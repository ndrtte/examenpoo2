package hn.unah.poo.demo.dto;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DueniosDTO {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
}
