/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controle.Utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.CRUD;
import modelos.ModelosCarro;
import modelos.ModelosCarro;
import modelos.Motoristas;

/**
 *
 * @author Kevin
 */
public class ModelosCarroPersistencia implements CRUD {
    Utils util = new Utils();

    private String nomeDoArquivoNoDisco = null;

    public ModelosCarroPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Object objeto) throws Exception {
        try {
            
            ArrayList<ModelosCarro> pilhaDeClientes = recuperar();
            ArrayList<ModelosCarro> pilhaDeClientes2 = recuperar();
            ModelosCarro ultimoCliente = pilhaDeClientes.get(pilhaDeClientes.size()-1) ;
            Integer lastId = Integer.parseInt(ultimoCliente.getId())+1;
            ModelosCarro modelo = (ModelosCarro) objeto;
            if ("".equals(modelo.getId()))
            {
            modelo.setId(lastId.toString());
             FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(modelo.desmontarObjeto() + "\n");
            bw.flush();
            bw.close();
            }
            else {
                File file = new File(nomeDoArquivoNoDisco);

                    if ( file.exists()) {
                                file.delete();
                                FileWriter fw2 = new FileWriter(nomeDoArquivoNoDisco);
                                BufferedWriter bw = new BufferedWriter(fw2);
                                for (ModelosCarro a : pilhaDeClientes) {
                                int d=0;
                                if (modelo.equals(a) ){
                                     pilhaDeClientes2.remove(a);
                                     pilhaDeClientes2.add(modelo);
                
                                    }
                               }
                                                               
                                
                                bw.write(retornaArraycomoString(pilhaDeClientes2));
                                bw.flush();
                                bw.close();
                                //fw2.write();
                                        }
            }
          
        } catch (Exception erro) {
            throw erro;
        }
    }
    public String retornaArraycomoString(ArrayList<ModelosCarro> lista)
     {
         String msg = "";
                for (ModelosCarro a :lista) {
                    
                  msg+= a.desmontarObjeto()+"\n";
                  
   
        }
     return msg;
    }
    public ArrayList<ModelosCarro> recuperar() throws Exception {
        try {
            ArrayList<ModelosCarro> pilhaDeClientes = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                ModelosCarro objetoClientes = new ModelosCarro();
                objetoClientes.montarObjeto(linha);
                pilhaDeClientes.add(objetoClientes);
            }
            br.close();
            return pilhaDeClientes;
        } catch (Exception erro) {
            throw erro;
        }
    }
}
