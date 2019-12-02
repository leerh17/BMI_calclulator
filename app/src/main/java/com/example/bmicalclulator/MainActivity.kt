package com.example.bmicalclulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            val Weight: Double = Weight.text.toString().toDouble()//calculation part
            val Height: Double = Height.text.toString().toDouble()
            val bmi: Double = Weight / (Height * Height)

            Bmi.text = "BMI : %.2f".format(bmi)//calculation part

            //show image
            if (bmi < 18.5) {
                img.setImageResource(R.drawable.under);

            } else if (bmi >= 18.5 && bmi <= 24.9) {
                img.setImageResource(R.drawable.normal);

            } else if (bmi > 25) {
                img.setImageResource(R.drawable.over);
            }
        }

        reset.setOnClickListener(){
            Weight.text= null;
            Height.text=null;
            Bmi.text="BMI : ";
            img.setImageResource(R.drawable.empty);

        }
    }
}
