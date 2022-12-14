package com.careerit.cj.str;

public class StringMethod1 {
  public static void main(String[] args) {
    // Split
    String str = "123-Krish-38,124- Satya S -36,125-Ashok-40";
    String[] empArr = str.split(",");
    for (String emp : empArr) {
      String[] data = emp.split("-");
      if(data[1].toUpperCase().startsWith("K")) {
        System.out.println(data[1].trim().toUpperCase());
      }
    }
    System.out.println("Hello".equalsIgnoreCase("hello"));
    System.out.println("Learning java is fun!".contains("ing"));

    String s1="Krish";
    String s2 = "Manoj";
    String s3= "Satya";
    String s4 = "John";
    // Krish,Manoj,Satya,John
    String data = String.join(",",s1,s2,s3,s4);
    System.out.println(data);
    String s = "*";
    System.out.println(s.repeat(100));
    // Text Blocks
    String empData = """
            {
               "empno":1001,
               "name":"Manoj",
               "worksfor":"SSGA",
               "address":
                  {
                    "city":"Bangalore",
                    "state":"KA"
                  }
               
            }
        """;
    System.out.println(empData);

    String empInfo = String.format("""
        Hello %s,
              Learning java is fun!
              
              To have fun learn Java
              
              Wish you all best %s
        """,s1,s1);
    System.out.println(empInfo);

    String sample = "Welcome to JAVA world!";
    System.out.println(sample.substring(2));
    System.out.println(sample.substring(2,5));
  }
}
