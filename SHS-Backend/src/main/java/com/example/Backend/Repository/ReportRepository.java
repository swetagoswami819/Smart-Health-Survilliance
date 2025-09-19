package com.example.Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Backend.model.Report;

@Repository
public interface ReportRepository extends JpaRepository <Report,Long>{
    //if you want to write any query then you can write here
} 
