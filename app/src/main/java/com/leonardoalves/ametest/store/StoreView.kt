package com.leonardoalves.ametest.store

import com.leonardoalves.ametest.custom.ViewModel

interface StoreView {
    fun setItems(viewModel: List<ViewModel>)
}