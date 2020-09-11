package com.glennposadas.urbandicsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SearchResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_results)

        val term = intent.getStringExtra(MainActivity.term)
        println("---Search Results" + term)

        supportActionBar?.title = term
        getSearchResultsForTerm(term)
    }

    private fun getSearchResultsForTerm(term: String) {

    }
}
