package com.example.prjgrannyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_page)
        var LoginButton : Button = findViewById(R.id.btLogin)
        var RegisterButton : Button = findViewById(R.id.btRegister)
        var txtUserName: EditText = findViewById(R.id.txtUsername)
        var txtPassword: EditText = findViewById(R.id.txtPassword)

        LoginButton.setOnClickListener()
        {
            UserData().AddOldUsers()
            var AllowIn:Boolean = UserData().CheckUser(txtUserName.text.toString(),
                txtPassword.text.toString())
            if (AllowIn)
            {
                val intent = Intent(this, Welcome :: class.java)
            }
        }

        RegisterButton.setOnClickListener()
        {

        }

    }
}