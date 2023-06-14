package com.example.benerin.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.benerin.data.Bengkel
import com.example.benerin.data.dataDummy

class NotificationsViewModel : ViewModel() {
    private val _dataBengkel = MutableLiveData<List<Bengkel>>()
    val dataBengkel = _dataBengkel

    fun getDataBengkel(){
        _dataBengkel.value = dataDummy.dataBengkelFavoritesDummy
    }
}