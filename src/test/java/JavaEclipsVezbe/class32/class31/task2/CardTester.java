package JavaEclipsVezbe.class32.class31.task2;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(new CreditCard("Credit Card"));
        linkedList.add(new DebitCard("DebitCard Card"));
        linkedList.add(new PrepaidCard("PrepaidCard Card"));
        for (Card card : linkedList) {
            card.IssueCard();
            card.calculateInterest();
        }
    }
}
