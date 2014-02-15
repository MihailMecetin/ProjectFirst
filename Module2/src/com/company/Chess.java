package com.company;

public class Chess {

    public static void main (String [] args) {


    }

    class GameShape{
        public byte x,y;
        public GameShape(byte StartX,byte StartY){
            x=StartX;
            y=StartY;
        }
        public void Move(byte NewX,byte NewY){
            x=NewX;
            y=NewY;
        }
    }

    class Empty extends GameShape{
        public Empty(byte StartX, byte StartY) {
            super(StartX, StartY);
        }
    }




}
