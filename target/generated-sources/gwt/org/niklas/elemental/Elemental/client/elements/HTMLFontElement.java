package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLFontElement"
)
interface HTMLFontElement extends HTMLElement {
  @JsProperty
  String getColor();

  @JsProperty
  void setColor(String value);

  @JsProperty
  String getFace();

  @JsProperty
  void setFace(String value);

  @JsProperty
  String getSize();

  @JsProperty
  void setSize(String value);
}
