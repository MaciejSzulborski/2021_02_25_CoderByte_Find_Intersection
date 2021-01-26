/*
26.01.2021 - Coderbyte challenge FindIntersection
Author: Maciej Szulborski

Have the function FindIntersection(strArr) read the array of strings
stored in strArr which will contain 2 elements: the first element will
 represent a list of comma-separated numbers sorted in ascending
 order, the second element will represent a second list of
 comma-separated numbers (also sorted). Your goal is to return
 a comma-separated string containing the numbers that occur
 in elements of strArr in sorted order.
 If there is no intersection, return the string false.

For example: if strArr contains ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"]
the output should return "1,4,13" because those numbers appear in both strings.
The array given will not be empty, and each string inside the array will be
of numbers sorted in ascending order and may contain negative numbers.
*/

class Main {

    public static String FindIntersection(String[] strArr) {
        // code goes here
        String [] strZero = strArr[0].split(", ");
        String [] strOne = strArr[1].split(", ");
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i<strZero.length; i++){
            for(int j =0; j<strOne.length; j++){
                if(strZero[i].equals(strOne[j])) {
                    result.append(strZero[i]).append(", ");
                }
            }
        }
        if(result.toString().equals("")){
            return "false";
        }
        result = new StringBuilder(result.substring(0, result.length() - 2));
        return result.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        String[] input = new String[] {"1, 2, 5, 10, 13, 14, 51, 65, 111", "1, 5, 11, 65"};
        System.out.print(FindIntersection(input));
    }
}