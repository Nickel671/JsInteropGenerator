package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "CanvasPathMethods"
)
interface CanvasPathMethods {
  void closePath();

  double moveTo(double x, double y);

  double lineTo(double x, double y);

  double quadraticCurveTo(double cpx, double cpy, double x, double y);

  double bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);

  double arcTo(double x1, double y1, double x2, double y2, double radius);

  double arcTo(double x1, double y1, double x2, double y2, double radiusX, double radiusY, double rotation);

  double rect(double x, double y, double w, double h);

  boolean arc(double x, double y, double radius, double startAngle, double endAngle, boolean anticlockwise);

  boolean ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle, boolean anticlockwise);
}
