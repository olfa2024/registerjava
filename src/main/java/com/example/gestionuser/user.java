package com.example.gestionuser;

import jakarta.persistence.*;

@Entity
@Table(name = "userss")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userss_SEQ")
    @SequenceGenerator(name = "userss_SEQ", sequenceName = "userss_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;

    // Constructeur par défaut
    public user() {
    }

    // Constructeur avec email et mot de passe
    public user(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter pour l'ID
    public Long getId() {
        return id;
    }

    // Setter pour l'ID
    public void setId(Long id) {
        this.id = id;
    }

    // Getter pour l'email
    public String getEmail() {
        return email;
    }

    // Setter pour l'email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter pour le mot de passe
    public String getPassword() {
        return password;
    }

    // Setter pour le mot de passe
    public void setPassword(String password) {
        this.password = password;
    }

    // Méthode pour afficher les détails de l'utilisateur
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
