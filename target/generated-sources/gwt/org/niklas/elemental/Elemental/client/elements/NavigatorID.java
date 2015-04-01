package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NavigatorID"
)
interface NavigatorID {
  @JsProperty
  String getAppCodeName();

  @JsProperty
  String getAppName();

  @JsProperty
  String getAppVersion();

  @JsProperty
  String getPlatform();

  @JsProperty
  String getProduct();

  @JsProperty
  String getUserAgent();

  @JsProperty
  String getVendorSub();

  boolean taintEnabled();
}
