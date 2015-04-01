package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLKeygenElement"
)
interface HTMLKeygenElement extends HTMLElement {
  @JsProperty
  boolean getAutofocus();

  @JsProperty
  void setAutofocus(boolean value);

  @JsProperty
  String getChallenge();

  @JsProperty
  void setChallenge(String value);

  @JsProperty
  boolean getDisabled();

  @JsProperty
  void setDisabled(boolean value);

  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getKeytype();

  @JsProperty
  void setKeytype(String value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getType();

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

  void setCustomValidity(String error);
}
