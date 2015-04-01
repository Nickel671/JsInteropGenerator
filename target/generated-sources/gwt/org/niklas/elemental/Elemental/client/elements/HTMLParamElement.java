package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLParamElement"
)
interface HTMLParamElement extends HTMLElement {
  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getValue();

  @JsProperty
  void setValue(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  String getValueType();

  @JsProperty
  void setValueType(String value);
}
