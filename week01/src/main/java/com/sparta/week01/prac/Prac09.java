package com.sparta.week01.prac;
// 반복문과 조건문

import java.util.ArrayList;
import java.util.List;

public class Prac09 {
    public static int countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int cnt = 0;

        for (int i=0; i < fruits.size(); i++){
            if (fruits.get(i)==fruit) {
                cnt++;
            }
        };
        return cnt;
    }

    public static void main(String[] args){
        int ret = countFruit("감");
        System.out.println(ret);


    }
}
