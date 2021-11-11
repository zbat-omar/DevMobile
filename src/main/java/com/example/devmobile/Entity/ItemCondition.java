package com.example.devmobile.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ItemCondition")
public class ItemCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_ItemCondition")
    private int Id_ItemCondition;
    @Column(name = "ConditionCode")
    private String ConditionCode;
    @Column(name = "Description")
    private String Description;

    public ItemCondition(int id_ItemCondition, String conditionCode, String description) {
        Id_ItemCondition = id_ItemCondition;
        ConditionCode = conditionCode;
        Description = description;
    }

    public ItemCondition() {

    }

    public int getId_ItemCondition() {
        return Id_ItemCondition;
    }

    public void setId_ItemCondition(int id_ItemCondition) {
        Id_ItemCondition = id_ItemCondition;
    }

    public String getConditionCode() {
        return ConditionCode;
    }

    public void setConditionCode(String conditionCode) {
        ConditionCode = conditionCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
