/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Azaed  Alejandro Ramírez
 */
public class Registro {
    private String name;
    private String lastname;
    private String brtdy;
    private String mail;
    private String pass;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

  

    public String getBrtdy() {
        return brtdy;
    }

    public String getMail() {
        return mail;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public void setBrtdy(String brtdy) {
        this.brtdy = brtdy;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
        
}
