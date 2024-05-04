package com.upc.demorail.cotroller;

import com.upc.demorail.model.Peru;
import com.upc.demorail.service.PeruService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rail")
public class PeruController {
    final PeruService peruService;

    public PeruController(PeruService peruService) {
        this.peruService = peruService;
    }

    @GetMapping()
    public ResponseEntity<List<Peru>> findAll () {
        return ResponseEntity.ok(peruService.findAll());

    }
    @GetMapping("/{id}")
    public ResponseEntity<Peru> findById (@PathVariable Long id) {
        return ResponseEntity.ok(peruService.findById(id));

    }
    @PostMapping
    public ResponseEntity<Peru> add (@RequestBody Peru peru) {
        return new ResponseEntity<>(peruService.add(peru), HttpStatus.CREATED);
    }
}
