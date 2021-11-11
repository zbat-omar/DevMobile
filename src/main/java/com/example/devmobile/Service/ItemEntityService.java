package com.example.devmobile.Service;

import com.example.devmobile.Entity.ItemEntity;
import com.example.devmobile.Repository.ItemConditionRepository;
import com.example.devmobile.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemEntityService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemConditionRepository itemConditionRepository;
//    @Autowired
//    private ItemEntity itemEntity;
    public List<ItemEntity> Items(){
        return itemRepository.findAll();
    }
    public void addItem(ItemEntity itemEntity){
        itemRepository.save(itemEntity);
    }
    public Optional<ItemEntity> getitembyid(int id){
        return itemRepository.findById(id);
    }
}
