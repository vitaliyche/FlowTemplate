package com.codeliner.flowtemplate.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.codeliner.flowtemplate.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.message)

        ViewModelProvider(this)[MainViewModel::class.java]
            .liveData.observe(this) { dataFromDataBase ->
                textView.text = dataFromDataBase.Data
            }

    } // onCreate
}