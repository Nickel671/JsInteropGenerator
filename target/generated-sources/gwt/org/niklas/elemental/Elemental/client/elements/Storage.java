package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Storage"
)
interface Storage {
  @JsProperty
  int getLength();

  String key(int index);

  String getItem(String key);

  void setItem(String key, String value);

  void removeItem(String key);

  void clear();
}
