package org.appfog.blog.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import org.appfog.blog.entity.Article;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestArticleDAO {

	private static ApplicationContext context;
	private static ArticleDAO articleDAO;

	@BeforeClass
	public static void init() {
		context = new  FileSystemXmlApplicationContext(
				"F:\\workspace\\appfog-blog\\src\\main\\webapp\\WEB-INF\\spring\\root-context.xml");
		articleDAO = (ArticleDAO) context.getBean("articleDAO");
	}

	@Test
	public void testAdd() {
	}

	@Test
	public void testFindAll() {
		List<Article> list=articleDAO.findAll();
		System.out.println(list.get(0).getContent());
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a=s.format(list.get(0).getPublishDate());
		System.out.println(a);
	}
}
