package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLOptGroupElement"
)
interface HTMLOptGroupElement extends HTMLElement {
  @JsProperty
  boolean getDisabled();

  @JsProperty
  void setDisabled(boolean value);

  @JsProperty
  String getLabel();

  @JsProperty
  void setLabel(String value);
}
