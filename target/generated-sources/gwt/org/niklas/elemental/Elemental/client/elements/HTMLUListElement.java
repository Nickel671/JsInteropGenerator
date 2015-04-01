package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLUListElement"
)
interface HTMLUListElement extends HTMLElement {
  @JsProperty
  boolean getCompact();

  @JsProperty
  void setCompact(boolean value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);
}
