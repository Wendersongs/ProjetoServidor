package controle;
import comunicacao.ServidorTCP;
import java.util.ArrayList;
import modelos.ClientesFisicos;
import modelos.ClientesJuridicos;
import modelos.Motoristas;
import persistencia.ClienteFisicoPersistencia;
import persistencia.ClienteJuridicoPersistencia;
import persistencia.MotoristaPersistencia;

public class ControlePersistencia {
   
    public void execOrdem(String dados) throws Exception{
        String[] informacao = dados.split("#");
        ClienteJuridicoPersistencia clientePersistencia = new ClienteJuridicoPersistencia("C:\\Desenvolvimento\\PessoaJuridica.txt");
        ClientesJuridicos objetoClientes = new ClientesJuridicos();
        switch (informacao[0]){
            case "ClientesJuridicos": ctrlPersistenciaClientes(informacao[1], informacao[2]);
            
            break;
            case "ClientesFisicos": ctrlPersistenciaClientesFisicos(informacao[1], informacao[2]);
            break;
            case "Motoristas": ctrlPersistenciaMotoristas(informacao[1], informacao[2]);
            break;
        }
    }
    
    public void ctrlPersistenciaClientes(String opcao, String dados) throws Exception{
         ClienteJuridicoPersistencia clientePersistencia = new ClienteJuridicoPersistencia("C:\\Desenvolvimento\\PessoaJuridica.txt");
         ClientesJuridicos objetoClientes = new ClientesJuridicos();
        switch(opcao){
            case "1":
                
                objetoClientes.montarObjeto(dados);
                clientePersistencia.incluir(objetoClientes);
            case "2":
                ArrayList<ClientesJuridicos> pilhaDeClientes = new ArrayList<>();
                pilhaDeClientes = clientePersistencia.recuperar();
                String msg = pilhaDeClientes.toString();
                
        }
    }
     public void ctrlPersistenciaClientesFisicos(String opcao, String dados) throws Exception{
        ClienteFisicoPersistencia clienteFisicoPersistencia = new ClienteFisicoPersistencia("C:\\Users\\Kevin\\Desktop\\PessoaFisica.txt");
        switch(opcao){
            case "1":
                ClientesFisicos objetoClientesFisicos = new ClientesFisicos();
                objetoClientesFisicos.montarObjeto(dados);
                clienteFisicoPersistencia.incluir(objetoClientesFisicos);
        }
    }
     
       public void ctrlPersistenciaMotoristas(String opcao, String dados) throws Exception{
        MotoristaPersistencia motoristaPersistencia = new MotoristaPersistencia("C:\\Users\\Kevin\\Desktop\\Motoristas.txt");
        switch(opcao){
            case "1":
                Motoristas objetoMotoristas = new Motoristas();
                objetoMotoristas.montarObjeto(dados);
                motoristaPersistencia.incluir(objetoMotoristas);
        }
       }
}

  

   
