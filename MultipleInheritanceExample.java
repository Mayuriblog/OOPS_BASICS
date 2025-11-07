// Interface 1
interface OnlinePayment {
    void payOnline();
    void refundOnline();
}

// Interface 2
interface CardPayment {
    void swipeCard();
    void refundCard();
}

// Class implementing multiple interfaces
class SmartPayment implements OnlinePayment, CardPayment {

    @Override
    public void payOnline() {
        System.out.println("Online payment done using UPI or Net Banking.");
    }

    @Override
    public void refundOnline() {
        System.out.println("Refund processed to online account.");
    }

    @Override
    public void swipeCard() {
        System.out.println("Card swiped successfully at POS terminal.");
    }

    @Override
    public void refundCard() {
        System.out.println("Refund processed to the card account.");
    }

    // Extra method showing combined functionality
    public void generateReceipt() {
        System.out.println("Digital receipt generated for payment.");
    }
}

// Main class to test
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        OnlinePayment P1 = new SmartPayment();
		CardPayment P2 = new SmartPayment();
		SmartPayment P3 = new SmartPayment();
		
        P1.payOnline();
        P1.refundOnline();
        P2.swipeCard();
        P2.refundCard();
        P3.generateReceipt();
    }
}
