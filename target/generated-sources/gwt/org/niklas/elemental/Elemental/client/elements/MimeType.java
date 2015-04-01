package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MimeType"
)
interface MimeType {
  @JsProperty
  String getType();

  @JsProperty
  String getDescription();

  @JsProperty
  String getSuffixes();

  @JsProperty
  Plugin getEnabledPlugin();
}
