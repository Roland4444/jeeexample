package ws;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.server.ServerEndpoint;
@ServerEndpoint("/websocketendpoint2")
public class WsServer2 {
     
    @OnOpen
    public void onOpen(){
        System.out.println("Open Connection ...");
    }
     
    @OnClose
    public void onClose(){
        System.out.println("Close Connection ...");
    }
     
    @OnMessage
    public String onMessage(String message){
        System.out.println("Message from the client: " + message);
        String echoMsg = "Echo from the server :222222 " + message;
        return echoMsg;
    }
 
    @OnError
    public void onError(Throwable e){
        e.printStackTrace();
    }
 
}