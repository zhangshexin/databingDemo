package com.sam.test.databingdemo

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.sam.test.databingdemo.beans.Admin
import com.sam.test.databingdemo.databinding.ActivityUserInfoBinding

class UserInfoActivity : AppCompatActivity() {


    lateinit var binding: ActivityUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this@UserInfoActivity,R.layout.activity_user_info)
        initView()
    }

    private fun initView(){
        var admin:Admin=Admin()
        admin.adminName.set("张三")
        admin.imageUrl.set("http://file.bqj.cn/file/cd9316ff87a0458db5d6dea157e59b9d.png")

        binding.admin=admin

        admin.isDisplay.set(false)

        Thread(Runnable {
            run {
                Thread.sleep(3000)

                runOnUiThread {
                    binding.philview.visibility=View.VISIBLE
                    Log.d("kdkdkdkdk", "数值变化:" + admin.isDisplay.get())
                }
            }
        }).start()

    }
}
