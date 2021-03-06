[toc]

# 一般项目组织结构

## 后端项目结构

```shell
app-server
├─common
├─model
├─service
├─gateway
├─jobs
├─admin
└─app
```

| common        | 项目中各个模块的公共部分                                     |
| ------------- | ------------------------------------------------------------ |
| model         | JPA或者MYBATIS的数据库映射模型                               |
| service       | 主要的业务服务                                               |
| jobs(可选)    | 定时任务，可以引用前三个模块，自身可以单独部署，如果系统不大，可以以jar方式提供到app运行 |
| gateway(可选) | 提供给外部应用调用的接口，与其它服务分离，简化权限与安全规则，建议直接部署成可运行应用，如果系统不大，需要通过单独的url与其它服务隔离 |
| admin(可选)   | 如果需要单独的后台管理，可以单独一个应用，与其它服务分离这是避免一些应用需要暴露到外网，减少安全问题，如果系统不大，需要通过单独的url与其它服务隔离 |
| app           | 系统主程序                                                   |

**注意当前后端分离时，前端项目与`app-server`**

### 模块分层结构



## 前端项目结构



## 系统其它目录说明

- API 定义部分，主要定义一些对外提供的接口文档，interface 定义等，与系统实现分开出于几个原因。

  1. API定义部分可能需要提供到第三方，而系统实现不能提供。
  2. API部分单独发版管理，一般系统实现部分发版较快，分离后减少模块单的依赖
  3. API部分单独可以进行多个项目组基于原码等讨论与合作，一般多个项目组是互相隔离，但出于效率原因可以直接通过共享API部分来提高效率。
  4. API禁止依赖系统中的其它模块

  

- 系统实现部分，就是整个系统的具体实现，依赖API部分。整个系统可以分成多个模块，例如

  1. model ，数据库的映射

  2. common, 常用工具与常量定义

  3. service，业务的具体实现，可以有多个进一步划分优化

  4. jobs、gateway、admin、app  spring boot 的 runjar 项目，主要用于打包为可运行程序 

     

- 文档需求部分，主要包含项目中的各种文档

  1. 如果有需要对权限细分，可以再进行划分，例如，需求，进度，运维，技术等

     

- 当使用GIT为版本管理工具时，而又有复杂的权限控制，请前期把项目进行细分。