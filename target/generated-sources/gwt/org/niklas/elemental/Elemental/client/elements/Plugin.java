package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Plugin"
)
interface Plugin {
  @JsProperty
  String getName();

  @JsProperty
  String getDescription();

  @JsProperty
  String getFilename();

  @JsProperty
  int getLength();

  int item(int index);

  String namedItem(String name);
}
