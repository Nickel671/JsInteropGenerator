package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DataTransferItemList"
)
interface DataTransferItemList {
  @JsProperty
  int getLength();

  String add(String data, String type);

  int remove(int index);

  void clear();
}
