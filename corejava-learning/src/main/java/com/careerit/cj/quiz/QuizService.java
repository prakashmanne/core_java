package com.careerit.cj.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizService {

    private List<Question> questions;
    public QuizService(){
        questions = new ArrayList<>();
        Question q1 = new Question("Java is platform or programming language ?",
          "programming language",
          "platform",
          "neither programming nor platform",
          "It it both",
          4
        );
      Question q2 = new Question("3 + 3 * 4 = ?",
          "10",
          "15",
          "8",
          "12",
          2
      );
      Question q3 = new Question("(3 + 3) * 4 = ?",
          "10",
          "15",
          "24",
          "28",
          3
     );
      questions.add(q1);
      questions.add(q2);
      questions.add(q3);
    }

    public void startQuiz() throws InterruptedException {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name :");
      String name = sc.nextLine();
      System.out.println("Hi "+name+", please wait your quiz is going to start in few seconds....");
      TimeUnit.SECONDS.sleep(5);
      int ccount = 0;
      for(Question question:questions){
        int i = 1;
        System.out.println("-".repeat(100));
        System.out.println(question.getQdata());
        System.out.println(i++ +") "+question.getOption1());
        System.out.println(i++ +") "+question.getOption2());
        System.out.println(i++ +") "+question.getOption3());
        System.out.println(i++ +") "+question.getOption4());
        System.out.println("Enter your answer (1-4) :");
        int userAnswer = sc.nextInt();
        if(userAnswer == question.getAnswer()){
            ccount++;
        }
      }
      if(ccount == questions.size()){
        System.out.println("Hi "+name+" congratulation you done good job");
      }else{
        System.out.println("Hi "+name+" sorry! please try again");
      }
    }

}
