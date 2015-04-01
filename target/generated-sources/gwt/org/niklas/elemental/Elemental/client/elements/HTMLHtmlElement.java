package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLHtmlElement"
)
interface HTMLHtmlElement extends HTMLElement {
  @JsProperty
  String getVersion();

  @JsProperty
  void setVersion(String value);
}
