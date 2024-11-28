package com.GestorTitan.Titan.Models;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotNull;

@Document(collection = "medicamentosEntradas")
public class MedicamentoEntradas {
    @Setter
    @Getter
    @Id
    private String id;
    private String fecha;
    private int noDoc;
    @NotNull(message = "El codigo es obligatorio")
    private String codigo;
    private String medicamento;
    private String Caducidad;
    private String unidad;
    private int entrada;
    private int salida;
    private int stock;
    private int diasDisp;
    private String estado;
}
