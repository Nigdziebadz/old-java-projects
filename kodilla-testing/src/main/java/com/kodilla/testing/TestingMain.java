package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
        public static void main(String[] args){
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")){
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

            Calculator calculate = new Calculator();

            int resultAdd = calculate.Add(5, 5);
            int resultSubstract = calculate.Subtract(10, 5);

            if (resultAdd == 10) {
                System.out.println("test OK");
            } else {
                System.out.println("Wrong result");
            }

            if (resultSubstract >= 10) {
                System.out.println("test OK");
            } else {
                System.out.println("Wrong result");
            }
        }
}
