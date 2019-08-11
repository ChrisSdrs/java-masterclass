public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(2,4,6));
        System.out.println(hasEqualSum(123,454,577));
        System.out.println(hasEqualSum(5,-3,2));
        System.out.println(hasEqualSum(0,2,2));
        System.out.println(hasEqualSum(-1,-3,-4));
        System.out.println(hasEqualSum(-3,5,-8));
    }

    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber){
        int sum = firstNumber + secondNumber;
        if (sum == thirdNumber){
            return true;
        }return false;
    }
}
