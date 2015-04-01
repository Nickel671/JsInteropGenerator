package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "PortCollectionCallback"
)
interface PortCollectionCallback {
  void run(MessagePort port);
}
