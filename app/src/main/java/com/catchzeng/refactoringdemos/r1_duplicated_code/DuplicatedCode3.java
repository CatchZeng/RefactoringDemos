package com.catchzeng.refactoringdemos.r1_duplicated_code;

import android.util.Log;

public class DuplicatedCode3 {
    class Test1 {
        void logHellword() {
            String hello = "hello";
            String world = "world";
            String log = hello + world;
            Log.i("DuplicatedCode", log);
        }
    }

    class Test2 {
        void logHellword() {
            String hello = "hello";
            String world = "world";
            String log = hello + world;
            Log.i("DuplicatedCode", log);
        }
    }
}
