package com.example.lb2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lb2.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    private val vb by viewBinding(
        ActivityBBinding::bind,
        R.id.b_root
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        vb.btn.setOnClickListener{
            var t2 = vb.textEd.text.toString()

            startActivity(Intent(this, MainActivity::class.java)
                .putExtra(KEY_B, t2))
        }
    }
}