package com.sam.test.databingdemo

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import com.sam.test.databingdemo.beans.User
import com.sam.test.databingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    val tag:String=this@MainActivity.javaClass.name

    private lateinit var binding: ActivityMainBinding

    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title="首页"
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        initView()
    }

    private fun initView() {
        user = User()
        user.age.set(13)
        user.userName = "sam"


        binding.user = user

        binding.et1.addTextChangedListener(object : TextWatcher {
            //object类似于java的匿名内部类
            override fun afterTextChanged(s: Editable?) {
                //这个是系统生成的，在java中可以不作处理但在kotlin中是必须要册掉或注掉，否则报kotlin.NotImplementedError: An operation is not implemented: not implemented
                //TODO("not implemented") To change body of created functions use File | Settings | File Templates.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // TODO("not implemented") To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // TODO("not implemented") To change body of created functions use File | Settings | File Templates.
                try {
                    Log.e(tag,"输入的密码："+user.pwd.get())
                } catch (e: Exception) {
                    Log.e(tag,e.toString())
                }
            }
        })

        binding.go.setOnClickListener {
            var intent= Intent(this@MainActivity,UserInfoActivity::class.java)
            startActivity(intent)
        }
    }


    /**
     * 这种是扩展写法，在EditText中增加一个setTextChangeListener方法，例如更简单的一个函数
     *
     *
     *
     *
     *  fun String.isBlank(msg:String):Boolean {
     *
     *      return msg==null || msg.length==0;
     *  }
     *
     *
     * 扩展了string方法
     *
     */
    fun EditText.setTextChangeListener(body: (key: String) -> Unit) {
        addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                body(s.toString())
            }
        })
    }

}
