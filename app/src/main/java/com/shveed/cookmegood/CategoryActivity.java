package com.shveed.cookmegood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shveed.wallpapperparser.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    List<Recipe> recipes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        setRecipeData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recipeRecycler);
        CategoryRecipeAdapter adapter = new CategoryRecipeAdapter(this, recipes);
        recyclerView.setAdapter(adapter);
    }


    private void setRecipeData(){
        recipes.add(new Recipe("Борщ", "Украина"));
        recipes.add(new Recipe("Пицца", "Италия"));
        recipes.add(new Recipe("Плов", "Узбекистан"));
        recipes.add(new Recipe("Лаваш", "Армения"));
    }

    public void toRecipe(View view){
        Intent intent = new Intent(CategoryActivity.this, RecipePage.class);
        startActivity(intent);
    }

    public void toCart(View view){
        Intent intent = new Intent(CategoryActivity.this, CartActivity.class);
        startActivity(intent);
    }
}
