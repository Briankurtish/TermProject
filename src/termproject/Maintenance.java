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
public class Maintenance implements Serializable{
    private int maint_id;
    private int cust_id;
    private int service_id;
    private int tech_id;
    private String work_status;
    private String date_created;

    public Maintenance(int maint_id, int cust_id, int service_id, int tech_id, String work_status, String date_created) {
        this.maint_id = maint_id;
        this.cust_id = cust_id;
        this.service_id = service_id;
        this.tech_id = tech_id;
        this.work_status = work_status;
        this.date_created = date_created;
    }

    public int getMaint_id() {
        return maint_id;
    }

    public void setMaint_id(int maint_id) {
        this.maint_id = maint_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getTech_id() {
        return tech_id;
    }

    public void setTech_id(int tech_id) {
        this.tech_id = tech_id;
    }

    public String getWork_status() {
        return work_status;
    }

    public void setWork_status(String work_status) {
        this.work_status = work_status;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }
    
    
}
