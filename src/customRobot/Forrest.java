package customRobot;
import com.mobilerobots.Aria.*;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class Forrest extends ArRobot{

  ArrayList<iAction> acoes = new ArrayList<iAction>();

  public void init(){
    enableMotors();
    // velocidade maxima instantania 1m/s
    setTransAccel(9999);
    setTransDecel(9999);
    setRotAccel(9999);
    setRotDecel(9999);
  }
  public void moveTo(double x, double y){
    moveTo(x, y, 0);
  }
  public void moveTo(double x, double y, double th){
    moveTo(new ArPose(x, y, th));
  }
  public void moveTo(ArPose pose){
    log("Movendo para " + pose.getX() + ", " + pose.getY() + " " + pose.getTh());
    super.moveTo(pose);
  }

  public String toString(){
    ArPose coords = getPose();
    return
      "\n" +
      "Forrest:: (" + coords.getX() + ", " + coords.getY() + "), " + coords.getTh() + " graus\n";
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
    calmaCara((int)(distanceMM * 2)); // dist/vel * 1000
  }
  public void roda(double anguloGrau){
    log(
      "Roda " + anguloGrau + " (" +
      (anguloGrau < 0 ? "horário" : "anti-horario") +
      ") graus."
    );
    setDeltaHeading(anguloGrau);
    calmaCara((int)(anguloGrau * 80)); // usando velocidade aproximada 5deg/s
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
    if(tempoMS < 0)
      tempoMS = -1 * tempoMS;
    ArUtil.sleep(tempoMS);
  }

  public static void sleep(int tempoMS){
    if(tempoMS < 0)
      tempoMS = -1 * tempoMS;
    System.out.println("- " + tempoMS + " zZz..");
    ArUtil.sleep(tempoMS);
  }

}
