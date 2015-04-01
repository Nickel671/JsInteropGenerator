package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLTextAreaElement"
)
interface HTMLTextAreaElement extends HTMLElement {
  @JsProperty
  String getAutocomplete();

  @JsProperty
  void setAutocomplete(String value);

  @JsProperty
  boolean getAutofocus();

  @JsProperty
  void setAutofocus(boolean value);

  @JsProperty
  int getCols();

  @JsProperty
  void setCols(int value);

  @JsProperty
  String getDirName();

  @JsProperty
  void setDirName(String value);

  @JsProperty
  boolean getDisabled();

  @JsProperty
  void setDisabled(boolean value);

  @JsProperty
  HTMLFormElement getForm();

  @JsProperty
  String getInputMode();

  @JsProperty
  void setInputMode(String value);

  @JsProperty
  int getMaxLength();

  @JsProperty
  void setMaxLength(int value);

  @JsProperty
  int getMinLength();

  @JsProperty
  void setMinLength(int value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getPlaceholder();

  @JsProperty
  void setPlaceholder(String value);

  @JsProperty
  boolean getReadOnly();

  @JsProperty
  void setReadOnly(boolean value);

  @JsProperty
  boolean getRequired();

  @JsProperty
  void setRequired(boolean value);

  @JsProperty
  int getRows();

  @JsProperty
  void setRows(int value);

  @JsProperty
  String getWrap();

  @JsProperty
  void setWrap(String value);

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
  int getTextLength();

  @JsProperty
  boolean getWillValidate();

  @JsProperty
  ValidityState getValidity();

  @JsProperty
  String getValidationMessage();

  @JsProperty
  NodeList getLabels();

  @JsProperty
  int getSelectionStart();

  @JsProperty
  void setSelectionStart(int value);

  @JsProperty
  int getSelectionEnd();

  @JsProperty
  void setSelectionEnd(int value);

  @JsProperty
  String getSelectionDirection();

  @JsProperty
  void setSelectionDirection(String value);

  boolean checkValidity();

  boolean reportValidity();

  void setCustomValidity(String error);

  void select();

  void setRangeText(String replacement);

  void setRangeText(String replacement, int start, int end, String selectionMode);

  void setSelectionRange(int start, int end, String direction);
}
