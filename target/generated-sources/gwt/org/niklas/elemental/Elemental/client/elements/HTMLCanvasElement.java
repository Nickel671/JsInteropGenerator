package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLCanvasElement"
)
interface HTMLCanvasElement extends HTMLElement {
  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int value);

  @JsProperty
  int getHeight();

  @JsProperty
  void setHeight(int value);

  CanvasProxy transferControlToProxy();
}
