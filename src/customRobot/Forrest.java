import com.mobilerobots.Aria.*;

public class Forrest extends ArRobot{


  public void adiante(int distanceMM){
    System.out.println(
      ">Adiante " + distanceMM + "mm."
    );
    this.lock();
    this.enableMotors();
    this.move(distanceMM);
    this.unlock();
  }
}
