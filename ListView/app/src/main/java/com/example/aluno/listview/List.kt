package com.example.aluno.listview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_list.*

class List : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        //setSupportActionBar(toolbar)

        /*fab.setOnClickListener{view: view! ->
            Snackbar.make(view, text: "Replace with your own action", Snackbar.LENGTH_LONG)
        }*/

        val arrayDeLinhas = ArrayList<String>()
        arrayDeLinhas.add("Primeira")
        arrayDeLinhas.add("Segunda")
        arrayDeLinhas.add("Terceira")
        arrayDeLinhas.add("Quarta")

        val lv:ListView=findViewById(R.id.listview)
        lv.adapter = ArrayAdapter( this,
                android.R.layout.simple_list_item_1,
                arrayDeLinhas)

        }
    }
