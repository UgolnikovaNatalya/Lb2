package com.example.lb2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.widget.RadioButton
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lb2.databinding.ActivityMainBinding

const val KEY_B = "B"
const val KEY_C = "C"

class MainActivity : AppCompatActivity() {

    var radioButtonChecked : RadioButton? = null

    private val vb by viewBinding(
        ActivityMainBinding :: bind,
        R.id.main_root
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t1 = intent.getStringExtra(KEY_B)
        val t2 = intent.getStringExtra((KEY_C))

        if (t1 != null || t2 != null)
        {
            if (t1 == null){
                vb.resTv.text = t2
            }
            else{
                vb.resTv.text = t1
            }
        }

        vb.btn.setOnClickListener{
            val selectedId = vb.radioGroup!!.checkedRadioButtonId
            radioButtonChecked = findViewById(selectedId)

            if (radioButtonChecked?.text == "class B"){
                startActivity(Intent(this, ActivityB::class.java))
            }
            else
            {
                startActivity(Intent(this, ActivityC::class.java))
            }
        }
    }
}