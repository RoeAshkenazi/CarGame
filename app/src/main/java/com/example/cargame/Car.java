package com.example.cargame;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.imageview.ShapeableImageView;

public class Car extends AppCompatActivity {

    private ShapeableImageView car_left;
    private ShapeableImageView car_mid;
    private ShapeableImageView car_right;

    private ShapeableImageView heart_1;
    private ShapeableImageView heart_2;
    private ShapeableImageView heart_3;

    private int life;
    private ShapeableImageView main_IMG_car;

    public Car()
    {


        car_left = findViewById(R.id.main_car_left);
        car_mid = findViewById(R.id.main_car_mid);
        car_right = findViewById(R.id.main_car_right);
        heart_1 = findViewById(R.id.main_img_heart_1);
        heart_2 = findViewById(R.id.main_img_heart_2);
        heart_3 = findViewById(R.id.main_img_heart_3);
    }

    public void toLeft()
    {
    }






}
