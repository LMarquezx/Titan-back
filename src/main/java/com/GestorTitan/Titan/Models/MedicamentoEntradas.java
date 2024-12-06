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
    @Setter
    @Getter
    private String fecha;
    @Setter
    @Getter
    private int noDoc;
    @Setter
    @Getter
    @NotNull(message = "El codigo es obligatorio")
    private String codigo;
    @Setter
    @Getter
    private String medicamento;
    @Setter
    @Getter
    private String Caducidad;
    @Setter
    @Getter
    private String unidad;
    @Setter
    @Getter
    private int entrada;
    @Setter
    @Getter
    private int salida;
    @Setter
    @Getter
    private int stock;
    @Setter
    @Getter
    private int diasDisp;
    @Setter
    @Getter
    private String estado;
}
