package com.example.newsapplication.domain.usecase

import com.example.newsapplication.data.model.APIResponse
import com.example.newsapplication.data.util.Resource
import com.example.newsapplication.domain.repository.NewsRepository

class GetSearchedNewsUseCase (private val newsRepository: NewsRepository) {

    suspend fun execute(searchQuery: String) : Resource<APIResponse>{
        return newsRepository.getSearchedNews(searchQuery)
    }

}