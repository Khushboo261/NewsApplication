package com.example.newsapplication.domain.usecase

import com.example.newsapplication.data.model.APIResponse
import com.example.newsapplication.data.util.Resource
import com.example.newsapplication.domain.repository.NewsRepository

class GetSearchedNewsUseCase (private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, searchQuery: String, page: Int) : Resource<APIResponse>{
        return newsRepository.getSearchedNews(country, searchQuery, page)
    }

}