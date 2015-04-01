package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MutationCallback"
)
interface MutationCallback {
  void run(MutationRecord mutations, MutationObserver observer);
}
