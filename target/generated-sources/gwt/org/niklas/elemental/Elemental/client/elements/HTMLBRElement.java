package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLBRElement"
)
interface HTMLBRElement extends HTMLElement {
  @JsProperty
  String getClear();

  @JsProperty
  void setClear(String value);
}
