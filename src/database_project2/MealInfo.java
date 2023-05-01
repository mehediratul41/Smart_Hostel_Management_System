/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

/**
 *
 * @author Asus
 */
public class MealInfo {
    
    private String mealId;
    private String memberId;
    private String mealType;
    private String noOfMeal;
    private String date;
    
    
    public MealInfo() {
    }
    
    public MealInfo(String mealId, String memberId, String mealType, String noOfMeal,String date) {
        this.mealId = mealId;
        this.memberId = memberId;
        this.mealType = mealType;
        this.noOfMeal = noOfMeal;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getNoOfMeal() {
        return noOfMeal;
    }

    public void setNoOfMeal(String noOfMeal) {
        this.noOfMeal = noOfMeal;
    }

}


