package com.example.demo;

import com.example.demo.Modele.WspolrzedneGeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class WspolrzedneRepository {
    @Autowired
    private EntityManager entityManager;

    public List<WspolrzedneGeo> findAll(){
        return entityManager.createQuery("select w from WspolrzedneGeo w")
        .getResultList();
    }

    public void save(WspolrzedneGeo wspolrzedneGeo){
        entityManager.persist(wspolrzedneGeo);
    }
}
