package com.catchzeng.refactoringdemos.r1_duplicated_code;

import android.util.Log;

public class DuplicatedCode {

    private void test() {
        String hello = "hello";
        String world = "world";
        String log = hello + world;
        Log.i("DuplicatedCode", log);
    }

    private void test2() {
        String hello = "hello";
        String world = "world";
        String log = hello + world;
        Log.i("DuplicatedCode", log);
    }
}
