package com.example.newsapplication.domain.usecase

import com.example.newsapplication.data.model.APIResponse
import com.example.newsapplication.data.util.Resource
import com.example.newsapplication.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase (private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int) : Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country, page)
    }
}