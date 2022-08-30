public class Main {
    public static void main(String[] args) {
        Task1_4();


    }

    public static void Task1_4() {
        // 1 задание
        int[] myArray = new int[3];
        myArray[0] = 25;
        myArray[1] = 26;
        myArray[2] = 39;

        double[] myArrayTwo = new double[]{1.57, 7.654, 9.986};

        int[] goodArray = new int[3];
        goodArray[0] = 152;
        goodArray[1] = 39;
        goodArray[2] = 159;

        // 2 задание
        for (int i = 0; i < myArray.length - 1; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println(myArray[myArray.length - 1]);

        for (int i = 0; i < myArrayTwo.length - 1; i++) {
            System.out.print(myArrayTwo[i] + ", ");
        }
        System.out.println(myArrayTwo[myArrayTwo.length - 1]);

        for (int i = 0; i < goodArray.length; i++) {
            System.out.print(goodArray[i]);
            if (i != goodArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // 3 задание

        for (int i = myArray.length - 1; i > 0; i--) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println(myArray[0]);

        for (int i = myArrayTwo.length - 1; i > 0; i--) {
            System.out.print(myArrayTwo[i] + ", ");
        }
        System.out.println(myArrayTwo[0]);

        for (int i = goodArray.length - 1; i > 0; i--) {
            System.out.print(goodArray[i] + ", ");
        }
        System.out.println(goodArray[0]);


        // 4 Задание

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                myArray[i]++;

            }
            System.out.println(myArray[i]);


        }
    }


}