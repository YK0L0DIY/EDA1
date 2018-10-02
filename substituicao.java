//dveopers by @y.kolodiy
//
public class substituicao {
    public static void main(String[] args) {
        System.out.println(sub("3 hello my name is"));
    }

    static String sub(String enter){

        int numeroDEPAlavras=Integer.parseInt(enter.substring(0,enter.indexOf(" ")));
        enter=enter.substring(enter.indexOf(" ")+1);
        String keys[]=new String[numeroDEPAlavras];

        for(String i:keys){
            i=enter.substring(0,enter.indexOf(" "));
            System.out.println(i);
            enter=enter.substring(enter.indexOf(" ")+1);
        }

        System.out.println(enter);

        String my_code=enter;

        char a=97;
        System.out.println(a);





        return ""+numeroDEPAlavras;
    }
}
