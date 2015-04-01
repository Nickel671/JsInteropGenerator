package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTableElement"
)
interface HTMLTableElement extends HTMLElement {
  @JsProperty
  HTMLTableCaptionElement getCaption();

  @JsProperty
  void setCaption(HTMLTableCaptionElement value);

  @JsProperty
  HTMLTableSectionElement getTHead();

  @JsProperty
  void setTHead(HTMLTableSectionElement value);

  @JsProperty
  HTMLTableSectionElement getTFoot();

  @JsProperty
  void setTFoot(HTMLTableSectionElement value);

  @JsProperty
  HTMLCollection getTBodies();

  @JsProperty
  HTMLCollection getRows();

  @JsProperty
  boolean getSortable();

  @JsProperty
  void setSortable(boolean value);

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getBorder();

  @JsProperty
  void setBorder(String value);

  @JsProperty
  String getFrame();

  @JsProperty
  void setFrame(String value);

  @JsProperty
  String getRules();

  @JsProperty
  void setRules(String value);

  @JsProperty
  String getSummary();

  @JsProperty
  void setSummary(String value);

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);

  @JsProperty
  String getBgColor();

  @JsProperty
  void setBgColor(String value);

  @JsProperty
  String getCellPadding();

  @JsProperty
  void setCellPadding(String value);

  @JsProperty
  String getCellSpacing();

  @JsProperty
  void setCellSpacing(String value);

  HTMLElement createCaption();

  void deleteCaption();

  HTMLElement createTHead();

  void deleteTHead();

  HTMLElement createTFoot();

  void deleteTFoot();

  HTMLElement createTBody();

  int insertRow(int index);

  int deleteRow(int index);

  void stopSorting();
}
