package customRobot;
import com.mobilerobots.Aria.*;
import java.util.concurrent.CompletableFuture;

public class Forrest extends ArRobot{

  public void init(){
    enableMotors();
  }

  public String toString(){
    return
      "\n" +
      "Forrest::\n"  +
      "TransVel: " + getAbsoluteMaxTransVel() + "\n" +
      "RotatVel: " + getAbsoluteMaxRotVel() + "\n";
  }
  public void log(){
    System.out.println(this);
  }
  public void log(String msg){
    System.out.println("> " + msg);
  }
  public boolean isRotVelZero(){
    return getRotVel() == 0;
  }
  public boolean isTransVelZero(){
    return getVel() == 0;
  }

  public void avanca(int distanceMM){
    log(
      "Adiante " + distanceMM + "mm."
    );
    move(distanceMM);
    calmaCara(20000);
  }
  public void roda(double anguloGrau){
    log(
      "Roda " + anguloGrau + " (" +
      (anguloGrau < 0 ? "horário" : "anti-horario") +
      ") graus."
    );
    setDeltaHeading(anguloGrau);
    calmaCara(3000);
  }
  public void desvia(double anguloFrente){
    double novoAngulo = 0;
    if(anguloFrente >= 0 && anguloFrente < 45)
    {
      log("Obstaculo a esquerda..");
      novoAngulo = -30;
    }
    else if(anguloFrente < 0 && anguloFrente > -45){
      log("Obstaculo a direita..");
      novoAngulo = 30;
    }

    roda(novoAngulo);
  }

  public void calmaCara(int tempoMS){
    ArUtil.sleep(tempoMS);
  }
  public static void sleep(int tempoMS){
    System.out.println("- " + tempoMS + " zZz..");
    ArUtil.sleep(tempoMS);
  }
}
