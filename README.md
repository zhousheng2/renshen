部署：  
1、JDK环境(见Linux下JDK安装)  
2、数据库环境  
3、静态资源访问  
4、上传的图片访问  
5、springboot内置tomcat配置虚拟路径（解决第4条）

Test环境启动:  
java -jar -Dfile.encoding=UTF-8 -Dspring.profiles.active=test renshen.jar  
后台启动：  
nohup java -jar -Dfile.encoding=UTF-8 -Dspring.profiles.active=test renshen.jar >/dev/null 2>&1 &
