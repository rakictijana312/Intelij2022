package class29;

public class WrapperClassesDemo2 {
    public static void main(String[] args) {
        int a=10;
        Integer aa=a;
        a=aa;
        String str=new String("blabla");
        str="blabla";

        Integer integer=new Integer(10); //boxing
        Integer integer1=45;  //autoboxing
        int abc=integer.intValue();//unboxing
        abc=integer;  //auto unboxing


    }
}
