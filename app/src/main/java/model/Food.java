package model;

import java.io.Serializable;

/**
 * Created by Dee on 1/03/2017.
 */

public class Food implements Serializable{ // Name, Calorie and Record date
    private static final long serialVersionUID = 10L;
    private String foodName;
    private int calories;
    private int foodId; // hold id in our data base
    private String recordDate;

    public Food(String food, int cals, int id, String date)
    {
        foodName = food;
        calories = cals;
        foodId = id;
        recordDate = date;

    }
    public Food()
    {

    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
