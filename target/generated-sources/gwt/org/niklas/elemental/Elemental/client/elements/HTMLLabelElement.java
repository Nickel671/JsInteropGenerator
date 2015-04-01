package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLLabelElement"
)
interface HTMLLabelElement extends HTMLElement {
  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getHtmlFor();

  @JsProperty
  void setHtmlFor(String value);

  @JsProperty
  HTMLElement getControl();
}
