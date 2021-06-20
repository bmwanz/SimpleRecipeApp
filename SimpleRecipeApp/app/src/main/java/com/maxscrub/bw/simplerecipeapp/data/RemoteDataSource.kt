package com.maxscrub.bw.simplerecipeapp.data

import com.maxscrub.bw.simplerecipeapp.data.network.FoodRecipesApi
import com.maxscrub.bw.simplerecipeapp.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    // will fetch from NetworkModule
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}