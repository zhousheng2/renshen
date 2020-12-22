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
nohup java -jar -Dfile.encoding=UTF-8 -Dspring.profiles.active=prod renshen.jar >/dev/null 2>&1 &


MySQL数据库： 
yangjia/yangjia*&^%$#@2020（程序，【查询】）
mysql_yangjia/yangjia@2020（佳哥，【查询、插入、修改】）
root/yangjia@2020

颜色改版：
FAEFDE->0099ff8f
89BF04->0066CC
fff->00c2ff
73AF00->rgba(0, 153, 255, 0.1607843137254902)