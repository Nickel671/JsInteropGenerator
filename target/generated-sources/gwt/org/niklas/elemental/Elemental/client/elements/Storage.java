package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Storage"
)
interface Storage {
  @JsProperty
  int getLength();

  int key(int index);

  String getItem(String key);

  String setItem(String key, String value);

  String removeItem(String key);

  void clear();
}
