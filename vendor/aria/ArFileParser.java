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

public class ArFileParser {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArFileParser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArFileParser obj) {
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
        AriaJavaJNI.delete_ArFileParser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArFileParser(String baseDirectory, boolean isPreCompressQuotes) {
    this(AriaJavaJNI.new_ArFileParser__SWIG_0(baseDirectory, isPreCompressQuotes), true);
  }

  public ArFileParser(String baseDirectory) {
    this(AriaJavaJNI.new_ArFileParser__SWIG_1(baseDirectory), true);
  }

  public ArFileParser() {
    this(AriaJavaJNI.new_ArFileParser__SWIG_2(), true);
  }

  public boolean addHandler(String keyword, ArRetFunctor1_Bool_ArgumentBuilderP functor) {
    return AriaJavaJNI.ArFileParser_addHandler(swigCPtr, this, keyword, ArRetFunctor1_Bool_ArgumentBuilderP.getCPtr(functor), functor);
  }

  public boolean addHandlerWithError(String keyword, SWIGTYPE_p_ArRetFunctor3T_bool_ArArgumentBuilder_p_char_p_size_t_t functor) {
    return AriaJavaJNI.ArFileParser_addHandlerWithError(swigCPtr, this, keyword, SWIGTYPE_p_ArRetFunctor3T_bool_ArArgumentBuilder_p_char_p_size_t_t.getCPtr(functor));
  }

  public boolean remHandler(String keyword, boolean logIfCannotFind) {
    return AriaJavaJNI.ArFileParser_remHandler__SWIG_0(swigCPtr, this, keyword, logIfCannotFind);
  }

  public boolean remHandler(String keyword) {
    return AriaJavaJNI.ArFileParser_remHandler__SWIG_1(swigCPtr, this, keyword);
  }

  public boolean remHandler(ArRetFunctor1_Bool_ArgumentBuilderP functor) {
    return AriaJavaJNI.ArFileParser_remHandler__SWIG_2(swigCPtr, this, ArRetFunctor1_Bool_ArgumentBuilderP.getCPtr(functor), functor);
  }

  public boolean remHandler(SWIGTYPE_p_ArRetFunctor3T_bool_ArArgumentBuilder_p_char_p_size_t_t functor) {
    return AriaJavaJNI.ArFileParser_remHandler__SWIG_3(swigCPtr, this, SWIGTYPE_p_ArRetFunctor3T_bool_ArArgumentBuilder_p_char_p_size_t_t.getCPtr(functor));
  }

  public void setPreParseFunctor(ArFunctor1_CString functor) {
    AriaJavaJNI.ArFileParser_setPreParseFunctor(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor);
  }

  public boolean parseFile(String fileName, boolean continueOnErrors, boolean noFileNotFoundMessage, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_0(swigCPtr, this, fileName, continueOnErrors, noFileNotFoundMessage, errorBuffer, errorBufferLen);
  }

  public boolean parseFile(String fileName, boolean continueOnErrors, boolean noFileNotFoundMessage, String errorBuffer) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_1(swigCPtr, this, fileName, continueOnErrors, noFileNotFoundMessage, errorBuffer);
  }

  public boolean parseFile(String fileName, boolean continueOnErrors, boolean noFileNotFoundMessage) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_2(swigCPtr, this, fileName, continueOnErrors, noFileNotFoundMessage);
  }

  public boolean parseFile(String fileName, boolean continueOnErrors) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_3(swigCPtr, this, fileName, continueOnErrors);
  }

  public boolean parseFile(String fileName) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_4(swigCPtr, this, fileName);
  }

  public boolean parseFile(SWIGTYPE_p_FILE file, String buffer, int bufferLength, boolean continueOnErrors, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_5(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(file), buffer, bufferLength, continueOnErrors, errorBuffer, errorBufferLen);
  }

  public boolean parseFile(SWIGTYPE_p_FILE file, String buffer, int bufferLength, boolean continueOnErrors, String errorBuffer) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_6(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(file), buffer, bufferLength, continueOnErrors, errorBuffer);
  }

  public boolean parseFile(SWIGTYPE_p_FILE file, String buffer, int bufferLength, boolean continueOnErrors) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_7(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(file), buffer, bufferLength, continueOnErrors);
  }

  public boolean parseFile(SWIGTYPE_p_FILE file, String buffer, int bufferLength) {
    return AriaJavaJNI.ArFileParser_parseFile__SWIG_8(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(file), buffer, bufferLength);
  }

  public void cancelParsing() {
    AriaJavaJNI.ArFileParser_cancelParsing(swigCPtr, this);
  }

  public String getBaseDirectory() {
    return AriaJavaJNI.ArFileParser_getBaseDirectory(swigCPtr, this);
  }

  public void setBaseDirectory(String baseDirectory) {
    AriaJavaJNI.ArFileParser_setBaseDirectory(swigCPtr, this, baseDirectory);
  }

  public void setCommentDelimiters(SWIGTYPE_p_std__listT_std__string_t delimiters) {
    AriaJavaJNI.ArFileParser_setCommentDelimiters(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(delimiters));
  }

  public void clearCommentDelimiters() {
    AriaJavaJNI.ArFileParser_clearCommentDelimiters(swigCPtr, this);
  }

  public boolean parseLine(String line, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArFileParser_parseLine__SWIG_0(swigCPtr, this, line, errorBuffer, errorBufferLen);
  }

  public boolean parseLine(String line, String errorBuffer) {
    return AriaJavaJNI.ArFileParser_parseLine__SWIG_1(swigCPtr, this, line, errorBuffer);
  }

  public boolean parseLine(String line) {
    return AriaJavaJNI.ArFileParser_parseLine__SWIG_2(swigCPtr, this, line);
  }

  public void resetCounters() {
    AriaJavaJNI.ArFileParser_resetCounters(swigCPtr, this);
  }

  public void setMaxNumArguments(long maxNumArguments) {
    AriaJavaJNI.ArFileParser_setMaxNumArguments__SWIG_0(swigCPtr, this, maxNumArguments);
  }

  public void setMaxNumArguments() {
    AriaJavaJNI.ArFileParser_setMaxNumArguments__SWIG_1(swigCPtr, this);
  }

  public void setQuiet(boolean isQuiet) {
    AriaJavaJNI.ArFileParser_setQuiet(swigCPtr, this, isQuiet);
  }

}
