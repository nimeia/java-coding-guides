

[toc]

# java 编码规范 

## 代码结构说明

| baseapi     | api层的一些公用定义            |
| ----------- | ------------------------------ |
| api         | api 的一些常用定义约束与规范   |
| client      | 客户端通过api调用service的例子 |
| service     | 主要的代码定义与一些例子       |
| check_style | 代码检查中的定义               |

## 如何开始阅读

### IDE 建议

后端IDE 建议统一使用 [idea](https://www.jetbrains.com/idea/) 

前端IDE建议统一使用[vscode](https://code.visualstudio.com/)

其它 [eclipse](http://eclipse.org/) [webstorm](https://www.jetbrains.com/webstorm/)

### EditorConfig



### 阅读入口



## 其它说明

> 所有规则都在代码中，结合代码相对比一条条的规则容易理解 
> ShowCodeDemo 建议从该类开始阅读，
> 后面会增加接口，数据库等规范
> 该规范会结合editconfig ，后面会整理出来


# 个性化定义
> checkstyle 目录中有对应的定义,可以按自己项目的需要进行修改



# 其它未整理说明
1. 关于lobmok ,我个人意见是不建议也不反对。但你需要充分明白每个注解的意思
本人已经处理过几个由于lobmok 注解使用不正确产生的生产问题，同时该类问题比较难以查询
一般都涉及到反射，反序列化等操作