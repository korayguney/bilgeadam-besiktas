package com.bilgeadam.interfacechallenge;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint mv = new MovablePoint(0,0);
        mv.moveDown();
        mv.moveDown();
        mv.moveDown();
        mv.moveRight();
        mv.moveRight();
        mv.moveUp();
        mv.moveLeft();
        mv.moveLeft();
        mv.moveLeft();
        mv.moveLeft();
        mv.moveLeft();

        /* intifinate loop
        for(;;){
           new MovablePoint(0,0);
        }

         */


    }
}
