package hn.unah.poo.demo.Modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="mensualidades")
public class Mensualidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="idmensualidad")
    private int idMensualidad;
    
    @ManyToOne()
    @JoinColumn(name="numerocondominio",referencedColumnName = "numerocondominio")
    private Condominios condominios;

    private double monto;

    private char estado;

    private LocalDate fecha;
     
}
