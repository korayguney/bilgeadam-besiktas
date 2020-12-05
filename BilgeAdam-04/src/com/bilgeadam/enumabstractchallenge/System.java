package com.bilgeadam.enumabstractchallenge;

public enum System {

    OUT {
        @Override
        public void println(String s) {
            java.lang.System.out.println(s);
        }

        @Override
        public void print(String s) {
            java.lang.System.out.print(s);
        }
    },
    ERR {
        @Override
        public void print(String s) {
            java.lang.System.err.print(s);
        }

        @Override
        public void println(String s) {
            java.lang.System.err.println(s);
        }
    };

    public abstract void print(String s);
    public abstract void println(String s);



}
