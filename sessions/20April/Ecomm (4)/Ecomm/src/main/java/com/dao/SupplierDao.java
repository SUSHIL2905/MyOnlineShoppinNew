package com.dao;

import java.util.List;

import com.model.Category;
import com.model.Supplier;

public interface SupplierDao 
{
	public void insertSupplier(Supplier supplier);
	public List<Supplier> retreive();
	public Supplier findById(int sid);
	public void deleteSupplier(int sid);
	

}
