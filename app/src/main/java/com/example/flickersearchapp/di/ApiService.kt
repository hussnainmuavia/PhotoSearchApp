package com.example.flickersearchapp.di

import com.example.flickersearchapp.domain.models.SearchResult
import com.example.flickersearchapp.utils.Constants.API_KEY_VALUE
import com.example.flickersearchapp.utils.Constants.KEY_API_KEY
import com.example.flickersearchapp.utils.Constants.KEY_FORMAT
import com.example.flickersearchapp.utils.Constants.KEY_JSON
import com.example.flickersearchapp.utils.Constants.KEY_NO_JSON_CALLBACK
import com.example.flickersearchapp.utils.Constants.KEY_PAGE
import com.example.flickersearchapp.utils.Constants.KEY_QUERY
import com.example.flickersearchapp.utils.Constants.SEARCH_PHOTO_PATH
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(SEARCH_PHOTO_PATH)
    suspend fun getSearchResults(
        @Query(KEY_API_KEY) apiKey: String = API_KEY_VALUE,
        @Query(KEY_QUERY) text: String,
        @Query(KEY_PAGE) page: Int,
        @Query(KEY_FORMAT) format: String = KEY_JSON,
        @Query(KEY_NO_JSON_CALLBACK) noJsonCallback: Int = 1
    ): SearchResult
}