package controle;
import comunicacao.ServidorTCP;
import java.util.ArrayList;
import modelos.ClientesFisicos;
import modelos.ClientesJuridicos;
import modelos.ContratoVenda;
import modelos.Marcas;
import modelos.ModelosCarro;
import modelos.Motoristas;
import modelos.Veiculos;
import persistencia.ClienteFisicoPersistencia;
import persistencia.ClienteJuridicoPersistencia;
import persistencia.ContratoVendaPersistencia;
import persistencia.MarcasPersistencia;
import persistencia.ModelosCarroPersistencia;
import persistencia.MotoristaPersistencia;
import persistencia.VeiculoPersistencia;

public class ControlePersistencia {
   Utils util = new Utils();
    public String execOrdem(String dados) throws Exception{
        String[] informacao = dados.split("#");
        ClienteJuridicoPersistencia clientePersistencia = new ClienteJuridicoPersistencia("C:\\Desenvolvimento\\PessoaJuridica.txt");
        ClientesJuridicos objetoClientes = new ClientesJuridicos();
        String msg="";
        switch (informacao[0]){
                case "ClientesJuridicos": msg=ctrlPersistenciaClientes(informacao[1], informacao[2]);
            return msg;
            case "ClientesFisicos": ctrlPersistenciaClientesFisicos(informacao[1], informacao[2]);
            return msg;
            case "Motoristas": ctrlPersistenciaMotoristas(informacao[1], informacao[2]);
            return msg;
            case "Marcas": ctrlPersistenciaMarcas(informacao[1], informacao[2]);
            return msg;
            case "ModelosCarro": ctrlPersistenciaModelosCarro(informacao[1], informacao[2]);
            return msg;
            case "Veiculos": ctrlPersistenciaVeiculos(informacao[1], informacao[2]);
            return msg;
            case "ContratoVenda": ctrlPersistenciaVendas(informacao[1], informacao[2]);
            return msg;
            default: return "Nenhum caso";
        }
    }
    
    public String ctrlPersistenciaClientes(String opcao, String dados) throws Exception{
         ClienteJuridicoPersistencia clientePersistencia = new ClienteJuridicoPersistencia("C:\\desenvolvimento\\PessoaJuridica.txt");
         ClientesJuridicos objetoClientes = new ClientesJuridicos();
         String msg = "";
        switch(opcao){
            case "1":
                objetoClientes.montarObjeto(dados);
                clientePersistencia.incluir(objetoClientes);
                msg = "incluído com sucesso";
                return msg;
            case "2":
                ArrayList<ClientesJuridicos> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = clientePersistencia.recuperar();
                msg = clientePersistencia.retornaArraycomoString(pilhaDeClientes);
                return msg;
            default: return "nenhuma opção";   
        }
    }
     public String ctrlPersistenciaClientesFisicos(String opcao, String dados) throws Exception{
        ClienteFisicoPersistencia clienteFisicoPersistencia = new ClienteFisicoPersistencia("C:\\desenvolvimento\\PessoaFisica.txt");
            ClientesFisicos objetoClientes = new ClientesFisicos();
            String msg ="";
        switch(opcao){
                case "1":
                objetoClientes.montarObjeto(dados);
                clienteFisicoPersistencia.incluir(objetoClientes);
                msg = "incluído com sucesso";
                return msg;
            case "2":
                ArrayList<ClientesFisicos> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = clienteFisicoPersistencia.recuperar();
                msg = clienteFisicoPersistencia.retornaArraycomoString(pilhaDeClientes);
                return msg;
            default: return "nenhuma opção";   
        }
    }
     
       public String ctrlPersistenciaMotoristas(String opcao, String dados) throws Exception{
        MotoristaPersistencia motoristaPersistencia = new MotoristaPersistencia("C:\\desenvolvimento\\Motoristas.txt");
       
        Motoristas objetoClientes = new Motoristas();
            String msg ="";
        switch(opcao){
            
            case "1":
                objetoClientes.montarObjeto(dados);
                motoristaPersistencia.incluir(objetoClientes);
                msg = "incluído com sucesso";
                return msg;
            case "2":
                ArrayList<Motoristas> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = motoristaPersistencia.recuperar();
                msg = motoristaPersistencia.retornaArraycomoString(pilhaDeClientes);
                return util.limpaCaracteres(msg);
            default: return "nenhuma opção";  
        }
       }
       
        public String ctrlPersistenciaMarcas(String opcao, String dados) throws Exception{
        MarcasPersistencia marcaPersistencia = new MarcasPersistencia("C:\\desenvolvimento\\Marcas.txt");
       
        Marcas objetoClientes = new Marcas();
            String msg ="";
        switch(opcao){
            
            case "1":
                objetoClientes.montarObjeto(dados);
                marcaPersistencia.incluir(objetoClientes);
                msg = "incluído com sucesso";
                return msg;
            case "2":
                ArrayList<Marcas> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = marcaPersistencia.recuperar();
                msg = marcaPersistencia.retornaArraycomoString(pilhaDeClientes);
                return util.limpaCaracteres(msg);
            default: return "nenhuma opção";  
        }
       }
       
       public String ctrlPersistenciaModelosCarro(String opcao, String dados) throws Exception{
        ModelosCarroPersistencia modelos = new ModelosCarroPersistencia("C:\\desenvolvimento\\Modelos.txt");
       
        ModelosCarro objetoClientes = new ModelosCarro();
            String msg ="";
        switch(opcao){
            
            case "1":
                objetoClientes.montarObjeto(dados);
                modelos.incluir(objetoClientes);
                msg = "incluído com sucesso";
                return msg;
            case "2":
                ArrayList<ModelosCarro> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = modelos.recuperar();
                msg = modelos.retornaArraycomoString(pilhaDeClientes);
                return util.limpaCaracteres(msg);
            default: return "nenhuma opção";  
        }
       }
       
        public String ctrlPersistenciaVeiculos(String opcao, String dados) throws Exception{
        VeiculoPersistencia veiculos = new VeiculoPersistencia("C:\\desenvolvimento\\Veiculos.txt");
       
        Veiculos objetoClientes = new Veiculos();
            String msg ="";
        switch(opcao){
            
            case "1":
                objetoClientes.montarObjeto(dados);
                veiculos.incluir(objetoClientes);
                msg = "incluído com sucesso";
                return msg;
            case "2":
                ArrayList<Veiculos> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = veiculos.recuperar();
                msg = veiculos.retornaArraycomoString(pilhaDeClientes);
                return util.limpaCaracteres(msg);
            default: return "nenhuma opção";  
        }
       }
        
          public String ctrlPersistenciaVendas(String opcao, String dados) throws Exception{
        ContratoVendaPersistencia venda = new ContratoVendaPersistencia("C:\\desenvolvimento\\ContratoVenda.txt");
       
        ContratoVenda objetoClientes = new ContratoVenda();
            String msg ="";
        switch(opcao){
            
            case "1":
                objetoClientes.montarObjeto(dados);
                venda.incluir(objetoClientes);
                msg = "incluído com sucesso";
                return msg;
            case "2":
                ArrayList<ContratoVenda> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = venda.recuperar();
                msg = venda.retornaArraycomoString(pilhaDeClientes);
                return util.limpaCaracteres(msg);
            default: return "nenhuma opção";  
        }
       }
       
}

  

   
