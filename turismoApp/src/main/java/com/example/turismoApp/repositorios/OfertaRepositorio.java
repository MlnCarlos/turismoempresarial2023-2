package com.example.turismoApp.repositorios;

import com.example.turismoApp.modelos.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepositorio extends JpaRepository<Oferta,Integer> {
}
