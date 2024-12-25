package SERVER;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import HELPER.Hybrid_Encryption;

public class MultiThreadBus {
    static List<MultiThread> listServerThreads;

    public MultiThreadBus() {
        listServerThreads = new ArrayList<>();
    }

    public List<MultiThread> getListServerThreads() {
        return listServerThreads;
    }

    public synchronized void add(MultiThread serverThread){
        listServerThreads.add(serverThread);
    }

    public synchronized void removeSocket(int clientID){
        listServerThreads.removeIf(thread -> thread.getClientID() == clientID);
    }

    public synchronized void writeSocket(int clientID, String json, String clientKey) throws IOException {
        for (MultiThread serverThread : listServerThreads) {
            if (serverThread.getClientID() == clientID) {
                if (clientKey.isEmpty()) {
                    serverThread.writeSocket(json);
                } else {
                    String data = Hybrid_Encryption.encryptAES(json, clientKey);
                    serverThread.writeSocket(data);
                }
                break;
            }
        }
    }

    public int getLength() {
        return listServerThreads.size();
    }
}
