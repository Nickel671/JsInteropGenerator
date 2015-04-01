package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NamedNodeMap"
)
interface NamedNodeMap {
  @JsProperty
  int getLength();

  int item(int index);

  String getNamedItem(String name);

  String getNamedItemNS(String namespace, String localName);

  Attr setNamedItem(Attr attr);

  Attr setNamedItemNS(Attr attr);

  String removeNamedItem(String name);

  String removeNamedItemNS(String namespace, String localName);
}
