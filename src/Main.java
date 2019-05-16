import model.Municipio;
import model.MyFileReader;
import model.Pnae;
import model.Search;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyFileReader myFileReader = new MyFileReader();
        Search search = new Search();

        String path = "/Users/viniciuszamai/Downloads/PNAE_ALUNOS_ATENDIDOS_2018.csv";
        ArrayList<Pnae> arrayList = myFileReader.readFile(path);
        search.setPnaes(arrayList);

        System.out.println("Usuário informa cidade, sistema informa quantidade de alunos atendidos:");
        int qntAlunosPorCidade = search.buscaQntAlunosTotalPorMunicipio("MONTE ALEGRE DE MINAS");
        System.out.println(qntAlunosPorCidade);

        System.out.println("Usuários informa estado, sistema informa a quantidade de alunos atendidos em cada modalidade:");
        search.buscaQntAlunosPorModalidadePorEstado("PI");

        System.out.println("Usuários informa a modalidade, sistema informa a quantidade de alunos atendidos na modalidade no país:");
        int qntAlunosPorModalidade = search.buscaQntAlunosTotalPorModalidade("CRECHE");
        System.out.println(qntAlunosPorModalidade);

        System.out.println("Quantidade de alunos atendidos no programa:");
        int qntTotalAlunos = search.buscaQntTotalAlunos();
        System.out.println(qntTotalAlunos);

        System.out.println("100 cidades que atendem o maior número de alunos, classificada em ordem decrescente por quantidade\n" +
                "de alunos atendidos:");
        ArrayList<Municipio> osCemMunicipios = search.buscaCemMunicipios();
        for(int i=0; i<100; i++){
            System.out.println("Municipio "+ (i+1) + ": " + osCemMunicipios.get(i).toString());
        }

    }

}
