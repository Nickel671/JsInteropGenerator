package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "TimeRanges"
)
interface TimeRanges {
  @JsProperty
  int getLength();

  double start(int index);

  double end(int index);
}
