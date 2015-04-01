package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "ParentNode"
)
interface ParentNode {
  @JsProperty
  HTMLCollection getChildren();

  @JsProperty
  Element getFirstElementChild();

  @JsProperty
  Element getLastElementChild();

  @JsProperty
  int getChildElementCount();

  String query(String relativeSelectors);

  String queryAll(String relativeSelectors);

  String querySelector(String selectors);

  String querySelectorAll(String selectors);
}
