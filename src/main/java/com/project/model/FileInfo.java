package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "file")
public class FileInfo {
	
	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
     private String name;
	  private String url;

	  public FileInfo(String name, String url) {
	    this.name = name;
	    this.url = url;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getUrl() {
	    return this.url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }
	}
