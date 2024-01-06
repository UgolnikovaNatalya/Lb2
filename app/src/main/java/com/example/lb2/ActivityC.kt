package com.example.lb2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lb2.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {

    private val vb by viewBinding(
        ActivityCBinding::bind,
        R.id.c_root
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        vb.btn.setOnClickListener{
            startActivity(
                Intent(this, MainActivity::class.java)
                .putExtra(KEY_C, vb.input.text.toString()))
        }
    }
}