package com.example.lexdex

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration

const val EXTRA_MESSAGE = "com.example.lexdex.MESSAGE"

class MainActivity : AppCompatActivity()
{
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* From the demo
    fun sendMessage(view: View)
    {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
    */

    fun openCreateMenu(view: View)
    {
        val intent = Intent(this, AddMenuActivity::class.java)
        startActivity(intent)
    }
}