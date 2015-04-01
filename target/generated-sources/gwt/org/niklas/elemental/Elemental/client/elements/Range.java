package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Range"
)
interface Range {
  @JsProperty
  Node getStartContainer();

  @JsProperty
  int getStartOffset();

  @JsProperty
  Node getEndContainer();

  @JsProperty
  int getEndOffset();

  @JsProperty
  boolean getCollapsed();

  @JsProperty
  Node getCommonAncestorContainer();

  int setStart(Node node, int offset);

  int setEnd(Node node, int offset);

  Node setStartBefore(Node node);

  Node setStartAfter(Node node);

  Node setEndBefore(Node node);

  Node setEndAfter(Node node);

  boolean collapse(boolean toStart);

  Node selectNode(Node node);

  Node selectNodeContents(Node node);

  Range compareBoundaryPoints(short how, Range sourceRange);

  void deleteContents();

  DocumentFragment extractContents();

  DocumentFragment cloneContents();

  Node insertNode(Node node);

  Node surroundContents(Node newParent);

  Range cloneRange();

  void detach();

  int isPointInRange(Node node, int offset);

  int comparePoint(Node node, int offset);

  Node intersectsNode(Node node);
}
