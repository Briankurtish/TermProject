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
public class Service implements Serializable{
    private int service_id;
    private String Service_name;
    private String Service_description;
    private int Service_price;
    private String Service_status;

    public Service(int service_id, String Service_name, String Service_description, int Service_price, String Service_status) {
        this.service_id = service_id;
        this.Service_name = Service_name;
        this.Service_description = Service_description;
        this.Service_price = Service_price;
        this.Service_status = Service_status;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return Service_name;
    }

    public void setService_name(String Service_name) {
        this.Service_name = Service_name;
    }

    public String getService_description() {
        return Service_description;
    }

    public void setService_description(String Service_description) {
        this.Service_description = Service_description;
    }

    public int getService_price() {
        return Service_price;
    }

    public void setService_price(int Service_price) {
        this.Service_price = Service_price;
    }

    public String getService_status() {
        return Service_status;
    }

    public void setService_status(String Service_status) {
        this.Service_status = Service_status;
    }
    
    
}
