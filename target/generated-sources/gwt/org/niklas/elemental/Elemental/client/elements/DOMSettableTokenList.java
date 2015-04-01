package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DOMSettableTokenList"
)
interface DOMSettableTokenList extends DOMTokenList {
  @JsProperty
  String getValue();

  @JsProperty
  void setValue(String value);
}
