import java.util.Locale;

public class MerkeziBank {

    public int getCredit(String userName) {
        if(userName.toLowerCase(Locale.ROOT).startsWith("a")){
            return 12_000;
        }else{
            return 1_000;
        }
    }
public  boolean isUserAllowed(String userName) {
       int score =getCredit(userName);

return score>1000?true:false;
}




}
