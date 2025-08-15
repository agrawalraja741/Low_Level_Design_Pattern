package Adapter;

public class PhonePayAPI {

    iBankAdapter iBankAdapterObj;

    public PhonePayAPI() {
        iBankAdapterObj = new YesBankAdapter();
    }

    public int getBalance(int accountNo) {
        PhonePayRequest phonePayRequest = new PhonePayRequest();
        phonePayRequest.setAccountNo(accountNo);
        PhonePayResponse response =  iBankAdapterObj.getBalance(phonePayRequest);
        return response.getBalance();
    }
}
