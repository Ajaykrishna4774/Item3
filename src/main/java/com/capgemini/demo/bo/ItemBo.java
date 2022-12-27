package com.capgemini.demo.bo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.demo.entity.Item;
@Repository
public interface ItemBo {

	List<Item> getAllItems();

	Item getItem(int itemId);

	int addItem(Item item);

	void deleteItem(int id);

}
