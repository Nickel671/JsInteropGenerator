package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLDetailsElement"
)
interface HTMLDetailsElement extends HTMLElement {
  @JsProperty
  boolean getOpen();

  @JsProperty
  void setOpen(boolean value);
}
