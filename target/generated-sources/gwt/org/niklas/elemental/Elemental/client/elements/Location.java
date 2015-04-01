package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Location"
)
interface Location {
  String assign(String url);

  String replace(String url);

  void reload();
}
