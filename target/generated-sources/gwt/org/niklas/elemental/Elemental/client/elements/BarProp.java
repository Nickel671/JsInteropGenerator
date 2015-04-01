package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "BarProp"
)
interface BarProp {
  @JsProperty
  boolean getVisible();

  @JsProperty
  void setVisible(boolean value);
}
