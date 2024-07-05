# Library-management
## 项目创建
### Vue

[vue](https://cli.vuejs.org/zh/guide/installation.html)

```shell
vue create vue
```
### ElementUI

[官网](https://element.eleme.cn)

```shell
npm i element-ui -S
```
导入ElementUI
```vue
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
```

### 图标网站

[网址](https://www.iconfont.cn)

#### 侧边栏设置

将侧边栏设置为全屏

```vue
min-height: calc(100vh - 62px)//页面高度减去头部高度
```

链接数据库

```java
datasource:
  driver-class-name: com.mysql.cj.jdbc.Driver
  url: jdbc:mysql://localhost:3306/book_manager?characterEncoding=utf-8&useUnicode=true&useSSL=false&serverTimezone=UTC
  username: root
  password: 6
```

## 跨域问题

#### 方法一

```java
@CrossOrigin
//UserController
```

#### 其他方式（百度）