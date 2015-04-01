package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLOutputElement"
)
interface HTMLOutputElement extends HTMLElement {
  @JsProperty
  DOMSettableTokenList getHtmlFor();

  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getType();

  @JsProperty
  String getDefaultValue();

  @JsProperty
  void setDefaultValue(String value);

  @JsProperty
  String getValue();

  @JsProperty
  void setValue(String value);

  @JsProperty
  boolean getWillValidate();

  @JsProperty
  ValidityState getValidity();

  @JsProperty
  String getValidationMessage();

  @JsProperty
  NodeList getLabels();

  boolean checkValidity();

  boolean reportValidity();

  String setCustomValidity(String error);
}
