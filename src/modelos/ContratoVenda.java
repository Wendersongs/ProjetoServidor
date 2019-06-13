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
public class ContratoVenda extends Contrato implements Dados{
    
    private String dataDaVenda;
    
    public ContratoVenda(){
        
        this.id="";
        this.idCliente="";
        this.idVeiculo="";
        this.nomeFuncionario="";
        this.valorFinal="";
        this.dataDaVenda="";
        
    }
    
    public ContratoVenda(String id , String idCliente , String idVeiculo , String nomeFuncionario , String valorFinal , String dataDaVenda){
        
        this.id=id;
        this.idCliente=idCliente;
        this.idVeiculo=idVeiculo;
        this.nomeFuncionario=nomeFuncionario;
        this.valorFinal=valorFinal;
        this.dataDaVenda=dataDaVenda;
        
        
        
    }
    
 

    @Override
    public String desmontarObjeto() {
return this.id+";"+this.getIdCliente()+";"+this.idVeiculo+";"+this.nomeFuncionario+";"+this.valorFinal+";"+this.dataDaVenda;
    }

    @Override
   public void montarObjeto(String stringDados) throws Exception {
        try {
            String vetorString[] = stringDados.split(";");
            this.id=vetorString[0];
            this.setIdCliente(vetorString[1]);
            this.idVeiculo=vetorString[2];
            this.nomeFuncionario=vetorString[3];
            this.valorFinal=vetorString[4];
            this.dataDaVenda=vetorString[5];
            
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Cliente");
        }
    }

    /**
     * @return the dataDaVenda
     */
    public String getDataDaVenda() {
        return dataDaVenda;
    }

    /**
     * @param dataDaVenda the dataDaVenda to set
     */
    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
