package com.example.demo;

import com.example.demo.Modele.HelloWorld;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HelloRepository extends JpaRepository<HelloWorld, Long>{

}
