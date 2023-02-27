package com.example.tiktactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tiktactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReset.setOnClickListener {
            binding.ticTacToeView.reset()
        }
    }

    fun showText(msg: String) {
        binding.tvMessage.text = msg
    }


    fun showMessage(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
}