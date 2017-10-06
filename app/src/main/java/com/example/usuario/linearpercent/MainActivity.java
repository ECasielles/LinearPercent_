package com.example.usuario.linearpercent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Prevalece wrap content frente a layout_gravity
 * Se pone layout_width 0dp para que no lo haga.
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Activity
 * @see android.support.v7.app.AppCompatActivity
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
