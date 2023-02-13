public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.1");
        int[] number = new int[]{1, 2, 3};
        number[0] = 1;
        int number1 = number[0];
        number[1] = 2;
        int number2 = number[1];
        number[2] = 3;
        int number3 = number[2];
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        System.out.println("Задача 1.2");
        double[] doubleNumber = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubleNumber.length; i++) {
            System.out.println(doubleNumber[i]);
        }


        System.out.println("Задача 1.3");
        double[] massive = {5, 17, 5.86, 9.87, 5.17};
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }









        System.out.println("Задача 2");
        for (int i = 0; i < number.length-1; i++) {
            System.out.print(number[i] + ",");
        }
        System.out.print(number3);
        System.out.println();
        double x = doubleNumber[doubleNumber.length-1];
        for (int i = 0; i <doubleNumber.length-1; i++) {
            System.out.print(doubleNumber[i]+",");
        }
        System.out.print(x);
        System.out.println();
        double y = massive[massive.length - 1];
        for (int i = 0; i < massive.length-1; i++) {
            System.out.print(massive[i] + ",");
        }
        System.out.print(y);
        System.out.println();







        System.out.println("Задача 3");
        for (int i = number.length-1; i >0; i--) {
            System.out.print(number[i] + ",");
        }
        System.out.print(number[0]);
        System.out.println();
        for (int i = doubleNumber.length-1; i >0; i--) {
            System.out.print(doubleNumber[i]+",");
        }
        System.out.print(doubleNumber[0]);
        System.out.println();
        for (int i = massive.length-1; i >0; i--) {
            System.out.print(massive[i] + ",");
        }
        System.out.print(massive[0]);
        System.out.println();






        System.out.println("Задача 4");
        for (int i= 0; i <number.length ; i++) {
            if (number[i] % 2 != 0) {
                number[i] = number[i] + 1;
                System.out.print(number[i] + " ");
            }

        }
    }

}