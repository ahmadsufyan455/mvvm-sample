package com.zerodev.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.zerodev.mvvmexample.viewmodel.UserViewModel
import com.zerodev.mvvmexample.viewmodel.UserViewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvName = findViewById<TextView>(R.id.tv_name)

        val factory = UserViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[UserViewModel::class.java]

        viewModel.setName("Ahmad Sufyan")
        viewModel.name.observe(this) {
            tvName.text = it.name
        }
    }
}