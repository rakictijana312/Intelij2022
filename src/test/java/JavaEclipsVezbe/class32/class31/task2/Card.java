package JavaEclipsVezbe.class32.class31.task2;

//2)Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
// Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
//Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Card {
    String creditCardType;
    Card(String creditCardType){
        this.creditCardType=creditCardType;
    }
    abstract void calculateInterest();
    public void IssueCard(){
        System.out.println(creditCardType+ "Issued ");
    }
}

class CreditCard extends Card {
    CreditCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 15%");
    }
}
class DebitCard extends Card{

    DebitCard(String creditCardType) {
        super(creditCardType);
    }
    @Override
    void calculateInterest() {
        System.out.println("interest is 0 but has a fee of 20 USD");
    }
}

class PrepaidCard extends Card{

    PrepaidCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Must pay all the money before hand");
    }
}