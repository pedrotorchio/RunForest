/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact
Adept MobileRobots for information about a commercial version of ARIA at
robots@mobilerobots.com or
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/

/* A simple example of connecting to and driving the robot with direct
 * motion commands.
 */

import com.mobilerobots.Aria.*;
import customRobot.Forrest;
import java.util.concurrent.CompletableFuture;

public class RunForest {

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

    Forrest robot = new Forrest();
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

      robot.avanca(10000);



    // sleep(1000);
    // robot.avanca(1000);
    // sleep(1000);
    // robot.roda(20);
    // robot.avanca(1000);
    // sleep(1000);

  }
}
