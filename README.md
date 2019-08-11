# maven inproject repository demo

```

部署jar包到项目内仓库的命令(对应参数的值自己替换)：
mvn deploy:deploy-file -DgroupId=[GROUP] -DartifactId=[ARTIFACT] -Dversion=[VERS] -Durl=file:./local-maven-repo/ -DrepositoryId=local-maven-repo -DupdateReleaseInfo=true -Dfile=[FILE_PATH]

本项目中用来测试部署的jar包为根目录的 tjar.jar myjar.jar。

本项目中的本地仓库路径为 项目根目录/repo 

部署完后就可以删除部署时的jar包了。

maven 配置文件中如果配置了 mirror 并且将 mirrorOf标签的值设为 "*" ，需要将 mirrorOf的值改为非*的值，比如 external:*，否则即使在pom中设置了本地仓库也不会生效。
示例：
    <mirror>
      <id>nexus</id>
      <mirrorOf>*</mirrorOf>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    </mirror>

将其中的 <mirrorOf>*</mirrorOf> 改为 <mirrorOf>external:*</mirrorOf>，即：
    <mirror>
      <id>nexus</id>
      <mirrorOf>external:*</mirrorOf>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    </mirror>
附：
mirrorOf 不同值的含义：
* = everything
external:* = everything not on the localhost and not file based.
repo,repo1 = repo or repo1
*,!repo1 = everything except repo1

详见:https://www.cnblogs.com/lzxianren/p/5142838.html

```
