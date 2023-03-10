package com.example.newsapplication.presentation.di

import com.example.newsapplication.data.repository.NewsRepositoryImpl
import com.example.newsapplication.data.repository.dataSource.NewsLocalDataSource
import com.example.newsapplication.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsapplication.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ):NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource,
        newsLocalDataSource)
    }

}