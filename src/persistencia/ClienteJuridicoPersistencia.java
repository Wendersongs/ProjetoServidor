package persistencia;
import controle.Utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.CRUD;

import modelos.ClientesJuridicos;
public class ClienteJuridicoPersistencia implements CRUD {
    Utils util = new Utils();

    private String nomeDoArquivoNoDisco = null;

    public ClienteJuridicoPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Object objeto) throws Exception {
        try {
            
            ArrayList<ClientesJuridicos> pilhaDeClientes = recuperar();
            ClientesJuridicos ultimoCliente = pilhaDeClientes.get(pilhaDeClientes.size()-1) ;
            Integer lastId = Integer.parseInt(ultimoCliente.getId())+1;
            ClientesJuridicos clienteJuri = (ClientesJuridicos) objeto;
            if (clienteJuri.getId()=="")
            {
            clienteJuri.setId(lastId.toString());
            }
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(clienteJuri.desmontarObjeto() + "\n");
            bw.flush();
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }
    public String retornaArraycomoString(ArrayList<ClientesJuridicos> lista)
     {
         String msg = "";
                for (ClientesJuridicos a :lista) {
                    
                  msg+= a.desmontarObjeto()+"\n";
                  
   
        }
     return msg;
    }
    public ArrayList<ClientesJuridicos> recuperar() throws Exception {
        try {
            ArrayList<ClientesJuridicos> pilhaDeClientes = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                ClientesJuridicos objetoClientes = new ClientesJuridicos();
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
