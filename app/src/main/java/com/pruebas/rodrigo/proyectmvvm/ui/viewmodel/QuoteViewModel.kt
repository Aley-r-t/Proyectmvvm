package com.pruebas.rodrigo.proyectmvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pruebas.rodrigo.proyectmvvm.data.model.QuoteModel
import com.pruebas.rodrigo.proyectmvvm.data.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}