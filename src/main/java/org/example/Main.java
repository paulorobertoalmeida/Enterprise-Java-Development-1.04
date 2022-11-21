package org.example;

import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};
        int difference = getDifference(a);
        System.out.println(difference);

        int numArr[] = {2, 5, 14, 1, 26, 65, 123, 6};
        String smallestTwo = String.valueOf(getSmallestTwo(numArr));
        System.out.println(smallestTwo);

        int resolution = getResolution(1, 8);
        System.out.println(resolution);
    }


    //0.1 DIFFERENCE BETWEEN MAX N MIN
    public static int getDifference(int a[]) {

        int result = 0;

        if (a.length < 1) {

            int large = a[0];
            int small = a[0];

            for (int i = 1; i < a.length; ++i) {
                if (a[i] > large)
                    large = a[i];

                if (a[i] < small)
                    small = a[i];
            }
            result = (large - small);
        }
        return result;
    }

    //0.2 SMALLEST
    public static ArrayList<Integer> getSmallestTwo(int[] numArr) {

        int numOne = Integer.MAX_VALUE;
        int numTwo = Integer.MAX_VALUE;

        for(int i = 0; i < numArr.length; i++){
            if(numOne > numArr[i]){
                numTwo = numOne;
                numOne = numArr[i];
            }else if(numTwo > numArr[i]){
                numTwo= numArr[i];
            }
        }

        ArrayList<Integer> arrResult  = new ArrayList<Integer>(2);
        arrResult.add(numOne);
        arrResult.add(numTwo);

        return arrResult;
    }


    public static int getResolution(int x, int y ) {
        double result = Math.pow(x, 2) + Math.pow(((4 * y) / 5 - x), 2);
        return (int) result;
    }

}