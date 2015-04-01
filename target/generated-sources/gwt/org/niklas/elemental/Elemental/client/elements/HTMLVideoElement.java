package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLVideoElement"
)
interface HTMLVideoElement extends HTMLMediaElement {
  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int value);

  @JsProperty
  int getHeight();

  @JsProperty
  void setHeight(int value);

  @JsProperty
  int getVideoWidth();

  @JsProperty
  int getVideoHeight();

  @JsProperty
  String getPoster();

  @JsProperty
  void setPoster(String value);
}
