package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLAllCollection"
)
interface HTMLAllCollection extends HTMLCollection {
  Element item(int index);
}
