package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLMenuElement"
)
interface HTMLMenuElement extends HTMLElement {
  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  String getLabel();

  @JsProperty
  void setLabel(String value);

  @JsProperty
  boolean getCompact();

  @JsProperty
  void setCompact(boolean value);
}
