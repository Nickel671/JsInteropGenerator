package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DataTransferItem"
)
interface DataTransferItem {
  @JsProperty
  String getKind();

  @JsProperty
  String getType();

  void getAsString(FunctionStringCallback _callback);
}
