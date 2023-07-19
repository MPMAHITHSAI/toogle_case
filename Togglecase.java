package Tooglecase;
import java.util.*;

public class Togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result="";
        for(int i=0;i<input.length();i++){
            result+=(char)((int)input.charAt(i)^(1<<5));
        }
        System.out.println(result);
    }
}