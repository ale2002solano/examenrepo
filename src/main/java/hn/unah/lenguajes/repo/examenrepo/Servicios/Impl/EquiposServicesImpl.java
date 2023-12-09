package hn.unah.lenguajes.repo.examenrepo.Servicios.Impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes.repo.examenrepo.Modelos.Equipos;
import hn.unah.lenguajes.repo.examenrepo.Repositorios.EquiposRepositorio;
import hn.unah.lenguajes.repo.examenrepo.Servicios.EquiposService;

public class EquiposServicesImpl implements EquiposService{

    @Autowired
    private EquiposRepositorio eRepositorio;
    

    @Override
    public Equipos crearEquipos(Equipos equipos) {
        return this.eRepositorio.save(equipos);
       
    }

    @Override
    public Equipos buscarEquiposId(Integer codigoequipo) {
        return this.eRepositorio.findById(codigoequipo).get();
       
    }

    @Override
    public Equipos eliminarEquiposId(Integer codigoequipo) {
        Equipos equipoAEliminar = this.eRepositorio.findById(codigoequipo)
        .orElseThrow(() -> new NoSuchElementException("No se encontró el equipo con el ID proporcionado: " + codigoequipo));
    
    this.eRepositorio.deleteById(codigoequipo);
    
    return equipoAEliminar;
        
    }
    
}
