package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLAllCollection"
)
interface HTMLAllCollection extends HTMLCollection {
  int item(int index);

  String item(String name);

  String namedItem(String name);
}
