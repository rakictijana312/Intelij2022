package JavaEclipsVezbe;

import java.util.Locale;

public class WorkingWithStrings {
    public static void main (String args[]){

        //charAt - odprintace samo slovo koje je oznaceno, krece od 0,1,2
        String name="TIAJANA";
        System.out.println(name.charAt(0)); //T
        System.out.println(name.charAt(5)); //A

        //concat  -spoji dve strings with no space - cant work with numbers(ako koristimo brojeve dobicemo CE)
        String name1="Mihailo";
        String lastname1= "Rakic";
        System.out.println(name1.concat(lastname1)); //not common

        String name2="Mihailo";
        String lastname2= "Rakic";
        System.out.println(name2+ " " +lastname2); // common


        //contains/startsWith/endsWith - TRUE / FALSE
        String var="This is demo of contain 12555%%%-*/5##52522,b,";
        System.out.println(var.contains("#"));
        if (var.contains("#") || var.contains("%")){
            System.out.println("%#, are not allowed");
        }

        System.out.println(var.contains("This is demo"));  //true

        System.out.println(var.endsWith(",")); //true

        System.out.println(var.startsWith("This")); //true


        //length
        String m="Ja sam srecna"; //14 karaktera
        System.out.println(m.length());

        //toLowerCase()
        String n="MIHAILO";
        System.out.println(n.toLowerCase());

        //toUpperCase
        String j="tijana";
        System.out.println(j.toUpperCase());

        //indexOf - koja je pozicija 0,1,2,3,4
        String h="salma";
        System.out.println(h.indexOf('l'));

        //substring? nisam sigurna
        String x="Ja imam najbolljeg muzica";
        System.out.println(x.substring(0,2));

        //trim -mislim da brise na pocetku space
        String name4="            Tijana       ++++";
        System.out.println(name4.trim());

        //replaceAll -[0-9] obriase brojeve od 0-9
        String l="Ja imam najboljeg muzica 0123456789....;";
        System.out.println(l.replaceAll("[0-9]",""));

        String p="m v s fsrdvf vfv f v fdv,f,f,df,1225555//";
        System.out.println(p.replaceAll("[a-zA-Z]", ""));//odprintace samo brojeve i znakove, zamenice slova od a-z

        String p3="Ja imam najboljeg muzica ,1225555//";
        System.out.println(p.replaceAll("[A-Za-z0-9]", ""));//odprintace znakove psoto smo replaceAll letters and numbers

























    }
}
