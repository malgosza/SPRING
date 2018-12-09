package com.example.demo.Modele;

import javax.persistence.*;
import java.util.Date;


@Entity
public class GeographicalCoordinates {

    @Id
    @GeneratedValue
    private Integer id;
//    private String nameOfDevice;
//    private String city;
//    private String country;
    private Double longitude;
    private Double latitude;

    @Temporal(TemporalType.DATE)
    private Date creationDate;


    private String nameOfDevice;

    public Integer getId() {
        return id;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getNameOfDevice() {
        return nameOfDevice;
    }


//
//    public String getNameOfDevice() {
//        return nameOfDevice;
//    }

//    public String getCity() {
//        return city;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//    private Date creationDate;

    @PrePersist
    public void prePersist() {
        creationDate =  new Date();

    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setNameOfDevice(String nameOfDevice) { this.nameOfDevice = nameOfDevice;
    }


//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public void setNameOfDevice(String nameOfDevice) {
//        this.nameOfDevice = nameOfDevice;
//    }
}

