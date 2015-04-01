package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "CanvasRenderingContext2D"
)
interface CanvasRenderingContext2D extends CanvasDrawingStyles, CanvasPathMethods {
  @JsProperty
  HTMLCanvasElement getCanvas();

  @JsProperty
  int getWidth();

  @JsProperty
  void setWidth(int value);

  @JsProperty
  int getHeight();

  @JsProperty
  void setHeight(int value);

  @JsProperty
  double getGlobalAlpha();

  @JsProperty
  void setGlobalAlpha(double value);

  @JsProperty
  String getGlobalCompositeOperation();

  @JsProperty
  void setGlobalCompositeOperation(String value);

  @JsProperty
  boolean getImageSmoothingEnabled();

  @JsProperty
  void setImageSmoothingEnabled(boolean value);

  @JsProperty
  double getShadowOffsetX();

  @JsProperty
  void setShadowOffsetX(double value);

  @JsProperty
  double getShadowOffsetY();

  @JsProperty
  void setShadowOffsetY(double value);

  @JsProperty
  double getShadowBlur();

  @JsProperty
  void setShadowBlur(double value);

  @JsProperty
  String getShadowColor();

  @JsProperty
  void setShadowColor(String value);

  void commit();

  void save();

  void restore();

  double scale(double x, double y);

  double rotate(double angle);

  double translate(double x, double y);

  double transform(double a, double b, double c, double d, double e, double f);

  double setTransform(double a, double b, double c, double d, double e, double f);

  void resetTransform();

  double createLinearGradient(double x0, double y0, double x1, double y1);

  double createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);

  double clearRect(double x, double y, double w, double h);

  double fillRect(double x, double y, double w, double h);

  double strokeRect(double x, double y, double w, double h);

  void beginPath();

  String fill(String fillRule);

  String fill(Path2D path, String fillRule);

  void stroke();

  Path2D stroke(Path2D path);

  Element drawFocusIfNeeded(Element element);

  Element drawFocusIfNeeded(Path2D path, Element element);

  void scrollPathIntoView();

  Path2D scrollPathIntoView(Path2D path);

  String clip(String fillRule);

  String clip(Path2D path, String fillRule);

  void resetClip();

  String isPointInPath(double x, double y, String fillRule);

  String isPointInPath(Path2D path, double x, double y, String fillRule);

  double isPointInStroke(double x, double y);

  double isPointInStroke(Path2D path, double x, double y);

  double fillText(String text, double x, double y, double maxWidth);

  double strokeText(String text, double x, double y, double maxWidth);

  String measureText(String text);

  String removeHitRegion(String id);

  void clearHitRegions();

  double createImageData(double sw, double sh);

  ImageData createImageData(ImageData imagedata);

  double getImageData(double sx, double sy, double sw, double sh);

  double putImageData(ImageData imagedata, double dx, double dy);

  double putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
}
