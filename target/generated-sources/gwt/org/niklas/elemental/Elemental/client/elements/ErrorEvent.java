package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "ErrorEvent"
)
interface ErrorEvent extends Event {
  @JsProperty
  String getMessage();

  @JsProperty
  String getFilename();

  @JsProperty
  int getLineno();

  @JsProperty
  int getColno();
}
