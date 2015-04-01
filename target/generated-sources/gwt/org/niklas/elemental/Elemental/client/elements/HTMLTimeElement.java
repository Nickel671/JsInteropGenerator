package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTimeElement"
)
interface HTMLTimeElement extends HTMLElement {
  @JsProperty
  String getDateTime();

  @JsProperty
  void setDateTime(String value);
}
