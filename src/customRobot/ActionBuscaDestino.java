package customRobot;
import com.mobilerobots.Aria.*;

public class ActionBuscaDestino implements iAction{

  ArPose obj;
  Forrest robot;
  final static String NOME = "BD";

  public ActionBuscaDestino(ArPose obj){
    log("Objetivo (" + obj.getX() + ", " + obj.getY() + ")");
    this.obj = obj;
  }
public void log(String msg){
  System.out.println(NOME + ": " + msg);
}
  public boolean fire(){
    ArPose cur = robot.getPose();

    double obj_ang = robot.findAngleTo(obj);
    double obj_dis = robot.findDistanceTo(obj);

    robot.log(obj_ang + " graus");
    robot.log(obj_dis + " m");

    robot.setDeltaHeading(obj_ang);
    robot.move((int)obj_dis * 1000);


    return checkCoord(cur);
  }
  public boolean checkCoord(ArPose cur){
    return (
        cur.getX() == obj.getX() &&
        cur.getY() == obj.getY()
    );
  }
  public void setRobot(Forrest robot)
  {
    this.robot = robot;
  }

}
