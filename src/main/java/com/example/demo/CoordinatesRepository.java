package com.example.demo;

import com.example.demo.Modele.GeographicalCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;


import java.util.Date;
import java.util.List;


@Repository
@Transactional
public class CoordinatesRepository {
    @Autowired
    private EntityManager entityManager;

    public List<GeographicalCoordinates> findAll(){
        return entityManager.createQuery("select w from GeographicalCoordinates w")
        .getResultList();
    }

    public List<GeographicalCoordinates> findDay(Date date) {
        return entityManager.createQuery("select w from GeographicalCoordinates w " +
                "where w.creationDate LIKE :  Day")
                .setParameter("Day" ,date, TemporalType.DATE)
                .getResultList();
    }


    public void save(GeographicalCoordinates geographicalCoordinates){
        entityManager.persist(geographicalCoordinates);
    }
}
