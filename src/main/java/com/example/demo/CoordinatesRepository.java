package com.example.demo;

import com.example.demo.Modele.GeographicalCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
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

    public void save(GeographicalCoordinates geographicalCoordinates){
        entityManager.persist(geographicalCoordinates);
    }

    public List<GeographicalCoordinates> find(String phoneName) {
        return entityManager.createQuery("select w from GeographicalCoordinates w " +
                "where w.nameOfDevice =: device")
                .setParameter("device" ,phoneName)
                .getResultList();
    }
}
