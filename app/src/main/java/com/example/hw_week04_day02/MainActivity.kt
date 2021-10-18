package com.example.hw_week04_day02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val employees= mutableListOf<CardDataModle>(
        CardDataModle("I am Strong",R.drawable.cover7),
        CardDataModle(" i believe in myself ",R.drawable.img2),
        CardDataModle("earth is a watery planet",R.drawable.ima3)
    )



    private lateinit var empRecyclerView: RecyclerView
    private lateinit var empAdapter: EmployeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        empRecyclerView=findViewById(R.id.emp_recyclerview)
        empAdapter=EmployeeAdapter(employees)
        empRecyclerView.adapter=empAdapter
    }
}