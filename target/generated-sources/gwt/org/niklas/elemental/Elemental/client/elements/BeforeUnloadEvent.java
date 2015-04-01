package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "BeforeUnloadEvent"
)
interface BeforeUnloadEvent extends Event {
  @JsProperty
  String getReturnValue();

  @JsProperty
  void setReturnValue(String value);
}
