package com.example.aluno.telalogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast



class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       val login :Button = findViewById<Button>(R.id.button)

         login.setOnClickListener(View.OnClickListener {
             val textViewlogin: TextView = findViewById(R.id.login) as TextView
             val textViewsenha: TextView = findViewById(R.id.senha) as TextView

             val loginResult: Boolean = FunLogin.login(
                     textViewlogin.text.toString(),
                     textViewsenha.text.toString())

             if( loginResult == true){
                 toast ("Login realizado com sucesso")
             }else{
                 toast("Usuario ou senha incorretos")
             }


         })
    }
}
