package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLFormElement"
)
interface HTMLFormElement extends HTMLElement {
  @JsProperty
  String getAcceptCharset();

  @JsProperty
  void setAcceptCharset(String value);

  @JsProperty
  String getAction();

  @JsProperty
  void setAction(String value);

  @JsProperty
  String getAutocomplete();

  @JsProperty
  void setAutocomplete(String value);

  @JsProperty
  String getEnctype();

  @JsProperty
  void setEnctype(String value);

  @JsProperty
  String getEncoding();

  @JsProperty
  void setEncoding(String value);

  @JsProperty
  String getMethod();

  @JsProperty
  void setMethod(String value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  boolean getNoValidate();

  @JsProperty
  void setNoValidate(boolean value);

  @JsProperty
  String getTarget();

  @JsProperty
  void setTarget(String value);

  @JsProperty
  HTMLFormControlsCollection getElements();

  @JsProperty
  int getLength();

  void submit();

  void reset();

  boolean checkValidity();

  boolean reportValidity();

  void requestAutocomplete();
}
