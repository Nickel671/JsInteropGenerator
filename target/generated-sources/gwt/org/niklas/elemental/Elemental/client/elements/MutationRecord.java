package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MutationRecord"
)
interface MutationRecord {
  @JsProperty
  String getType();

  @JsProperty
  Node getTarget();

  @JsProperty
  NodeList getAddedNodes();

  @JsProperty
  NodeList getRemovedNodes();

  @JsProperty
  Node getPreviousSibling();

  @JsProperty
  Node getNextSibling();

  @JsProperty
  String getAttributeName();

  @JsProperty
  String getAttributeNamespace();

  @JsProperty
  String getOldValue();
}
