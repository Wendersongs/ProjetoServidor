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
import modelos.ContratoLocacao;
import modelos.ContratoLocacao;
import modelos.Veiculos;
import persistencia.VeiculoPersistencia;

/**
 *
 * @author Kevin
 */
public class ContratoLocacaoPersistencia implements CRUD {
    Utils util = new Utils();
    VeiculoPersistencia vp = new VeiculoPersistencia("C:\\desenvolvimento\\Veiculos.txt");

    private String nomeDoArquivoNoDisco = null;

    public ContratoLocacaoPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    @Override
    public void incluir(Object objeto) throws Exception {
        try {
            
            ArrayList<ContratoLocacao> pilhaDeClientes = recuperar();
            ArrayList<ContratoLocacao> pilhaDeClientes2 = recuperar();
            ContratoLocacao ultimoCliente = pilhaDeClientes.get(pilhaDeClientes.size()-1) ;
            Integer lastId = Integer.parseInt(ultimoCliente.getId())+1;
            ContratoLocacao locacao = (ContratoLocacao) objeto;
            if ("".equals(locacao.getId()))
            {
            locacao.setId(lastId.toString());
             FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(locacao.desmontarObjeto() + "\n");
            bw.flush();
                alteraCarro(locacao.getIdVeiculo());
            bw.close();
            }
            else {
                File file = new File(nomeDoArquivoNoDisco);

                    if ( file.exists()) {
                                file.delete();
                                FileWriter fw2 = new FileWriter(nomeDoArquivoNoDisco);
                                BufferedWriter bw = new BufferedWriter(fw2);
                                for (ContratoLocacao a : pilhaDeClientes) {
                                int d=0;
                                if (locacao.equals(a) ){
                                     pilhaDeClientes2.remove(a);
                                     pilhaDeClientes2.add(locacao);
                
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
    public String retornaArraycomoString(ArrayList<ContratoLocacao> lista)
     {
         String msg = "";
                for (ContratoLocacao a :lista) {
                    
                  msg+= a.desmontarObjeto()+"\n";
                  
   
        }
     return msg;
    }
    public ArrayList<ContratoLocacao> recuperar() throws Exception {
        try {
            ArrayList<ContratoLocacao> pilhaDeClientes = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                ContratoLocacao objetoClientes = new ContratoLocacao();
                objetoClientes.montarObjeto(linha);
                pilhaDeClientes.add(objetoClientes);
            }
            br.close();
            return pilhaDeClientes;
        } catch (Exception erro) {
            throw erro;
        }
    }
    public String alteraCarro(String idCarro) throws Exception{
        
     ArrayList<Veiculos> pilhaDeClientes = new ArrayList<>();
     ArrayList<Veiculos> pilhaDeClientes2 = new ArrayList<>();
     Veiculos veiculo = new Veiculos();
     
       try{
           pilhaDeClientes = vp.recuperar();
           pilhaDeClientes2 = vp.recuperar();
           for (Veiculos a : pilhaDeClientes) {
               if (a.getId().equals(idCarro)){
               veiculo=a;
               }
              
           }
        File file = new File("C:\\desenvolvimento\\Veiculos.txt");

                    if ( file.exists()) {
                                file.delete();
                                FileWriter fw2 = new FileWriter("C:\\desenvolvimento\\Veiculos.txt");
                                BufferedWriter bww = new BufferedWriter(fw2);
                                for (Veiculos a : pilhaDeClientes) {
                                
                                if (veiculo.equals(a) ){
                                    
                                     pilhaDeClientes2.remove(a);
                                     
                                     veiculo.setEstado("Indisponivel");
                                     pilhaDeClientes2.add(veiculo);
                
                                    }
                               }
                                                               
                                
                                bww.write(vp.retornaArraycomoString(pilhaDeClientes2));
                                bww.flush();
                                bww.close();
                                //fw2.write();
                                        }
            
            
        } catch (Exception erro) {
            throw erro;
        }
    
    
    return "ok";
    }
    
        public ArrayList<Veiculos> recuperarVeiculo() throws Exception {
        try {
            ArrayList<Veiculos> pilhaDeClientes = new ArrayList<>();
            FileReader fr = new FileReader("C:\\desenvolvimento\\Veiculos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Veiculos objetoClientes = new Veiculos();
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
