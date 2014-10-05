/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCHandConfiguration extends PXCBase {
  private long swigCPtr;

  protected PXCHandConfiguration(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCHandConfiguration_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCHandConfiguration obj) {
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

  static public class AlertHandler {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected AlertHandler(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(AlertHandler obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCHandConfiguration_AlertHandler(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void OnFiredAlert(PXCHandData.AlertData alertData) {
      realsenseJNI.PXCHandConfiguration_AlertHandler_OnFiredAlert(swigCPtr, this, PXCHandData.AlertData.getCPtr(alertData), alertData);
    }
  
  }

  static public class GestureHandler {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected GestureHandler(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(GestureHandler obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCHandConfiguration_GestureHandler(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void OnFiredGesture(PXCHandData.GestureData gestureData) {
      realsenseJNI.PXCHandConfiguration_GestureHandler_OnFiredGesture(swigCPtr, this, PXCHandData.GestureData.getCPtr(gestureData), gestureData);
    }
  
  }

  public pxcStatus ApplyChanges() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_ApplyChanges(swigCPtr, this));
  }

  public pxcStatus RestoreDefaults() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_RestoreDefaults(swigCPtr, this));
  }

  public pxcStatus Update() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_Update(swigCPtr, this));
  }

  public pxcStatus ResetTracking() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_ResetTracking(swigCPtr, this));
  }

  public pxcStatus SetUserName(SWIGTYPE_p_wchar_t userName) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_SetUserName(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(userName)));
  }

  public SWIGTYPE_p_wchar_t QueryUserName() {
    long cPtr = realsenseJNI.PXCHandConfiguration_QueryUserName(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public pxcStatus EnableJointSpeed(PXCHandData.JointType jointLabel, PXCHandData.JointSpeedType jointSpeed, int time) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableJointSpeed(swigCPtr, this, jointLabel.swigValue(), jointSpeed.swigValue(), time));
  }

  public pxcStatus DisableJointSpeed(PXCHandData.JointType jointLabel) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_DisableJointSpeed(swigCPtr, this, jointLabel.swigValue()));
  }

  public pxcStatus SetTrackingBounds(float nearTrackingDistance, float farTrackingDistance, float nearTrackingWidth, float nearTrackingHeight) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_SetTrackingBounds(swigCPtr, this, nearTrackingDistance, farTrackingDistance, nearTrackingWidth, nearTrackingHeight));
  }

  public pxcStatus QueryTrackingBounds(SWIGTYPE_p_float nearTrackingDistance, SWIGTYPE_p_float farTrackingDistance, SWIGTYPE_p_float nearTrackingWidth, SWIGTYPE_p_float nearTrackingHeight) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_QueryTrackingBounds(swigCPtr, this, SWIGTYPE_p_float.getCPtr(nearTrackingDistance), SWIGTYPE_p_float.getCPtr(farTrackingDistance), SWIGTYPE_p_float.getCPtr(nearTrackingWidth), SWIGTYPE_p_float.getCPtr(nearTrackingHeight)));
  }

  public pxcStatus SetTrackingMode(PXCHandData.TrackingModeType trackingMode) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_SetTrackingMode(swigCPtr, this, trackingMode.swigValue()));
  }

  public PXCHandData.TrackingModeType QueryTrackingMode() {
    return PXCHandData.TrackingModeType.swigToEnum(realsenseJNI.PXCHandConfiguration_QueryTrackingMode(swigCPtr, this));
  }

  public pxcStatus SetDistanceUnit(PXCHandData.DistanceUnitType distanceUnit) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_SetDistanceUnit(swigCPtr, this, distanceUnit.swigValue()));
  }

  public PXCHandData.DistanceUnitType QueryDistanceUnit() {
    return PXCHandData.DistanceUnitType.swigToEnum(realsenseJNI.PXCHandConfiguration_QueryDistanceUnit(swigCPtr, this));
  }

  public pxcStatus SetSmoothingValue(float smoothingValue) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_SetSmoothingValue(swigCPtr, this, smoothingValue));
  }

  public float QuerySmoothingValue() {
    return realsenseJNI.PXCHandConfiguration_QuerySmoothingValue(swigCPtr, this);
  }

  public pxcStatus EnableNormalizedJoints(int enableFlag) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableNormalizedJoints(swigCPtr, this, enableFlag));
  }

  public int IsNormalizedJointsEnabled() {
    return realsenseJNI.PXCHandConfiguration_IsNormalizedJointsEnabled(swigCPtr, this);
  }

  public pxcStatus EnableSegmentationImage(int enableFlag) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableSegmentationImage(swigCPtr, this, enableFlag));
  }

  public int IsSegmentationImageEnabled() {
    return realsenseJNI.PXCHandConfiguration_IsSegmentationImageEnabled(swigCPtr, this);
  }

  public pxcStatus EnableTrackedJoints(int enableFlag) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableTrackedJoints(swigCPtr, this, enableFlag));
  }

  public int IsTrackedJointsEnabled() {
    return realsenseJNI.PXCHandConfiguration_IsTrackedJointsEnabled(swigCPtr, this);
  }

  public pxcStatus EnableAlert(PXCHandData.AlertType alertEvent) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableAlert(swigCPtr, this, alertEvent.swigValue()));
  }

  public pxcStatus EnableAllAlerts() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableAllAlerts(swigCPtr, this));
  }

  public int IsAlertEnabled(PXCHandData.AlertType alertEvent) {
    return realsenseJNI.PXCHandConfiguration_IsAlertEnabled(swigCPtr, this, alertEvent.swigValue());
  }

  public pxcStatus DisableAlert(PXCHandData.AlertType alertEvent) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_DisableAlert(swigCPtr, this, alertEvent.swigValue()));
  }

  public pxcStatus DisableAllAlerts() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_DisableAllAlerts(swigCPtr, this));
  }

  public pxcStatus SubscribeAlert(PXCHandConfiguration.AlertHandler alertHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_SubscribeAlert(swigCPtr, this, PXCHandConfiguration.AlertHandler.getCPtr(alertHandler), alertHandler));
  }

  public pxcStatus UnsubscribeAlert(PXCHandConfiguration.AlertHandler alertHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_UnsubscribeAlert(swigCPtr, this, PXCHandConfiguration.AlertHandler.getCPtr(alertHandler), alertHandler));
  }

  public pxcStatus LoadGesturePack(SWIGTYPE_p_wchar_t gesturePackPath) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_LoadGesturePack(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gesturePackPath)));
  }

  public pxcStatus UnloadGesturePack(SWIGTYPE_p_wchar_t gesturePackPath) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_UnloadGesturePack(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gesturePackPath)));
  }

  public pxcStatus UnloadAllGesturesPacks() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_UnloadAllGesturesPacks(swigCPtr, this));
  }

  public int QueryGesturesTotalNumber() {
    return realsenseJNI.PXCHandConfiguration_QueryGesturesTotalNumber(swigCPtr, this);
  }

  public pxcStatus QueryGestureNameByIndex(int index, int bufferSize, SWIGTYPE_p_wchar_t gestureName) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_QueryGestureNameByIndex(swigCPtr, this, index, bufferSize, SWIGTYPE_p_wchar_t.getCPtr(gestureName)));
  }

  public pxcStatus EnableGesture(SWIGTYPE_p_wchar_t gestureName, int continuousGesture) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableGesture__SWIG_0(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gestureName), continuousGesture));
  }

  public pxcStatus EnableGesture(SWIGTYPE_p_wchar_t gestureName) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableGesture__SWIG_1(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gestureName)));
  }

  public pxcStatus EnableAllGestures(int continuousGesture) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableAllGestures__SWIG_0(swigCPtr, this, continuousGesture));
  }

  public pxcStatus EnableAllGestures() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_EnableAllGestures__SWIG_1(swigCPtr, this));
  }

  public int IsGestureEnabled(SWIGTYPE_p_wchar_t gestureName) {
    return realsenseJNI.PXCHandConfiguration_IsGestureEnabled(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gestureName));
  }

  public pxcStatus DisableGesture(SWIGTYPE_p_wchar_t gestureName) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_DisableGesture(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gestureName)));
  }

  public pxcStatus DisableAllGestures() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_DisableAllGestures(swigCPtr, this));
  }

  public pxcStatus SubscribeGesture(PXCHandConfiguration.GestureHandler gestureHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_SubscribeGesture(swigCPtr, this, PXCHandConfiguration.GestureHandler.getCPtr(gestureHandler), gestureHandler));
  }

  public pxcStatus UnsubscribeGesture(PXCHandConfiguration.GestureHandler gestureHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCHandConfiguration_UnsubscribeGesture(swigCPtr, this, PXCHandConfiguration.GestureHandler.getCPtr(gestureHandler), gestureHandler));
  }

  public final static int CUID = realsenseJNI.PXCHandConfiguration_CUID_get();

}
