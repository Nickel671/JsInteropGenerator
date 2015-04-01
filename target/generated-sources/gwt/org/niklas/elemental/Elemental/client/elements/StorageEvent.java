package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "StorageEvent"
)
interface StorageEvent extends Event {
  @JsProperty
  String getKey();

  @JsProperty
  String getOldValue();

  @JsProperty
  String getNewValue();

  @JsProperty
  String getUrl();

  @JsProperty
  Storage getStorageArea();
}
