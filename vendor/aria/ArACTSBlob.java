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

public class ArACTSBlob {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArACTSBlob(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArACTSBlob obj) {
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
        AriaJavaJNI.delete_ArACTSBlob(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArACTSBlob() {
    this(AriaJavaJNI.new_ArACTSBlob(), true);
  }

  public int getArea() {
    return AriaJavaJNI.ArACTSBlob_getArea(swigCPtr, this);
  }

  public int getXCG() {
    return AriaJavaJNI.ArACTSBlob_getXCG(swigCPtr, this);
  }

  public int getYCG() {
    return AriaJavaJNI.ArACTSBlob_getYCG(swigCPtr, this);
  }

  public int getLeft() {
    return AriaJavaJNI.ArACTSBlob_getLeft(swigCPtr, this);
  }

  public int getRight() {
    return AriaJavaJNI.ArACTSBlob_getRight(swigCPtr, this);
  }

  public int getTop() {
    return AriaJavaJNI.ArACTSBlob_getTop(swigCPtr, this);
  }

  public int getBottom() {
    return AriaJavaJNI.ArACTSBlob_getBottom(swigCPtr, this);
  }

  public void setArea(int area) {
    AriaJavaJNI.ArACTSBlob_setArea(swigCPtr, this, area);
  }

  public void setXCG(int xcg) {
    AriaJavaJNI.ArACTSBlob_setXCG(swigCPtr, this, xcg);
  }

  public void setYCG(int ycg) {
    AriaJavaJNI.ArACTSBlob_setYCG(swigCPtr, this, ycg);
  }

  public void setLeft(int left) {
    AriaJavaJNI.ArACTSBlob_setLeft(swigCPtr, this, left);
  }

  public void setRight(int right) {
    AriaJavaJNI.ArACTSBlob_setRight(swigCPtr, this, right);
  }

  public void setTop(int top) {
    AriaJavaJNI.ArACTSBlob_setTop(swigCPtr, this, top);
  }

  public void setBottom(int bottom) {
    AriaJavaJNI.ArACTSBlob_setBottom(swigCPtr, this, bottom);
  }

  public void log() {
    AriaJavaJNI.ArACTSBlob_log(swigCPtr, this);
  }

}
