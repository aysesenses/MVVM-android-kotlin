package com.example.mvvmproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var result = MutableLiveData<String>()

    init {
        result = MutableLiveData<String>("0")
    }

    fun numAddition(getNum1: String, getNum2: String) {
        val number1 = getNum1.toInt()
        val number2 = getNum2.toInt()

        val addition = number1 + number2
        result.value = addition.toString()
    }

    fun numMultiplication(getNum1: String, getNum2: String){
        val number1 = getNum1.toInt()
        val number2 = getNum2.toInt()

        val multiplication = number1 * number2
        result.value = multiplication.toString()
    }
}