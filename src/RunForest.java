
import com.mobilerobots.Aria.*;
import customRobot.*;
import actions.*;

public class RunForest {
  static Forrest robot;
  static ArPose OBJ;
  static ArRangeDevice SONAR;
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

      // robot.avanca(1600);
      // robot.roda(90);
      // robot.avanca(7000);
      // robot.roda(90);
      // robot.avanca(1600);
      // robot.roda(-90);
      // robot.avanca(3000);

      go();

      robot.log();
      robot.run(true);
      // ArUtil.sleep(60000);
      Aria.exit(0);
  }
  public static void go(){
    SONAR = robot.findRangeDevice("sonar");
    while(!loop());
    print("Sucesso");
  }
  public static boolean loop(){
    br();

    double obj_ang, obj_dist;

    obj_ang  = pickAngle();
    obj_dist = pickDist(obj_ang);

    br();
    divide();

    robot.roda(obj_ang);
    robot.avanca((int)obj_dist);

    return reached();
  }
  public static double pickDist(double ang){
    double dist = getDistance(ang)/4;

    printKeyValue("dist", dist);
    return dist;
  }

  static int VIEW_FIELD = 45;

  public static boolean isClear(double single){
    return isClear(single - VIEW_FIELD, single + VIEW_FIELD);
  }
  public static double getDistance(double single){
    return getDistance(single - VIEW_FIELD, single + VIEW_FIELD);
  }
  public static double getDistance(double from, double to){
    return SONAR.currentReadingPolar(from, to);
  }
  public static boolean isClear(double from, double to){
    double robotRad  = robot.getRobotRadius();
    double frontDist = getDistance(from, to);

    return frontDist >= robotRad * 4;
  }
  public static double pickAngle(){

    ArPose cur = robot.getPose();
    double ang = robot.findDeltaHeadingTo(OBJ);

    // double deltaX = OBJ.getX() - cur.getX();
    // double deltaY = OBJ.getY() - cur.getY();

    // olha em linha reta, se tiver livre, vai.
    while(!isClear(ang)){
      // olha em volta e escolhe angulo livre
      double bestA  = ang;
      double watchA = bestA;
      double bestF = 999999;
      double watchF = bestF;

      for(watchA = ang + 60 ; watchA >= ang - 60 ; watchA -= 15){

        if(isClear(watchA)){
          // tg obj_ang mais prox tg ang
          watchF = calcComparisonFactor(ang, watchA);

          if(watchF < bestF){

            bestA = watchA;
            bestF = watchF;
          }
        }
      }
      br();
      ang = bestA;
    }

    printKeyValue("angle", ang);
    return ang;
  }
  public static double calcComparisonFactor(double ang, double newAng){
    // menor possivel
    double dist = getDistance(newAng);
    double f = Math.abs(ang) - Math.abs(newAng) / dist;
    System.out.println(newAng + "g " + ang + " gObj" + getDistance(newAng) + dist + "mm");
    return Math.pow(f,2);
  }
  public static boolean checkStep(){
    // só é passo valido se tiver no minimo espaço menor que metade do raio
    boolean clear = isClear(0);
    printKeyValue("step", clear);

    return clear;
  }
  public static void divide(){
    print("---");
  }
  public static <T> void printKeyValue(String key, T value){
    // System.out.print(key + "=" + value + ":");
  }
  public static void br(){
    System.out.println();
  }

  public static void print(String msg){
    System.out.println(msg);
  }
  public static void print(ArPose pose){
    print("(" + pose.getX() + ", " + pose.getY() + ") " + pose.getTh());
  }
  public static boolean reached(){
    ArPose cur = robot.getPose();
    return (
      cur.getX() < OBJ.getX() &&
      cur.getY() > OBJ.getY()
    );
  }

  public static ArPose getOrigem(){
    return new ArPose(7000, -12000, 0);
  }
  public static ArPose getObjetivo(){
    return new ArPose(0, 0);
  }

}
