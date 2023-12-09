package hn.unah.lenguajes.repo.examenrepo.Servicios;

import hn.unah.lenguajes.repo.examenrepo.Modelos.Equipos;

public interface EquiposService {
     public Equipos crearEquipos(Equipos equipos);
    public Equipos buscarEquiposId(Integer codigoequipo);
    public Equipos eliminarEquiposId(Integer codigoequipo);
}
