package com.sparta.week01.prac;

public class Prac10 {
    public static void main(String[] args){
        Tutor tutor_1 = new Tutor();
        String name = "김정우";
        String bio = "python and java";
        tutor_1.setName(name);
        tutor_1.setBio(bio);
        System.out.println(tutor_1.getName());
        System.out.println(tutor_1.getBio());

    }
}
