package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "TreeWalker"
)
interface TreeWalker {
  @JsProperty
  Node getRoot();

  @JsProperty
  int getWhatToShow();

  @JsProperty
  NodeFilter getFilter();

  @JsProperty
  Node getCurrentNode();

  @JsProperty
  void setCurrentNode(Node value);

  Node parentNode();

  Node firstChild();

  Node lastChild();

  Node previousSibling();

  Node nextSibling();

  Node previousNode();

  Node nextNode();
}
