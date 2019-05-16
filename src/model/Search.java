package model;

import java.util.ArrayList;
import java.util.Collections;

public class Search {

    private ArrayList<Pnae> pnaes = new ArrayList<>();

//    public void teste(List<Pnae> pnaes){
//        pnaes.stream().filter(p ->);
//    }

    public void setPnaes(ArrayList<Pnae> pnaes) {
        this.pnaes = pnaes;
    }

    public int buscaQntAlunosTotalPorMunicipio(String municipio){
        int alunos = 0;

        for(Pnae pnae : pnaes){
            if(pnae.getMunicipio().equalsIgnoreCase(municipio)){
                alunos += pnae.getQntAlunos();
            }
        }
        return alunos;
    }

    public void buscaQntAlunosPorModalidadePorEstado(String estado){

        for (Pnae pnae : pnaes){
            if(pnae.getEstado().equalsIgnoreCase(estado)){
                System.out.println(pnae.getEtapa()+ " : " +pnae.getQntAlunos());
            }
        }
    }

    public int buscaQntAlunosTotalPorModalidade(String modalidade){
        int alunos = 0;

        for (Pnae pnae : pnaes){
            if(pnae.getEtapa().equalsIgnoreCase(modalidade)){
                alunos += pnae.getQntAlunos();
            }
        }
        return alunos;
    }

    public int buscaQntTotalAlunos(){
        int alunos = 0;

        for (Pnae pnae : pnaes){
            alunos += pnae.getQntAlunos();
        }
        return alunos;
    }

    public ArrayList<Municipio> buscaCemMunicipios(){

        ArrayList<String> listMunicipiosToAdd = new ArrayList<>();
        ArrayList<Municipio> listMunicipios = new ArrayList<>();

        for(int i=0; i<pnaes.size(); i++) {
            if(!listMunicipiosToAdd.contains(pnaes.get(i).getMunicipio()))
                listMunicipiosToAdd.add(pnaes.get(i).getMunicipio());
        }

        for(String munToAdd : listMunicipiosToAdd) {
            int alunos = 0;

            for(int i=0; i < pnaes.size(); i++){
                if(pnaes.get(i).getMunicipio().equalsIgnoreCase(munToAdd))
                    alunos += pnaes.get(i).getQntAlunos();
            }
            listMunicipios.add(new Municipio(munToAdd, alunos));

        }

        Collections.sort(listMunicipios);

        return listMunicipios;

    }

}
