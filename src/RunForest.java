
import com.mobilerobots.Aria.*;
import customRobot.*;
import actions.*;

public class RunForest {
  static Forrest robot;
  static ArPose OBJ;
  static {
    try {
        System.loadLibrary("AriaJava");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library libAriaJava failed to load. Make sure that its directory is in your library path; See javaExamples/README.txt and the chapter on Dynamic Linking Problems in the SWIG Java documentation (http://www.swig.org) for help.\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[]) {
    System.out.println("Starting Java Test");

    Aria.init();

    // Forrest robot = new Forrest();
    robot = new Forrest();

    ArSimpleConnector conn = new ArSimpleConnector(argv);

    if(!Aria.parseArgs())
    {
      Aria.logOptions();
      Aria.exit(1);
    }

    if (!conn.connectRobot(robot))
    {
      System.err.println("Could not connect to robot, exiting.\n");
      System.exit(1);
    }

      robot.runAsync(true);
      robot.init();

      ArSonarDevice sonar = new ArSonarDevice();
      robot.addRangeDevice(sonar);
      /************ [ ENTRADA ] */
      OBJ = getObjetivo();
      robot.moveTo(
        getOrigem()
      );
      ArUtil.sleep(1000);

      // robot.addAction(new ArActionBumpers(), 100);
      // robot.addAction(new ArActionAvoidSide(), 90);
      // robot.addAction(new SeekNDestroyAction(objetivo), 80);

      // robot.log();
      /************ [ MOVIMENTOS ]
       * avanca (mm)
       * roda (graus)
       */

      robot.avanca(1600);
      robot.roda(90);
      robot.avanca(7000);
      robot.roda(90);
      robot.avanca(1600);
      robot.roda(-90);
      robot.avanca(3000);

      // go();

      robot.log();
      robot.run(true);
      // ArUtil.sleep(60000);
      Aria.exit(0);
  }
  public static void go(){
    while(!loop());
  }
  public static boolean loop(){
    ArRangeDevice sonar = robot.findRangeDevice("sonar");
    ArPose cur = robot.getPose();

    double obj_ang;
    double obj_dis = robot.findDistanceTo(OBJ);

    for(int i = 100 ; i > 0 ; i--){
      obj_ang =  robot.findDeltaHeadingTo(OBJ);
      robot.roda(obj_ang);
      // robot.avanca(100);
    }



    return reached();
  }
  public static boolean reached(){
    ArPose cur = robot.getPose();
    return (
      cur.getX() < OBJ.getX() &&
      cur.getY() > OBJ.getY()
    );
  }

  public static ArPose getOrigem(){
    return new ArPose(0, 10, 0);
  }
  public static ArPose getObjetivo(){
    return new ArPose(0, 0);
  }

}
