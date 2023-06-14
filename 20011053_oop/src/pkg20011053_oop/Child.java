/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20011053_oop;

import java.io.Serializable;

/**
 *
 * @author MTI
 */
public class Child implements Serializable{                 // Çocukların Kaydında Kullanılacak Sınıf
    private final String fullName;
    private final String userName;
    private final String password;
    private int id;
    
    public Child(String fullName, String password) {
        Functions.lastChild++;
        id = Functions.lastChild;
        this.fullName = fullName;
        this.password = password;
        String[] words = fullName.split(" ");
        String firstWord = words[0];
        this.userName = firstWord + "_" + this.id;
    }
    
    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
}