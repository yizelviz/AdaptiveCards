/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class AdaptiveCard {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected AdaptiveCard(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdaptiveCard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_AdaptiveCard(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AdaptiveCard() {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_0(), true);
  }

  public AdaptiveCard(String version, String minVersion, String fallbackText, String backgroundImageUrl) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_1(version, minVersion, fallbackText, backgroundImageUrl), true);
  }

  public AdaptiveCard(String version, String minVersion, String fallbackText, String backgroundImageUrl, BaseCardElementVector body, BaseActionElementVector actions) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_2(version, minVersion, fallbackText, backgroundImageUrl, BaseCardElementVector.getCPtr(body), body, BaseActionElementVector.getCPtr(actions), actions), true);
  }

  public String GetVersion() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetVersion(swigCPtr, this);
  }

  public void SetVersion(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetVersion(swigCPtr, this, value);
  }

  public String GetMinVersion() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetMinVersion(swigCPtr, this);
  }

  public void SetMinVersion(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetMinVersion(swigCPtr, this, value);
  }

  public String GetFallbackText() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetFallbackText(swigCPtr, this);
  }

  public void SetFallbackText(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetFallbackText(swigCPtr, this, value);
  }

  public String GetBackgroundImageUrl() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetBackgroundImageUrl(swigCPtr, this);
  }

  public void SetBackgroundImageUrl(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetBackgroundImageUrl(swigCPtr, this, value);
  }

  public BaseCardElementVector GetBody() {
    return new BaseCardElementVector(AdaptiveCardObjectModelJNI.AdaptiveCard_GetBody__SWIG_0(swigCPtr, this), false);
  }

  public BaseActionElementVector GetActions() {
    return new BaseActionElementVector(AdaptiveCardObjectModelJNI.AdaptiveCard_GetActions(swigCPtr, this), false);
  }

  public CardElementType GetElementType() {
    return CardElementType.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetElementType(swigCPtr, this));
  }

  public static AdaptiveCard DeserializeFromFile(String jsonFile) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromFile(jsonFile);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard Deserialize(SWIGTYPE_p_Json__Value json) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(json));
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public static AdaptiveCard DeserializeFromString(String jsonString) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromString(jsonString);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.AdaptiveCard_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_Serialize(swigCPtr, this);
  }

}
