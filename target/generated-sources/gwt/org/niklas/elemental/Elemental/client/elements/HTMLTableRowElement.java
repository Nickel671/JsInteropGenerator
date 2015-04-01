package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTableRowElement"
)
interface HTMLTableRowElement extends HTMLElement {
  @JsProperty
  int getRowIndex();

  @JsProperty
  int getSectionRowIndex();

  @JsProperty
  HTMLCollection getCells();

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

  @JsProperty
  String getBgColor();

  @JsProperty
  void setBgColor(String value);

  HTMLElement insertCell(int index);

  void deleteCell(int index);
}
