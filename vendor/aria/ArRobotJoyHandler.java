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
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArRobotJoyHandler {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArRobotJoyHandler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRobotJoyHandler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArRobotJoyHandler(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArRobotJoyHandler(ArRobot robot) {
    this(AriaJavaJNI.new_ArRobotJoyHandler(ArRobot.getCPtr(robot), robot), true);
  }

  public void getDoubles(double[] x, double[] y, double[] z) {
    AriaJavaJNI.ArRobotJoyHandler_getDoubles(swigCPtr, this, x, y, z);
  }

  public boolean getButton1() {
    return AriaJavaJNI.ArRobotJoyHandler_getButton1(swigCPtr, this);
  }

  public boolean getButton2() {
    return AriaJavaJNI.ArRobotJoyHandler_getButton2(swigCPtr, this);
  }

  public ArTime getDataReceivedTime() {
    return new ArTime(AriaJavaJNI.ArRobotJoyHandler_getDataReceivedTime(swigCPtr, this), true);
  }

  public boolean gotData() {
    return AriaJavaJNI.ArRobotJoyHandler_gotData(swigCPtr, this);
  }

  public void addToConfig(ArConfig config, String section) {
    AriaJavaJNI.ArRobotJoyHandler_addToConfig(swigCPtr, this, ArConfig.getCPtr(config), config, section);
  }

  public int getRawX() {
    return AriaJavaJNI.ArRobotJoyHandler_getRawX(swigCPtr, this);
  }

  public int getRawY() {
    return AriaJavaJNI.ArRobotJoyHandler_getRawY(swigCPtr, this);
  }

  public int getRawThrottle() {
    return AriaJavaJNI.ArRobotJoyHandler_getRawThrottle(swigCPtr, this);
  }

}
