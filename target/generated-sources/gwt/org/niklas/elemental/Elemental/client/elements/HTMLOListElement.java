package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLOListElement"
)
interface HTMLOListElement extends HTMLElement {
  @JsProperty
  boolean getReversed();

  @JsProperty
  void setReversed(boolean value);

  @JsProperty
  int getStart();

  @JsProperty
  void setStart(int value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  boolean getCompact();

  @JsProperty
  void setCompact(boolean value);
}
