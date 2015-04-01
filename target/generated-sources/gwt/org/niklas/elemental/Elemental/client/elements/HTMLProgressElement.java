package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLProgressElement"
)
interface HTMLProgressElement extends HTMLElement {
  @JsProperty
  double getValue();

  @JsProperty
  void setValue(double value);

  @JsProperty
  double getMax();

  @JsProperty
  void setMax(double value);

  @JsProperty
  double getPosition();

  @JsProperty
  NodeList getLabels();
}
