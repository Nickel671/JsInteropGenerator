package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "PortCollection"
)
interface PortCollection {
  void add(MessagePort port);

  void remove(MessagePort port);

  void clear();

  void iterate(PortCollectionCallback callback);
}
