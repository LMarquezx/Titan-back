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
    @Setter
    @Getter
    private String fecha;
    @Setter
    @Getter
    @NotNull(message = "El codigo es obligatorio")
    private String codigo;
    @Setter
    @Getter
    private String medicamento;
    @Setter
    @Getter
    private String unidad;
    @Setter
    @Getter
    private int cantidad;
}
