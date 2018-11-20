package com.catchzeng.refactoringdemos.r1_duplicated_code;

import android.util.Log;

public class DuplicatedCode2 {

    class Base {

    }

    class Test1 extends Base {
        void print() {
            String hello = "hello";
            String world = "world";
            String log = hello + world;
            Log.i("DuplicatedCode", log);
        }
    }

    class Test2 extends Base {
        void print2() {
            String hello = "hello";
            String world = "world";
            String log = hello + world;
            Log.i("DuplicatedCode", log);
        }
    }
}
