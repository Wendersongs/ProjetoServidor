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
public class Veiculos extends Marca implements Dados{
    private String modeloVeiculo;
    private  String placa;
    private  String ano;
    private  String categoria;
    private  String estado;
    private  String enderecoAnexo;
    
    public Veiculos(){
        
        this.id="";
        this.modeloVeiculo="";
        this.placa="";
        this.ano="";
        this.categoria="";
        this.estado="";
        this.nomeDaMarca="";
        this.enderecoAnexo="";
        
        
    }
    
    public Veiculos(String id , String placa , String ano , String estado , String categoria , String nomeDaMarca , String modeloVeiculo , String enderecoAnexo){
        
        this.id=id;
        this.modeloVeiculo=modeloVeiculo;
        this.placa=placa;
        this.ano=ano;
        this.categoria=categoria;
        this.estado=estado;
        this.nomeDaMarca=nomeDaMarca;
        this.enderecoAnexo=enderecoAnexo;
        
        
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnderecoAnexo() {
        return enderecoAnexo;
    }

    public void setEnderecoAnexo(String enderecoAnexo) {
        this.enderecoAnexo = enderecoAnexo;
    }
    
    
    

    @Override
    public String desmontarObjeto() {
        return this.id+";"+this.placa+";"+this.ano+";"+this.estado+";"+this.categoria +";"+ this.nomeDaMarca+";"+this.modeloVeiculo+";"+this.enderecoAnexo+";";
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
try {
            String vetorString[] = stringDados.split(";");
            this.id=vetorString[0];
            this.placa = vetorString[1];
            this.ano = vetorString[2];
            this.estado = vetorString[3];
            this.categoria = vetorString[4];
            this.nomeDaMarca = vetorString[5];
            this.modeloVeiculo = vetorString[6];
            this.enderecoAnexo = vetorString[7];
            
          
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Veiculo");
        }    }
    
    
    
}
