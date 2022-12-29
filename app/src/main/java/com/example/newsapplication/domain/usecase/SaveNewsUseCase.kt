package com.example.newsapplication.domain.usecase

import com.example.newsapplication.data.model.Article
import com.example.newsapplication.domain.repository.NewsRepository

class SaveNewsUseCase (private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) = newsRepository.saveNews(article)

}