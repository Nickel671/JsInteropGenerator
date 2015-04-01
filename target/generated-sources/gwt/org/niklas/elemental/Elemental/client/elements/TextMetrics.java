package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "TextMetrics"
)
interface TextMetrics {
  @JsProperty
  double getWidth();

  @JsProperty
  double getActualBoundingBoxLeft();

  @JsProperty
  double getActualBoundingBoxRight();

  @JsProperty
  double getFontBoundingBoxAscent();

  @JsProperty
  double getFontBoundingBoxDescent();

  @JsProperty
  double getActualBoundingBoxAscent();

  @JsProperty
  double getActualBoundingBoxDescent();

  @JsProperty
  double getEmHeightAscent();

  @JsProperty
  double getEmHeightDescent();

  @JsProperty
  double getHangingBaseline();

  @JsProperty
  double getAlphabeticBaseline();

  @JsProperty
  double getIdeographicBaseline();
}
