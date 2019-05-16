package com.dao;

import java.util.List;

import com.model.*;

public interface ProductDao 
{
	public void insertProduct(Product product);
	public List<Product> retreive();
	public Product findById(int pid);
	public void deleteProduct(int pid);
	

}
