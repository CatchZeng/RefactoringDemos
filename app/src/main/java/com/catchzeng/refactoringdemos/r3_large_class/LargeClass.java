package com.catchzeng.refactoringdemos.r3_large_class;

public class LargeClass {

    class Person {
        String name;
        int offciceAreaCode;
        String offciceNumber;

        String getPhoneNumber() {
            return offciceAreaCode+offciceNumber;
        }
    }
}
