package com.example.dearmydiary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dearmydiary.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    lateinit var binding : ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}