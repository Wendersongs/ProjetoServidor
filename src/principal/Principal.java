package principal;

import comunicacao.ServidorTCP;
import controle.ControlePersistencia;
import persistencia.ClienteJuridicoPersistencia;
import persistencia.ClienteFisicoPersistencia;
public class Principal {
    public static void main(String[] args) throws Exception{
        ServidorTCP servidor = new ServidorTCP(7777);
        String msg = "";
  try{      
        while(true){
            String dados = servidor.receberMsg();
            ControlePersistencia executa = null;
            executa = new ControlePersistencia();
            msg=executa.execOrdem(dados);
            System.out.println(dados);
            servidor.enviarMsg(msg);
            
        }
  }
  catch (Exception erro) {
            throw erro;
    }
    }
}
