package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLImageElement"
)
interface HTMLImageElement extends HTMLElement {
  @JsProperty
  String getAlt();

  @JsProperty
  void setAlt(String value);

  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getSrcset();

  @JsProperty
  void setSrcset(String value);

  @JsProperty
  String getSizes();

  @JsProperty
  void setSizes(String value);

  @JsProperty
  String getCrossOrigin();

  @JsProperty
  void setCrossOrigin(String value);

  @JsProperty
  String getUseMap();

  @JsProperty
  void setUseMap(String value);

  @JsProperty
  boolean getIsMap();

  @JsProperty
  void setIsMap(boolean value);

  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int value);

  @JsProperty
  int getHeight();

  @JsProperty
  void setHeight(int value);

  @JsProperty
  int getNaturalWidth();

  @JsProperty
  int getNaturalHeight();

  @JsProperty
  boolean getComplete();

  @JsProperty
  String getCurrentSrc();

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getLowsrc();

  @JsProperty
  void setLowsrc(String value);

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  int getHspace();

  @JsProperty
  void setHspace(int value);

  @JsProperty
  int getVspace();

  @JsProperty
  void setVspace(int value);

  @JsProperty
  String getLongDesc();

  @JsProperty
  void setLongDesc(String value);

  @JsProperty
  String getBorder();

  @JsProperty
  void setBorder(String value);
}
