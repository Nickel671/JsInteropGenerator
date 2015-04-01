package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Elements"
)
interface Elements {
  String query(String relativeSelectors);

  String queryAll(String relativeSelectors);
}
