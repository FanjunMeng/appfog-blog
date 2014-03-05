package org.appfog.blog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.appfog.blog.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ArticleDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private LobHandler lobHandler;

	@Transactional
	public void add(Article article) {

	}

	@Transactional(readOnly = true)
	public List<Article> findAll() {
		return jdbcTemplate.query("select id,title,content,publishDate from article",
				new RowMapper<Article>() {
					@Override
					public Article mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Article article = new Article();
						article.setId(rs.getInt("id"));
						article.setTitle(rs.getString("title"));
						article.setContent(lobHandler.getClobAsString(rs, "content"));
						article.setPublishDate(rs.getTimestamp("publishDate"));
						return article;
					}
				});
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public LobHandler getLobHandler() {
		return lobHandler;
	}

	public void setLobHandler(LobHandler lobHandler) {
		this.lobHandler = lobHandler;
	}

}
