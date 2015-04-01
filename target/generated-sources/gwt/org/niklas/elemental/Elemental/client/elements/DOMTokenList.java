package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DOMTokenList"
)
interface DOMTokenList {
  @JsProperty
  int getLength();

  String item(int index);

  boolean contains(String token);

  void add(String tokens);

  void remove(String tokens);

  boolean toggle(String token, boolean force);
}
