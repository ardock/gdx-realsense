/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCPoint3DF32 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PXCPoint3DF32(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCPoint3DF32 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        realsenseJNI.delete_PXCPoint3DF32(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    realsenseJNI.PXCPoint3DF32_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return realsenseJNI.PXCPoint3DF32_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    realsenseJNI.PXCPoint3DF32_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return realsenseJNI.PXCPoint3DF32_y_get(swigCPtr, this);
  }

  public void setZ(float value) {
    realsenseJNI.PXCPoint3DF32_z_set(swigCPtr, this, value);
  }

  public float getZ() {
    return realsenseJNI.PXCPoint3DF32_z_get(swigCPtr, this);
  }

  public PXCPoint3DF32() {
    this(realsenseJNI.new_PXCPoint3DF32(), true);
  }

}
