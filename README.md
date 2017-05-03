http://robots.mobilerobots.com/docs/api/ARIA/2.9.1/docs/index.html#arCliServ
https://link.springer.com/chapter/10.1007%2F978-1-84882-864-3_2#page-1

## PARA INSTALAR
1- Baixar e instalar MobileSim e Aria pra windows
2- JDK tem que tá instalado, obvio
3- Colocar diretorio "C:\Program Files\MobileRobots\Aria\bin(64)" no PATH das variáveis do sistema (se o download tiver sido 64bits, bin64)

## PARA COMPILAR
### CWD @ build
##### clear build
build $ rm -r ./*
### CWD @ src
#### compilar RunForest.java (ou outro arquivo main) na pasta build
src $ javac -classpath "vendor/Aria.jar;." -d ../build RunForest.java


## PARA EXECUTAR
### CWD @ build
#### executar simple.class (ou outro arquivo main) na pasta build
build $ java -cp "../src/vendor/Aria.jar;." RunForest


Como chegar do ponto global conhecido (x, y) no ponto global (x',y')
Movimentos possíveis (até agora, ainda vou tentar implementar mais):
- Rodar (g graus)
- Avancar (d milimetros)
A percepção do robô é um sonar, que funciona assim:
- Você chama read(g angulo, g' angulo) passando uma faixa de angulos. Ele retorna o obstaculo mais proximo dentro desse intervalo. Ou seja, vc desta angulos pequenos na direcao que quer saber se tem um obstaculo e ele diz a distancia, mas nao diz o angulo exato
