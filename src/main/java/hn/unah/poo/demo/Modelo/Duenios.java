package hn.unah.poo.demo.Modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="duenios")
public class Duenios {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    @OneToMany(mappedBy = "duenios",cascade = CascadeType.ALL)
    @JsonIgnore
    private List <Condominios> condominios;
}
