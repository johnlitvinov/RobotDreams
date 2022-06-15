public class Main {

    public static void main(String[] args) {

        Module module = new Module();

        try {
            System.out.println("Payment is successfully handled.\n" +
                    "Code is : " + module.processPayment(110, "USD", "22"));
        } catch (InvalidPaymentCurrencyException e) {
            System.out.println(e.getMessage());

        } catch (InvalidPaymentAmountException e) {
            System.out.println(e.getMessage());

        } catch (BankProcessingFailedException e) {
            e.printStackTrace();
            System.out.println("Payment is failed.\n" + e.getMessage());
            module.paymentErrorInfo(e.getMessage());
        }
    }
}//end class