package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTableDataCellElement"
)
interface HTMLTableDataCellElement extends HTMLTableCellElement {
  @JsProperty
  String getAbbr();

  @JsProperty
  void setAbbr(String value);
}
