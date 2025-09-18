package com.ToDoList.jpa.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_todolist")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String email;
    private String senha;
}
