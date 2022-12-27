package com.capgemini.demo.bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.demo.entity.Item;
import com.capgemini.demo.eo.ItemEo;
@Component
public class ItemBoImpl implements ItemBo {

	private static final Logger LOGGER= LoggerFactory.getLogger(ItemBoImpl.class);
	
	@Autowired
	private ItemEo eo;
	
	@Override
	public List<Item> getAllItems() {
		LOGGER.info("inside class !!! ItemBoImpl, method!!!: getAllItems");
		List<Item> allEmployees = eo.getAllItems();
		
		return allEmployees;
	}

	@Override
	public Item getItem(int itemId) {
		LOGGER.info("inside class !!! ItemBoImpl, method!!!: getItem");
		return eo.getItem(itemId);
	}

	public int addItem(Item item){
		LOGGER.info("inside class !!! ItemBoImpl, method!!!: addItem");
		return eo.addItem(item);
	}

	@Override
	public void deleteItem(int id) {
		LOGGER.info("inside class !!! ItemBoImpl, method!!!: deleteItem");
		eo.deleteItem(id);
	}
}
