package com.example.benerin.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.benerin.data.Bengkel
import com.example.benerin.data.ServiceKendaraan
import com.example.benerin.data.dataDummy

class DashboardViewModel : ViewModel() {

    private val _dataService = MutableLiveData<List<ServiceKendaraan>>()
    val dataService = _dataService

    fun getDataBengkel(){
        _dataService.value = dataDummy.dataServiceDummy
    }
}