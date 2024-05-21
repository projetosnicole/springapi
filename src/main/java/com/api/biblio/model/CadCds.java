package com.api.biblio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cds")
public class CadCds implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String nomecd;
    private String banda;
    private String ano;
  
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomecd() {
        return nomecd;
    }
    public void setNomecd(String nomecd) {
        this.nomecd = nomecd;
    }
    public String getBanda() {
        return banda;
    }
    public void setBanda(String banda) {
        this.banda = banda;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

}
