package br.com.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private Long id;
    private String name;
    private String username;

    public User(Long id, String nome, String username){
        this.id = id;
        this.name = nome;
        this.username = username;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    public void setId(Long novoid) {
        this.id = novoid;
    }

    public void setName(String novoname){
        this.name = novoname;
    }

    public void setUserName(String novoUserName){
        this.username = novoUserName;
    }

    @Override
    public String toString(){
        String saida = "ID : "+this.id+System.lineSeparator()+"Nome: "+ this.name + System.lineSeparator()+"UserName: "+this.username+System.lineSeparator();
        
    return saida;

    }
    

    
    
}
