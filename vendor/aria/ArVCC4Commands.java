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

public class ArVCC4Commands {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArVCC4Commands(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArVCC4Commands obj) {
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
        AriaJavaJNI.delete_ArVCC4Commands(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArVCC4Commands() {
    this(AriaJavaJNI.new_ArVCC4Commands(), true);
  }

  public final static class Command {
    public final static Command DELIM = new Command("DELIM", AriaJavaJNI.ArVCC4Commands_DELIM_get());
    public final static Command DEVICEID = new Command("DEVICEID", AriaJavaJNI.ArVCC4Commands_DEVICEID_get());
    public final static Command PANSLEW = new Command("PANSLEW", AriaJavaJNI.ArVCC4Commands_PANSLEW_get());
    public final static Command TILTSLEW = new Command("TILTSLEW", AriaJavaJNI.ArVCC4Commands_TILTSLEW_get());
    public final static Command STOP = new Command("STOP", AriaJavaJNI.ArVCC4Commands_STOP_get());
    public final static Command INIT = new Command("INIT", AriaJavaJNI.ArVCC4Commands_INIT_get());
    public final static Command SLEWREQ = new Command("SLEWREQ", AriaJavaJNI.ArVCC4Commands_SLEWREQ_get());
    public final static Command ANGLEREQ = new Command("ANGLEREQ", AriaJavaJNI.ArVCC4Commands_ANGLEREQ_get());
    public final static Command PANTILT = new Command("PANTILT", AriaJavaJNI.ArVCC4Commands_PANTILT_get());
    public final static Command SETRANGE = new Command("SETRANGE", AriaJavaJNI.ArVCC4Commands_SETRANGE_get());
    public final static Command PANTILTREQ = new Command("PANTILTREQ", AriaJavaJNI.ArVCC4Commands_PANTILTREQ_get());
    public final static Command INFRARED = new Command("INFRARED", AriaJavaJNI.ArVCC4Commands_INFRARED_get());
    public final static Command PRODUCTNAME = new Command("PRODUCTNAME", AriaJavaJNI.ArVCC4Commands_PRODUCTNAME_get());
    public final static Command LEDCONTROL = new Command("LEDCONTROL", AriaJavaJNI.ArVCC4Commands_LEDCONTROL_get());
    public final static Command CONTROL = new Command("CONTROL", AriaJavaJNI.ArVCC4Commands_CONTROL_get());
    public final static Command POWER = new Command("POWER", AriaJavaJNI.ArVCC4Commands_POWER_get());
    public final static Command AUTOFOCUS = new Command("AUTOFOCUS", AriaJavaJNI.ArVCC4Commands_AUTOFOCUS_get());
    public final static Command ZOOMSTOP = new Command("ZOOMSTOP", AriaJavaJNI.ArVCC4Commands_ZOOMSTOP_get());
    public final static Command GAIN = new Command("GAIN", AriaJavaJNI.ArVCC4Commands_GAIN_get());
    public final static Command FOCUS = new Command("FOCUS", AriaJavaJNI.ArVCC4Commands_FOCUS_get());
    public final static Command ZOOM = new Command("ZOOM", AriaJavaJNI.ArVCC4Commands_ZOOM_get());
    public final static Command ZOOMREQ = new Command("ZOOMREQ", AriaJavaJNI.ArVCC4Commands_ZOOMREQ_get());
    public final static Command IRCUTFILTER = new Command("IRCUTFILTER", AriaJavaJNI.ArVCC4Commands_IRCUTFILTER_get());
    public final static Command DIGITALZOOM = new Command("DIGITALZOOM", AriaJavaJNI.ArVCC4Commands_DIGITALZOOM_get());
    public final static Command FOOTER = new Command("FOOTER", AriaJavaJNI.ArVCC4Commands_FOOTER_get());
    public final static Command RESPONSE = new Command("RESPONSE", AriaJavaJNI.ArVCC4Commands_RESPONSE_get());
    public final static Command HEADER = new Command("HEADER", AriaJavaJNI.ArVCC4Commands_HEADER_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Command swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Command.class + " with value " + swigValue);
    }

    private Command(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Command(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Command(String swigName, Command swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Command[] swigValues = { DELIM, DEVICEID, PANSLEW, TILTSLEW, STOP, INIT, SLEWREQ, ANGLEREQ, PANTILT, SETRANGE, PANTILTREQ, INFRARED, PRODUCTNAME, LEDCONTROL, CONTROL, POWER, AUTOFOCUS, ZOOMSTOP, GAIN, FOCUS, ZOOM, ZOOMREQ, IRCUTFILTER, DIGITALZOOM, FOOTER, RESPONSE, HEADER };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
