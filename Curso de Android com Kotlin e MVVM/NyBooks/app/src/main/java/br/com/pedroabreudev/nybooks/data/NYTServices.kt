package br.com.pedroabreudev.nybooks.data


import br.com.pedroabreudev.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "ycDXzkGGUiB1JMm6SbV98NJf6mCJ6zO4",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}