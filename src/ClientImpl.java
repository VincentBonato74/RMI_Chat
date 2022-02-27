import java.io.Serializable;

public class ClientImpl implements Client_itf, Serializable {

    private String pseudo;

    public ClientImpl(String s){
        pseudo = s;
    }

    public String getPseudo(){
        return pseudo;
    }
}
