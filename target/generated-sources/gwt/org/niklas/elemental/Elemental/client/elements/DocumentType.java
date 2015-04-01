package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DocumentType"
)
interface DocumentType extends ChildNode, Node {
  @JsProperty
  String getName();

  @JsProperty
  String getPublicId();

  @JsProperty
  String getSystemId();
}
