package com.capgemini.demo.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.demo.bo.ItemBo;
import com.capgemini.demo.entity.Item;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemBo bo;
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ItemServiceImpl.class);
	public String ServiceLog() {
		LOGGER.info("This is a Emplpyee service Layer ");
		return "ServiceLog";
	}
	
	@Override
	public List<Item> getAllItems() {
		LOGGER.info("inside class !!! ItemService, method!!!: getAllItems");
		List<Item> allEmployees = bo.getAllItems();
		
		return allEmployees;
	}

	@Override
	public Item getItem(int itemId) {
		LOGGER.info("inside class !!! ItemService, method!!!: getItem");
		return bo.getItem(itemId);
	}

	public int addItem(Item item){
		LOGGER.info("inside class !!! ItemService, method!!!: addItem");
		return bo.addItem(item);
	}

	@Override
	public void deleteItem(int id) {
		LOGGER.info("inside class !!! ItemService, method!!!: deleteItem");
		bo.deleteItem(id);
	}

}
