package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "ElementContentEditable"
)
interface ElementContentEditable {
  @JsProperty
  String getContentEditable();

  @JsProperty
  void setContentEditable(String value);

  @JsProperty
  boolean getIsContentEditable();
}
