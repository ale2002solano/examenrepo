package hn.unah.lenguajes.repo.examenrepo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.repo.examenrepo.Servicios.Impl.EquiposServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/equipo")
public class EquiposController {
    @Autowired
    private EquiposServicesImpl equiposServicesImpl;

    @GetMapping("/prueba")
    public  String prueba(){
        return "Funciona";
    }
    
    
}
