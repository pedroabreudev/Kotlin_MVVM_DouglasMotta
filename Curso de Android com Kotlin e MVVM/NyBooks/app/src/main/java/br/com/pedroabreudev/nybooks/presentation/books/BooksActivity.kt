package br.com.pedroabreudev.nybooks.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.pedroabreudev.nybooks.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = "Books"
        setSupportActionBar(toolbarMain)
    }
}