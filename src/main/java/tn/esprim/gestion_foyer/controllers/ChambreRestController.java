package tn.esprim.gestion_foyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestion_foyer.entities.Chambre;
import tn.esprim.gestion_foyer.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    IChambreService chambreService;

    //http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    //http://localhost:8089/tpfoyer/chambre/retrieve-chambre/{idChambre}
    @GetMapping("/retrieve-chambre/{idChambre}")
    public Chambre retrieveChambre(@PathVariable("idChambre") Long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    //http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    //http://localhost:8089/tpfoyer/chambre/remove-chambre/{idChambre}
    @DeleteMapping("/remove-chambre/{idChambre}")
    public void removeChambre(@PathVariable("idChambre") Long idChambre) {
        chambreService.removeChambre(idChambre);
    }

    //http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre chambre) {
        return chambreService.modifyChambre(chambre);
    }
}
