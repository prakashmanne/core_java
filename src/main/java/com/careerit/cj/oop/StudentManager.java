package com.careerit.cj.oop;

public class StudentManager {
  public static void main(String[] args) {

    Student[] arr = getStudents();
    // Get the max score
    int max = arr[0].score;
    for(Student s:arr){
        if(max < s.score){
            max = s.score;
        }
    }
    System.out.println("-".repeat(60));
    System.out.println("Max score :"+max);
    System.out.println("-".repeat(60));
    // Show Details of max score student(s)
    System.out.println("Max scored student(s)");
    System.out.println("-".repeat(60));
    for(Student student:arr){
        if(student.score == max){
            student.showInfo();
        }
    }
    System.out.println("-".repeat(60));
    // What is the average score
    int sum = 0;
    for(Student s:arr){
        sum+=s.score;
    }
    double avg = sum / (double)arr.length;
    System.out.println("Average score is :"+avg);
    // How many student(s) are eligible for promotion ( Score >=5 )
    int count = 0;
    for(Student s:arr){
        if(s.score >= 5){
          count++;
        }
    }
    System.out.println("Total "+count+" students are eligible for promotion");
  }

  private static Student[] getStudents() {
    Student s1 = new Student(1001, "Tanvi", 2, 8);
    Student s2 = new Student(1002, "Sai", 2, 5);
    Student s3 = new Student(1021, "Anusha", 2, 4);
    Student s4 = new Student(1031, "Rani", 2, 2);
    Student s5 = new Student(1041, "Dhatri", 2, 8);
    Student s6 = new Student(1002, "Aadya", 2, 10);
    Student s7 = new Student(1051, "Anish", 2, 9);
    Student s8 = new Student(1061, "Nimmi", 2, 2);
    Student s9 = new Student(1081, "Dummy", 2, 8);
    Student s10 = new Student(1091, "Charan", 2, 10);
    return new Student[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
  }
}
