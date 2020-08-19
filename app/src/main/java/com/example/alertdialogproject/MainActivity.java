package com.example.alertdialogproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button button;
         private AlertDialog.Builder alertdialogBuilder;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertdialogBuilder=new AlertDialog.Builder(MainActivity.this);
                alertdialogBuilder.setTitle("ALERT");
                alertdialogBuilder.setMessage("Do you want to exit");
                alertdialogBuilder.setIcon(R.drawable.alert);
                alertdialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();

                    }
                });

                alertdialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"you have clicked the NO button",Toast.LENGTH_SHORT).show();

                    }
                });

                alertdialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"you have clicked the Cancel  button",Toast.LENGTH_SHORT).show();

                    }
                });
              AlertDialog alertDialog=alertdialogBuilder.create();
              alertDialog.show();

            }
        });


     }
}