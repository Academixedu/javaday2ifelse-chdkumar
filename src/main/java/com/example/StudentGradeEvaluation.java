package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name=s.nextLine();

        // Prompt the user to enter their age
        System.out.println("Enter your age: ");
        int Age=s.nextInt();


        // Prompt the user to enter their exam score
        System.out.println("Enter your exam score: ");
        int score=s.nextInt();

        System.out.println("name: "+name);
        System.out.println("age: "+Age);
        System.out.println("Score: "+score);

        // Determine the grade
        String grade;
        if(score>=90)
        {
            System.out.println("Grade: A");
        }
        else if(score>=80&&score<90) {
            System.out.println("grade: B");
            
        }
        else if(score>=70&&score<80){
            System.out.println("grade: C");
        }  
        else if(score>=600&&score<70){
            System.out.println("grade: D");
        } 
        else   
        {
            System.out.println("grade: Fail");
        }
        

        // Print the student's details
        

       
    }
}
