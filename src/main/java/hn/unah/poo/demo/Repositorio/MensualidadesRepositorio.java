package hn.unah.poo.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.poo.demo.Modelo.Mensualidades;

public interface MensualidadesRepositorio extends JpaRepository<Mensualidades,Integer> {
    
}
