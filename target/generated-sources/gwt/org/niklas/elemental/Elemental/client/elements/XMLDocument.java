package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "XMLDocument"
)
interface XMLDocument extends Document {
  String load(String url);
}
