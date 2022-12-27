package com.capgemini.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.capgemini.demo.entity.Item;

import java.util.List;

@Repository
public class ItemRepository {

	private static final Logger LOGGER= LoggerFactory.getLogger(ItemRepository.class);
	
    @Autowired
    JdbcTemplate template;

   /*Getting all Items from table*/
    public List<Item> getAllItems(){
    	LOGGER.info(" ItemRepository, method!!!: getAllItems");
        List<Item> items = template.query("select id, name,category from item",(result,rowNum)->new Item(result.getInt("id"),
                result.getString("name"),result.getString("category")));
        return items;
    }
    
    /*Getting a specific item by item id from table*/
    public Item getItem(int itemId){
    	LOGGER.info(" ItemRepository, method!!!: getItem");
        String query = "SELECT * FROM ITEM WHERE ID=?";
        Item item = template.queryForObject(query,new Object[]{itemId},new BeanPropertyRowMapper<>(Item.class));

        return item;
    }
    
    /*delete an item from database*/
    public int deleteItem(int id){
    	LOGGER.info(" ItemRepository, method!!!: addItem");
        String query = "DELETE FROM ITEM WHERE ID =?";
        return template.update(query,id);
    }
    
    /*Adding an item into database table*/
	public int addItem(Item id) {
		LOGGER.info(" ItemRepository, method!!!: deleteItem");
		String query = "INSERT INTO ITEM VALUES(?,?,?)";
        return template.update(query,new Object[] {id.getId(), id.getName(), id.getCategory()});
		
	}

}