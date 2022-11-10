package com.apearmy.trainingappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform