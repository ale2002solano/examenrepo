package hn.unah.lenguajes.repo.examenrepo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.repo.examenrepo.Modelos.Equipos;
import hn.unah.lenguajes.repo.examenrepo.Servicios.Impl.EquiposServicesImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/equipo")
public class EquiposController {
    @Autowired
    private EquiposServicesImpl equiposServicesImpl;

    @GetMapping("/prueba")
    public  String prueba(){
        return "Funciona";
    }
    
    @PostMapping("/crear")
    public Equipos crearEquipo(@RequestBody Equipos equipos){
        return this.equiposServicesImpl.crearEquipos(equipos);
    }

    @DeleteMapping("/eliminar")
    public Equipos eliminarEquipoId(@RequestParam(name="codigoequipo") Integer codigoequipo){
        return this.equiposServicesImpl.eliminarEquiposId(codigoequipo);
    }
    
    @GetMapping("/buscar")
    public Equipos buscarEquipo(@RequestParam(name="codigoequipo") Integer codigoequipo){
        return this.equiposServicesImpl.buscarEquiposId(codigoequipo);
    }
}
