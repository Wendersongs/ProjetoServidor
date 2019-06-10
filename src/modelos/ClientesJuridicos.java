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
public class ClientesJuridicos extends Pessoa implements Dados {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoEstadual;
    


    public ClientesJuridicos() {
        this.id="";
        this.cnpj="";
        this.razaoSocial="";
        this.nomeFantasia="";
        this.inscricaoEstadual="";
        this.endereco="";
        this.num="";
        this.bairro="";
        this.cidade="";
        this.uf="";
        this.cep="";
        this.email="";
        this.contato="";
        
        
    }
    
    public ClientesJuridicos( String id, String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstadual, String endereco, String numero, String bairro, String cidade, String uf, String cep,   String email, String contato){
        this.id=id;
        this.cnpj=cnpj;
        this.razaoSocial=razaoSocial;
        this.nomeFantasia=nomeFantasia;
        this.inscricaoEstadual=inscricaoEstadual;
        this.endereco=endereco;
        this.num=numero;
        this.bairro=bairro;
        this.cidade=cidade;
        this.uf=uf;
        this.cep=cep;
        this.email=email;
        this.contato=contato;
        
    } 

    


    @Override
    public String desmontarObjeto() {
        return this.id+";"+this.cnpj+";"+this.razaoSocial+";"+this.nomeFantasia+";"+this.inscricaoEstadual+";"+this.endereco+";"+this.num+";"+this.bairro+";"+this.cidade+";"+this.uf+";"+this.cep+";"+this.email+";"+this.contato;
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
        try {
            String vetorString[] = stringDados.split(";");
            this.id = vetorString[0];
            this.cnpj = vetorString[1];
            this.razaoSocial = vetorString[2];
            this.nomeFantasia = vetorString[3];
            this.inscricaoEstadual = vetorString[4];
            this.endereco = vetorString[5];
            this.num = vetorString[6];
            this.bairro = vetorString[7];
            this.cidade = vetorString[8];
            this.uf = vetorString[9];
            this.cep = vetorString[10];
            this.email = vetorString[11];
            this.contato= vetorString[12];
          
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Cliente");
        }
    }
    
}
