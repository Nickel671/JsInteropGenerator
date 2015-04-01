package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "CanvasGradient"
)
interface CanvasGradient {
  void addColorStop(double offset, String color);
}
