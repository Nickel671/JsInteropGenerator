package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Element"
)
interface Element extends ParentNode, NonDocumentTypeChildNode, ChildNode, Node {
  @JsProperty
  String getNamespaceURI();

  @JsProperty
  String getPrefix();

  @JsProperty
  String getLocalName();

  @JsProperty
  String getTagName();

  @JsProperty
  String getId();

  @JsProperty
  void setId(String value);

  @JsProperty
  String getClassName();

  @JsProperty
  void setClassName(String value);

  @JsProperty
  DOMTokenList getClassList();

  @JsProperty
  NamedNodeMap getAttributes();

  boolean hasAttributes();

  String getAttribute(String name);

  String getAttributeNS(String namespace, String localName);

  void setAttribute(String name, String value);

  void setAttributeNS(String namespace, String name, String value);

  void removeAttribute(String name);

  void removeAttributeNS(String namespace, String localName);

  boolean hasAttribute(String name);

  boolean hasAttributeNS(String namespace, String localName);

  Attr getAttributeNode(String name);

  Attr getAttributeNodeNS(String namespace, String localName);

  Attr setAttributeNode(Attr attr);

  Attr setAttributeNodeNS(Attr attr);

  Attr removeAttributeNode(Attr attr);

  Element closest(String selectors);

  boolean matches(String selectors);

  HTMLCollection getElementsByTagName(String localName);

  HTMLCollection getElementsByTagNameNS(String namespace, String localName);

  HTMLCollection getElementsByClassName(String classNames);
}
