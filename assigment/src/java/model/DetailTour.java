/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class DetailTour {
    int id;
    int userid;
    int tourid;
    boolean dstatus;
  Tour tour;
 User user;

    public DetailTour(int id, int userid, int tourid, boolean dstatus, Tour tour, User user) {
        this.id = id;
        this.userid = userid;
        this.tourid = tourid;
        this.dstatus = dstatus;
        this.tour = tour;
        this.user = user;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
 
 
    public DetailTour() {
    }

    public DetailTour(int id, int userid, int tourid, boolean dstatus) {
        this.id = id;
        this.userid = userid;
        this.tourid = tourid;
        this.dstatus = dstatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getTourid() {
        return tourid;
    }

    public void setTourid(int tourid) {
        this.tourid = tourid;
    }

    public boolean getDstatus() {
        return dstatus;
    }

    public boolean isDstatus() {
        return dstatus;
    }

    public void setDstatus(boolean dstatus) {
        this.dstatus = dstatus;
    }

 
    
}
