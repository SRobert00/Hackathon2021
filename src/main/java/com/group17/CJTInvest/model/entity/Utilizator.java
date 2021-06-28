package com.group17.CJTInvest.model.entity;


import javax.persistence.*;

@Table(name = "utilizator")
@Entity
public class Utilizator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    private String nume;

    private String prenume;

    private String departament;

    private String functie;

    private String email;

    private String telefon;

    private String rol;

    public Utilizator() {
    }

    public Utilizator(Long id, String nume, String prenume, String departament, String functie, String email, String telefon, String rol) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.departament = departament;
        this.functie = functie;
        this.email = email;
        this.telefon = telefon;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}