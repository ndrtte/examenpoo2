package hn.unah.poo.demo.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.demo.Servicio.CondominioServicio;
import hn.unah.poo.demo.dto.CondominiosDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/condominios")
public class CondominiosControlador {

    @Autowired
    private CondominioServicio condominioServicio;
    
    @PostMapping("/crear/nuevo")
    public String crearCondominio(@RequestBody CondominiosDTO nvoCondominio) {
        return condominioServicio.crearCondominio(nvoCondominio);
    }
    

}
