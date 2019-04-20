package com.dradest.storedepot.database;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "article") 

public class Article implements Serializable {  
	   private static final long serialVersionUID = 1L; 
	   private int id; 
	   private String title; 
	   private String description;  
	   public Article(){} 
	    
	   public Article(int id, String name, String profession){  
	      this.id = id; 
	      this.title = name; 
	      this.description = profession; 
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getName() { 
	      return title; 
	   } 
	   @XmlElement
	   public void setName(String name) { 
	      this.title = name; 
	   } 
	   public String getProfession() { 
	      return description; 
	   } 
	   @XmlElement 
	   public void setProfession(String profession) { 
	      this.description = profession; 
	   }   
	} 
