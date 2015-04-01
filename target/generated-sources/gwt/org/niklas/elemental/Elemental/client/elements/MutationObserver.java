package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MutationObserver"
)
interface MutationObserver {
  void disconnect();

  MutationRecord takeRecords();
}
