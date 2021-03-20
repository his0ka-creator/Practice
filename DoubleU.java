package com.test;

public class DoubleU {
    public static void main(String[] args) {
        int a1 = 15;
        int b = 4*a1-3;
        DoubleU a= new DoubleU();
        int[][] arr = a.initArray(a1);
        /*
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        a.outDoubleU(arr,a1,b);

    }

    int[][] initArray ( int a){
        int b = 4 * a - 3;
        int[][] array = new int[a][];
        array[0] = new int[]{0, (b - 1) / 2, b - 1};
        array[1] = new int[]{1, (b - 1) / 2 - 1, (b - 1) / 2 + 1, b - 2};
        for (int i = 2; i < a - 1; i++) {
            array[i] = new int[]{array[i - 1][0] + 1, array[i - 1][1] - 1, array[i - 1][2] + 1, array[i - 1][3] - 1};
        }
        array[a - 1] = new int[]{array[a - 2][0] + 1, array[a - 2][2] + 1};
        return array;
    }
        void outDoubleU ( int[][] array, int a, int b){
            boolean flag = false;
            for (int i=0;i<a;i++){
                for (int j=0; j<b;j++){
                    for (int k=0; k<array[i].length; k++){
                        if (array[i][k]==j){flag = true;}
                    }
                    if (flag){System.out.print("*");flag=false;}
                    else {System.out.print(" ");}
                }
                System.out.println();
            }

        }
}
