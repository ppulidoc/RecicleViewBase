package com.paudam.recicleviewbase
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.paudam.recicleviewbase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       // binding = ActivityMainBinding.inflate(layoutInflater)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding.recyclerview2.layoutManager=LinearLayoutManager(this)
        val arrayChanclas = DataSource().loadChancles()


        val chanclaAdapter = CustomAdapter(arrayChanclas)
        binding.recyclerview2.adapter=chanclaAdapter

    }
}

