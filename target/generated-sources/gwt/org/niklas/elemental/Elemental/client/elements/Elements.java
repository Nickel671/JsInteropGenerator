package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Elements"
)
interface Elements {
  Element query(String relativeSelectors);

  Elements queryAll(String relativeSelectors);
}
