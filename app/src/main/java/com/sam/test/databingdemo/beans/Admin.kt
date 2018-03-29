package com.sam.test.databingdemo.beans

import android.databinding.BaseObservable
import android.databinding.ObservableField

/**
 * Created by zhangshexin on 2018/3/26.
 * 管理员对象
 */
class Admin : BaseObservable() {
    var adminName:ObservableField<String> = ObservableField()

    var imageUrl:ObservableField<String> = ObservableField()

    var isDisplay:ObservableField<Boolean> =ObservableField()
}