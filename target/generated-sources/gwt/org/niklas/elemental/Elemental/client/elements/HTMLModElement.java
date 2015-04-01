package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLModElement"
)
interface HTMLModElement extends HTMLElement {
  @JsProperty
  String getCite();

  @JsProperty
  void setCite(String value);

  @JsProperty
  String getDateTime();

  @JsProperty
  void setDateTime(String value);
}
