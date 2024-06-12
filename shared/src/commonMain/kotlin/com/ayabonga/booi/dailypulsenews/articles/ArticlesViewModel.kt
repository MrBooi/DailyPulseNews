package com.ayabonga.booi.dailypulsenews.articles

import com.ayabonga.booi.dailypulsenews.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ArticlesViewModel : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState())

    val articleState : StateFlow<ArticlesState> get() = _articlesState
}