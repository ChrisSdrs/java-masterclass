public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(-1,5,7);
        printEqual(-1,5,5);
        printEqual(5,-1,7);
        printEqual(5,-1,5);
        printEqual(5,7,-1);
        printEqual(5,5,-1);
        printEqual(1, 2, 3);
    }
    public static void printEqual (int firstNumber, int secondNumber, int thirdNumber){
    if ((firstNumber < 0)||(secondNumber < 0)||(thirdNumber < 0)){
        System.out.println("Invalid value");
    } else if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)){
        System.out.println("All numbers are equal");
    } else if ((firstNumber != secondNumber) && (secondNumber != thirdNumber) && (firstNumber != thirdNumber)){
            System.out.println("All numbers are different");
        } else
        System.out.println("Neither all are equal or different");
    }
}
