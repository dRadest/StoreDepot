package com.dradest.storedepot.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArticleDao { 
	   public List<Article> getAllArticles(){ 
	      
	      List<Article> articleList = null; 
	      try { 
	         File file = new File("Articles.dat"); 
	         if (!file.exists()) { 
	            Article speaker = new Article(187, "Speaker", "Blast some killer music"); 
	            articleList = new ArrayList<Article>(); 
	            articleList.add(speaker); 
	            saveUserList(articleList); 
	         } 
	         else{ 
	            FileInputStream fis = new FileInputStream(file); 
	            ObjectInputStream ois = new ObjectInputStream(fis); 
	            articleList = (List<Article>) ois.readObject(); 
	            ois.close(); 
	         } 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } catch (ClassNotFoundException e) { 
	         e.printStackTrace(); 
	      }   
	      return articleList; 
	   } 
	   private void saveUserList(List<Article> userList){ 
	      try { 
	         File file = new File("Users.dat"); 
	         FileOutputStream fos;  
	         fos = new FileOutputStream(file); 
	         ObjectOutputStream oos = new ObjectOutputStream(fos); 
	         oos.writeObject(userList); 
	         oos.close(); 
	      } catch (FileNotFoundException e) { 
	         e.printStackTrace(); 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } 
	   }    
	}
