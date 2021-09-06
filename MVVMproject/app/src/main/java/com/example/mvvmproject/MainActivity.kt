package com.example.mvvmproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainActivityObject = this

        viewModel.result.observe(this, {
            binding.calculatedResult = it
        })
    }

    fun addition(getNum1: String, getNum2: String) {
        viewModel.numAddition(getNum1, getNum2)
    }

    fun multiplication(getNum1: String, getNum2: String) {
        viewModel.numMultiplication(getNum1, getNum2)
    }
}