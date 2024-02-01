package com.astha.singh.controller;

import com.astha.singh.model.Category;
import com.astha.singh.model.Items;
import com.astha.singh.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("/getAllCategory")
    public List<Category> getAllCategory()
    {
       return service.getAllCategory();
    }
    @GetMapping("/getallcategoryitems")
    public List<Items> getAllItemCategory(@RequestParam int id)
    {
        return service.getItemsByCategoryID(id);
    }
    @GetMapping("/getcostprice")
    public int getCostPrice(@RequestParam int id)
    {
        return service.totalPriceByCategoryId(id);
    }

    @PostMapping("/createCategory")
    public Category createCategory( @Valid @RequestBody Category category)
    {
        return  service.createCategory(category);
    }
    @PutMapping("/updateCategory")
    public  Category updateCategory(@RequestBody Category category)
    {
        return  service.updateCategory(category);
    }
    @DeleteMapping("/deleteCategory")
    public void deleteCategory(@RequestParam Integer id)
    {
        service.deleteCategory(id);
    }
}
