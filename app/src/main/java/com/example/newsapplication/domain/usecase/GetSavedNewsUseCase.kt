package com.example.newsapplication.domain.usecase

import com.example.newsapplication.data.model.Article
import com.example.newsapplication.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase (private val newsRepository: NewsRepository) {

    fun execute() : Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }

}