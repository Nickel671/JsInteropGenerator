package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NodeIterator"
)
interface NodeIterator {
  @JsProperty
  Node getRoot();

  @JsProperty
  Node getReferenceNode();

  @JsProperty
  boolean getPointerBeforeReferenceNode();

  @JsProperty
  int getWhatToShow();

  @JsProperty
  NodeFilter getFilter();

  Node nextNode();

  Node previousNode();

  void detach();
}
