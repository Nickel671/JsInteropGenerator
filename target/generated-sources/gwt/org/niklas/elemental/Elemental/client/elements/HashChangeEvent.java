package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HashChangeEvent"
)
interface HashChangeEvent extends Event {
  @JsProperty
  String getOldURL();

  @JsProperty
  String getNewURL();
}
