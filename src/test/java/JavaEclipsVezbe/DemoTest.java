package JavaEclipsVezbe;




public class DemoTest {
	
	public static String SimplePassword(String str){

	    if(str.replaceAll("[A-Z0-9]","").equals(str)){
	        return "false";
	    }else if(str.replaceAll("^[A-Za-z0-9]","").equals(str)){
	        return "false";
	    }else if(str.toLowerCase().contains("password")){
	        return "false";
	    }else if(str.length()<=7 || str.length()>=31){
	        return "false";
	    }else {
	        return "true";
	    }

	}}