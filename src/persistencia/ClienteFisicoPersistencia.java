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
import modelos.ClientesFisicos;
import modelos.ClientesFisicos;


    
public class ClienteFisicoPersistencia implements CRUD {
    Utils util = new Utils();

    private String nomeDoArquivoNoDisco = null;

    public ClienteFisicoPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Object objeto) throws Exception {
        try {
            
            ArrayList<ClientesFisicos> pilhaDeClientes = recuperar();
            ArrayList<ClientesFisicos> pilhaDeClientes2 = recuperar();
            ClientesFisicos ultimoCliente = pilhaDeClientes.get(pilhaDeClientes.size()-1) ;
            Integer lastId = Integer.parseInt(ultimoCliente.getId())+1;
            ClientesFisicos clienteFisico = (ClientesFisicos) objeto;
            if ("".equals(clienteFisico.getId()))
            {
            clienteFisico.setId(lastId.toString());
             FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(clienteFisico.desmontarObjeto() + "\n");
            bw.flush();
            bw.close();
            }
            else {
                File file = new File(nomeDoArquivoNoDisco);

                    if ( file.exists()) {
                                file.delete();
                                FileWriter fw2 = new FileWriter(nomeDoArquivoNoDisco);
                                BufferedWriter bw = new BufferedWriter(fw2);
                                for (ClientesFisicos a : pilhaDeClientes) {
                                int d=0;
                                if (clienteFisico.equals(a) ){
                                     pilhaDeClientes2.remove(a);
                                     pilhaDeClientes2.add(clienteFisico);
                
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
    public String retornaArraycomoString(ArrayList<ClientesFisicos> lista)
     {
         String msg = "";
                for (ClientesFisicos a :lista) {
                    
                  msg+= a.desmontarObjeto()+"\n";
                  
   
        }
     return msg;
    }
    public ArrayList<ClientesFisicos> recuperar() throws Exception {
        try {
            ArrayList<ClientesFisicos> pilhaDeClientes = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                ClientesFisicos objetoClientes = new ClientesFisicos();
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
