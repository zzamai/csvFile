package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {

    public ArrayList<Pnae> readFile(String path){

        ArrayList<Pnae> list = new ArrayList<>();

        try (InputStream inputStream = new FileInputStream(path) ){

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;

            bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null){

                line = line.replace("\"", "");
                String [] attr = line.split(";");

                Pnae pnae = new Pnae();
                pnae.setAno(Integer.parseInt(attr[0]));
                pnae.setEstado(attr[1]);
                pnae.setMunicipio(attr[2]);
                pnae.setEsfera(attr[3]);
                pnae.setEtapa(attr[4]);
                pnae.setQntAlunos(Integer.parseInt(attr[5]));

                list.add(pnae);

            }

        }catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

}
