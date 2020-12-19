package com.rofi_18102032.praktikum9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rofi_18102032.praktikum9.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        supportActionBar?.title = getString(R.string.main_title)
    }
}
