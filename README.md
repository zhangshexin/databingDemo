# databingDemo

DataBinding使用

DataBinding是MVVM在Android上的一种实现，支持双向绑定,自动刷新。是ButterKnife等APT框架的有效替代方案

APT英文全称：Android annotation process tool是一种处理注释的工具，它对源代码文件进行检测找出其中的Annotation，使用Annotation进行额外的处理。（可以看这里https://www.jianshu.com/p/94979c056b20）



里面有用到kotlin，有一些初级的应注意的事项


一、	初识，关键词
dataBinding {
    enabled true
}
<layout>
<data>
<variable>
BaseObservable
ObservableField
DataBindingUtil
	晋级，关键词
1、BindingAdapter
a)	这是一个注解关键词
b)	观察一个控件的属性值
c)	被观察者数据变动时调用被绑定属性
2、InverseBindingAdapter
3、双向绑定@={}
4、BindingMethods与BindingMethod, InverseBindingMethod
	注解方法，定义xml中定义的属性与某个medthod（方法）绑定





一些不错的文章
https://www.jianshu.com/p/ba4982be30f8
https://blog.csdn.net/to_yan/article/details/51881818
https://www.jianshu.com/p/a05c9735f595
https://blog.csdn.net/column/details/17169.html

注解标签
https://blog.csdn.net/qiang_xi/article/details/75379321
