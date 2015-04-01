package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "FunctionStringCallback"
)
interface FunctionStringCallback {
  void run(String data);
}
