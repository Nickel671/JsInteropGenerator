package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTableColElement"
)
interface HTMLTableColElement extends HTMLElement {
  @JsProperty
  int getSpan();

  @JsProperty
  void setSpan(int value);

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getCh();

  @JsProperty
  void setCh(String value);

  @JsProperty
  String getChOff();

  @JsProperty
  void setChOff(String value);

  @JsProperty
  String getVAlign();

  @JsProperty
  void setVAlign(String value);

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);
}
