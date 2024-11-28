package com.GestorTitan.Titan.Repository;

import com.GestorTitan.Titan.Models.MedicamentoEntradas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicamentosEntradaRepository extends MongoRepository<MedicamentoEntradas, String> {

}
