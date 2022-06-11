package com.br.pizzaia.prova2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long renavam;

    @NotNull
    private String modelo;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate anoFabricacao;

    @NotNull
    private int cilindrada;

    @NotNull
    private String cor;

    @NotNull
    private String montadora;
}
