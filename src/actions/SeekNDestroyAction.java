package actions;
import com.mobilerobots.Aria.*;

public class SeekNDestroyAction extends ArAction{
  ArPose  _OBJ_;
  ArActionDesired _AD_;
  ArRangeDevice _SONAR_;
  public SeekNDestroyAction(ArPose obj){
    super("Seek N Destroy");
    _OBJ_ = obj;
    _AD_ = new ArActionDesired();
  }
  public ArActionDesired fire(ArActionDesired currentDesired)
  {
        _AD_.reset();

        ArRobot robot = getRobot();
        ArPose cur = robot.getPose();

        double obj_ang = robot.findAngleTo(_OBJ_);
        double obj_dis = robot.findDistanceTo(_OBJ_);
        System.out.println(cur.getX() + ", " + cur.getY() + " " + cur.getTh());
        System.out.println(obj_ang);
        System.out.println(obj_dis);
        robot.setDeltaHeading(obj_ang);
        // robot.move((int)obj_dis * 1000);




        return _AD_;
  }
  public void setRobot(ArRobot robot)
  {
    setActionRobot(robot);
    _SONAR_ = robot.findRangeDevice("sonar");
  }
}
