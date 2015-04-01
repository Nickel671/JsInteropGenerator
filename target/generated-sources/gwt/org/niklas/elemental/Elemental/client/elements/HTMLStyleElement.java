package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLStyleElement"
)
interface HTMLStyleElement extends HTMLElement {
  @JsProperty
  String getMedia();

  @JsProperty
  void setMedia(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  boolean getScoped();

  @JsProperty
  void setScoped(boolean value);
}
