import sun.misc.Cleaner;

public class Client {

static Service service;

    public static void main(String[] args) {
        Client client =new Client();
ServiceImp imp = new ServiceImp();
client.setService(imp);

        System.out.println(imp.giveCredit("AserName"));
    }

    public    void setService(Service service) {
        this.service=service;
    }


}
