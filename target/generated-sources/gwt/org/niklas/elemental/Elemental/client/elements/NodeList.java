package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NodeList"
)
interface NodeList {
  @JsProperty
  int getLength();

  Node item(int index);
}
