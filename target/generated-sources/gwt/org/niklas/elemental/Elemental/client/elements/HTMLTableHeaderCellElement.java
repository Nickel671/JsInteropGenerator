package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTableHeaderCellElement"
)
interface HTMLTableHeaderCellElement extends HTMLTableCellElement {
  @JsProperty
  String getScope();

  @JsProperty
  void setScope(String value);

  @JsProperty
  String getAbbr();

  @JsProperty
  void setAbbr(String value);

  @JsProperty
  String getSorted();

  @JsProperty
  void setSorted(String value);

  void sort();
}
