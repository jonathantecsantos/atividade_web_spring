package br.com.springboot.model;

public class Aluno  {

   private Long id;
   private String nome;
   private int matricula;

   public Aluno(Long id,String nome,int matricula){
       this.id = id;
       this.nome = nome;
       this.matricula = matricula;
   }

   public Long getId(){
       return this.id;
   }

   public String getNome(){
       return this.nome;
   }

   public int getMatricula(){
       return this.matricula;
   }

   public void setId(Long novoId){
       this.id = novoId;
   }

   public void setNome(String novoNome){
       this.nome = novoNome;
   }

   public void setMatricula(int novaMatricula){
       this.matricula = novaMatricula;
   }

   @Override
   public String toString(){
       String saida = "ID : "+this.id+System.lineSeparator()+"Nome: "+ this.nome + System.lineSeparator()+"Matricula: "+this.matricula+System.lineSeparator();
       
   return saida;

   }
    
}
