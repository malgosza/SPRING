package com.example.demo;

import com.example.demo.Modele.WspolrzedneGeo;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface WspolrzedneRepository extends JpaRepository<WspolrzedneGeo, Long>{

}
