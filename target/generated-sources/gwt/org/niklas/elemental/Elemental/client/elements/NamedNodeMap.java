package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "NamedNodeMap"
)
interface NamedNodeMap {
  @JsProperty
  int getLength();

  Attr item(int index);

  Attr getNamedItem(String name);

  Attr getNamedItemNS(String namespace, String localName);

  Attr setNamedItem(Attr attr);

  Attr setNamedItemNS(Attr attr);

  Attr removeNamedItem(String name);

  Attr removeNamedItemNS(String namespace, String localName);
}
