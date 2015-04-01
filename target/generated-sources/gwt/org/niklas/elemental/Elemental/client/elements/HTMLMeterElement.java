package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLMeterElement"
)
interface HTMLMeterElement extends HTMLElement {
  @JsProperty
  double getValue();

  @JsProperty
  void setValue(double value);

  @JsProperty
  double getMin();

  @JsProperty
  void setMin(double value);

  @JsProperty
  double getMax();

  @JsProperty
  void setMax(double value);

  @JsProperty
  double getLow();

  @JsProperty
  void setLow(double value);

  @JsProperty
  double getHigh();

  @JsProperty
  void setHigh(double value);

  @JsProperty
  double getOptimum();

  @JsProperty
  void setOptimum(double value);

  @JsProperty
  NodeList getLabels();
}
