package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLAppletElement"
)
interface HTMLAppletElement extends HTMLElement {
  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getAlt();

  @JsProperty
  void setAlt(String value);

  @JsProperty
  String getArchive();

  @JsProperty
  void setArchive(String value);

  @JsProperty
  String getCode();

  @JsProperty
  void setCode(String value);

  @JsProperty
  String getCodeBase();

  @JsProperty
  void setCodeBase(String value);

  @JsProperty
  String getHeight();

  @JsProperty
  void setHeight(String value);

  @JsProperty
  int getHspace();

  @JsProperty
  void setHspace(int value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String get_object();

  @JsProperty
  void set_object(String value);

  @JsProperty
  int getVspace();

  @JsProperty
  void setVspace(int value);

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);
}
