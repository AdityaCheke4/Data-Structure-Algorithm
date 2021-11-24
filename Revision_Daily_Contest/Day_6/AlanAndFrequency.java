package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_6;

/*
Alan & Frequency -23:40:6
Description

Alan Turing, the mathematician, is trying to break the encrypted messages of the German Troops, generated by their encryption device "Enigma". To find the distribution of characters, he needs to find out how many times a particular character appears in a string. But, to feed the data into his computer, "Christopher", he needs the data in lexicographic order, that is, in alphabetical order. Since, he is busy making "Christopher" better, he asks you for help. Help Alan find the frequency of characters in the encrypted strings in alphabetical order. The string contains only lower case alphabets.


Input
The first line contains N, the length of the string, and the next line contains the string itself.





1 <= N<=100


Output
For each unique character in the string, print the character along with its frequency in the encrypted string, separated by '-' , on a new line.


Sample Input 1

4
aman
Sample Output 1

a-2
m-1
n-1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlanAndFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        res(n,str);
    }

    static void res(int n, String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                Integer temp = hashMap.get(str.charAt(i)) + 1;
                hashMap.put(str.charAt(i), temp);
            }else
                hashMap.put(str.charAt(i),1);
        }
        for (Map.Entry<Character,Integer> map : hashMap.entrySet()){
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
