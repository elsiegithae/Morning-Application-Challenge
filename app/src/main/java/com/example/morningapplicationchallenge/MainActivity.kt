package com.example.morningapplicationchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mContacts : Button
    lateinit var mWebsite : Button
    lateinit var mCalculator : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContacts=findViewById(R.id.mBtnContacts)
        mWebsite=findViewById(R.id.mWeb)
        mCalculator=findViewById(R.id.mBtnCalculator)

        mContacts.setOnClickListener {
            val tembea= Intent(this@MainActivity, ContactsActivity::class.java)
            startActivity(tembea)
        }

        mCalculator.setOnClickListener {
            val tembea= Intent(this@MainActivity, Calculator::class.java)
            startActivity(tembea)
        }

        mWebsite.setOnClickListener {
            val tembea= Intent(this@MainActivity, WebsiteActivity::class.java)
            startActivity(tembea)
        }
    }
}