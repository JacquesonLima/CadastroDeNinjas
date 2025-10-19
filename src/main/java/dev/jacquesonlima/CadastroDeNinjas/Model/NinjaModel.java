package dev.jacquesonlima.CadastroDeNinjas.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(Long id, String nome, String email, int idade, MissoesModel missoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }
}
