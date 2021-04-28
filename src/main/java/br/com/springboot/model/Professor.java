package br.com.springboot.model;

public class Professor {

    
   private Long id;
   private String nome;
   private int cargaHoraria;

   public Professor(Long id,String nome,int carga){
       this.id = id;
       this.nome = nome;
       this.cargaHoraria = carga;
   }

   public Long getId(){
       return this.id;
   }

   public String getNome(){
       return this.nome;
   }

   public int getCargaHoraria(){
       return this.cargaHoraria;
   }

   public void setId(Long novoId){
       this.id = novoId;
   }

   public void setNome(String novoNome){
       this.nome = novoNome;
   }

   public void setCargaHoraria(int novaCarga){
       this.cargaHoraria = novaCarga;
   }

   @Override
   public String toString(){
       String saida = "ID : "+this.id+System.lineSeparator()+"Nome: "+ this.nome + System.lineSeparator()+"Carga Horaria: "+this.cargaHoraria+System.lineSeparator();
       
   return saida;

   }


    
}
