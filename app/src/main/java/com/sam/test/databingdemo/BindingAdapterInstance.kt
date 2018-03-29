package com.sam.test.databingdemo

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions

/**
 * Created by zhangshexin on 2018/3/27.
 * 这是一个单例，对kotlin来说创建单例只需以object 代替java 的class
 * JvmStatic对应java 的 static
 */
object BindingAdapterInstance {

    @BindingAdapter(value=*arrayOf("imageUrl1"),requireAll= false)
    @JvmStatic fun loadImage(view:ImageView,u:String?){
        if(u==null)
            return
        var ro:RequestOptions=RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher_round).error(R.mipmap.ic_launcher).priority(Priority.HIGH).diskCacheStrategy(DiskCacheStrategy.NONE)
        Glide.with(view.context).applyDefaultRequestOptions(ro).load(u).transition(DrawableTransitionOptions().crossFade(1000)).into(view)
    }

}