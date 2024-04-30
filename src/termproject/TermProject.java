/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package termproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Cipher
 */
public class TermProject {
    public static List services, customers, technicians, maintenanace;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        services = new ArrayList();
        customers = new ArrayList();
        technicians = new ArrayList();
        maintenanace = new ArrayList();
        
        test_services();
        test_customers(); 
        test_technicians();
        test_maintenance();
        
        System.out.printf("\n");
        
        
    }
    
    public static void test_services() {
        try {
        System.out.printf("\n Tests for Class Service\n\n");
        System.out.printf("\n Add_Service()\n\n");
        add_service(1, "Install Car Radio", "Install Car Radio for Android", 700, "Open");
        add_service(2, "Reverse Camera", "Install Reverse camera", 1200, "Open");
        add_service(3, "Headlights", "Change Car Headlights", 550, "Open");
        add_service(4, "Android car Play", "Install Car Radio for Android", 800, "Open");
        add_service(5, "Apple Car Play", "Install Car Radio for Apple", 900, "Open");
        System.out.printf("\n List_services()\n\n");
        list_services();
        System.out.printf("\n Edit_student()\n\n");
        edit_service(2, "Reverse Camera", "Install Reverse camera", 550, "Close");
        System.out.printf("\n List_services()\n\n");
        list_services();
        backup_service();
        
        System.out.printf("\n Delete_service(4)\n\n");
        delete_service(4);
        
        System.out.printf("\n List_service()\n\n");
        list_services();
        
        
        System.out.printf("\n List_one_service()\n\n");
        list_one_service(2);
        
        retrieve_services();
        System.out.printf("\n List_service()\n\n");
        list_services();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    
    public static void test_customers() {
        try {
        System.out.printf("\n Tests for Class Customer\n\n");
        System.out.printf("\n Add_Customer()\n\n");
        add_customer(1, "John Kerry", "HJ786RF", "54377898765", "johnkerry@gmail.com", "Magusa");
        add_customer(2, "Barry Jones", "JL887VC", "54377898765", "barryjones@gmail.com", "Lefkosia");
        add_customer(3, "Phill Kenny", "BV432WS", "54377898765", "phillKeny@gmail.com", "Lefke");
        add_customer(4, "Batthy Yolic", "PK120CJ", "54377898765", "battyyolic@gmail.com", "Nicosia");
        add_customer(5, "David Nelson", "MF769GY", "54377898765", "Davidnelson@gmail.com", "Girne");
        
        System.out.printf("\n List_customers()\n\n");
        list_customers();
        System.out.printf("\n Edit_customers()\n\n");
        edit_customer(2, "Barry Jones", "JL887VC", "54377898765", "barryjones@gmail.com", "Kyrenia");
        System.out.printf("\n List_customers()\n\n");
        list_customers();
        backup_customers();
        
        System.out.printf("\n Delete_customers(4)\n\n");
        delete_customer(2);
        
        System.out.printf("\n List_customers()\n\n");
        list_customers();
        
        retrieve_customers();
        System.out.printf("\n List_customers()\n\n");
        list_customers();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    
    
    public static void test_technicians() {
        try {
        System.out.printf("\n Tests for Class Technicians\n\n");
        System.out.printf("\n Add_Technician()\n\n");
        add_technicians(1, "John Paul", "54377898765", "Magusa", "Available", "********", 2);
        add_technicians(2, "Barry Peter","54377898765", "Girne", "Available", "********", 0);
        add_technicians(3, "Phill henry", "54377898765", "Lefkosia", "Busy", "********", 1);
        add_technicians(4, "Batthy Petrovic", "54377898765", "Magusa", "Available", "********", 7);
        add_technicians(5, "David Samuel", "54377898765", "Magusa", "Busy", "********", 4);
        
        System.out.printf("\n List_technicians()\n\n");
        list_technicians();
        System.out.printf("\n Edit_technician()\n\n");
        edit_technicians(4, "Batthy Petrovic", "54377898765", "Lefke", "Available", "********", 9);
        System.out.printf("\n List_technicians()\n\n");
        list_technicians();
        backup_technicians();
        
        System.out.printf("\n Delete_technician(4)\n\n");
        delete_technician(3);
        
        System.out.printf("\n List_technicians()\n\n");
        list_technicians();
        
        retrieve_technicians();
        System.out.printf("\n List_technicians()\n\n");
        list_technicians();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    
    
    public static void test_maintenance() {
        try {
        System.out.printf("\n Tests for Class Maintenance\n\n");
        System.out.printf("\n Add_Maintenance()\n\n");
        add_maintenance(1, 1, 1, 2, "Pending", "30/12/2023");
        add_maintenance(2, 2, 4, 1, "Cancelled", "18/12/2023");
        add_maintenance(3, 1, 2, 4, "Conpletd", "12/12/2023");
        add_maintenance(4, 3, 5, 1, "Ongoing", "14/12/2023");
        add_maintenance(5, 4, 3, 5, "Pending", "24/12/2023");
        
        System.out.printf("\n List_maintenance()\n\n");
        list_maintenance();
        System.out.printf("\n Edit_Maintenance()\n\n");
        edit_maintenance(4, 3, 5, 1, "Completed", "14/12/2023");
        System.out.printf("\n List_maintenance()\n\n");
        list_maintenance();
        backup_maintenance();
        
        System.out.printf("\n Delete_maintenance(4)\n\n");
        delete_maintenance(3);
        
        System.out.printf("\n List_maintenance()\n\n");
        list_maintenance();
        
        retrieve_maintenance();
        System.out.printf("\n List_maintenance()\n\n");
        list_maintenance();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    
    
    
    public static void retrieve_services() throws IOException, ClassNotFoundException
    {
     File infile  = new File("services.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     services = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_service() throws IOException
    {
     File outfile  = new File("services.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(services);
     outObjectStream.close();
     
    }
    
    public static void add_service(int service_id, String service_name, String service_description, int service_price,
            String service_status) {
            Service serv =new Service(service_id, service_name, service_description, service_price, service_status);
            services.add(serv);
    }
    
      public static void edit_service(int service_id, String service_name, String service_description, int service_price,
            String service_status) {
      Service serv=null;
      Boolean found=false;
      Iterator <Service> itr = services.iterator();
      while (itr.hasNext()) {
          serv = itr.next(); 
          if(service_id==serv.getService_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          serv.setService_id(service_id);
          serv.setService_name(service_name);
          serv.setService_description(service_description);
          serv.setService_price(service_price);
          serv.setService_status(service_status);
      }
      }

    public static void delete_service(int service_id) {
      Service serv=null;
      Boolean found=false;
      Iterator <Service> itr = services.iterator();
      while (itr.hasNext()) {
          serv = itr.next(); 
          if(service_id==(serv.getService_id())) {
              found=true;
              break;
          }
      }
      if (found) services.remove(serv);
      }
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_one_service(int service_id) {
        Service serv;
        Boolean found=false;
        Iterator<Service> itr = services.iterator();
        System.out.printf("\n%2s %20s %40s %15s %10s",
                "Id", "Service Name", "Description", "Price",
                "Status");
        draw_line(100);

        while (itr.hasNext()) {
            serv = itr.next();
            if(service_id==(serv.getService_id())){
                found=true;
                System.out.printf("\n%2d %20s %40s %15s %10s",
                serv.getService_id(), serv.getService_name(),
                serv.getService_description(), serv.getService_price(),
                serv.getService_status());
                break;
            }
        }
        draw_line(100);

    }
    
    
    public static void list_services() {
        Service serv;
        Iterator<Service> itr = services.iterator();
        System.out.printf("\n%2s %20s %40s %15s %10s",
                "Id", "Service Name", "Description", "Price",
                "Status");
        draw_line(100);

        while (itr.hasNext()) {
            serv = itr.next();
            System.out.printf("\n%2d %20s %40s %15s %10s",
            serv.getService_id(), serv.getService_name(),
            serv.getService_description(), serv.getService_price(),
            serv.getService_status());
        }
        draw_line(100);

    }
    
    
    public static void retrieve_customers() throws IOException, ClassNotFoundException
    {
     File infile  = new File("customers.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     customers = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_customers() throws IOException
    {
     File outfile  = new File("customers.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(customers);
     outObjectStream.close();
     
    }
    
    public static void add_customer(int customer_id, String customer_name, String car_plate, String conatct, String email,
            String address) {
            Customer cust  =new Customer(customer_id, customer_name, car_plate, conatct, email, address);
            customers.add(cust);
    }
    
      public static void edit_customer(int customer_id, String customer_name, String car_plate, String conatct, String email,
            String address) {
      Customer cust =null;
      Boolean found=false;
      Iterator <Customer> itr = customers.iterator();
      while (itr.hasNext()) {
          cust = itr.next(); 
          if(customer_id==cust.getCustomer_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          cust.setCustomer_id(customer_id);
          cust.setCustomer_name(customer_name);
          cust.setCar_plate(car_plate);
          cust.setContact(conatct);
          cust.setEmail(email);
          cust.setAddress(address);
      }
      }

    public static void delete_customer(int customer_id) {
      Customer cust =null;
      Boolean found=false;
      Iterator <Customer> itr = customers.iterator();
      while (itr.hasNext()) {
          cust = itr.next(); 
          if(customer_id==(cust.getCustomer_id())) {
              found=true;
              break;
          }
      }
      if (found) customers.remove(cust);
      }
    
    public static void list_customers() {
        Customer cust;
        Iterator<Customer> itr = customers.iterator();
        System.out.printf("\n%2s %20s %15s %15s %25s %15s",
                "Id", "Customer Name", "Car Plate", "Contact",
                "Email", "Address");
        draw_line(120);

        while (itr.hasNext()) {
            cust = itr.next();
            System.out.printf("\n%2d %20s %15s %15s %30s %10s",
            cust.getCustomer_id(), cust.getCustomer_name(),
            cust.getCar_plate(), cust.getContact(),
            cust.getEmail(), cust.getAddress());
        }
        draw_line(120);

    }
    
    
    public static void retrieve_technicians() throws IOException, ClassNotFoundException
    {
     File infile  = new File("technicians.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     technicians = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_technicians() throws IOException
    {
     File outfile  = new File("technicians.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(technicians);
     outObjectStream.close();
     
    }
    
    public static void add_technicians(int tech_id, String tech_username, String tech_contact, String tech_address, String tech_status,
            String tech_password, int task_number) {
            Technician tech  =new Technician(tech_id, tech_username, tech_contact, tech_address, tech_status, tech_password, task_number);
            technicians.add(tech);
    }
    
      public static void edit_technicians(int tech_id, String tech_username, String tech_contact, String tech_address, String tech_status,
            String tech_password, int task_number) {
      Technician tech =null;
      Boolean found=false;
      Iterator <Technician> itr = technicians.iterator();
      while (itr.hasNext()) {
          tech = itr.next(); 
          if(tech_id==tech.getTech_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          tech.setTech_id(tech_id);
          tech.setTech_username(tech_username);
          tech.setTech_contact(tech_contact);
          tech.setTech_address(tech_address);
          tech.setTech_status(tech_status);
          tech.setTech_password(tech_password);
          tech.setTask_number(task_number);
      }
      }

    public static void delete_technician(int tech_id) {
      Technician tech =null;
      Boolean found=false;
      Iterator <Technician> itr = technicians.iterator();
      while (itr.hasNext()) {
          tech = itr.next(); 
          if(tech_id==(tech.getTech_id())) {
              found=true;
              break;
          }
      }
      if (found) technicians.remove(tech);
      }
    
    public static void list_technicians() {
        Technician tech;
        Iterator<Technician> itr = technicians.iterator();
        System.out.printf("\n%2s %20s %15s %15s %20s %15s %15s",
                "Id", "Tech Name", "Contact", "Address",
                "Status", "Password", "Task No");
        draw_line(120);

        while (itr.hasNext()) {
            tech = itr.next();
            System.out.printf("\n%2d %20s %15s %15s %20s %15s %10s",
            tech.getTech_id(), tech.getTech_username(),
            tech.getTech_contact(), tech.getTech_address(),
            tech.getTech_status(), tech.getTech_password(), tech.getTask_number());
        }
        draw_line(120);

    }
    
    
    public static void retrieve_maintenance() throws IOException, ClassNotFoundException
    {
     File infile  = new File("maintenance.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     maintenanace = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_maintenance() throws IOException
    {
     File outfile  = new File("maintenance.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(maintenanace);
     outObjectStream.close();
     
    }
    
    public static void add_maintenance(int maint_id, int cust_id, int service_id, int tech_id, String work_status,
            String date_created) {
            Maintenance maint  =new Maintenance(maint_id, cust_id, service_id, tech_id, work_status, date_created);
            maintenanace.add(maint);
    }
    
      public static void edit_maintenance(int maint_id, int cust_id, int service_id, int tech_id, String work_status,
            String date_created) {
      Maintenance maint =null;
      Boolean found=false;
      Iterator <Maintenance> itr = maintenanace.iterator();
      while (itr.hasNext()) {
          maint = itr.next(); 
          if(maint_id==maint.getMaint_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          maint.setMaint_id(maint_id);
          maint.setCust_id(cust_id);
          maint.setService_id(service_id);
          maint.setTech_id(tech_id);
          maint.setWork_status(work_status);
          maint.setDate_created(date_created);
          
      }
      }

    public static void delete_maintenance(int maint_id) {
      Maintenance maint =null;
      Boolean found=false;
      Iterator <Maintenance> itr = maintenanace.iterator();
      while (itr.hasNext()) {
          maint = itr.next(); 
          if(maint_id==(maint.getMaint_id())) {
              found=true;
              break;
          }
      }
      if (found) maintenanace.remove(maint);
      }
    
    public static void list_maintenance() {
        Maintenance maint;
        Iterator<Maintenance> itr = maintenanace.iterator();
        System.out.printf("\n%2s %20s %15s %15s %20s %15s",
                "Id", "Cust ID", "Service ID", "Tech ID",
                "Work Status", "Date Created");
        draw_line(130);

        while (itr.hasNext()) {
            maint = itr.next();
            System.out.printf("\n%2d %20s %15s %15s %20s %15s",
            maint.getMaint_id(), maint.getCust_id(),
            maint.getService_id(), maint.getTech_id(),
            maint.getWork_status(), maint.getDate_created());
        }
        draw_line(130);

    }
    
}
