public class ServiceImp implements  Service{

private MerkeziBank merkeziBank;
    @Override
    public boolean giveCredit(String userName){

setMerkeziBank();
return  merkeziBank.isUserAllowed(userName);
    }

    public void setMerkeziBank() {
        merkeziBank = new MerkeziBank();
    }
}
