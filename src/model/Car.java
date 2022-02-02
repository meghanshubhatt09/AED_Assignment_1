/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class Car {
    
    private String brand;
    private String model;
    private String color;
    private String year;
    private String engineNo;
    private String seatsNumber;
    private String licensePlates;
    private String ownerName;
    private String ownerTelephoneNumbers;
    private String ownerEmailAddresses;
    private String ownerDriverLicense;
    private String ownerSocialSecurityNumber;
    private String ownerAddress;
    //private String serviceRecords;
    private ArrayList serviceRecords;
    private String warrantyYear;
    private Image photo;    

    public Car() {
        super();
    }
    
    

    public Car(String brand, String model, String color, String year, String engineNo, String seatsNumber, String licensePlates, String ownerName, String ownerTelephoneNumbers, String ownerEmailAddresses, String ownerDriverLicense, String ownerSocialSecurityNumber, String ownerAddress, ArrayList serviceRecords, String warrantyYear, Image photo) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineNo = engineNo;
        this.seatsNumber = seatsNumber;
        this.licensePlates = licensePlates;
        this.ownerName = ownerName;
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
        this.ownerEmailAddresses = ownerEmailAddresses;
        this.ownerDriverLicense = ownerDriverLicense;
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
        this.ownerAddress = ownerAddress;
        this.serviceRecords = serviceRecords;
        this.warrantyYear = warrantyYear;
        this.photo = photo;
    }





    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(String seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTelephoneNumbers() {
        return ownerTelephoneNumbers;
    }

    public void setOwnerTelephoneNumbers(String ownerTelephoneNumbers) {
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
    }

    public String getOwnerEmailAddresses() {
        return ownerEmailAddresses;
    }

    public void setOwnerEmailAddresses(String ownerEmailAddresses) {
        this.ownerEmailAddresses = ownerEmailAddresses;
    }

    public String getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    public void setOwnerDriverLicense(String ownerDriverLicense) {
        this.ownerDriverLicense = ownerDriverLicense;
    }

    public String getOwnerSocialSecurityNumber() {
        return ownerSocialSecurityNumber;
    }

    public void setOwnerSocialSecurityNumber(String ownerSocialSecurityNumber) {
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public ArrayList getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(ArrayList serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    
    


    
    
}

