package com.maxscrub.bw.simplerecipeapp.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.maxscrub.bw.simplerecipeapp.util.Constants

//@HiltViewModel
class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        // number of recipes, between 1-100
        queries[Constants.QUERY_NUMBER] = "50"
        queries[Constants.QUERY_API_KEY] = Constants.API_KEY
        queries[Constants.QUERY_TYPE] = "snack"
        queries[Constants.QUERY_DIET] = "vegan"
        queries[Constants.QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[Constants.QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }

}