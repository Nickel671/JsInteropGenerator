package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MimeTypeArray"
)
interface MimeTypeArray {
  @JsProperty
  int getLength();

  int item(int index);

  String namedItem(String name);
}
