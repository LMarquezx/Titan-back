package com.GestorTitan.Titan.Repository;

import com.GestorTitan.Titan.Models.MedicamentoEntradas;
import com.GestorTitan.Titan.Models.MedicamentoExist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface medicamentoExist extends MongoRepository<MedicamentoExist, String> {

}
