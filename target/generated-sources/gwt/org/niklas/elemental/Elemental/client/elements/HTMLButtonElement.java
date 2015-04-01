package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLButtonElement"
)
interface HTMLButtonElement extends HTMLElement {
  @JsProperty
  boolean getAutofocus();

  @JsProperty
  void setAutofocus(boolean value);

  @JsProperty
  boolean getDisabled();

  @JsProperty
  void setDisabled(boolean value);

  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getFormAction();

  @JsProperty
  void setFormAction(String value);

  @JsProperty
  String getFormEnctype();

  @JsProperty
  void setFormEnctype(String value);

  @JsProperty
  String getFormMethod();

  @JsProperty
  void setFormMethod(String value);

  @JsProperty
  boolean getFormNoValidate();

  @JsProperty
  void setFormNoValidate(boolean value);

  @JsProperty
  String getFormTarget();

  @JsProperty
  void setFormTarget(String value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  String getValue();

  @JsProperty
  void setValue(String value);

  @JsProperty
  HTMLMenuElement getMenu();

  @JsProperty
  void setMenu(HTMLMenuElement value);

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
