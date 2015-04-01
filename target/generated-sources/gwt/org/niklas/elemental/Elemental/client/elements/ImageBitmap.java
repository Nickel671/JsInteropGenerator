package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "ImageBitmap"
)
interface ImageBitmap {
  @JsProperty
  int getWidth();

  @JsProperty
  int getHeight();
}
