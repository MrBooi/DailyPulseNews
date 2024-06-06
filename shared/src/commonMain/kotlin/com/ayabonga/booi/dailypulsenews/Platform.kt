package com.ayabonga.booi.dailypulsenews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform