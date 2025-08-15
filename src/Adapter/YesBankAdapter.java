package Adapter;

public class YesBankAdapter implements iBankAdapter{

    @Override
    public PhonePayResponse getBalance(PhonePayRequest request) {
        String account = request.getAccountNo() + "";
        //call yes bank API

        YesBankAPI yesBankAPI = new YesBankAPI();
        int balance = yesBankAPI.myBalance(account);

        PhonePayResponse response = new PhonePayResponse();
        response.setBalance(balance);
        return response;
    }
}
