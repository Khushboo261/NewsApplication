package com.example.newsapplication.presentation.di

import com.example.newsapplication.data.api.NewsAPIService
import com.example.newsapplication.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsapplication.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }

}