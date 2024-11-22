package hn.unah.poo.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CondominiosDTO {
    private int numeroCondominio; 

    private int nivel;
    private double area;
    private String color;
    private int parqueos;

    private List <MensualidadesDTO> mensualidades;
}
