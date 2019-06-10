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
        
        this.modeloVeiculo="";
        this.placa="";
        this.ano="";
        this.categoria="";
        this.estado="";
        this.nomeDaMarca="";
        this.enderecoAnexo="";
        
        
    }
    
    public Veiculos(String placa , String ano , String estado , String categoria , String nomeDaMarca , String modeloVeiculo , String enderecoAnexo){
        
        this.modeloVeiculo=modeloVeiculo;
        this.placa=placa;
        this.ano=ano;
        this.categoria=categoria;
        this.estado=estado;
        this.nomeDaMarca=nomeDaMarca;
        this.enderecoAnexo=enderecoAnexo;
        
        
    }
    
    
    

    @Override
    public String desmontarObjeto() {
        return this.modeloVeiculo+";"+this.placa+";"+this.ano+";"+this.categoria +";"+ this.estado+";"+this.nomeDaMarca+";"+this.enderecoAnexo+";";
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
try {
            String vetorString[] = stringDados.split(";");
            this.modeloVeiculo = vetorString[0];
            this.placa = vetorString[1];
            this.ano = vetorString[2];
            this.categoria = vetorString[3];
            this.estado = vetorString[4];
            this.nomeDaMarca = vetorString[5];
            this.enderecoAnexo = vetorString[6];
            
          
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Veiculo");
        }    }
    
    
    
}
