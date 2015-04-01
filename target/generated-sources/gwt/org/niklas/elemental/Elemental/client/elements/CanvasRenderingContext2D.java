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

  void scale(double x, double y);

  void rotate(double angle);

  void translate(double x, double y);

  void transform(double a, double b, double c, double d, double e, double f);

  void setTransform(double a, double b, double c, double d, double e, double f);

  void resetTransform();

  CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);

  CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);

  void clearRect(double x, double y, double w, double h);

  void fillRect(double x, double y, double w, double h);

  void strokeRect(double x, double y, double w, double h);

  void beginPath();

  void fill(String fillRule);

  void fill(Path2D path, String fillRule);

  void stroke();

  void stroke(Path2D path);

  void drawFocusIfNeeded(Element element);

  void drawFocusIfNeeded(Path2D path, Element element);

  void scrollPathIntoView();

  void scrollPathIntoView(Path2D path);

  void clip(String fillRule);

  void clip(Path2D path, String fillRule);

  void resetClip();

  boolean isPointInPath(double x, double y, String fillRule);

  boolean isPointInPath(Path2D path, double x, double y, String fillRule);

  boolean isPointInStroke(double x, double y);

  boolean isPointInStroke(Path2D path, double x, double y);

  void fillText(String text, double x, double y, double maxWidth);

  void strokeText(String text, double x, double y, double maxWidth);

  TextMetrics measureText(String text);

  void removeHitRegion(String id);

  void clearHitRegions();

  ImageData createImageData(double sw, double sh);

  ImageData createImageData(ImageData imagedata);

  ImageData getImageData(double sx, double sy, double sw, double sh);

  void putImageData(ImageData imagedata, double dx, double dy);

  void putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
}
