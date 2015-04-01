package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "PortCollection"
)
interface PortCollection {
  MessagePort add(MessagePort port);

  MessagePort remove(MessagePort port);

  void clear();

  PortCollectionCallback iterate(PortCollectionCallback callback);
}
