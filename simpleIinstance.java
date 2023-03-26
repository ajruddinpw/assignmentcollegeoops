public class simpleIinstance {
    
    float p = 6, r = 5, t = 8;

    public static void main(String arrgs[]){
        simpleIinstance  obj = new simpleIinstance ();

        float w = (obj.p*obj.r*obj.t)/100;

        System.out.println( "simple interest is :\t"+w);


    }
}