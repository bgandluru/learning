package com.learning.Exceptions;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class EmployeeExceptionMain {

  public static void main(String args[]) {

    Employee e =  new Employee("",3546456,"Sunnyvale",304906 );


      checkEmployee(e);


  }

  public static void checkEmployee(Employee e ) {

    if ( e.geteName().equals("") || e.geteName().isEmpty()) {
      throw new IllegalArgumentException("argument is in valid");
    }

    ArrayList al = new ArrayList();
    //al.add(e);

    if (al.contains(e)) {
      System.out.println("exists");
    } else {

try {
  throw new EmployeeNotFoundException("Employee not available with" +e.geteNo());

} catch (EmployeeNotFoundException eof) {
  eof.printStackTrace();
}

    }

  }

}
