package class33.exceptions;

public class Demo3 {
    public static void main(String[] args) {
        String s=null;
        if(s==null){
            System.out.println("Can not execute methods on this object");
        }else {
            System.out.println(  s.length());
        }

    }
}
