set projectLocation=D:\jenkins\PS
%projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*;D:\jenkins\PS\testng\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
