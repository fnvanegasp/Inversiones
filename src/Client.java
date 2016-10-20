/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Client {
    private String cc;
    private String firstname;
    private String lastname;
    private int phone;
    private int age;
    
    private Asset[] assets;

    public Client(String cc, String firstname, String lastname, int phone, int age) {
        this.cc = cc;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.age = age;
        this.assets = new Asset[10];
    }
    
    public double sumProfit(){
        return 0;
    }
    
    public double sumMarketValue(){
        return 0;
    }
    
    public boolean addAsset(Asset asset){
        return true;
    }
}
