package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTableSectionElement"
)
interface HTMLTableSectionElement extends HTMLElement {
  @JsProperty
  HTMLCollection getRows();

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getCh();

  @JsProperty
  void setCh(String value);

  @JsProperty
  String getChOff();

  @JsProperty
  void setChOff(String value);

  @JsProperty
  String getVAlign();

  @JsProperty
  void setVAlign(String value);

  int insertRow(int index);

  int deleteRow(int index);
}
