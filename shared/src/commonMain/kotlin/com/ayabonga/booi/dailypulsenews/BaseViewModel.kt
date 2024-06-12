package com.ayabonga.booi.dailypulsenews

import kotlinx.coroutines.CoroutineScope

expect  open class BaseViewModel() {
    val scope: CoroutineScope
}