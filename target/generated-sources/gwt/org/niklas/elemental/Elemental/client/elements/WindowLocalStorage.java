package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "WindowLocalStorage"
)
interface WindowLocalStorage {
  @JsProperty
  Storage getLocalStorage();
}
