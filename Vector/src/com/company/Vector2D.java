package com.company;

public class Vector2D {
    double vX;
    double vY;

    public Vector2D(double vX,double vY){
       this.vX =vX ;
        this.vY=vY;
    }
    public void Vector11 (){
       vX = 1;
       vY = 1;
    }
    public void Vector2D2(Vector2D Vector2D ){

    }
    public  void print(Vector2D vector2D){
       String g = String.format( "%.2f",vector2D.vX);
       String g1 = String.format( "%.2f",vector2D.vY);
        System.out.println(g + ","+g1);
    }
}
