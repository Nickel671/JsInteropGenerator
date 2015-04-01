package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NavigatorOnLine"
)
interface NavigatorOnLine {
  @JsProperty
  boolean getOnLine();
}
