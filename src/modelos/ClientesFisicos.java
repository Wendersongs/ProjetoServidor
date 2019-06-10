/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Renan
 */
public class ClientesFisicos extends Pessoa implements Dados {


    public ClientesFisicos() {
        this.id="";
        this.nome="";
        this.endereco="";
        this.num="";
        this.bairro="";
        this.cidade="";
        this.uf="";
        this.cep="";
        this.sexo="";
        this.nascimento="";
        this.cpf="";
        this.email="";
        this.contato="";
        this.numcelular="";
        
    }
    
    public ClientesFisicos(String id , String nome,String sexo, String endereco, String numero, String bairro, String cidade, String uf, String cep,  String dataNascimento,  String cpf,  String email, String contato, String celular){
       this.id=id;
        this.nome=nome;
        this.endereco=endereco;
        this.num=numero;
        this.bairro=bairro;
        this.cidade=cidade;
        this.uf=uf;
        this.cep=cep;
        this.sexo=sexo;
        this.nascimento= dataNascimento;
        this.cpf=cpf;
        this.email=email;
        this.contato=contato;
        this.numcelular=celular;
    } 

    @Override
    public String desmontarObjeto() {
        return this.id+";"+this.nome+";"+this.sexo+";"+this.endereco+";"+this.num+";"+this.bairro+";"+this.cidade+";"+this.uf+";"+this.cep+";"+this.nascimento+";"+this.cpf+";"+this.email+";"+this.contato+";"+this.numcelular;
    }

    @Override
    public void montarObjeto(String stringDados) throws Exception {
        try {
            String vetorString[] = stringDados.split(";");
            this.id=vetorString[0];
            this.nome = vetorString[1];
            this.sexo = vetorString[2];
            this.endereco = vetorString[3];
            this.num = vetorString[4];
            this.bairro = vetorString[5];
            this.cidade = vetorString[6];
            this.uf = vetorString[7];
            this.cep = vetorString[8];
            this.nascimento = vetorString[9];
            this.cpf = vetorString[10];
            this.email = vetorString[11];
            this.contato= vetorString[12];
            this.numcelular = vetorString[13];
        } catch (Exception e) {
            throw new Exception("Erro no metodo montarObjeto do Cliente");
        }
    }

}
