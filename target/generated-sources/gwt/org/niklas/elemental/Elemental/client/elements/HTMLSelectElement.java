package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLSelectElement"
)
interface HTMLSelectElement extends HTMLElement {
  @JsProperty
  String getAutocomplete();

  @JsProperty
  void setAutocomplete(String value);

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
  boolean getMultiple();

  @JsProperty
  void setMultiple(boolean value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  boolean getRequired();

  @JsProperty
  void setRequired(boolean value);

  @JsProperty
  int getSize();

  @JsProperty
  void setSize(int value);

  @JsProperty
  String getType();

  @JsProperty
  HTMLOptionsCollection getOptions();

  @JsProperty
  int getLength();

  @JsProperty
  void setLength(int value);

  @JsProperty
  HTMLCollection getSelectedOptions();

  @JsProperty
  int getSelectedIndex();

  @JsProperty
  void setSelectedIndex(int value);

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

  int item(int index);

  String namedItem(String name);

  void remove();

  int remove(int index);

  boolean checkValidity();

  boolean reportValidity();

  String setCustomValidity(String error);
}
