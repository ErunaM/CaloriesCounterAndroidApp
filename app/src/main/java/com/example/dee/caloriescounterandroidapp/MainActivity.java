package com.example.dee.caloriescounterandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import data.DatabaseHandler;
import model.Food;

public class MainActivity extends AppCompatActivity {
    // fetch user items
    private EditText foodName, foodCals;
    private Button submitButton;
    private DatabaseHandler dba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dba = new DatabaseHandler(MainActivity.this);

        foodName = (EditText)findViewById(R.id.foodEditText);
        foodCals = (EditText)findViewById(R.id.caloriesEditText);
        submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                saveDataToDb();

            }
        });
    }

    private void saveDataToDb() {

        Food food = new Food();
        String name = foodName.getText().toString().trim();
        String calsString = foodCals.getText().toString().trim();

        int cals = Integer.parseInt(calsString);

        if(name.equals("") || calsString.equals(""))
        {
            Toast.makeText(getApplicationContext(), "No empty fields allowed", Toast.LENGTH_LONG).show();
        }else{
            food.setFoodName(name);
            food.setCalories(cals);
            dba.addFood(food);
            dba.close();

            //Clear the form
            foodName.setText("");
            foodCals.setText("");

            //Take users to next screen
            startActivity(new Intent(MainActivity.this,DisplayFoodsActivity.class));
        }

    }
}
