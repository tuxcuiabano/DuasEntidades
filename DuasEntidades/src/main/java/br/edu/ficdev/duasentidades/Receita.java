/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ficdev.duasentidades;

/**
 *
 * @author pedroclarindodasilvaneto
 */
import javax.persistence.*;

@Entity
@Table(name = "receitas")
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "nome_receita")
    public String nomeReceita;

    @ManyToOne
    @JoinColumn(name = "nutricionista_fk")
    public Nutricionista nutricionista;

    @Column(name = "numero_ingredientes")
    public int numeroIngredientes;

    // Métodos getter e setter para os atributos id, nomeReceita, nutricionista e numeroIngredientes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    public void setNumeroIngredientes(int numeroIngredientes) {
        this.numeroIngredientes = numeroIngredientes;
    }
}
