package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "CanvasDrawingStyles"
)
interface CanvasDrawingStyles {
  @JsProperty
  double getLineWidth();

  @JsProperty
  void setLineWidth(double value);

  @JsProperty
  String getLineCap();

  @JsProperty
  void setLineCap(String value);

  @JsProperty
  String getLineJoin();

  @JsProperty
  void setLineJoin(String value);

  @JsProperty
  double getMiterLimit();

  @JsProperty
  void setMiterLimit(double value);

  @JsProperty
  double getLineDashOffset();

  @JsProperty
  void setLineDashOffset(double value);

  @JsProperty
  String getFont();

  @JsProperty
  void setFont(String value);

  @JsProperty
  String getTextAlign();

  @JsProperty
  void setTextAlign(String value);

  @JsProperty
  String getTextBaseline();

  @JsProperty
  void setTextBaseline(String value);

  @JsProperty
  String getDirection();

  @JsProperty
  void setDirection(String value);

  void setLineDash(double segments);

  double getLineDash();
}
