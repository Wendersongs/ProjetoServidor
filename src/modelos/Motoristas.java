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
public class Motoristas extends Pessoa implements Dados{

    /**
     * @return the cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the enderecoAnexo
     */
    public String getEnderecoAnexo() {
        return enderecoAnexo;
    }

    /**
     * @param enderecoAnexo the enderecoAnexo to set
     */
    public void setEnderecoAnexo(String enderecoAnexo) {
        this.enderecoAnexo = enderecoAnexo;
    }
    private  String cnh;
    private  String enderecoAnexo;
    
    
    
     public Motoristas(){
         this.id="";
        this.nome="";
        this.cpf="";
        this.cnh="";
        this.enderecoAnexo="";
       
        
        
    }
    
    public Motoristas(String id , String nome , String cpf , String cnh , String enderecoAnexo){
        
        this.id=id;
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.enderecoAnexo = enderecoAnexo;
        
        
    }

    @Override
    public String desmontarObjeto() {
        return this.id+";"+this.nome+";"+this.cpf+";"+this.getCnh()+";"+this.getEnderecoAnexo()+";";
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
try {
            String vetorString[] = stringDados.split(";");
            this.id=vetorString[0];
            this.nome = vetorString[1];
            this.cpf = vetorString[2];
            this.setCnh(vetorString[3]);
            this.setEnderecoAnexo(vetorString[4]);
            
          
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Motorista");
        }   
    }
    
    
    
    
}
