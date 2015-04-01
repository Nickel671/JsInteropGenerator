package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLFrameSetElement"
)
interface HTMLFrameSetElement extends HTMLElement, WindowEventHandlers {
  @JsProperty
  String getCols();

  @JsProperty
  void setCols(String value);

  @JsProperty
  String getRows();

  @JsProperty
  void setRows(String value);
}
