package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLPreElement"
)
interface HTMLPreElement extends HTMLElement {
  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int value);
}
