package com.example.applist3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
    }
    public void legislacion(View View){
    	Toast.makeText(getApplicationContext(), "Dos horas",Toast.LENGTH_LONG).show();
    }
    public void trabajo(View View){
    	Toast.makeText(getApplicationContext(), "Dos horas",Toast.LENGTH_LONG).show();
    }
    public void proyecto(View View){
    	Toast.makeText(getApplicationContext(), "Dos horas",Toast.LENGTH_LONG).show();
    }
    public void programacion(View View){
    	Toast.makeText(getApplicationContext(), "Ocho horas",Toast.LENGTH_LONG).show();
    }
    public void comercio(View View){
    	Toast.makeText(getApplicationContext(), " Dos horas",Toast.LENGTH_LONG).show();
    }
    public void aplicaciones(View View){
    	Toast.makeText(getApplicationContext(), "Cuatro horas",Toast.LENGTH_LONG).show();
    }
    public void produccion(View View){
    	Toast.makeText(getApplicationContext(), "Cinco horas",Toast.LENGTH_LONG).show();
    }
}
