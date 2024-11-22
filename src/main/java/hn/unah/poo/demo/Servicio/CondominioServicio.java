package hn.unah.poo.demo.Servicio;

import java.time.LocalDate;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.demo.Modelo.Condominios;
import hn.unah.poo.demo.Modelo.Mensualidades;
import hn.unah.poo.demo.Repositorio.CondominiosRepositorio;
import hn.unah.poo.demo.Repositorio.MensualidadesRepositorio;
import hn.unah.poo.demo.dto.CondominiosDTO;

@Service
public class CondominioServicio {

    @Autowired
    private CondominiosRepositorio condominiosRepositorio;

    @Autowired
    private MensualidadesRepositorio mensualidadesRepositorio;

    private ModelMapper modelMapper = new ModelMapper();

    public String crearCondominio(CondominiosDTO nvoCondominio) {
       Condominios condominios = new Condominios();
       condominios = modelMapper.map(nvoCondominio, Condominios.class);

       int contador = 1;
       int dias=1;
       LocalDate fechaHoy = LocalDate.now();
       LocalDate nuevaFecha;
        while (contador <= 12){
            Mensualidades mensualidades = new Mensualidades();
            mensualidades.setMonto(condominios.getArea()*2.5);
            nuevaFecha = fechaHoy.plusMonths(dias);
            mensualidadesRepositorio.save(mensualidades);
            contador++;
            dias++;
        }
       condominiosRepositorio.save(condominios);
       return "Condomino creado exitosamente";
    }
}
