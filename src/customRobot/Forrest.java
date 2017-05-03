package customRobot;
import com.mobilerobots.Aria.*;
import java.util.concurrent.CompletableFuture;

public class Forrest extends ArRobot{

  public void init(){
    enableMotors();
    // velocidade maxima instantania 1m/s
    setTransAccel(10000);
    setTransDecel(10000);
    setRotAccel(10000);
    setRotDecel(10000);
  }

  public String toString(){
    return
      "\n" +
      "Forrest::\n"  +
      "MaxVel: " + getAbsoluteMaxTransVel() + "\n" +
      "MaxRotVel: " + getAbsoluteMaxRotVel() + "\n" +
      "MaxAccel: " + getTransAccel() + "\n" +
      "Decel: " + getTransDecel() + "\n" +
      "MaxRotAccel: " + getAbsoluteMaxRotAccel();
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
    calmaCara(distanceMM); // dist/vel * 1000
  }
  public void roda(double anguloGrau){
    log(
      "Roda " + anguloGrau + " (" +
      (anguloGrau < 0 ? "horário" : "anti-horario") +
      ") graus."
    );
    setDeltaHeading(anguloGrau);
    calmaCara((int)anguloGrau/20 * 1000); // usando velocidade aproximada
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
