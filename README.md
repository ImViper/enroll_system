#enroll_system
平行志愿录取系统，软件工程大作业，数据库工程大作业。其中完整的软件工程文档在doc文件夹中。需要的可以自取。仅供参考。
基于java，mysql，spring，vue的项目。

# 开发环境

- JDK8
- MySQL5.7
- springboot2.3
- maven3.6.3（需要安装，否则没有依赖）
- vue2.0（前端开发环境，并不必需）
- vue-cli3（前端开发环境，并不必需）


# 下载项目

- 克隆本项目，下载到自己的电脑上。

- 用IDEA打开，前端已打包放置在静态资源文件夹下

# 环境配置

- 打开Mysql，创建数据库

```
CREATE DATABASE `<你的数据库名>` CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_general_ci';
-- 例如：CREATE DATABASE `db_enroll` CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_general_ci';
```

- 进入数据库，运行sql文件，在sql文件夹下，可以把sql放在一个没有中文路径的地方，否则有可能出错

```
-- 进入刚刚创建的数据库
use db_enroll;
-- 运行路径下的sql文件
source /path/to/sql/db_enroll.sql
```

- 修改springboot配置文件application.yml，找到下面配置

```
enroll:
  login:
    # 登录用户名
    adminName: admin
    # 登录密码
    adminPass: 123456
  # 改为自己的数据库名
  database: DATABASE_NAME
  # 改为自己的数据库密码（账号默认root）
  dbpass: MYSQL_PASSWORD
```

# 运行

- 找到启动类`EnrollSystemApplication`，并运行
- 打开浏览器，访问`http://localhost:8080/`



# 效果展示（部分）

## **系统登录界面**

![image-20210118021916601](https://tuchuang666.oss-cn-shenzhen.aliyuncs.com/img/image-20210118021916601.png)

## **系统主界面**

![image-20210118021930049](https://tuchuang666.oss-cn-shenzhen.aliyuncs.com/img/image-20210118021930049.png)

## **系统招生界面**

![image-20210118021948276](https://tuchuang666.oss-cn-shenzhen.aliyuncs.com/img/image-20210118021948276.png)

## **人数分布界面**

![image-20210118022012774](https://tuchuang666.oss-cn-shenzhen.aliyuncs.com/img/image-20210118022012774.png)