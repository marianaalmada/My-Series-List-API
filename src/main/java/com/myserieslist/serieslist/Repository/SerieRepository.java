package com.myserieslist.serieslist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myserieslist.serieslist.Entity.Serie;

// Repository es responsable del acceso a la base de datos

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> /*indicar tipo de objeto y el tipo del ID*/ {
    
    Serie findSerieByName(String name);
}