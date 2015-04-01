package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NonElementParentNode"
)
interface NonElementParentNode {
  Element getElementById(String elementId);
}
