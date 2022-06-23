package com.codeliner.flowtemplate.repository

import com.codeliner.flowtemplate.data.DataSource
import com.codeliner.flowtemplate.model.Data
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class Repository(dataSource: DataSource = DataSource()) {

    val userData: Flow<Data> = dataSource.data
        .map { data -> Data(data) }
}