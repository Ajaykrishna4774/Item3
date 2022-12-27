package com.capgemini.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.capgemini.demo.entity.Item;
import com.capgemini.demo.service.ItemServiceImpl;



@RestController
@RequestMapping("/item")
public class ItemController {
    
	@Autowired
    private ItemServiceImpl service;
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ItemController.class);

    @RequestMapping("/getAllItems")
    public List<Item> getAllItems(){
    	LOGGER.info("inside class !!! ItemController, method!!!: getAllItems");
        return service.getAllItems();
    }

    @GetMapping("/getItem/{id}")
    
    public Item getItem(@PathVariable int id){
    	LOGGER.info("inside class !!! ItemController, method!!!: getItem");
        return service.getItem(id);
    }

    @PostMapping("/addItem")
    public String addItem( @RequestBody Item body) {
    	LOGGER.info("inside class !!! ItemController, method!!!: addItem");
    	return service.addItem(body)+"New Details added successfully";
    }
    
    @DeleteMapping("/deleteItem/{id}")
    public void deleteItem(@PathVariable int id){
    	LOGGER.info("inside class !!! ItemController, method!!!: deleteItem");
    		service.deleteItem(id);
        
    }
    @GetMapping("/Health")
    public String HealthCheck() {
    	LOGGER.info("Health check");
    	return "Status : up ";
    }
}