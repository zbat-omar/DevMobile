package com.example.devmobile.Repository;


import com.example.devmobile.Entity.ItemImage;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

public interface ItemImageRepository extends JpaRepository<ItemImage,Integer>{
}
