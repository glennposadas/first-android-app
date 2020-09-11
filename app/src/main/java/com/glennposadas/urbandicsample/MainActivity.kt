package com.glennposadas.urbandicsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.ln

class MainActivity : AppCompatActivity() {

    // viewDidLoad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("GLENN:2")
        searchButton.setOnClickListener {
            println("HEY! This is the value: " + textField.text)
            navigateToSearchResults(textField.text.toString())
        }
    }

    private fun navigateToSearchResults(word: String) {
        val intent = Intent(this, SearchResultsActivity::class.java)
        intent.putExtra(term, word)
        startActivity(intent)
    }

    companion object {
        val term = "term"
    }
}