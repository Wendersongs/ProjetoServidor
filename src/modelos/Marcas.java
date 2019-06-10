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
public class Marcas extends Marca implements Dados{
    
    public Marcas(){
         
        this.nomeDaMarca="";
        this.enderecoAnexoMarca="";
        
    }
    
    public Marcas(String nomeDaMarca , String enderecoAnexoMarca){
         
        this.nomeDaMarca=nomeDaMarca;
        this.enderecoAnexoMarca=enderecoAnexoMarca;
        
    }
    
    
    
    

    @Override
    public String desmontarObjeto() {
        return this.nomeDaMarca+";"+this.enderecoAnexoMarca+";";
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
        try {
            String vetorString[] = stringDados.split(";");
            this.nomeDaMarca = vetorString[0];
            this.enderecoAnexoMarca = vetorString[1];
          
            
          
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto da Marca");
        } 
    }
    
}
