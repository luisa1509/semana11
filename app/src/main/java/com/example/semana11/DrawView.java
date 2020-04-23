package com.example.semana11;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;


public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private int width;
    private int height;
    private int framecount;
    private Cuadrado cuadrado1;
    private Cuadrado cuadrado2;
    private Cuadrado cuadrado3;
    private Cuadrado cuadrado4;
    private Cuadrado cuadrado5;
    private Cuadrado cuadrado6;
    private Cuadrado cuadrado7;
    private Cuadrado cuadrado8;
    private Cuadrado cuadrado9;
    private float tamcua=0;
    private int selec;

    private ArrayList<Cuadrado> tablero;

    //control+O

//equivale a settings
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        width=w;
        height=h;
        setup();

    }
    //equivale a setup
    public void setup(){
        tablero = new ArrayList<>();
        tamcua=width/3;
        selec=0;
        cuadrado1 = new Cuadrado(0,0,Color.rgb(0,255,0),tamcua);
        cuadrado2 = new Cuadrado(tamcua,0,Color.rgb(0,255,0),tamcua);
        cuadrado3 = new Cuadrado(tamcua*2,0,Color.rgb(0,255,0),tamcua);
        cuadrado4 = new Cuadrado(0,tamcua,Color.rgb(0,255,0),tamcua);
        cuadrado5 = new Cuadrado(tamcua,tamcua,Color.rgb(0,255,0),tamcua);
        cuadrado6 = new Cuadrado(tamcua*2,tamcua,Color.rgb(0,255,0),tamcua);
        cuadrado7 = new Cuadrado(0,tamcua*2,Color.rgb(0,255,0),tamcua);
        cuadrado8 = new Cuadrado(tamcua,tamcua*2,Color.rgb(0,255,0),tamcua);
        cuadrado9 = new Cuadrado(tamcua*2,tamcua*2,Color.rgb(0,255,0),tamcua);

        tablero.add(cuadrado1);
        tablero.add(cuadrado2);
        tablero.add(cuadrado3);
        tablero.add(cuadrado4);
        tablero.add(cuadrado5);
        tablero.add(cuadrado6);
        tablero.add(cuadrado7);
        tablero.add(cuadrado8);
        tablero.add(cuadrado9);


    }

    //equivale al draw
    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        framecount++;
        canvas.drawARGB(255,0,0,0);

        Paint paint = new Paint();


        //paint.setColor(Color.rgb(255,0,0));
        //canvas.drawRect(100,100,200,200,paint);

        //Cuadrado cuadrado = new Cuadrado(event.getX(),event.getY(),Color.rgb(0,255,0));
        for (int i=0; i<tablero.size(); i++){
            tablero.get(i).pintar(canvas);
            //Cuadrado cua= tablero[0];
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_UP:
                if(event.getX()<tamcua && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(0).setColor(Color.rgb(255,0,0));
                    selec=1;
                }
                if(event.getX()<tamcua*2 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(1).setColor(Color.rgb(255,0,0));
                    selec=2;
                }
                if(event.getX()<tamcua*3 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(2).setColor(Color.rgb(255,0,0));
                    selec=3;
                }
                if(event.getX()<150 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(3).setColor(Color.rgb(255,0,0));
                    selec=4;
                }
                if(event.getX()<150 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(4).setColor(Color.rgb(255,0,0));
                    selec=5;
                }
                if(event.getX()<150 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(5).setColor(Color.rgb(255,0,0));
                    selec=6;
                }
                if(event.getX()<150 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(6).setColor(Color.rgb(255,0,0));
                    selec=7;
                }
                if(event.getX()<150 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(7).setColor(Color.rgb(255,0,0));
                    selec=8;
                }
                if(event.getX()<150 && event.getX()>0 && event.getY()<150 && event.getY()>0){
                    tablero.get(8).setColor(Color.rgb(255,0,0));
                    selec=9;
                }

                break;
        }
        return false;
    }

}







