/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.CRUD;
import modelos.ClientesFisicos;
public class ClienteFisicoPersistencia implements CRUD {

    

    private String nomeDoArquivoNoDisco = null;

    public ClienteFisicoPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Object objeto) throws Exception {
        try {
            ArrayList<ClientesFisicos> pilhaDeClientes = recuperar();
            ClientesFisicos ultimoCliente = pilhaDeClientes.get(pilhaDeClientes.size()-1) ;
            Integer lastId = Integer.parseInt(ultimoCliente.getId())+1;
            ClientesFisicos clienteFisico = (ClientesFisicos) objeto;
            clienteFisico.setId(lastId.toString());
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(clienteFisico.desmontarObjeto() + "\n");
            bw.flush();
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
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
