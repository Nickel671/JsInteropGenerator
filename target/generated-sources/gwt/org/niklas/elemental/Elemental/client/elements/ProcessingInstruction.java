package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "ProcessingInstruction"
)
interface ProcessingInstruction extends CharacterData {
  @JsProperty
  String getTarget();
}
