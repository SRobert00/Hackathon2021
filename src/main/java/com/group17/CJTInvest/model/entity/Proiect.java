package com.group17.CJTInvest.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Proiect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proiectId", unique = true)
    private Long proiectId;

    private String denumireObiectiv;

    private Long bugetCJT;

    private Long contributieCJT;

    private Long fonduriProiecteEU;

    private Long fonduriGuvernPNDL;

    private Long alteSurse;

    private Long total;

    private Short trimestru;

    private String persoanaResponsabila;

    private String directia;

    private String statusDescriere;

    private String statusCuloare;

    private String probleme;

    private LocalDate dataActualizare;

    public Proiect() {
    }

    public Proiect(String denumireObiectiv, Long bugetCJT, Long contributieCJT, Long fonduriProiecteEU, Long fonduriGuvernPNDL, Long alteSurse, Short trimestru, String persoanaResponsabila, String directia, String statusDescriere, String statusCuloare, String probleme, LocalDate dataActualizare) {
        this.denumireObiectiv = denumireObiectiv;
        this.bugetCJT = bugetCJT;
        this.contributieCJT = contributieCJT;
        this.fonduriProiecteEU = fonduriProiecteEU;
        this.fonduriGuvernPNDL = fonduriGuvernPNDL;
        this.alteSurse = alteSurse;
        this.trimestru = trimestru;
        this.persoanaResponsabila = persoanaResponsabila;
        this.directia = directia;
        this.statusDescriere = statusDescriere;
        this.statusCuloare = statusCuloare;
        this.probleme = probleme;
        this.dataActualizare = dataActualizare;
    }

    public String getDenumireObiectiv() {
        return denumireObiectiv;
    }

    public void setDenumireObiectiv(String denumireObiectiv) {
        this.denumireObiectiv = denumireObiectiv;
    }

    public Long getProiectId() {
        return proiectId;
    }

    public void setProiectId(Long proiectId) {
        this.proiectId = proiectId;
    }

    public Long getBugetCJT() {
        return bugetCJT;
    }

    public void setBugetCJT(Long bugetCJT) {
        this.bugetCJT = bugetCJT;
    }

    public Long getContributieCJT() {
        return contributieCJT;
    }

    public void setContributieCJT(Long contributieCJT) {
        this.contributieCJT = contributieCJT;
    }

    public Long getFonduriProiecteEU() {
        return fonduriProiecteEU;
    }

    public void setFonduriProiecteEU(Long fonduriProiecteEU) {
        this.fonduriProiecteEU = fonduriProiecteEU;
    }

    public Long getFonduriGuvernPNDL() {
        return fonduriGuvernPNDL;
    }

    public void setFonduriGuvernPNDL(Long fonduriGuvernPNDL) {
        this.fonduriGuvernPNDL = fonduriGuvernPNDL;
    }

    public Long getAlteSurse() {
        return alteSurse;
    }

    public void setAlteSurse(Long alteSurse) {
        this.alteSurse = alteSurse;
    }

    public Long getTotal() {
        return total = bugetCJT + contributieCJT + fonduriProiecteEU + fonduriGuvernPNDL + alteSurse;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Short getTrimestru() {
        return trimestru;
    }

    public void setTrimestru(Short trimestru) {
        this.trimestru = trimestru;
    }

    public String getPersoanaResponsabila() {
        return persoanaResponsabila;
    }

    public void setPersoanaResponsabila(String persoanaResponsabila) {
        this.persoanaResponsabila = persoanaResponsabila;
    }

    public String getDirectia() {
        return directia;
    }

    public void setDirectia(String directia) {
        this.directia = directia;
    }

    public String getStatusDescriere() {
        return statusDescriere;
    }

    public void setStatusDescriere(String statusDescriere) {
        this.statusDescriere = statusDescriere;
    }

    public String getStatusCuloare() {
        return statusCuloare;
    }

    public void setStatusCuloare(String statusCuloare) {
        this.statusCuloare = statusCuloare;
    }

    public String getProbleme() {
        return probleme;
    }

    public void setProbleme(String probleme) {
        this.probleme = probleme;
    }

    public LocalDate getDataActualizare() {
        return dataActualizare;
    }

    public void setDataActualizare(LocalDate dataActualizare) {
        this.dataActualizare = dataActualizare;
    }
}