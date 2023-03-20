package com.example.didemo1

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize : Int) {

    @Provides
    fun providesMemoryCard(): MemoryCard{
        Log.i("MYTAG", "Memory Size : ${memorySize}")
        return MemoryCard()
    }
}