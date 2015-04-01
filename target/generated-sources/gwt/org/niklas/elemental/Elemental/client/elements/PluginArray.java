package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "PluginArray"
)
interface PluginArray {
  @JsProperty
  int getLength();

  boolean refresh(boolean reload);

  int item(int index);

  String namedItem(String name);
}
