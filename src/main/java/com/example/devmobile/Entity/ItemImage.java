package com.example.devmobile.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ItemImage")
public class ItemImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdImage;
    @Column(name = "ImageURL")
    private String ImageURL;
    @ManyToOne
    @JoinColumn(name = "Id_Item")
    private ItemEntity itemEntity;

    public ItemImage(int idImage, String imageURL, ItemEntity itemEntity) {
        IdImage = idImage;
        ImageURL = imageURL;
        this.itemEntity = itemEntity;
    }

    public ItemImage() {

    }

    public int getIdImage() {
        return IdImage;
    }

    public void setIdImage(int idImage) {
        IdImage = idImage;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public ItemEntity getItemEntity() {
        return itemEntity;
    }

    public void setItemEntity(ItemEntity itemEntity) {
        this.itemEntity = itemEntity;
    }
}
