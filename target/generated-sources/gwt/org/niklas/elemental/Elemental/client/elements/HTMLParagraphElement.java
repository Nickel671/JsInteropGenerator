package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLParagraphElement"
)
interface HTMLParagraphElement extends HTMLElement {
  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);
}
