package com.example.daftarteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private var auth: FirebaseAuth? = null
    private val RC_SIGN_IN = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        progress.visibility = View.GONE
        login.setOnClickListener(this)
        auth = FirebaseAuth.getInstance()

        if (auth!!.currentUser == null) {
        }else {
            intent = Intent(applicationContext, MainActivity::class.java)
        }
    }
}