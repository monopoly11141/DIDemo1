package com.example.didemo1

import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery) : Battery
}