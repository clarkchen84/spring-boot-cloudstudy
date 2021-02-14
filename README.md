## spring boot 学习

### 环境 配置

#### maven 环境配置

1. 给maven的settings.xml 配置文件追加profiles 标签

```xml
<profiles>
    <profile>
        <id>jdk-1.8</id>
        <activation>
            <activeByDefault>true</activeByDefault>
            <jdk>1.8</jdk>
        </activation>
        <properties>
            <maven.compiler.souce>1.8</maven.compiler.souce>
            <maven.compiler.target>1.8</maven.compiler.target>
            <maven.compiler.comilerVersion>1.8</maven.compiler.comilerVersion>
        </properties>
    </profile>
</profiles>
```

#### idea 中配置maven

![](img/idea maven setting.png)

#### 导入Springboot 的依赖

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.5.9.RELEASE</version>
</parent>
<dependencies>
  <dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
</dependencies>

```

#### spring boot 程序探究

1. pom.xml

   1. 父项目

      ```xml
          <parent>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-parent</artifactId>
              <version>2.0.1.RELEASE</version>
          </parent>
      他的父项目
          <parent>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-dependencies</artifactId>
              <version>2.0.1.RELEASE</version>
              <relativePath>../../spring-boot-dependencies</relativePath>
          </parent>
      他来真正的管理Springboot 项目的依赖
      ```

      springboot 的仲裁中心，以后导入依赖默认时不需要写版本的。

   2. 导入依赖

      ```xml
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web</artifactId>
      </dependency>
      ```

      Spring-boot-starter : spring-boot 场景启动器，当启动web时，帮我们导入web模块儿正常运行所依赖的组件。

      spring boot 将所有的功能场景都抽取出来做成starter，只需要导入starter，相关场景的starter 都会导入进来。要用什么功能，就导入什么场景启动器。

2. spring boot 主程序

   ```java
   @SpringBootApplication
   @RestController
   public class HelloWorldBootStrap {
       public static void main(String[] args) {
           SpringApplication.run(HelloWorldBootStrap.class,args);
       }
   
       @GetMapping("/hello-world")
       public String helloWorld(){
           return "hello world";
       }
   }
   ```

   1. @SpringBootApplication 说明这个类是spring boot 的主程序类。

   2. @SpringBootApplicaiton是一个组合注解

      1. @SpringBootConfiguration,标注在某个类上，表示这是一个Spring boot 的配置类，他是通过**@Configuration**注解实现的。

      2. @EnableAutoConfiguation，启动自动配置。

         1. @AutoConfigurationPackage 用来将 主配置类所在包的所有类扫描到Spring容器中

            1. ```
               @Import(AutoConfigurationPackages.Registrar.class)
               ```

                

   





