package hw;

import java.util.Arrays;

public class hw {
}public class Hw2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(changeZeroOne()));
        System.out.println(Arrays.toString(plus3()));


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
