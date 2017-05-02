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

package vendor.aria;

public class ArSyncLoop extends ArASyncTask {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArSyncLoop(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArSyncLoopUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSyncLoop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArSyncLoop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArSyncLoop() {
    this(AriaJavaJNI.new_ArSyncLoop(), true);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArSyncLoop_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public void stopRunIfNotConnected(boolean stopRun) {
    AriaJavaJNI.ArSyncLoop_stopRunIfNotConnected(swigCPtr, this, stopRun);
  }

  public SWIGTYPE_p_void runThread(SWIGTYPE_p_void arg) {
    long cPtr = AriaJavaJNI.ArSyncLoop_runThread(swigCPtr, this, SWIGTYPE_p_void.getCPtr(arg));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public String getThreadActivity() {
    return AriaJavaJNI.ArSyncLoop_getThreadActivity(swigCPtr, this);
  }

}
