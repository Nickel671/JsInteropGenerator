package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLFieldSetElement"
)
interface HTMLFieldSetElement extends HTMLElement {
  @JsProperty
  boolean getDisabled();

  @JsProperty
  void setDisabled(boolean value);

  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getType();

  @JsProperty
  HTMLFormControlsCollection getElements();

  @JsProperty
  boolean getWillValidate();

  @JsProperty
  ValidityState getValidity();

  @JsProperty
  String getValidationMessage();

  boolean checkValidity();

  boolean reportValidity();

  String setCustomValidity(String error);
}
