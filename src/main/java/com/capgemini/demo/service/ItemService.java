package com.capgemini.demo.service;

import java.util.List;

import com.capgemini.demo.entity.Item;


public interface  ItemService {
	
	List<Item>  getAllItems();
	
	Item getItem(int itemId);
	
	int addItem(Item i);
	
	void deleteItem(int id);
	

}
