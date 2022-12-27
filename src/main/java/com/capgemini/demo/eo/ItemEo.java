package com.capgemini.demo.eo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.demo.entity.Item;
@Repository
public interface ItemEo {

	List<Item> getAllItems();

	Item getItem(int itemId);

	int addItem(Item item);

	void deleteItem(int id);

}
