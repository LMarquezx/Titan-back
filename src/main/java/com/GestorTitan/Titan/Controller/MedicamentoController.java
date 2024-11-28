package com.GestorTitan.Titan.Controller;
import com.GestorTitan.Titan.Models.MedicamentoEntradas;
import com.GestorTitan.Titan.Repository.MedicamentosEntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentosEntradaRepository _mEntradaRepository;

    @GetMapping
    public List<MedicamentoEntradas> listarMedicamentos(){
        return _mEntradaRepository.findAll();
    }

    @PostMapping
    public MedicamentoEntradas agregarMedicamento(@RequestBody MedicamentoEntradas _mEntradas){
        return _mEntradaRepository.save(_mEntradas);
    }

    @DeleteMapping("/{id}")
    public void eliminarMedicamento(@PathVariable String id){
        _mEntradaRepository.deleteById(id);
    }

}
