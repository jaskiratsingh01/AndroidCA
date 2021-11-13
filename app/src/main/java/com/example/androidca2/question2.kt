package com.example.androidca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class question2 : AppCompatActivity() {

    private lateinit var radioGrp:RadioGroup;
    private lateinit var c1:CheckBox;
    private lateinit var c2:CheckBox;
    private lateinit var c3:CheckBox;
    private lateinit var c4:CheckBox;
    private lateinit var c5:CheckBox;
    private lateinit var c6:CheckBox;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        radioGrp=findViewById(R.id.radiogrp);

        c1=findViewById(R.id.php);
        c2=findViewById(R.id.net);
        c3=findViewById(R.id.bootstrap);
        c4=findViewById(R.id.html);
        c5=findViewById(R.id.css);
        c6=findViewById(R.id.java);


        radioGrp.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->  val radio : RadioButton = findViewById(checkedId)
            Toast.makeText(applicationContext,"Gender:"+" ${radio.text}" , Toast.LENGTH_SHORT).show()
        })

        c1.setOnClickListener{
            if(c1.isChecked)
            {
                Toast.makeText(applicationContext, "${c1.text}"+" is selected", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(applicationContext, "${c1.text}"+" is Removed", Toast.LENGTH_SHORT).show();
            }
        }
        c2.setOnClickListener{
            if(c2.isChecked)
            {
                Toast.makeText(applicationContext, "${c2.text}"+" is selected", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(applicationContext, "${c2.text}"+" is Removed", Toast.LENGTH_SHORT).show();
            }
        }
        c3.setOnClickListener{
            if(c3.isChecked)
            {
                Toast.makeText(applicationContext, "${c3.text}"+" is selected", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(applicationContext, "${c3.text}"+" is Removed", Toast.LENGTH_SHORT).show();
            }
        }
        c4.setOnClickListener{
            if(c4.isChecked)
            {
                Toast.makeText(applicationContext, "${c4.text}"+" is selected", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(applicationContext, "${c4.text}"+" is Removed", Toast.LENGTH_SHORT).show();
            }
        }
        c5.setOnClickListener{
            if(c5.isChecked)
            {
                Toast.makeText(applicationContext, "${c5.text}"+" is selected", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(applicationContext, "${c5.text}"+" is Removed", Toast.LENGTH_SHORT).show();
            }
        }
        c6.setOnClickListener{
            if(c6.isChecked)
            {
                Toast.makeText(applicationContext, "${c6.text}"+" is selected", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(applicationContext, "${c6.text}"+" is Removed", Toast.LENGTH_SHORT).show();
            }
        }


    }
}