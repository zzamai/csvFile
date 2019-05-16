package model;

public class Municipio implements Comparable<Municipio> {

    private String cidade;
    private int alunos;

    public Municipio(String cidade, int alunos){
        this.setCidade(cidade);
        this.setAlunos(alunos);
    }

    @Override
    public int compareTo(Municipio o) {
        if(this.getAlunos() < o.getAlunos()){
            return 1;
        }
        if(this.getAlunos() > o.getAlunos()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s - Alunos: %d", this.getCidade(), this.getAlunos());
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}
