package com.careerit.cj.str;

public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Core");
    sb.append(" Java");
    System.out.println(sb);

    String empno = "SPAN007";
    String name = "Satya";
    double salary = 98000.89786;

    String formattedData = String.format("Empno :%s\nEname :%s\nSalary :%.2f",empno,name,salary);

    System.out.println(formattedData);
    // empno = {} - name = {} - salary = {}
    //String data = "empno = "+empno+" - "+"name = "+name+" - "+"salary = "+salary;
    //System.out.println(data);
    StringBuilder sb1 = new StringBuilder();
    sb1.append("empno = ").append(empno).append(" - ").append("name = ").append(name).append(" - ").append("salary = ")
        .append(salary);
    System.out.println(sb1.toString());

    String str = "ABCDEFG";
    String rstr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rstr += str.charAt(i);
    }
    System.out.println(rstr);

    String str1 = "ABCDEFG";
    String rstr1 = new StringBuilder(str1).reverse().toString();
    System.out.println(rstr1);

  }
  private static boolean isPalindrome(String str){
    return new StringBuilder(str).reverse().toString().equals(str);
  }
}
