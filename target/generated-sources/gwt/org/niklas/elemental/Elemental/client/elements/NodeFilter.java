package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NodeFilter"
)
interface NodeFilter {
  Node acceptNode(Node node);
}
