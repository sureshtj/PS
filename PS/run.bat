set projectPath=C:\jenkins\workspace\project\PS
cd\
cd %projectPath%
set classpath=%projectPath%\bin;%projectPath%\lib\*;
java -cp "C:\jenkins\workspace\project\PS\lib\testng-6.0.jar" org.testng.TestNG testng.xml
