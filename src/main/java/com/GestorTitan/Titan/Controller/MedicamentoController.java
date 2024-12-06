package com.GestorTitan.Titan.Controller;
import com.GestorTitan.Titan.Models.MedicamentoEntradas;
import com.GestorTitan.Titan.Models.MedicamentosSalidas;
import com.GestorTitan.Titan.Repository.MedicamentosEntradaRepository;
import com.GestorTitan.Titan.Repository.MedicamentosSalidasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MedicamentoController {

    @Autowired
    private MedicamentosEntradaRepository _mEntradaRepository;
    @Autowired
    private MedicamentosSalidasRepository _mSalidasRepository;

    @GetMapping("/medicamentos")
    public List<MedicamentoEntradas> listarMedicamentos(){
        return _mEntradaRepository.findAll();
    }

    @PostMapping("/medicamentos/create")
    public MedicamentoEntradas agregarMedicamento(@RequestBody MedicamentoEntradas _mEntradas){
        return _mEntradaRepository.save(_mEntradas);
    }

    @DeleteMapping("medicamentos/{id}")
    public ResponseEntity<Void> eliminarMedicamento(@PathVariable String id){
        if (!_mEntradaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        _mEntradaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("medicamentos/{id}")
    public ResponseEntity<MedicamentoEntradas> editarMedicamento(
            @PathVariable String id,
            @RequestBody MedicamentoEntradas medicamentoActualizado) {

        Optional<MedicamentoEntradas> medicamentoExistente = _mEntradaRepository.findById(id);

        if (medicamentoExistente.isPresent()) {
            MedicamentoEntradas medicamento = medicamentoExistente.get();

            // Actualizar campos del medicamento
            medicamento.setCodigo(medicamentoActualizado.getCodigo());
            medicamento.setFecha(medicamentoActualizado.getFecha());
            medicamento.setNoDoc(medicamentoActualizado.getNoDoc());
            medicamento.setMedicamento(medicamentoActualizado.getMedicamento());
            medicamento.setCaducidad(medicamentoActualizado.getCaducidad());
            medicamento.setUnidad(medicamentoActualizado.getUnidad());
            medicamento.setEntrada(medicamentoActualizado.getEntrada());
            medicamento.setSalida(medicamentoActualizado.getSalida());
            medicamento.setStock(medicamentoActualizado.getStock());
            medicamento.setDiasDisp(medicamentoActualizado.getDiasDisp());
            medicamento.setEstado(medicamentoActualizado.getEstado());

            _mEntradaRepository.save(medicamento);

            return ResponseEntity.ok(medicamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Listar medicamentos
    @GetMapping("/medicamentos-salidas")
    public List<MedicamentosSalidas> listarMedicamentosSalidas() {
        return _mSalidasRepository.findAll();
    }

    // Añadir un nuevo medicamento
    @PostMapping("/medicamentos-salidas/create")
    public MedicamentosSalidas agregarMedicamentoSalida(@RequestBody MedicamentosSalidas medicamentoSalida) {
        return _mSalidasRepository.save(medicamentoSalida);
    }

    // Eliminar un medicamento por ID
    @DeleteMapping("/medicamentos-salidas/{id}")
    public ResponseEntity<Void> eliminarMedicamentoSalida(@PathVariable String id) {
        if (!_mSalidasRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        _mSalidasRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Editar un medicamento existente
    @PutMapping("/medicamentos-salidas/{id}")
    public ResponseEntity<MedicamentosSalidas> editarMedicamentoSalida(
            @PathVariable String id,
            @RequestBody MedicamentosSalidas medicamentoActualizado) {

        Optional<MedicamentosSalidas> medicamentoExistente = _mSalidasRepository.findById(id);

        if (medicamentoExistente.isPresent()) {
            MedicamentosSalidas medicamento = medicamentoExistente.get();

            // Actualizar campos del medicamento
            medicamento.setFecha(medicamentoActualizado.getFecha());
            medicamento.setCodigo(medicamentoActualizado.getCodigo());
            medicamento.setMedicamento(medicamentoActualizado.getMedicamento());
            medicamento.setUnidad(medicamentoActualizado.getUnidad());
            medicamento.setCantidad(medicamentoActualizado.getCantidad());

            _mSalidasRepository.save(medicamento);

            return ResponseEntity.ok(medicamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
