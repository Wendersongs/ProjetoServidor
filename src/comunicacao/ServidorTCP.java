package comunicacao;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class ServidorTCP {
    ServerSocket ss;
    Socket socket;
    DataInputStream entrada;
    DataOutputStream saida;
    
    public ServidorTCP(int portaServer) throws IOException{
        ss = new ServerSocket(portaServer);
        socket = ss.accept();
        entrada = new DataInputStream(socket.getInputStream());
        saida = new DataOutputStream(socket.getOutputStream());
    }
    
    public void enviarMsg(String mensagem) throws IOException{
        saida.writeUTF(mensagem);
        saida.flush();
    }
    
    public String receberMsg() throws IOException{
        return entrada.readUTF();
    }
}
