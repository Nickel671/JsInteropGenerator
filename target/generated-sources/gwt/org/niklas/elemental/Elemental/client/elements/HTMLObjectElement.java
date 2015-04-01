package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLObjectElement"
)
interface HTMLObjectElement extends HTMLElement {
  @JsProperty
  String getData();

  @JsProperty
  void setData(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  boolean getTypeMustMatch();

  @JsProperty
  void setTypeMustMatch(boolean value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getUseMap();

  @JsProperty
  void setUseMap(String value);

  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);

  @JsProperty
  String getHeight();

  @JsProperty
  void setHeight(String value);

  @JsProperty
  Document getContentDocument();

  @JsProperty
  boolean getWillValidate();

  @JsProperty
  ValidityState getValidity();

  @JsProperty
  String getValidationMessage();

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getArchive();

  @JsProperty
  void setArchive(String value);

  @JsProperty
  String getCode();

  @JsProperty
  void setCode(String value);

  @JsProperty
  boolean getDeclare();

  @JsProperty
  void setDeclare(boolean value);

  @JsProperty
  int getHspace();

  @JsProperty
  void setHspace(int value);

  @JsProperty
  String getStandby();

  @JsProperty
  void setStandby(String value);

  @JsProperty
  int getVspace();

  @JsProperty
  void setVspace(int value);

  @JsProperty
  String getCodeBase();

  @JsProperty
  void setCodeBase(String value);

  @JsProperty
  String getCodeType();

  @JsProperty
  void setCodeType(String value);

  @JsProperty
  String getBorder();

  @JsProperty
  void setBorder(String value);

  Document getSVGDocument();

  boolean checkValidity();

  boolean reportValidity();

  void setCustomValidity(String error);
}
