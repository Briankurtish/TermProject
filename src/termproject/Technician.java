/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package termproject;

import java.io.Serializable;

/**
 *
 * @author Cipher
 */
public class Technician implements Serializable{
    private int tech_id;
    private String tech_username;
    private String tech_contact;
    private String tech_address;
    private String tech_status;
    private String tech_password;
    private int task_number;

    public Technician(int tech_id, String tech_username, String tech_contact, String tech_address, String tech_status, String tech_password, int task_number) {
        this.tech_id = tech_id;
        this.tech_username = tech_username;
        this.tech_contact = tech_contact;
        this.tech_address = tech_address;
        this.tech_status = tech_status;
        this.tech_password = tech_password;
        this.task_number = task_number;
    }

    public int getTech_id() {
        return tech_id;
    }

    public void setTech_id(int tech_id) {
        this.tech_id = tech_id;
    }

    public String getTech_username() {
        return tech_username;
    }

    public void setTech_username(String tech_username) {
        this.tech_username = tech_username;
    }

    public String getTech_contact() {
        return tech_contact;
    }

    public void setTech_contact(String tech_contact) {
        this.tech_contact = tech_contact;
    }

    public String getTech_address() {
        return tech_address;
    }

    public void setTech_address(String tech_address) {
        this.tech_address = tech_address;
    }

    public String getTech_status() {
        return tech_status;
    }

    public void setTech_status(String tech_status) {
        this.tech_status = tech_status;
    }

    public String getTech_password() {
        return tech_password;
    }

    public void setTech_password(String tech_password) {
        this.tech_password = tech_password;
    }

    public int getTask_number() {
        return task_number;
    }

    public void setTask_number(int task_number) {
        this.task_number = task_number;
    }
    
    
    
}
