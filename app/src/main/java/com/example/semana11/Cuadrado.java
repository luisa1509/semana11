package com.example.semana11;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Cuadrado {
    private float x;
    private float y;
    private float h;
    private float w;
    private int color;
    private float tam;
    private float margen;

    public Cuadrado(float x,float y,int color, float margen){
        this.x=x;
        this.y=y;
        this.h=h;
        this.w=w;
        this.color=color;
        tam=300;
        this.margen=margen;

    }

public void pintar(Canvas canvas){
        //paint=fill
    Paint p= new Paint();
    p.setColor(color);
    canvas.drawRect(x,y,x+tam,y+tam,p);
}
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
