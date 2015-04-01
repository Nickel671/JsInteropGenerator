package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLInputElement"
)
interface HTMLInputElement extends HTMLElement {
  @JsProperty
  String getAccept();

  @JsProperty
  void setAccept(String value);

  @JsProperty
  String getAlt();

  @JsProperty
  void setAlt(String value);

  @JsProperty
  String getAutocomplete();

  @JsProperty
  void setAutocomplete(String value);

  @JsProperty
  boolean getAutofocus();

  @JsProperty
  void setAutofocus(boolean value);

  @JsProperty
  boolean getDefaultChecked();

  @JsProperty
  void setDefaultChecked(boolean value);

  @JsProperty
  boolean getChecked();

  @JsProperty
  void setChecked(boolean value);

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
  int getHeight();

  @JsProperty
  void setHeight(int value);

  @JsProperty
  boolean getIndeterminate();

  @JsProperty
  void setIndeterminate(boolean value);

  @JsProperty
  String getInputMode();

  @JsProperty
  void setInputMode(String value);

  @JsProperty
  HTMLElement getList();

  @JsProperty
  String getMax();

  @JsProperty
  void setMax(String value);

  @JsProperty
  int getMaxLength();

  @JsProperty
  void setMaxLength(int value);

  @JsProperty
  String getMin();

  @JsProperty
  void setMin(String value);

  @JsProperty
  int getMinLength();

  @JsProperty
  void setMinLength(int value);

  @JsProperty
  boolean getMultiple();

  @JsProperty
  void setMultiple(boolean value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getPattern();

  @JsProperty
  void setPattern(String value);

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
  int getSize();

  @JsProperty
  void setSize(int value);

  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getStep();

  @JsProperty
  void setStep(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  String getDefaultValue();

  @JsProperty
  void setDefaultValue(String value);

  @JsProperty
  String getValue();

  @JsProperty
  void setValue(String value);

  @JsProperty
  double getValueAsNumber();

  @JsProperty
  void setValueAsNumber(double value);

  @JsProperty
  double getValueLow();

  @JsProperty
  void setValueLow(double value);

  @JsProperty
  double getValueHigh();

  @JsProperty
  void setValueHigh(double value);

  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int value);

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

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getUseMap();

  @JsProperty
  void setUseMap(String value);

  void stepUp(int n);

  void stepDown(int n);

  boolean checkValidity();

  boolean reportValidity();

  void setCustomValidity(String error);

  void select();

  void setRangeText(String replacement);

  void setRangeText(String replacement, int start, int end, String selectionMode);

  void setSelectionRange(int start, int end, String direction);
}
