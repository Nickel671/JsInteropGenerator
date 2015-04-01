package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLLIElement"
)
interface HTMLLIElement extends HTMLElement {
  @JsProperty
  int getValue();

  @JsProperty
  void setValue(int value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);
}
