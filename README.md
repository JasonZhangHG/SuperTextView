# SuperTextView
Android SuperTextView
总结安卓中常用的TextView的样式（SuperTextView）

https://user-images.githubusercontent.com/22411415/189327271-c12859bc-c54b-40dc-a6be-6e45d102bc61.mp4

引言：TextView在平时的开发中一般是显示文案，但是在实际开发中文字经常要显示一些特殊的样式，为了满足不同场景下的需求，特此总结常用的TextView,命名为：SuperTextView

场景一：使用TextView显示服务条款和隐私协议，并实现点击跳转H5。
![02](https://user-images.githubusercontent.com/22411415/189330533-db3cd101-d1e2-4c61-bf64-a644d62ab872.png)

 场景二：平时开发中设计经常要求在一段话中一些文字要加粗，显示不同的颜色等，这个时候有不同的做法，常用也是最简单的就是借助HTML:
![03](https://user-images.githubusercontent.com/22411415/189330539-cdec6ca4-2702-49c7-aff6-d9cf1b54b891.png)

 场景三：文字中经常要穿插一些图片，就是文字加图片的样式：
![04](https://user-images.githubusercontent.com/22411415/189330546-6a5e3ff5-6d91-4043-a10e-c0fadca61b24.png)

 场景四：文字中要求加特殊的UI样式，这个时候可以在TextView中加一个View
![05](https://user-images.githubusercontent.com/22411415/189330553-be59a127-1840-4f0d-9b26-0f61d90fce56.png)
