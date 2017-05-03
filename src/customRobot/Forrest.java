package customRobot;
import com.mobilerobots.Aria.*;

public class Forrest extends ArRobot{

  public void setVel(int velocidadeMM_S){
    this.setVel(velocidadeMM_S);
  }
  public void setRotVel(int velocidadeANG_S){
    this.setRotVel(velocidadeANG_S);
  }
  public void avanca(int distanceMM){
    System.out.println(
      ">Adiante " + distanceMM + "mm."
    );
    this.lock();
    this.enableMotors();
    this.move(distanceMM);
    this.unlock();
  }
  public void roda(double anguloGrau){
    this.lock();
    System.out.println(
      ">Roda " + anguloGrau + " (" +
      (anguloGrau < 0 ? "horário" : "anti-horario") +
      ") graus."
    );
    this.setDeltaHeading(anguloGrau);
    this.unlock();
  }
  public void desvia(double anguloFrente){
    double novoAngulo = 0;
    if(anguloFrente >= 0 && anguloFrente < 45)
    {
      System.out.println("Obstaculo a esquerda..");
      novoAngulo = -30;
    }
    else if(anguloFrente < 0 && anguloFrente > -45){
      System.out.println("Obstaculo a direita..");
      novoAngulo = 30;
    }

    roda(novoAngulo);
  }
}
