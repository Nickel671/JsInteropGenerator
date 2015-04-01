package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "CloseEvent"
)
interface CloseEvent extends Event {
  @JsProperty
  boolean getWasClean();

  @JsProperty
  short getCode();

  @JsProperty
  String getReason();
}
