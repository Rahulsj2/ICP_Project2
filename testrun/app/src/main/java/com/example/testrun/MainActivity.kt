package com.example.testrun

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignIn: Button = findViewById(R.id.signin)
        btnSignIn.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)

        }

        val btnCreateAccount: Button = findViewById(R.id.createaccount)
        btnCreateAccount.setOnClickListener {
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)
        }

        val btnLogIn: Button = findViewById(R.id.login)
        btnLogIn.setOnClickListener {
            val intent = Intent(this, recyclewaste::class.java)
            startActivity(intent)

        }
        val btnSignUp: Button = findViewById(R.id.signup)
        btnSignUp.setOnClickListener {
            val intent = Intent(this, recyclewaste::class.java)
            startActivity(intent)

        }
        val btnView1: Button = findViewById(R.id.view1id)
        btnView1.setOnClickListener {
            val intent = Intent(this, viewaccountpage::class.java)
            startActivity(intent)

        }
        val btnScan: Button = findViewById(R.id.scanid)
        btnScan.setOnClickListener {
            val intent = Intent(this, recyclewaste::class.java)
            startActivity(intent)

        }


    }

}
