package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Here comes a result of 7 - 9");
        int theSub = 0;
        System.out.println(theSub);
        theSub = calcTheSubOfTwo(7, 9);
        System.out.println(theSub);

        System.out.println("Here comes a result of 7 * 9");
        int theMul = 0;
        System.out.println(theMul);
        theMul = calcTheMulOfTwo(7,9);
        System.out.println(theMul);

        System.out.println("Here comes a result of 7 / 9");
        float theDiv = 0;
        System.out.println(theDiv);
        
	int y = 9;
	    
        if (y == 0) {System.out.println("Not allowed");}
        else {
		
	 	theDiv = calcTheDivOfTwo(7, y);
		System.out.println(theDiv);
        }
	    
        public static int calcSevenToEleven(System.out.println("Here comes a result of 7 - 9");
        int theSub = 0;
        System.out.println(theSub);
        theSub = calcTheSubOfTwo(7, 9);
        System.out.println(theSub););


        System.out.println("Here comes the sum of three results");
        float theSum = 0;
        System.out.println(theSum);
        theSum = calcTheSumOfThree(theSub, theMul, theDiv);
        System.out.println(theSum);

    }

    public static int calcTheSubOfTwo(int x, int y) {
        int result = 0;
        result = x - y;
        return result;
    }
    public static int calcTheMulOfTwo(int x, int y) {
        int result = 0;
        result = x * y;
        return result;
    }
    public static float calcTheDivOfTwo(float x, float y) {
        float result = 0;
        float result1 = result;
        result1 = x / y;
        return result1;
    }
    public static float calcTheSumOfThree (float calcTheSubOfTwo, float calcTheMulOfTwo, float calcTheDivOfTwo) {
        float result = 0;
        float result2 = result;
        result2 = calcTheSubOfTwo + calcTheMulOfTwo + calcTheDivOfTwo;
        return result2;
    }
}
