package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "History"
)
interface History {
  @JsProperty
  int getLength();

  void go(int delta);

  void back();

  void forward();
}
