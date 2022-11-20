package com.example.cargame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    private ShapeableImageView rock_0_0;
    private ShapeableImageView rock_0_1;
    private ShapeableImageView rock_0_2;
    private ShapeableImageView rock_1_0;
    private ShapeableImageView rock_1_1;
    private ShapeableImageView rock_1_2;
    private ShapeableImageView rock_2_0;
    private ShapeableImageView rock_2_1;
    private ShapeableImageView rock_2_2;
    private ShapeableImageView rock_3_0;
    private ShapeableImageView rock_3_1;
    private ShapeableImageView rock_3_2;
    private ShapeableImageView rock_4_0;
    private ShapeableImageView rock_4_1;
    private ShapeableImageView rock_4_2;
    private ShapeableImageView rock_5_0;
    private ShapeableImageView rock_5_1;
    private ShapeableImageView rock_5_2;

    private MaterialButton btn_left;
    private MaterialButton btn_right;

    private MaterialTextView score;

    private int delay = 1000;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        find();


        handler = new Handler();
        Runnable runnable = new Runnable() {
            public void run() {
                handler.postDelayed(this, delay);
                updateTimeUI();
            }
        };

    }
    private void updateTimeUI() {

    }
    private void find() {
        rock_0_0 = findViewById(R.id.main_grid_0_0);
        rock_0_1 = findViewById(R.id.main_grid_0_1);
        rock_0_2 = findViewById(R.id.main_grid_0_2);
        rock_1_0 = findViewById(R.id.main_grid_1_0);
        rock_1_1 = findViewById(R.id.main_grid_1_1);
        rock_1_2 = findViewById(R.id.main_grid_1_2);
        rock_2_0 = findViewById(R.id.main_grid_2_0);
        rock_2_1 = findViewById(R.id.main_grid_2_1);
        rock_2_2 = findViewById(R.id.main_grid_2_2);
        rock_3_0 = findViewById(R.id.main_grid_3_0);
        rock_3_1 = findViewById(R.id.main_grid_3_1);
        rock_3_2 = findViewById(R.id.main_grid_3_2);
        rock_4_0 = findViewById(R.id.main_grid_4_0);
        rock_4_1 = findViewById(R.id.main_grid_4_1);
        rock_4_2 = findViewById(R.id.main_grid_4_2);
        rock_5_0 = findViewById(R.id.main_grid_5_0);
        rock_5_1 = findViewById(R.id.main_grid_5_1);
        rock_5_2 = findViewById(R.id.main_grid_5_2);
        btn_left = findViewById(R.id.main_btn_left);
        btn_right = findViewById(R.id.main_btn_right);
        score = findViewById(R.id.main_txt_score);

    }
}