/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXC3DSeg extends PXCBase {
  private long swigCPtr;

  protected PXC3DSeg(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXC3DSeg_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXC3DSeg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PXCImage AcquireSegmentedImage() {
    long cPtr = realsenseJNI.PXC3DSeg_AcquireSegmentedImage(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCImage(cPtr, false);
  }

  public final static int CUID = realsenseJNI.PXC3DSeg_CUID_get();

}
