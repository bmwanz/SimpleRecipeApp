package com.maxscrub.bw.simplerecipeapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.maxscrub.bw.simplerecipeapp.models.FoodRecipe
import com.maxscrub.bw.simplerecipeapp.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {

    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}