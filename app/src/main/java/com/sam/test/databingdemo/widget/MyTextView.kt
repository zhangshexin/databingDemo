package com.sam.test.databingdemo.widget

import android.content.Context
import android.databinding.*
import android.text.TextWatcher
import android.util.AttributeSet
import android.widget.TextView
import android.widget.Toast

/**
 * Created by zhangshexin on 2018/3/27.
 */
@BindingMethods(BindingMethod(type = MyTextView::class,attribute = "my_text",method = "showToast"))
@InverseBindingMethods(InverseBindingMethod(type = MyTextView::class,attribute = "my_text",event = "myTextAttrChanged"))
class MyTextView(context: Context?, attrs: AttributeSet?) : TextView(context, attrs) {

    private var i=0

    private lateinit var str:String
    private lateinit var listener:InverseBindingListener
    fun showToast(text:String){
        this.str=text
        Toast.makeText(context,text,Toast.LENGTH_LONG).show()
        //此处有一个bug，会导致死循环
//        when (i) {
//            0 -> {
                listener.onChange()
//                i++
//            }
//        }

    }
    fun getMy_text():String{
        return "[$str]"
    }

    fun setMyTextAttrChanged(listener:InverseBindingListener){
        when {
            listener!=null -> this.listener=listener
        }
    }


    //非静态类中如果要静态方法需在companion object块中定义
    companion object {
       @JvmStatic fun test(){}
    }

}