package com.example.devmobile.Controller;

import com.example.devmobile.Entity.ItemEntity;
import com.example.devmobile.Service.ItemEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ItemEntityController {
    @Autowired
    private ItemEntityService itemEntityService;
    @GetMapping("/items")
    public List<ItemEntity> getItems(){
        return itemEntityService.Items();
    }
}
