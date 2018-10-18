package ca.cmbs.hr.intro;

import java.util.Scanner;

public class Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}


class MyRegex {
    String pattern = "^([0-2]?((?<!2)[0-9]|[0-5])?((?<!25)[0-9]|[0-5])\\.){3}([0-2]?((?<!2)[0-9]|[0-5])?((?<!25)[0-9]|[0-5]))";
}