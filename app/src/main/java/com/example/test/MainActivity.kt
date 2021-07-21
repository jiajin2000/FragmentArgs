package com.example.test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener(){
            //open new internal activity
            //val aboutIntent = Intent(this,AboutActivity::class.java)

            //startActivity(aboutIntent)


            //open external activity
            //val geo = Uri.parse("geo:3.13,101.7357")
            //val value = Uri.parse("tel:0125556815")
            //val intent = Intent(Intent.ACTION_DIAL, value)
            //val intent = Intent(Intent.ACTION_VIEW, geo)

            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, "Hello")

            try{
                startActivity(intent)
            }catch (e:ActivityNotFoundException){
                Toast.makeText(this, "App Not Found", Toast.LENGTH_LONG).show()
            }

        }

    }
}