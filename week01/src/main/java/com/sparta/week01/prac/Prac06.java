package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;


public class Prac06 {
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        String course1 = "웹개발의 봄 spring";
        String course2 = "프론트엔드의 꽃 React";
        myList.add(course1);
        myList.add(course2);
        System.out.println(myList);
        System.out.println(myList.get(1));
        myList.remove(1);
        System.out.println(myList);
    }
}
