package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLPropertiesCollection"
)
interface HTMLPropertiesCollection extends HTMLCollection {
  String namedItem(String name);
}
