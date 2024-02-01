package com.astha.singh.service;

import com.astha.singh.model.Category;
import com.astha.singh.model.Items;
import com.astha.singh.repository.CategoryRepository;
import com.astha.singh.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    @Autowired
    private ItemRepository itemsRepo;

    //READ
    public Category getCategoryById(int id)
    {
        return  repo.getReferenceById(id);
    }
    //READ ALL
    public List<Category> getAllCategory()
    {
        return repo.findAll();
    }
    //CREATE
    public Category createCategory(Category category)
    {
        return  repo.save(category);
    }
    //UPDATE
    public Category updateCategory(Category category)
    {
        repo.save(category);
        return  category;
    }
    //DELETE
    public void deleteCategory(int id)
    {
        repo.deleteById(id);
    }

    public List<Items> getItemsByCategoryID(int id)
    {
        Category category1=repo.getReferenceById(id);
        List<Integer> itemsid= category1.getListOfItems();
        List<Items> response=new ArrayList<>();
        for(Integer itemid: itemsid)
        {
            Items items = itemsRepo.getReferenceById(itemid);
            response.add(items);
        }
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getList());
        return response;
    }
    public int totalPriceByCategoryId(int id)
    {
        Category category2=repo.getReferenceById(id);
        List<Integer> itemsid= category2.getListOfItems();
        int sum=0;
        for(Integer idsum:itemsid)
        {
            Items items=itemsRepo.getReferenceById(idsum);
            sum+=items.getQuantity()*items.getPrice();
        }
        return  sum;
    }
}
