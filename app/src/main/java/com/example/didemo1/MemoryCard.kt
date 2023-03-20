package com.example.didemo1

import android.util.Log

class MemoryCard constructor(){
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}