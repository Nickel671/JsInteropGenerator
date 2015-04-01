package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLBodyElement"
)
interface HTMLBodyElement extends HTMLElement, WindowEventHandlers {
  @JsProperty
  String getText();

  @JsProperty
  void setText(String value);

  @JsProperty
  String getLink();

  @JsProperty
  void setLink(String value);

  @JsProperty
  String getVLink();

  @JsProperty
  void setVLink(String value);

  @JsProperty
  String getALink();

  @JsProperty
  void setALink(String value);

  @JsProperty
  String getBgColor();

  @JsProperty
  void setBgColor(String value);

  @JsProperty
  String getBackground();

  @JsProperty
  void setBackground(String value);
}
