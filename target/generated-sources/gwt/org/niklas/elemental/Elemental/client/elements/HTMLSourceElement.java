package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLSourceElement"
)
interface HTMLSourceElement extends HTMLElement {
  @JsProperty
  String getSrcset();

  @JsProperty
  void setSrcset(String value);

  @JsProperty
  String getSizes();

  @JsProperty
  void setSizes(String value);

  @JsProperty
  String getMedia();

  @JsProperty
  void setMedia(String value);

  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);
}
