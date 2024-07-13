import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server {
    public Consumer<Socket> getConsumer() {
        return (clienSocket) -> {
            try{
                PrintWriter toClient = new PrintWriter(clienSocket.getOutputStream());
                toClient.println("Hello from the server");
                toClient.close();
                clienSocket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        };
    }
    
    public static void main(String[] args) {
        int port = 8010;
        Server server = new Server();
        
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);
            System.out.println("Server is listening on port " + port);
            while (true) {
                Socket acceptedSocket = serverSocket.accept();
                
                // Create and start a new thread for each client
                Thread thread = new Thread(()->server.getConsumer().accept(acceptedSocket));
                thread.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}