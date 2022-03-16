package com.gmail.giphytestingapp.di

import com.gmail.giphytestingapp.model.GifsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideCarService(): GifsService {
        return GifsService.create()
    }

}