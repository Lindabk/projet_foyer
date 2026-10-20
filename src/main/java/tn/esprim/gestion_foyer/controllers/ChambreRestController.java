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

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/retrieve-chambre/{idChambre}")
    public Chambre retrieveChambre(@PathVariable("idChambre") Long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @DeleteMapping("/remove-chambre/{idChambre}")
    public void removeChambre(@PathVariable("idChambre") Long idChambre) {
        chambreService.removeChambre(idChambre);
    }

    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre chambre) {
        return chambreService.modifyChambre(chambre);
    }
}
