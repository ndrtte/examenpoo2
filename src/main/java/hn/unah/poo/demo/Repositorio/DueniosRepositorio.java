package hn.unah.poo.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.poo.demo.Modelo.Duenios;

public interface DueniosRepositorio extends JpaRepository<Duenios,String> {
    
}
