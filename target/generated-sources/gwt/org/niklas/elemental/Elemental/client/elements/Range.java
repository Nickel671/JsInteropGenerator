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

  void setStart(Node node, int offset);

  void setEnd(Node node, int offset);

  void setStartBefore(Node node);

  void setStartAfter(Node node);

  void setEndBefore(Node node);

  void setEndAfter(Node node);

  void collapse(boolean toStart);

  void selectNode(Node node);

  void selectNodeContents(Node node);

  short compareBoundaryPoints(short how, Range sourceRange);

  void deleteContents();

  DocumentFragment extractContents();

  DocumentFragment cloneContents();

  void insertNode(Node node);

  void surroundContents(Node newParent);

  Range cloneRange();

  void detach();

  boolean isPointInRange(Node node, int offset);

  short comparePoint(Node node, int offset);

  boolean intersectsNode(Node node);
}
