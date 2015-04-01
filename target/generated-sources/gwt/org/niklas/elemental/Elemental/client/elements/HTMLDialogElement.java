package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLDialogElement"
)
interface HTMLDialogElement extends HTMLElement {
  @JsProperty
  boolean getOpen();

  @JsProperty
  void setOpen(boolean value);

  @JsProperty
  String getReturnValue();

  @JsProperty
  void setReturnValue(String value);

  String close(String returnValue);
}
