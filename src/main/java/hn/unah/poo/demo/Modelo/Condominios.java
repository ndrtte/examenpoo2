package hn.unah.poo.demo.Modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="condominios")
public class Condominios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroCondominio; 

    private int nivel;
    private double area;
    private String color;
    private int parqueos;

    @ManyToOne()
    @JoinColumn(name="dni",referencedColumnName = "dni")
    private Duenios duenios;

    @OneToMany(mappedBy = "condominios", cascade = CascadeType.ALL)
    @JsonIgnore
    private List <Mensualidades> mensualidades;

}
