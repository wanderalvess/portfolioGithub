package br.com.wanderalvess.portfoliogithub

import android.app.Application
import br.com.wanderalvess.portfoliogithub.data.di.DataModule
import br.com.wanderalvess.portfoliogithub.domain.di.DomainModule
import br.com.wanderalvess.portfoliogithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}