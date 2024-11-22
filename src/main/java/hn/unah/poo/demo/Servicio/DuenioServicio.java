package hn.unah.poo.demo.Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.demo.Modelo.Duenios;
import hn.unah.poo.demo.Repositorio.DueniosRepositorio;
import hn.unah.poo.demo.dto.DueniosDTO;

@Service
public class DuenioServicio {
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private DueniosRepositorio dueniosRepositorio;

    public DueniosDTO obtenerDuenio(String dni) {
        if(!dueniosRepositorio.existsById(dni)){
            return null;
        }
        Optional <Duenios> duenio = dueniosRepositorio.findById(dni);
        DueniosDTO duenioBD = modelMapper.map(duenio, DueniosDTO.class);
        return duenioBD;
    }

    public List<DueniosDTO> obtenerTodos (){
        List<Duenios> listaDuenios = dueniosRepositorio.findAll();
        List<DueniosDTO> listaDueniosDTO = new ArrayList<>();
        DueniosDTO dueniosDTO;
        for (Duenios duenios : listaDuenios) {
            dueniosDTO = modelMapper.map(duenios, DueniosDTO.class);
            listaDueniosDTO.add(dueniosDTO);
        }
        return listaDueniosDTO;
    }

    public String eliminarDuenio(String dni){
        if(!dueniosRepositorio.existsById(dni)){
            return "Este dueño no existe";
        }
        dueniosRepositorio.deleteById(dni);
        return"Ha sido borrado exitosamente";
    }

    public String crearDuenio(DueniosDTO nvoDuenio) {
       if(dueniosRepositorio.existsById(nvoDuenio.getDni())){
            return "Este dueño ya existe";
       }
       Duenios duenioBD = new Duenios();
       duenioBD = modelMapper.map(nvoDuenio, Duenios.class);
       dueniosRepositorio.save(duenioBD);
       return "El cliente ha sido creado";
    }

}
