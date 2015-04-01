package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "CanvasPathMethods"
)
interface CanvasPathMethods {
  void closePath();

  void moveTo(double x, double y);

  void lineTo(double x, double y);

  void quadraticCurveTo(double cpx, double cpy, double x, double y);

  void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);

  void arcTo(double x1, double y1, double x2, double y2, double radius);

  void arcTo(double x1, double y1, double x2, double y2, double radiusX, double radiusY, double rotation);

  void rect(double x, double y, double w, double h);

  void arc(double x, double y, double radius, double startAngle, double endAngle, boolean anticlockwise);

  void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle, boolean anticlockwise);
}
