package JavaDemos;

public class ReCapDemo1 {
    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 25;
        int number3 = 26;
        int biggest = number1;

        if (biggest < number2) {
            biggest = number2;
        }
        if (biggest < number3) {
            biggest = number3;
        }
        System.out.println("The biggest = " + biggest);
    }
}
