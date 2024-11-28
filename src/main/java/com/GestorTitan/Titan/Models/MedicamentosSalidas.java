package com.GestorTitan.Titan.Models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotNull;

@Document(collection = "medicamentosSalidas")
public class MedicamentosSalidas {
    @Setter
    @Getter
    @Id
    private String id;
    private String fecha;
    @NotNull(message = "El codigo es obligatorio")
    private String codigo;
    private String medicamento;
    private String unidad;
    private int cantidad;
}
