package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLOptionElement"
)
interface HTMLOptionElement extends HTMLElement {
  @JsProperty
  boolean getDisabled();

  @JsProperty
  void setDisabled(boolean value);

  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getLabel();

  @JsProperty
  void setLabel(String value);

  @JsProperty
  boolean getDefaultSelected();

  @JsProperty
  void setDefaultSelected(boolean value);

  @JsProperty
  boolean getSelected();

  @JsProperty
  void setSelected(boolean value);

  @JsProperty
  String getValue();

  @JsProperty
  void setValue(String value);

  @JsProperty
  String getText();

  @JsProperty
  void setText(String value);

  @JsProperty
  int getIndex();
}
