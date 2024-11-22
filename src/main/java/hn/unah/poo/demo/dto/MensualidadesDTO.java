package hn.unah.poo.demo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MensualidadesDTO {

    private int idMensualidad;

    private CondominiosDTO condominios;

    private double monto;

    private char estado;

    private LocalDate fecha;
}
