package Adapter;

public class HDFCBankAdapter implements iBankAdapter{

    @Override
    public PhonePayResponse getBalance(PhonePayRequest request) {
        String account = request.getAccountNo() + "";
        //call HDFC bank API

       HDFC_API api = new HDFC_API();
        int balance = api.checkBalance(account);

        PhonePayResponse response = new PhonePayResponse();
        response.setBalance(balance);
        return response;
    }
}
