package com.GestorTitan.Titan.Models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotNull;

@Document(collection = "Medicamentos")
public class MedicamentoExist {

    @Setter
    @Getter
    @Id
    private String id;
    @Setter
    @Getter
    private String codigo;
    @Setter
    @Getter
    private String medicamento;
}
