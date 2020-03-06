package com.example.cesar.hilos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tiposHilos();
    }

    private void tiposHilos()
    {
        new Thread(new Runnable() {
            @Override
            public void run(){
                //proceso lento
            }
        }).start();


        //hilo 1
        Hilo1 h1=new Hilo1();
        h1.start();

        //hilo 2
        Thread h2=new Thread(new Hilo2());
        h2.start();


    }


    public class HiloDatos extends Thread{
       Context ctx;

        public HiloDatos (Context contexto){

            this.ctx=contexto;
            this.run();
        }
        @Override
        public void run()
        {
            super.run();
            //proceso lento iria aqui

        }

    }



}
