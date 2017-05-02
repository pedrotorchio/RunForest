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

public class ArSyncTask {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArSyncTask(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSyncTask obj) {
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
        AriaJavaJNI.delete_ArSyncTask(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArSyncTask(String name, ArFunctor functor, SWIGTYPE_p_ArTaskState__State state, ArSyncTask parent) {
    this(AriaJavaJNI.new_ArSyncTask__SWIG_0(name, ArFunctor.getCPtr(functor), functor, SWIGTYPE_p_ArTaskState__State.getCPtr(state), ArSyncTask.getCPtr(parent), parent), true);
  }

  public ArSyncTask(String name, ArFunctor functor, SWIGTYPE_p_ArTaskState__State state) {
    this(AriaJavaJNI.new_ArSyncTask__SWIG_1(name, ArFunctor.getCPtr(functor), functor, SWIGTYPE_p_ArTaskState__State.getCPtr(state)), true);
  }

  public ArSyncTask(String name, ArFunctor functor) {
    this(AriaJavaJNI.new_ArSyncTask__SWIG_2(name, ArFunctor.getCPtr(functor), functor), true);
  }

  public ArSyncTask(String name) {
    this(AriaJavaJNI.new_ArSyncTask__SWIG_3(name), true);
  }

  public void run() {
    AriaJavaJNI.ArSyncTask_run(swigCPtr, this);
  }

  public void log(int depth) {
    AriaJavaJNI.ArSyncTask_log__SWIG_0(swigCPtr, this, depth);
  }

  public void log() {
    AriaJavaJNI.ArSyncTask_log__SWIG_1(swigCPtr, this);
  }

  public ArTaskState.State getState() {
    return ArTaskState.State.swigToEnum(AriaJavaJNI.ArSyncTask_getState(swigCPtr, this));
  }

  public void setState(ArTaskState.State state) {
    AriaJavaJNI.ArSyncTask_setState(swigCPtr, this, state.swigValue());
  }

  public ArSyncTask findNonRecursive(String name) {
    long cPtr = AriaJavaJNI.ArSyncTask_findNonRecursive__SWIG_0(swigCPtr, this, name);
    return (cPtr == 0) ? null : new ArSyncTask(cPtr, false);
  }

  public ArSyncTask findNonRecursive(ArFunctor functor) {
    long cPtr = AriaJavaJNI.ArSyncTask_findNonRecursive__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
    return (cPtr == 0) ? null : new ArSyncTask(cPtr, false);
  }

  public ArSyncTask find(String name) {
    long cPtr = AriaJavaJNI.ArSyncTask_find__SWIG_0(swigCPtr, this, name);
    return (cPtr == 0) ? null : new ArSyncTask(cPtr, false);
  }

  public ArSyncTask find(ArFunctor functor) {
    long cPtr = AriaJavaJNI.ArSyncTask_find__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
    return (cPtr == 0) ? null : new ArSyncTask(cPtr, false);
  }

  public ArSyncTask getRunning() {
    long cPtr = AriaJavaJNI.ArSyncTask_getRunning(swigCPtr, this);
    return (cPtr == 0) ? null : new ArSyncTask(cPtr, false);
  }

  public void addNewBranch(String nameOfNew, int position, SWIGTYPE_p_ArTaskState__State state) {
    AriaJavaJNI.ArSyncTask_addNewBranch__SWIG_0(swigCPtr, this, nameOfNew, position, SWIGTYPE_p_ArTaskState__State.getCPtr(state));
  }

  public void addNewBranch(String nameOfNew, int position) {
    AriaJavaJNI.ArSyncTask_addNewBranch__SWIG_1(swigCPtr, this, nameOfNew, position);
  }

  public void addNewLeaf(String nameOfNew, int position, ArFunctor functor, SWIGTYPE_p_ArTaskState__State state) {
    AriaJavaJNI.ArSyncTask_addNewLeaf__SWIG_0(swigCPtr, this, nameOfNew, position, ArFunctor.getCPtr(functor), functor, SWIGTYPE_p_ArTaskState__State.getCPtr(state));
  }

  public void addNewLeaf(String nameOfNew, int position, ArFunctor functor) {
    AriaJavaJNI.ArSyncTask_addNewLeaf__SWIG_1(swigCPtr, this, nameOfNew, position, ArFunctor.getCPtr(functor), functor);
  }

  public String getName() {
    return AriaJavaJNI.ArSyncTask_getName(swigCPtr, this);
  }

  public ArFunctor getFunctor() {
    long cPtr = AriaJavaJNI.ArSyncTask_getFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public void setWarningTimeCB(ArRetFunctor_UnsignedInt functor) {
    AriaJavaJNI.ArSyncTask_setWarningTimeCB(swigCPtr, this, ArRetFunctor_UnsignedInt.getCPtr(functor), functor);
  }

  public ArRetFunctor_UnsignedInt getWarningTimeCB() {
    long cPtr = AriaJavaJNI.ArSyncTask_getWarningTimeCB(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRetFunctor_UnsignedInt(cPtr, false);
  }

  public void setNoTimeWarningCB(ArRetFunctor_Bool functor) {
    AriaJavaJNI.ArSyncTask_setNoTimeWarningCB(swigCPtr, this, ArRetFunctor_Bool.getCPtr(functor), functor);
  }

  public ArRetFunctor_Bool getNoTimeWarningCB() {
    long cPtr = AriaJavaJNI.ArSyncTask_getNoTimeWarningCB(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRetFunctor_Bool(cPtr, false);
  }

  public void remove(ArSyncTask proc) {
    AriaJavaJNI.ArSyncTask_remove(swigCPtr, this, ArSyncTask.getCPtr(proc), proc);
  }

  public boolean isDeleting() {
    return AriaJavaJNI.ArSyncTask_isDeleting(swigCPtr, this);
  }

}
