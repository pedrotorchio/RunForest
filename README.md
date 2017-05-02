http://robots.mobilerobots.com/docs/api/ARIA/2.9.1/docs/index.html#arCliServ


## PARA INSTALAR
1- Baixar e instalar MobileSim e Aria pra windows
2- JDK tem que tá instalado, obvio
3- Colocar diretorio "C:\Program Files\MobileRobots\Aria\bin(64)" no PATH das variáveis do sistema (se o download tiver sido 64bits, bin64)

## PARA COMPILAR
### CWD @ build
##### clear build
build $ rm -r ./*
### CWD @ src
#### compilar simple.java (ou outro arquivo main) na pasta build
src $ javac -classpath "vendor/Aria.jar;." -d ../build simple.java


## PARA EXECUTAR
### CWD @ build
#### executar simple.class (ou outro arquivo main) na pasta build
build $ java -cp "../src/vendor/Aria.jar;." simple
