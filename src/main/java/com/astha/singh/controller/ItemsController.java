package com.astha.singh.controller;

import com.astha.singh.model.Items;
import com.astha.singh.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Items")

public class ItemsController {

    @Autowired
    private ItemsService service;

    //READ
    @GetMapping("/getAllItems")
    public List<Items> getAllItems()
    {
        return  service.getAllItems();
    }
    //Get Item By Price
    @GetMapping("/getitembyprice")
    public List<Items> getItemByPrice(@RequestParam int price)
    {
        return service.getItemByPrice(price);
    }
    @GetMapping("/getitemsbyrange")
    public List<Items> getItemsByRange(@RequestParam int low, @RequestParam int high)
    {
        return service.getItemByRange(low,high);
    }
    //CREATE
    @PostMapping ("/createItems")
    public Items createItems(@RequestBody  Items items)
    {
        return  service.createItems(items);
    }
    //UPDATE
    @PutMapping("/updateItems")
    public Items updateItems(@RequestBody Items items)
    {
        return  service.updateItems(items);
    }
    //DELETE
    @DeleteMapping("/deleteItems")
    public void deleteItems(@RequestParam Integer id)
    {
        service.deleteItems(id);
    }
}
