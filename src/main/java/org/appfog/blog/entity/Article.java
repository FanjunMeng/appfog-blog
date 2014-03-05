package org.appfog.blog.entity;

import java.util.Date;

public class Article {
	
	private int id;
	
	private String title;
	
	private String content;
	
	/**
	 * 预览内容
	 */
	private String previewContent;
	
	/**
	 * 点击次数
	 */
	private int clickCount;
	
	/**
	 * 评论数
	 */
	private int commentCount;
	
	/**
	 * 发布时间
	 */
	private Date publishDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getClickCount() {
		return clickCount;
	}

	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getPreviewContent() {
		return previewContent;
	}

	public void setPreviewContent(String previewContent) {
		this.previewContent = previewContent;
	}
	
}
