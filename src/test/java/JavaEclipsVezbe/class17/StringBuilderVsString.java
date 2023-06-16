package JavaEclipsVezbe.class17;

public class StringBuilderVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String var1="Meerim";
 String var2="Aziz";
 String var3="Afzal";
 String var4="MJ"; //recommended  
 String var5=new String("Angelo"); //not recommended 
 var4="Ram";
 
 StringBuilder sb1=new StringBuilder(var1);
 StringBuilder sb2=new StringBuilder("Aziz");
 StringBuilder sb3=new StringBuilder("Afzal");
 StringBuilder sb4=new StringBuilder("MJ");
 
 System.out.println(sb1.reverse());
 
 var1=sb1.toString();
 
 System.out.println(var1);
 
 
 
 
 
 
 
	}

}
