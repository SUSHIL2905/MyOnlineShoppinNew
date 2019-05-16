package com.dao;

import java.util.List;

import com.model.Category;

public interface CategoryDao 
{
	public void insertCategory(Category category);
	public List<Category> retreive();
	public Category findById(int cid);
	/*public void deleteCategory(int cid);*/
	
	
	

}
