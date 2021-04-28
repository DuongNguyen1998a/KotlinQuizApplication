package com.example.kotlinquizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlinquizapplication.databinding.ActivityMainBinding
import com.example.kotlinquizapplication.utils.Constants

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            if (binding.edtName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please Enter Your Name!", Toast.LENGTH_LONG).show()
            }
            else {
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding.edtName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}