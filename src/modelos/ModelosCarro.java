/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Kevin
 */
public class  ModelosCarro extends Marcas  implements Dados{
        private String nomeDoModelo ;
        
     public ModelosCarro(){

         this.id="";   
         this.nomeDoModelo="" ;
         this.nomeDaMarca="";
}

    /**
     * @return the nomeDoModelo
     */
    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    /**
     * @param nomeDoModelo the nomeDoModelo to set
     */
    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }
    
    public ModelosCarro(String id , String nomeDoModelo , String nomeDaMarca){
        this.id=id;
        this.nomeDoModelo=nomeDoModelo;
        this.nomeDaMarca=nomeDaMarca;
        
    }
         @Override
    public String desmontarObjeto() {
        return this.id+";"+this.nomeDoModelo+";"+this.nomeDaMarca+"#";
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
try {
            String vetorString[] = stringDados.split(";");
            this.id=vetorString[0];
            this.nomeDoModelo = vetorString[1];
            this.nomeDaMarca= vetorString[2];
            
            
          
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Motorista");
        }   
    }
        
    }
    
    
    

