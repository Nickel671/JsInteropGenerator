package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLLegendElement"
)
interface HTMLLegendElement extends HTMLElement {
  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);
}
