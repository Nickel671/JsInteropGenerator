package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Node"
)
interface Node extends EventTarget {
  @JsProperty
  short getNodeType();

  @JsProperty
  String getNodeName();

  @JsProperty
  String getBaseURI();

  @JsProperty
  Document getOwnerDocument();

  @JsProperty
  Node getParentNode();

  @JsProperty
  Element getParentElement();

  @JsProperty
  NodeList getChildNodes();

  @JsProperty
  Node getFirstChild();

  @JsProperty
  Node getLastChild();

  @JsProperty
  Node getPreviousSibling();

  @JsProperty
  Node getNextSibling();

  @JsProperty
  String getNodeValue();

  @JsProperty
  void setNodeValue(String value);

  @JsProperty
  String getTextContent();

  @JsProperty
  void setTextContent(String value);

  boolean hasChildNodes();

  void normalize();

  boolean cloneNode(boolean deep);

  Node isEqualNode(Node node);

  Node compareDocumentPosition(Node other);

  Node contains(Node other);

  String lookupPrefix(String namespace);

  String lookupNamespaceURI(String prefix);

  String isDefaultNamespace(String namespace);

  Node insertBefore(Node node, Node child);

  Node appendChild(Node node);

  Node replaceChild(Node node, Node child);

  Node removeChild(Node child);
}
