public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(2.1234345,2.12352432));
        System.out.println(areEqualByThreeDecimalPlaces(6,6));
        System.out.println(areEqualByThreeDecimalPlaces(78.567,78.563));
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber,double secondNumber){
        if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)){
            return true;
        }else return false;
    }
}
