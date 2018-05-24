set projectPath=D:\Git\PS
cd\
cd %projectPath%
set classpath=%projectPath%\bin;%projectPath%\jar\*;
java org.testng.TestNG testng.xml