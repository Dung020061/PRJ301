/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Tour {
   int id;
        String name;
   Date dob;
      String img;
      float price;
      String description;

    public Tour() {
    }

    public Tour(int id, String name, Date dob, String img, float price, String description) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.img = img;
        this.price = price;
        this.description = description;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tour{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", img=" + img + ", price=" + price + ", description=" + description + '}';
    }


       
}