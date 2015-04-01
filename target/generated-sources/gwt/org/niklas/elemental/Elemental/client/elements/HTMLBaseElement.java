package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLBaseElement"
)
interface HTMLBaseElement extends HTMLElement {
  @JsProperty
  String getHref();

  @JsProperty
  void setHref(String value);

  @JsProperty
  String getTarget();

  @JsProperty
  void setTarget(String value);
}
