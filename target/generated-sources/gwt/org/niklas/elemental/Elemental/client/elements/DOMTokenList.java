package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DOMTokenList"
)
interface DOMTokenList {
  @JsProperty
  int getLength();

  int item(int index);

  String contains(String token);

  String add(String tokens);

  String remove(String tokens);

  boolean toggle(String token, boolean force);
}
