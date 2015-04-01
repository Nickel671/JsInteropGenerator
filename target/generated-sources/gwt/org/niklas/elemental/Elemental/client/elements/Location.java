package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Location"
)
interface Location {
  void assign(String url);

  void replace(String url);

  void reload();
}
