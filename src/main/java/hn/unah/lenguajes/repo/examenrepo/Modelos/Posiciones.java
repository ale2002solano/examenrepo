package hn.unah.lenguajes.repo.examenrepo.Modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="posiciones")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Posiciones {

    @Id
    @Column(name = "idPosiciones")
    private Integer idPosiciones;

    @OneToOne
    @JoinColumn(name = "codigoequipo", referencedColumnName = "codigoequipo")
    private Equipos codigoequipo;

     @Column(name="empates")
    private Integer empates;

    @Column(name="ganados")
    private Integer ganados;

    @Column(name="perdidos")
    private Integer perdidos;

    @Column(name="golesfavor")
    private Integer golesfavor;

    @Column(name="golescontra")
    private Integer golescontra;

    @Column(name="puntos")
    private Integer puntos;
    
}
