/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodfun.model;

/**
 *
 * @author RAJAT MATHUR
 */
public class Book {
    private int id;
    private String date;
    private String no_guest;
    private String purpose;
    private String text1;
    private String name;
    private String number;
    private String email;
    private String text2;

    public Book(int id, String date, String no_guest, String purpose, String text1, String name, String number, String email, String text2) {
        this.id = id;
        this.date = date;
        this.no_guest = no_guest;
        this.purpose = purpose;
        this.text1 = text1;
        this.name = name;
        this.number = number;
        this.email = email;
        this.text2 = text2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNo_guest() {
        return no_guest;
    }

    public void setNo_guest(String no_guest) {
        this.no_guest = no_guest;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
    
    
    
    
}
