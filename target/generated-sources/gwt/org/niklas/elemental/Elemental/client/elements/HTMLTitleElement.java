package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTitleElement"
)
interface HTMLTitleElement extends HTMLElement {
  @JsProperty
  String getText();

  @JsProperty
  void setText(String value);
}
