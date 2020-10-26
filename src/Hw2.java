import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(changeZeroOne()));
        System.out.println(Arrays.toString(plus3()));
        System.out.println(Arrays.toString(less6()));
        findMinMax();
        cross();

    }
//1Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static int[] changeZeroOne(){

        int[] changeNum = {1, 1, 0, 0, 1};
        for (int i =0; i < changeNum.length; i++) {
            if (changeNum[i] == 1){
                changeNum[i] = 0;
            }else {
                changeNum[i] = 1;
            }
        }
        return changeNum;
    }
    //Задать пустой целочисленный массив размером 8.
    // Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    public static int[] plus3(){
        int[] plus = new int[8];
        int x = 1;
        for (int i = 0; i < plus.length; i++) {
            if (plus[i] == 0) {
                plus[i] = x;
                x += 3;
            }
        }
        return plus;
    }
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    // написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2
    public static int[] less6(){
        int[] less = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < less.length; i++) {
            if (less[i] < 6) {
                less[i] *= 2;
            }
        }
        return less;
    }
//    Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента
    public static void findMinMax(){
        int [] minMax = {-35, 20, 5, -23, 28};
        int min = minMax[0];
        int max = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (minMax[i] < min) {
                min = minMax[i];
            }else if (minMax[i] > max) {
                max = minMax[i];
            }
        }
        System.out.println("min: " + min + "\nmax: " + max);
    }
    //Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    // заполнить его диагональные элементы единицами, используя цикл(ы)
    public static void cross(){
        int[][] cross = new int [5][5];
        for (int x = 0; x < cross.length; x++) {
            for (int y = 0; y < cross[x].length; y++) {
                if (x == y) {
                    cross[x][y] = 1;
                }else if (x + y == cross.length - 1) {
                    cross[x][y] = 1;
                }else {
                    cross[x][y] = 0;
                }
                System.out.print(cross[x][y] + "\t");
            }
            System.out.println();
        }
    }


}
