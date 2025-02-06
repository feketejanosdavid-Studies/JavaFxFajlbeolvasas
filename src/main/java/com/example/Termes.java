package com.example;

import java.time.LocalDate;

public class Termes {
    Integer id;
    String nev;
    String dulo;
    Integer mennyiseg;
    LocalDate betakaritas;
    public Termes() {
    }
    public Termes(Integer id, String nev, String dulo, Integer mennyiseg, LocalDate betakaritas) {
        this.id = id;
        this.nev = nev;
        this.dulo = dulo;
        this.mennyiseg = mennyiseg;
        this.betakaritas = betakaritas;
    }
    public Termes(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getDulo() {
        return dulo;
    }
    public void setDulo(String dulo) {
        this.dulo = dulo;
    }
    public Integer getMennyiseg() {
        return mennyiseg;
    }
    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    public LocalDate getBetakaritas() {
        return betakaritas;
    }
    public void setBetakaritas(LocalDate betakaritas) {
        this.betakaritas = betakaritas;
    }

    

}
