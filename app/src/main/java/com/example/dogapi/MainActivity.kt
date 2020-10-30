package com.example.dogapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val dogs = ArrayList<Dog>()

        dogs.add(Dog("akita"))
        dogs.add(Dog("lazy"))
        dogs.add(Dog("koker"))
        dogs.add(Dog("salchicha"))

        val adapter = CustomAdapter(dogs)

        recyclerView.adapter = adapter

        Toast.makeText(this, "Llego",Toast.LENGTH_LONG).show()

    }
}