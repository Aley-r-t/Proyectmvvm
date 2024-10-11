package com.pruebas.rodrigo.proyectmvvm.data.network

import com.pruebas.rodrigo.proyectmvvm.core.RetrofitHelper
import com.pruebas.rodrigo.proyectmvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes():List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}