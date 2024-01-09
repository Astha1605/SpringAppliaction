package com.astha.singh.service;

import com.astha.singh.model.Items;
import com.astha.singh.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ItemsService {

    @Autowired
    private ItemRepository repo;

    //READ
    public Items getItemsbyId(int id)
    {
        return repo.getReferenceById(id);
    }
    //READ ALL
    public List<Items> getAllItems()
    {
        return repo.findAll();
    }
    //CREATE
    public Items createItems(Items items)
    {
       return repo.save(items);
    }
    //UPDATE
    public Items updateItems(Items items)
    {
        repo.save(items);
        return  items;
    }
    //DELETE
    public void deleteItems(int id)
    {
        repo.deleteById(id);
    }

    //Get all item whose price is less than input
    public List<Items> getItemByPrice(int price)
    {
        List<Items> allItem = repo.findAll();
        List<Items> response = new ArrayList<>();
        for(Items items: allItem)
        {
            if(items.getPrice()<=price)
            {
                response.add(items);
            }
        }
        return response;
    }
    //Get all item whose price is less than
    public List<Items> getItemByRange(int low, int high)
    {
        List<Items> allItem = repo.findAll();
        List<Items> response = new ArrayList<>();
        for(Items items: allItem)
        {
            if(low<=items.getPrice() && items.getPrice()<=high)
            {
                response.add(items);
            }
        }
        return response;
    }
}
