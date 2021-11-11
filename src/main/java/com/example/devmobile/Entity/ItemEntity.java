package com.example.devmobile.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ItemEntity")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Item")
    private int Id;
    @Column(name = "Publicidentifier")
    private String Publicidentifier;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Description")
    private String Description;
    @Column(name = "ShortDescription")
    private String ShortDescription;
    @ManyToOne
    @JoinColumn(name = "Id_ItemCondition")
    private ItemCondition itemCondition;

    public ItemEntity(int id, String publicidentifier, String title, String description, String shortDescription) {
        Id = id;
        Publicidentifier = publicidentifier;
        Title = title;
        Description = description;
        ShortDescription = shortDescription;
    }

    public ItemEntity() {

    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPublicidentifier() {
        return Publicidentifier;
    }

    public void setPublicidentifier(String publicidentifier) {
        Publicidentifier = publicidentifier;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        ShortDescription = shortDescription;
    }

    public ItemCondition getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(ItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }
}
