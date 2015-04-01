package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLMenuItemElement"
)
interface HTMLMenuItemElement extends HTMLElement {
  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  String getLabel();

  @JsProperty
  void setLabel(String value);

  @JsProperty
  String getIcon();

  @JsProperty
  void setIcon(String value);

  @JsProperty
  boolean getDisabled();

  @JsProperty
  void setDisabled(boolean value);

  @JsProperty
  boolean getChecked();

  @JsProperty
  void setChecked(boolean value);

  @JsProperty
  String getRadiogroup();

  @JsProperty
  void setRadiogroup(String value);

  @JsProperty
  boolean getDefault();

  @JsProperty
  void setDefault(boolean value);

  @JsProperty
  HTMLElement getCommand();
}
