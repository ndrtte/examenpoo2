package hn.unah.poo.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.poo.demo.Modelo.Condominios;

public interface CondominiosRepositorio extends JpaRepository<Condominios,Integer> {
    
}
