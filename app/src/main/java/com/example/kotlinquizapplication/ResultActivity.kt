package com.example.kotlinquizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinquizapplication.databinding.ActivityQuizQuestionBinding
import com.example.kotlinquizapplication.databinding.ActivityResultBinding
import com.example.kotlinquizapplication.utils.Constants

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestion = intent.getStringExtra(Constants.TOTAL_QUESTION)
        val correctAnswer = intent.getStringExtra(Constants.CORRECT_ANSWER)

        binding.tvUsername.text = username
        binding.tvScore.text = "Your Score is $correctAnswer out of $totalQuestion"

        binding.btnFinish.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}