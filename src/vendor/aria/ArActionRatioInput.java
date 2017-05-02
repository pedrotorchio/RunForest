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

public class ArActionRatioInput extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionRatioInput(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionRatioInputUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionRatioInput obj) {
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
        AriaJavaJNI.delete_ArActionRatioInput(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArActionRatioInput(String name) {
    this(AriaJavaJNI.new_ArActionRatioInput__SWIG_0(name), true);
  }

  public ArActionRatioInput() {
    this(AriaJavaJNI.new_ArActionRatioInput__SWIG_1(), true);
  }

  public void setRatios(double transRatio, double rotRatio, double throttleRatio, double latRatio) {
    AriaJavaJNI.ArActionRatioInput_setRatios__SWIG_0(swigCPtr, this, transRatio, rotRatio, throttleRatio, latRatio);
  }

  public void setRatios(double transRatio, double rotRatio, double throttleRatio) {
    AriaJavaJNI.ArActionRatioInput_setRatios__SWIG_1(swigCPtr, this, transRatio, rotRatio, throttleRatio);
  }

  public void setTransRatio(double transRatio) {
    AriaJavaJNI.ArActionRatioInput_setTransRatio(swigCPtr, this, transRatio);
  }

  public void setRotRatio(double rotRatio) {
    AriaJavaJNI.ArActionRatioInput_setRotRatio(swigCPtr, this, rotRatio);
  }

  public void setLatRatio(double latRatio) {
    AriaJavaJNI.ArActionRatioInput_setLatRatio(swigCPtr, this, latRatio);
  }

  public void setThrottleRatio(double throttleRatio) {
    AriaJavaJNI.ArActionRatioInput_setThrottleRatio(swigCPtr, this, throttleRatio);
  }

  public double getTransRatio() {
    return AriaJavaJNI.ArActionRatioInput_getTransRatio(swigCPtr, this);
  }

  public double getRotRatio() {
    return AriaJavaJNI.ArActionRatioInput_getRotRatio(swigCPtr, this);
  }

  public double getThrottleRatio() {
    return AriaJavaJNI.ArActionRatioInput_getThrottleRatio(swigCPtr, this);
  }

  public void addFireCallback(int priority, ArFunctor functor) {
    AriaJavaJNI.ArActionRatioInput_addFireCallback(swigCPtr, this, priority, ArFunctor.getCPtr(functor), functor);
  }

  public void remFireCallback(ArFunctor functor) {
    AriaJavaJNI.ArActionRatioInput_remFireCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addActivateCallback(ArFunctor functor, ArListPos.Pos position) {
    AriaJavaJNI.ArActionRatioInput_addActivateCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addActivateCallback(ArFunctor functor) {
    AriaJavaJNI.ArActionRatioInput_addActivateCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remActivateCallback(ArFunctor functor) {
    AriaJavaJNI.ArActionRatioInput_remActivateCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addDeactivateCallback(ArFunctor functor, ArListPos.Pos position) {
    AriaJavaJNI.ArActionRatioInput_addDeactivateCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addDeactivateCallback(ArFunctor functor) {
    AriaJavaJNI.ArActionRatioInput_addDeactivateCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remDeactivateCallback(ArFunctor functor) {
    AriaJavaJNI.ArActionRatioInput_remDeactivateCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void setParameters(double fullThrottleForwards, double fullThrottleBackwards, double rotAtFullForwards, double rotAtFullBackwards, double rotAtStopped, double latAtFullForwards, double latAtFullBackwards, double latAtStopped) {
    AriaJavaJNI.ArActionRatioInput_setParameters__SWIG_0(swigCPtr, this, fullThrottleForwards, fullThrottleBackwards, rotAtFullForwards, rotAtFullBackwards, rotAtStopped, latAtFullForwards, latAtFullBackwards, latAtStopped);
  }

  public void setParameters(double fullThrottleForwards, double fullThrottleBackwards, double rotAtFullForwards, double rotAtFullBackwards, double rotAtStopped, double latAtFullForwards, double latAtFullBackwards) {
    AriaJavaJNI.ArActionRatioInput_setParameters__SWIG_1(swigCPtr, this, fullThrottleForwards, fullThrottleBackwards, rotAtFullForwards, rotAtFullBackwards, rotAtStopped, latAtFullForwards, latAtFullBackwards);
  }

  public void setParameters(double fullThrottleForwards, double fullThrottleBackwards, double rotAtFullForwards, double rotAtFullBackwards, double rotAtStopped, double latAtFullForwards) {
    AriaJavaJNI.ArActionRatioInput_setParameters__SWIG_2(swigCPtr, this, fullThrottleForwards, fullThrottleBackwards, rotAtFullForwards, rotAtFullBackwards, rotAtStopped, latAtFullForwards);
  }

  public void setParameters(double fullThrottleForwards, double fullThrottleBackwards, double rotAtFullForwards, double rotAtFullBackwards, double rotAtStopped) {
    AriaJavaJNI.ArActionRatioInput_setParameters__SWIG_3(swigCPtr, this, fullThrottleForwards, fullThrottleBackwards, rotAtFullForwards, rotAtFullBackwards, rotAtStopped);
  }

  public void addToConfig(ArConfig config, String section) {
    AriaJavaJNI.ArActionRatioInput_addToConfig(swigCPtr, this, ArConfig.getCPtr(config), config, section);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionRatioInput_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionRatioInput_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public void activate() {
    AriaJavaJNI.ArActionRatioInput_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArActionRatioInput_deactivate(swigCPtr, this);
  }

}
