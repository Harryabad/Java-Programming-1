
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harry
 */
public class MessagingService {

    private ArrayList<Message> list;

    public MessagingService() {

        list = new ArrayList<>();
    }

    // public void add(Message message) - adds a message passed as a parameter
    // to the messaging service as long as the message content is at most 280 
    // characters long.
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            list.add(message);
        }
    }

    // public ArrayList<Message> getMessages() - returns the messages added 
    // to the messaging service.
    public ArrayList<Message> getMessages() {
        return list;
    }

}
