package com.example.accessingdatamysql;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity // This tells Hibernate to make a table out of this class


public class Articles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@DateTimeFormat(pattern = "yyyy-MM-dd")

	private Integer id;

	private String title;

	private String author;

	private String description;

	private String urlToImage;

	private Date published;
	
	private String url;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}
	public String getUrlToImage() {
		return urlToImage;
	}


	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}

}
