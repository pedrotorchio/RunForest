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

public class ArMutex {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArMutex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMutex obj) {
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
        AriaJavaJNI.delete_ArMutex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArMutex(boolean recursive) {
    this(AriaJavaJNI.new_ArMutex__SWIG_0(recursive), true);
  }

  public ArMutex() {
    this(AriaJavaJNI.new_ArMutex__SWIG_1(), true);
  }

  public ArMutex(ArMutex mutex) {
    this(AriaJavaJNI.new_ArMutex__SWIG_2(ArMutex.getCPtr(mutex), mutex), true);
  }

  public int lock() {
    return AriaJavaJNI.ArMutex_lock(swigCPtr, this);
  }

  public int tryLock() {
    return AriaJavaJNI.ArMutex_tryLock(swigCPtr, this);
  }

  public int unlock() {
    return AriaJavaJNI.ArMutex_unlock(swigCPtr, this);
  }

  public String getError(int messageNumber) {
    return AriaJavaJNI.ArMutex_getError(swigCPtr, this, messageNumber);
  }

  public void setLog(boolean log) {
    AriaJavaJNI.ArMutex_setLog(swigCPtr, this, log);
  }

  public void setLogName(String logName) {
    AriaJavaJNI.ArMutex_setLogName(swigCPtr, this, logName);
  }

  public SWIGTYPE_p_HANDLE getMutex() {
    return new SWIGTYPE_p_HANDLE(AriaJavaJNI.ArMutex_getMutex(swigCPtr, this), false);
  }

  public static void setLockWarningTime(double lockWarningSeconds) {
    AriaJavaJNI.ArMutex_setLockWarningTime(lockWarningSeconds);
  }

  public static double getLockWarningTime() {
    return AriaJavaJNI.ArMutex_getLockWarningTime();
  }

  public static void setUnlockWarningTime(double unlockWarningSeconds) {
    AriaJavaJNI.ArMutex_setUnlockWarningTime(unlockWarningSeconds);
  }

  public static double getUnlockWarningTime() {
    return AriaJavaJNI.ArMutex_getUnlockWarningTime();
  }

  public final static class Status {
    public final static Status STATUS_FAILED_INIT = new Status("STATUS_FAILED_INIT", AriaJavaJNI.ArMutex_STATUS_FAILED_INIT_get());
    public final static Status STATUS_FAILED = new Status("STATUS_FAILED");
    public final static Status STATUS_ALREADY_LOCKED = new Status("STATUS_ALREADY_LOCKED");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Status swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Status.class + " with value " + swigValue);
    }

    private Status(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Status(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Status(String swigName, Status swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Status[] swigValues = { STATUS_FAILED_INIT, STATUS_FAILED, STATUS_ALREADY_LOCKED };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
