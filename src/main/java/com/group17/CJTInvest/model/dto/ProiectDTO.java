package com.group17.CJTInvest.model.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProiectDTO implements Serializable {

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

    public ProiectDTO() {
    }

    public Long getProiectId() {
        return proiectId;
    }

    public void setProiectId(Long proiectId) {
        this.proiectId = proiectId;
    }

    public String getDenumireObiectiv() {
        return denumireObiectiv;
    }

    public void setDenumireObiectiv(String denumireObiectiv) {
        this.denumireObiectiv = denumireObiectiv;
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
        return total;
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