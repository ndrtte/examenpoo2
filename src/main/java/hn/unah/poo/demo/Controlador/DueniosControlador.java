package hn.unah.poo.demo.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.demo.Servicio.DuenioServicio;
import hn.unah.poo.demo.dto.DueniosDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/duenio")
public class DueniosControlador {
    @Autowired
    private DuenioServicio duenioServicio;
    
    @GetMapping("/obtener/{dni}")
    public DueniosDTO obtenerDuenio(@PathVariable(name="dni") String dni) {
        return duenioServicio.obtenerDuenio(dni);
    }

    @GetMapping("/obtener")
    public List<DueniosDTO> obtenerTodos (){
        return duenioServicio.obtenerTodos();
    }

    @DeleteMapping("/Eliminar/dni")
    public String eliminarDuenio(@RequestParam(name="dni")String dni){
        return duenioServicio.eliminarDuenio(dni);
    }

    @PostMapping("/crear/nuevo")
    public String crearDuenio(@RequestBody DueniosDTO nvoDuenio) {
        return duenioServicio.crearDuenio(nvoDuenio);
    }
    
    

}
