/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ficdev.duasentidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pedroclarindodasilvaneto
 */
@Entity
@Table(name = "nutricionistas")
public class Nutricionista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "nome")
    public String nome;

    @Column(name = "crn")
    public String crn;

    @Column(name = "uuid")
    public int uuid;
    
    @OneToMany(mappedBy = "nutricionista", cascade = CascadeType.ALL)
    private List<Receita> receitas;

    // Métodos getter e setter para os atributos id, nome, crn e uuid

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the receitas
     */
    public List<Receita> getReceitas() {
        return receitas;
    }

    /**
     * @param receitas the receitas to set
     */
    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
    
    
    
}
