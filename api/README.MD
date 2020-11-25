[toc]

# 对外接口规范

## 约束

> - 一个对外提供的jar，应该避免依赖其它项目.
> - parent 应该为空，避免打包时出现循环依赖.
> - 不可用引用其它业务模块的vo作为参数，例如JAP,MYBATIS的model
> - API的`入参/出参`为 `ApiRequest/ ApiResponse`
> - API定义部分与主项目分离直接发版


