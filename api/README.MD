[toc]

# 对外接口规范

## 对外约束

**对外提供接口约束**

> - 一个对外提供的jar，应该避免依赖其它项目.
> - parent 应该为空，避免打包时出现循环依赖.
> - 不可用引用其它业务模块的`vo`作为参数，例如`JPA`,`MYBATIS`的`model`
> - API的`入参/出参`为 `ApiRequest/ ApiResponse`
> - API定义部分与主项目分离直接发版

## Rest接入层规范

**提供给前端接口约束**

### 路径命名规范

下表为标准的增、删、改、查对应的路径命名规范：

| URL                          | Java Method | HTTP Method | 说明                                |
| ---------------------------- | ----------- | ----------- | ----------------------------------- |
| /create                      | create()    | POST        | 新增对象（深度）                    |
| /update                      | update()    | POST        | 更新对象（深度）                    |
| /select/{id}                 | select()    | GET         | 获取数据（深度）                    |
| /delete/{ids}                | delete()    | POST        | 删除对象(ids中间用逗号分隔)（深度） |
| /search?fieldName=fieldValue | search()    | POST        |                                     |

###  类编程规范

1. `Api`类必须继承ins.framework.web.action.BaseApi类
2. 在WEB层类不允许用“new”关键字创建业务层和持久层类对象。
3. 在WEB层类不允许出现与SQL语句相关的代码，不允许调用任何类拼写SQL语句。
4.  WEB层类需要使用如下注解进行装在和标记访问地址。

> @RestController  @RequestMapping("/XXX")    

###  方法编程规范

1. 调用业务层的Service必须通过Spring容器注入。注入使用`@Autowired`注解即可。
2. 在查询和翻页查询的方法中，必须把从业务层Service返回的结果集存放到Page对象中。
3. 类之间不允许互相调用。
4.  仅可以抛出`DataVerifyException`和`PermissionException`。
5. 不允许连续调用数据库操作的方法（更新、新增、删除操作），如果需要此类操作，需要在业务层方法中进行操作，只允许一次调用，从而保证事务的完整性。

 