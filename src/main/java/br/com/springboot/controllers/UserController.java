package br.com.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.Aluno;
import br.com.springboot.model.Professor;
import br.com.springboot.model.User;

@RestController
@RequestMapping("/users")
public class UserController {


    private List<User> users = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    
    @GetMapping("/{id}")
    public String user(@PathVariable("id") Long id){
       System.out.println("O id é " + id);
       User user = buscaUser(id);
       return user.toString();
    }

    @GetMapping("/aluno/{id}")
    public String buscaAluno(@PathVariable("id") Long id){
       System.out.println("O id é " + id);
       Aluno aluno = encontraAluno(id);
       return aluno.toString();
    }

    @GetMapping("/professor/{id}")
    public String buscaProfessor(@PathVariable("id") Long id){
       System.out.println("O id é " + id);
       Professor professor = encontraProfessor(id);
       return professor.toString();
    }

    @PostMapping("/aluno")
    public String aluno(@RequestBody Aluno aluno){
        alunos.add(aluno);
        return aluno.toString();
    }

    @PostMapping("/professor")
    public String professor(@RequestBody Professor professor){
        professores.add(professor);
        return professor.toString();
    }

    @PostMapping("/")
    public String user(@RequestBody User user){
        users.add(user);
        return user.toString();
    }
    
    @GetMapping("/aluno/list")
    public String alunos(){
        return alunos.toString();
    }

    @GetMapping("/professor/list")
    public String professores(){
        return professores.toString();
    }


    @GetMapping("/list")
    public String users(){
        return users.toString();
    }
    
    public User buscaUser(Long id){
        for (User user : users) {
            if(user.getId()==id){
                return user;
            }
        }
        User usuariovazio = new User(0L,"vazio","vazionickname");
        return usuariovazio;
    }

    public Aluno encontraAluno(Long id){
        for (Aluno aluno : alunos) {
            if(aluno.getId()==id){
                return aluno;
            }
        }
        Aluno alunoVazio = new Aluno(0L,"vazio",1);
        return alunoVazio;
    }

    public Professor encontraProfessor(Long id){
        for (Professor professor : professores) {
            if(professor.getId()==id){
                return professor;
            }
        }
        Professor professorVazio = new Professor(0L,"vazio",1);
        return professorVazio;
    }

    @DeleteMapping("/aluno/delete/{id}")
    public void deleteAluno(@PathVariable Long id) {
        System.out.println("O id é " + id);
        Aluno aluno = encontraAluno(id);
        this.alunos.remove(aluno);  
    }

    @DeleteMapping("/professor/delete/{id}")
    public void deleteProfessor(@PathVariable Long id) {
        System.out.println("O id é " + id);
        Professor professor = encontraProfessor(id);
        this.professores.remove(professor);  
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        System.out.println("O id é " + id);
        User user = buscaUser(id);
        this.users.remove(user);  
    }

    @PutMapping("/aluno/update/{id}")
    public String updateAluno(@PathVariable("id") Long id ,@RequestBody Aluno aluno){
        Aluno aluno2 = encontraAluno(id);
        aluno2.setId(aluno.getId());
        aluno2.setNome(aluno.getNome());
        aluno2.setMatricula(aluno.getMatricula());
        return aluno2.toString();

    }

    @PutMapping("/professor/update/{id}")
    public String updateProfessor(@PathVariable("id") Long id ,@RequestBody Professor professor){
        Professor professor2 = encontraProfessor(id);
        professor2.setId(professor.getId());
        professor2.setNome(professor.getNome());
        professor2.setCargaHoraria(professor.getCargaHoraria());
        return professor2.toString();

    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable("id") Long id ,@RequestBody User user){
        User user2 = buscaUser(id);
        user2.setId(user.getId());
        user2.setName(user.getName());
        user2.setUserName(user.getUsername());
        return user2.toString();

    }
    
}
