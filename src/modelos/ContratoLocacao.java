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
public class ContratoLocacao extends Contrato implements Dados {

    /**
     * @return the categoriaVeiculo
     */
    public String getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    /**
     * @param categoriaVeiculo the categoriaVeiculo to set
     */
    public void setCategoriaVeiculo(String categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    private Integer diasDeLocacao;
    private Double valorCaucao;
    private String categoriaVeiculo;

    
    
    
    public ContratoLocacao(){
        
        this.id="";
        this.idCliente="";
        this.idVeiculo="";
        this.categoriaVeiculo="";
        this.nomeFuncionario="";
        this.diasDeLocacao=0;
        this.valorCaucao=0.0;
        
        
        
    }
    
    public Double CalcularCaucao(String categoria, double quantidadeDias){
        double valorDiaria = 0;
        double recebeCaucao=0;
        
      if(getCategoriaVeiculo() == "Economico")
       valorDiaria=66 ;
               
      if (getCategoriaVeiculo() == "Economico com Ar")
           valorDiaria = 69;
       
      if (getCategoriaVeiculo() == "Intermediario")
           valorDiaria=81;
       
      if (getCategoriaVeiculo() =="SUV")
           valorDiaria=113;
       
      if (getCategoriaVeiculo()=="4x4 Especial")
           valorDiaria=322;
        recebeCaucao = valorDiaria*quantidadeDias;
        return recebeCaucao;
    }
    
    public ContratoLocacao(String id , String idCliente , String idVeiculo ,String categoriaVeiculo , String nomeFuncionario , Integer diasDeLocacao , Double valorCaucao){
        
        this.id=id;
        this.idCliente=idCliente;
        this.idVeiculo=idVeiculo;
        this.categoriaVeiculo=categoriaVeiculo;
        this.nomeFuncionario=nomeFuncionario;
        this.diasDeLocacao=diasDeLocacao;
        this.valorCaucao=valorCaucao;
    }
    
    
    

    
    @Override
    public String desmontarObjeto() {

        return this.id+";"+this.idCliente+";"+this.idVeiculo+";"+this.getCategoriaVeiculo()+";"+this.nomeFuncionario+";"+this.diasDeLocacao+";"+this.valorCaucao;
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
        
         try {
            String vetorString[] = stringDados.split(";");
            this.id=vetorString[0];
            this.idCliente=vetorString[1];
            this.idVeiculo=vetorString[2];
            this.setCategoriaVeiculo(vetorString[3]);
            this.nomeFuncionario=vetorString[4];
            this.diasDeLocacao=Integer.parseInt(vetorString[5]);
            this.valorCaucao=Double.parseDouble(vetorString[6]);

        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Cliente");
        }

    }

    /**
     * @return the diasDeLocacao
     */
    public int getDiasDeLocacao() {
        return diasDeLocacao;
    }

    /**
     * @param diasDeLocacao the diasDeLocacao to set
     */
    public void setDiasDeLocacao(int diasDeLocacao) {
        this.diasDeLocacao = diasDeLocacao;
    }

    /**
     * @return the valorCaucao
     */
    public Double getValorCaucao() {
        return valorCaucao;
    }

    /**
     * @param valorCaucao the valorCaucao to set
     */
    public void setValorCaucao(Double valorCaucao) {
        this.valorCaucao = valorCaucao;
    }
    
  
}
