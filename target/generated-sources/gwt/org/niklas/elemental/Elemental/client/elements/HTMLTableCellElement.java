package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTableCellElement"
)
interface HTMLTableCellElement extends HTMLElement {
  @JsProperty
  int getColSpan();

  @JsProperty
  void setColSpan(int value);

  @JsProperty
  int getRowSpan();

  @JsProperty
  void setRowSpan(int value);

  @JsProperty
  DOMSettableTokenList getHeaders();

  @JsProperty
  int getCellIndex();

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getAxis();

  @JsProperty
  void setAxis(String value);

  @JsProperty
  String getHeight();

  @JsProperty
  void setHeight(String value);

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);

  @JsProperty
  String getCh();

  @JsProperty
  void setCh(String value);

  @JsProperty
  String getChOff();

  @JsProperty
  void setChOff(String value);

  @JsProperty
  boolean getNoWrap();

  @JsProperty
  void setNoWrap(boolean value);

  @JsProperty
  String getVAlign();

  @JsProperty
  void setVAlign(String value);

  @JsProperty
  String getBgColor();

  @JsProperty
  void setBgColor(String value);
}
