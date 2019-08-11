public class DogBarking {

    public static void main(String[] args) {
        bark(true,7);
        bark(true,8);
        bark(true,9);
        bark(true,21);
        bark(true,22);
        bark(true,23);
        bark(true,-1);
        bark(true,24);
        bark(false,7);
        bark(false,8);
        bark(false,9);
        bark(false,21);
        bark(false,22);
        bark(false,23);
        bark(false,-1);
        bark(false,24);

    }

    public static void bark(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay >23){
            System.out.println("You must be kidding");
         }else if (barking  && (hourOfDay <= 8 || hourOfDay >= 22)){
            System.out.println("Wake up !!");
         } else System.out.println("No problem");
    }
}
