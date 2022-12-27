package com.capgemini.demo.eo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.demo.entity.Item;
import com.capgemini.demo.repository.ItemRepository;
@Component
public class ItemEoImpl implements ItemEo {
	private static final Logger LOGGER= LoggerFactory.getLogger(ItemEoImpl.class);
	
	@Autowired
	private ItemRepository repo;
	
	@Override
	public List<Item> getAllItems() {
		LOGGER.info("inside class !!! ItemEoImpl, method!!!: getAllItems");
		List<Item> allEmployees = repo.getAllItems();
		return allEmployees;
	}

	@Override
	public Item getItem(int itemId) {
		LOGGER.info("inside class !!! ItemEoImpl, method!!!: getItem");
		return repo.getItem(itemId);
	}

	public int addItem(Item item){
		LOGGER.info("inside class !!! ItemEoImpl, method!!!: addItem");
		return repo.addItem(item);
	}

	@Override
	public void deleteItem(int id) {
		LOGGER.info("inside class !!! ItemEoImpl, method!!!: deleteItem");
		repo.deleteItem(id);
	}

}
