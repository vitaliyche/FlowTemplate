package com.codeliner.flowtemplate.view

import androidx.lifecycle.*
import com.codeliner.flowtemplate.model.Data
import com.codeliner.flowtemplate.repository.Repository

class MainViewModel(
    repository: Repository = Repository()
) : ViewModel() {

    val liveData: LiveData<Data> = repository.userData.asLiveData()
}