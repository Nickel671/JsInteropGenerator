package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "PluginArray"
)
interface PluginArray {
  @JsProperty
  int getLength();

  void refresh(boolean reload);

  Plugin item(int index);

  Plugin namedItem(String name);
}
