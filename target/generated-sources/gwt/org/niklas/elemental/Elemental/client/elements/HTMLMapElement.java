package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLMapElement"
)
interface HTMLMapElement extends HTMLElement {
  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  HTMLCollection getAreas();

  @JsProperty
  HTMLCollection getImages();
}
