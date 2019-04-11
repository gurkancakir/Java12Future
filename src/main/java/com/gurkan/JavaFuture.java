package com.gurkan;

import static java.util.Calendar.*;

public class JavaFuture {

    public int switchTest (int day) {
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {return 6;}
            case TUESDAY                -> {return 7;}
            case THURSDAY, SATURDAY     -> {return 8;}
            case WEDNESDAY              -> {return 9;}
            default -> {return 0;}
        }
    }

    public String switchTest2(int a) {
        ITest result = switch (a) {
            case 1 -> new Test1();
            case 2 -> new Test2();
            default -> new Test3();
        };

        return result.test();
    }


    public interface ITest {
        String test();
    }

    public class Test1 implements ITest {

        @Override
        public String test() {
            return "test1";
        }
    }

    public class Test2 implements ITest {

        @Override
        public String test() {
            return "test2";
        }
    }

    public class Test3 implements ITest {

        @Override
        public String test() {
            return "test3";
        }
    }
}
