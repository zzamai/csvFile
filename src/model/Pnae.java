package model;

public class Pnae {
    private int ano;
    private String estado;
    private String municipio;
    private String esfera;
    private String etapa;
    private int qntAlunos;


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEsfera() {
        return esfera;
    }

    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public int getQntAlunos() {
        return qntAlunos;
    }

    public void setQntAlunos(int qntAlunos) {
        this.qntAlunos = qntAlunos;
    }

    @Override
    public String toString(){
        return "municipio : "+municipio;

    }
}
