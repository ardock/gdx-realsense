/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCTouchlessController extends PXCBase {
  private long swigCPtr;

  protected PXCTouchlessController(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCTouchlessController_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCTouchlessController obj) {
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

  static public class ProfileInfo {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ProfileInfo(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ProfileInfo obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCTouchlessController_ProfileInfo(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setHandModule(PXCHandModule value) {
      realsenseJNI.PXCTouchlessController_ProfileInfo_handModule_set(swigCPtr, this, PXCHandModule.getCPtr(value), value);
    }
  
    public PXCHandModule getHandModule() {
      long cPtr = realsenseJNI.PXCTouchlessController_ProfileInfo_handModule_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCHandModule(cPtr, false);
    }
  
    public void setConfig(int value) {
      realsenseJNI.PXCTouchlessController_ProfileInfo_config_set(swigCPtr, this, value);
    }
  
    public int getConfig() {
      return realsenseJNI.PXCTouchlessController_ProfileInfo_config_get(swigCPtr, this);
    }
  
    public ProfileInfo() {
      this(realsenseJNI.new_PXCTouchlessController_ProfileInfo(), true);
    }
  
    public final static int Configuration_None = realsenseJNI.ProfileInfo_Configuration_None_get();
    public final static int Configuration_Allow_Zoom = realsenseJNI.ProfileInfo_Configuration_Allow_Zoom_get();
    public final static int Configuration_Use_Draw_Mode = realsenseJNI.ProfileInfo_Configuration_Use_Draw_Mode_get();
    public final static int Configuration_Scroll_Horizontally = realsenseJNI.ProfileInfo_Configuration_Scroll_Horizontally_get();
    public final static int Configuration_Scroll_Vertically = realsenseJNI.ProfileInfo_Configuration_Scroll_Vertically_get();
    public final static int Configuration_Meta_Context_Menu = realsenseJNI.ProfileInfo_Configuration_Meta_Context_Menu_get();
    public final static int Configuration_Enable_Injection = realsenseJNI.ProfileInfo_Configuration_Enable_Injection_get();
    public final static int Configuration_Edge_Scroll_Horizontally = realsenseJNI.ProfileInfo_Configuration_Edge_Scroll_Horizontally_get();
    public final static int Configuration_Edge_Scroll_Vertically = realsenseJNI.ProfileInfo_Configuration_Edge_Scroll_Vertically_get();
    public final static int Configuration_Hide_Cursor_After_Touch_Injection = realsenseJNI.ProfileInfo_Configuration_Hide_Cursor_After_Touch_Injection_get();
    public final static int Configuration_Allow_Back = realsenseJNI.ProfileInfo_Configuration_Allow_Back_get();
  
  }

  public pxcStatus QueryProfile(PXCTouchlessController.ProfileInfo pinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_QueryProfile(swigCPtr, this, PXCTouchlessController.ProfileInfo.getCPtr(pinfo), pinfo));
  }

  public pxcStatus SetProfile(PXCTouchlessController.ProfileInfo pinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_SetProfile(swigCPtr, this, PXCTouchlessController.ProfileInfo.getCPtr(pinfo), pinfo));
  }

  static public class UXEventData {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected UXEventData(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(UXEventData obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCTouchlessController_UXEventData(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setType(PXCTouchlessController.UXEventData.UXEventType value) {
      realsenseJNI.PXCTouchlessController_UXEventData_type_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCTouchlessController.UXEventData.UXEventType getType() {
      return PXCTouchlessController.UXEventData.UXEventType.swigToEnum(realsenseJNI.PXCTouchlessController_UXEventData_type_get(swigCPtr, this));
    }
  
    public void setPosition(PXCPoint3DF32 value) {
      realsenseJNI.PXCTouchlessController_UXEventData_position_set(swigCPtr, this, PXCPoint3DF32.getCPtr(value), value);
    }
  
    public PXCPoint3DF32 getPosition() {
      long cPtr = realsenseJNI.PXCTouchlessController_UXEventData_position_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCPoint3DF32(cPtr, false);
    }
  
    public void setBodySide(PXCHandData.BodySideType value) {
      realsenseJNI.PXCTouchlessController_UXEventData_bodySide_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCHandData.BodySideType getBodySide() {
      return PXCHandData.BodySideType.swigToEnum(realsenseJNI.PXCTouchlessController_UXEventData_bodySide_get(swigCPtr, this));
    }
  
    public UXEventData() {
      this(realsenseJNI.new_PXCTouchlessController_UXEventData(), true);
    }
  
    public final static class UXEventType {
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_StartZoom = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_StartZoom");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_Zoom = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_Zoom");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_EndZoom = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_EndZoom");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_StartScroll = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_StartScroll");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_Scroll = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_Scroll");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_EndScroll = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_EndScroll");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_StartDraw = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_StartDraw");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_Draw = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_Draw");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_EndDraw = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_EndDraw");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_CursorMove = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_CursorMove");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_Select = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_Select");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_GotoStart = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_GotoStart");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_CursorVisible = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_CursorVisible");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_CursorNotVisible = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_CursorNotVisible");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_ReadyForAction = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_ReadyForAction");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_StartMetaCounter = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_StartMetaCounter");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_StopMetaCounter = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_StopMetaCounter");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_ShowMetaMenu = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_ShowMetaMenu");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_HideMetaMenu = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_HideMetaMenu");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_MetaPinch = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_MetaPinch");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_MetaOpenHand = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_MetaOpenHand");
      public final static PXCTouchlessController.UXEventData.UXEventType UXEvent_Back = new PXCTouchlessController.UXEventData.UXEventType("UXEvent_Back");
  
      public final int swigValue() {
        return swigValue;
      }
  
      public String toString() {
        return swigName;
      }
  
      public static UXEventType swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
          return swigValues[swigValue];
        for (int i = 0; i < swigValues.length; i++)
          if (swigValues[i].swigValue == swigValue)
            return swigValues[i];
        throw new IllegalArgumentException("No enum " + UXEventType.class + " with value " + swigValue);
      }
  
      private UXEventType(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
      }
  
      private UXEventType(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue+1;
      }
  
      private UXEventType(String swigName, UXEventType swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue+1;
      }
  
      private static UXEventType[] swigValues = { UXEvent_StartZoom, UXEvent_Zoom, UXEvent_EndZoom, UXEvent_StartScroll, UXEvent_Scroll, UXEvent_EndScroll, UXEvent_StartDraw, UXEvent_Draw, UXEvent_EndDraw, UXEvent_CursorMove, UXEvent_Select, UXEvent_GotoStart, UXEvent_CursorVisible, UXEvent_CursorNotVisible, UXEvent_ReadyForAction, UXEvent_StartMetaCounter, UXEvent_StopMetaCounter, UXEvent_ShowMetaMenu, UXEvent_HideMetaMenu, UXEvent_MetaPinch, UXEvent_MetaOpenHand, UXEvent_Back };
      private static int swigNext = 0;
      private final int swigValue;
      private final String swigName;
    }
  
  }

  static public class UXEventHandler {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected UXEventHandler(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(UXEventHandler obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCTouchlessController_UXEventHandler(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void OnFiredUXEvent(PXCTouchlessController.UXEventData uxEventData) {
      realsenseJNI.PXCTouchlessController_UXEventHandler_OnFiredUXEvent(swigCPtr, this, PXCTouchlessController.UXEventData.getCPtr(uxEventData), uxEventData);
    }
  
  }

  public pxcStatus SubscribeEvent(PXCTouchlessController.UXEventHandler uxEventHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_SubscribeEvent(swigCPtr, this, PXCTouchlessController.UXEventHandler.getCPtr(uxEventHandler), uxEventHandler));
  }

  public pxcStatus UnsubscribeEvent(PXCTouchlessController.UXEventHandler uxEventHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_UnsubscribeEvent(swigCPtr, this, PXCTouchlessController.UXEventHandler.getCPtr(uxEventHandler), uxEventHandler));
  }

  static public class AlertData {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected AlertData(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(AlertData obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCTouchlessController_AlertData(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setType(PXCTouchlessController.AlertData.AlertType value) {
      realsenseJNI.PXCTouchlessController_AlertData_type_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCTouchlessController.AlertData.AlertType getType() {
      return PXCTouchlessController.AlertData.AlertType.swigToEnum(realsenseJNI.PXCTouchlessController_AlertData_type_get(swigCPtr, this));
    }
  
    public AlertData() {
      this(realsenseJNI.new_PXCTouchlessController_AlertData(), true);
    }
  
    public final static class AlertType {
      public final static PXCTouchlessController.AlertData.AlertType Alert_TooClose = new PXCTouchlessController.AlertData.AlertType("Alert_TooClose");
      public final static PXCTouchlessController.AlertData.AlertType Alert_TooFar = new PXCTouchlessController.AlertData.AlertType("Alert_TooFar");
      public final static PXCTouchlessController.AlertData.AlertType Alert_NoAlerts = new PXCTouchlessController.AlertData.AlertType("Alert_NoAlerts");
  
      public final int swigValue() {
        return swigValue;
      }
  
      public String toString() {
        return swigName;
      }
  
      public static AlertType swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
          return swigValues[swigValue];
        for (int i = 0; i < swigValues.length; i++)
          if (swigValues[i].swigValue == swigValue)
            return swigValues[i];
        throw new IllegalArgumentException("No enum " + AlertType.class + " with value " + swigValue);
      }
  
      private AlertType(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
      }
  
      private AlertType(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue+1;
      }
  
      private AlertType(String swigName, AlertType swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue+1;
      }
  
      private static AlertType[] swigValues = { Alert_TooClose, Alert_TooFar, Alert_NoAlerts };
      private static int swigNext = 0;
      private final int swigValue;
      private final String swigName;
    }
  
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
          realsenseJNI.delete_PXCTouchlessController_AlertHandler(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void OnFiredAlert(PXCTouchlessController.AlertData alertData) {
      realsenseJNI.PXCTouchlessController_AlertHandler_OnFiredAlert(swigCPtr, this, PXCTouchlessController.AlertData.getCPtr(alertData), alertData);
    }
  
  }

  public pxcStatus SubscribeAlert(PXCTouchlessController.AlertHandler alertHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_SubscribeAlert(swigCPtr, this, PXCTouchlessController.AlertHandler.getCPtr(alertHandler), alertHandler));
  }

  public pxcStatus UnsubscribeAlert(PXCTouchlessController.AlertHandler alertHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_UnsubscribeAlert(swigCPtr, this, PXCTouchlessController.AlertHandler.getCPtr(alertHandler), alertHandler));
  }

  static public class ActionHandler {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ActionHandler(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ActionHandler obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCTouchlessController_ActionHandler(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void OnFiredAction(PXCTouchlessController.Action action) {
      realsenseJNI.PXCTouchlessController_ActionHandler_OnFiredAction(swigCPtr, this, action.swigValue());
    }
  
  }

  public pxcStatus AddGestureActionMapping(SWIGTYPE_p_wchar_t gestureName, PXCTouchlessController.Action action, PXCTouchlessController.ActionHandler actionHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_AddGestureActionMapping__SWIG_0(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gestureName), action.swigValue(), PXCTouchlessController.ActionHandler.getCPtr(actionHandler), actionHandler));
  }

  public pxcStatus AddGestureActionMapping(SWIGTYPE_p_wchar_t gestureName, PXCTouchlessController.Action action) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_AddGestureActionMapping__SWIG_1(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(gestureName), action.swigValue()));
  }

  public pxcStatus ClearAllGestureActionMappings() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTouchlessController_ClearAllGestureActionMappings(swigCPtr, this));
  }

  public final static int CUID = realsenseJNI.PXCTouchlessController_CUID_get();

  public final static class Action {
    public final static PXCTouchlessController.Action Action_None = new PXCTouchlessController.Action("Action_None", realsenseJNI.PXCTouchlessController_Action_None_get());
    public final static PXCTouchlessController.Action Action_LeftKeyPress = new PXCTouchlessController.Action("Action_LeftKeyPress");
    public final static PXCTouchlessController.Action Action_RightKeyPress = new PXCTouchlessController.Action("Action_RightKeyPress");
    public final static PXCTouchlessController.Action Action_BackKeyPress = new PXCTouchlessController.Action("Action_BackKeyPress");
    public final static PXCTouchlessController.Action Action_PgUpKeyPress = new PXCTouchlessController.Action("Action_PgUpKeyPress");
    public final static PXCTouchlessController.Action Action_PgDnKeyPress = new PXCTouchlessController.Action("Action_PgDnKeyPress");
    public final static PXCTouchlessController.Action Action_VolumeUp = new PXCTouchlessController.Action("Action_VolumeUp");
    public final static PXCTouchlessController.Action Action_VolumeDown = new PXCTouchlessController.Action("Action_VolumeDown");
    public final static PXCTouchlessController.Action Action_Mute = new PXCTouchlessController.Action("Action_Mute");
    public final static PXCTouchlessController.Action Action_NextTrack = new PXCTouchlessController.Action("Action_NextTrack");
    public final static PXCTouchlessController.Action Action_PrevTrack = new PXCTouchlessController.Action("Action_PrevTrack");
    public final static PXCTouchlessController.Action Action_PlayPause = new PXCTouchlessController.Action("Action_PlayPause");
    public final static PXCTouchlessController.Action Action_Stop = new PXCTouchlessController.Action("Action_Stop");
    public final static PXCTouchlessController.Action Action_ToggleTabs = new PXCTouchlessController.Action("Action_ToggleTabs");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Action swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Action.class + " with value " + swigValue);
    }

    private Action(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Action(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Action(String swigName, Action swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Action[] swigValues = { Action_None, Action_LeftKeyPress, Action_RightKeyPress, Action_BackKeyPress, Action_PgUpKeyPress, Action_PgDnKeyPress, Action_VolumeUp, Action_VolumeDown, Action_Mute, Action_NextTrack, Action_PrevTrack, Action_PlayPause, Action_Stop, Action_ToggleTabs };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
