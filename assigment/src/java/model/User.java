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
public class User {

    int id;
    String username;
    String pasword;
    String addres;
    String phone;
    int roleid;
    Tour tour;

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public User(int id, String username, String pasword, String addres, String phone, int roleid) {
        this.id = id;
        this.username = username;
        this.pasword = pasword;
        this.addres = addres;
        this.phone = phone;
        this.roleid = roleid;
    }

    public int getRoleid() {
        return roleid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public User() {
    }

    public User(int id, String username, String pasword, String addres, String phone, int roleid, Tour tour) {
        this.id = id;
        this.username = username;
        this.pasword = pasword;
        this.addres = addres;
        this.phone = phone;
        this.roleid = roleid;
        this.tour = tour;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
