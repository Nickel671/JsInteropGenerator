package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLHRElement"
)
interface HTMLHRElement extends HTMLElement {
  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getColor();

  @JsProperty
  void setColor(String value);

  @JsProperty
  boolean getNoShade();

  @JsProperty
  void setNoShade(boolean value);

  @JsProperty
  String getSize();

  @JsProperty
  void setSize(String value);

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);
}
