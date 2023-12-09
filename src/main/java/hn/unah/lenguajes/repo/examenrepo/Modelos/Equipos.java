package hn.unah.lenguajes.repo.examenrepo.Modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="equipos")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipos {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "codigoEquipo")
    private Integer codigoequipo;

      @Column(name="nombre")
    private String nombre;

    @Column(name="ataque")
    private double ataque;

    @Column(name="defensa")
    private double defensa;
}
