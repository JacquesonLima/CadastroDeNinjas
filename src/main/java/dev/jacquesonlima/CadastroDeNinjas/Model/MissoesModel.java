package dev.jacquesonlima.CadastroDeNinjas.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private boolean isConcluida;

    // Uma missão pode ter um ou mais ninjas.
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nome, String dificuldade, boolean isConcluida, List<NinjaModel> ninjas) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.isConcluida = isConcluida;
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean isConcluida() {
        return isConcluida;
    }

    public void setConcluida(boolean concluida) {
        isConcluida = concluida;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinja(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }
}
