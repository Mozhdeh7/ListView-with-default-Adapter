package com.moj.androidlistview.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.moj.androidlistview.Model.Category
import com.moj.androidlistview.Model.Product
import com.moj.androidlistview.R
import com.moj.androidlistview.Services.DataServices

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: ArrayAdapter<Category> //define listview with default adapter
    lateinit var myList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = findViewById(R.id.categoriesListView)

        myAdapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, // show items in list with simple design
            DataServices.categories // adapt data to listview
        )

        myList.adapter = myAdapter



    }
}