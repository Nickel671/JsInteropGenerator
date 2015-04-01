package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Text"
)
interface Text extends CharacterData {
  @JsProperty
  String getWholeText();

  int splitText(int offset);
}
