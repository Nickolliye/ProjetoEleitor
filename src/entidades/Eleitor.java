/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.time.LocalDate;

/**
 *
 * @author dobne
 */
public class Eleitor {
    //Atributos
    private String nome = "";
    private int anoDeNascimento = 0;
    
    //Métodos
    public Eleitor(String nome, int anoDeNascimento) throws Exception{
        if (nome.isEmpty()) throw new Exception("O nome não pode estar vazio.");
        this.nome = nome;
        if(anoDeNascimento <= 0) throw new Exception("O ano de nascimento não pode ser <= 0");
        this.anoDeNascimento = anoDeNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception{
        if (nome.isEmpty()) throw new Exception("O nome não pode estar vazio.");
        this.nome = nome;
    }
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }
    public void setAnoDeNascimento(int anoDeNascimento) throws Exception{
        if(anoDeNascimento <= 0) throw new Exception("O ano de nascimento não pode ser <= 0");
        this.anoDeNascimento = anoDeNascimento;
    }
    
    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        return anoAtual - anoDeNascimento;
    }
    public String calcularTipoDeEleitor(){
        int idade = calcularIdade();
        if(idade < 16) return "Não Eleitor";
        else if (idade >= 16 || idade < 18) return "Eleitor Facultativo";
        else if (idade >=18 || idade <= 65) return "Eleitor Obrigatório";
        else return "Eleitor Facultativo";
    }

    @Override
    public String toString() {
        return "Eleitor{" + "nome=" + nome + ", anoDeNascimento=" + anoDeNascimento + '}';
    }
    
    
}
