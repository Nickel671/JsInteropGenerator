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

  String setAttribute(String name, String value);

  String setAttributeNS(String namespace, String name, String value);

  String removeAttribute(String name);

  String removeAttributeNS(String namespace, String localName);

  String hasAttribute(String name);

  String hasAttributeNS(String namespace, String localName);

  String getAttributeNode(String name);

  String getAttributeNodeNS(String namespace, String localName);

  Attr setAttributeNode(Attr attr);

  Attr setAttributeNodeNS(Attr attr);

  Attr removeAttributeNode(Attr attr);

  String closest(String selectors);

  String matches(String selectors);

  String getElementsByTagName(String localName);

  String getElementsByTagNameNS(String namespace, String localName);

  String getElementsByClassName(String classNames);
}
