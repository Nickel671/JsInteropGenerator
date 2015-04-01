package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "TextTrackCueList"
)
interface TextTrackCueList {
  @JsProperty
  int getLength();

  String getCueById(String id);
}
