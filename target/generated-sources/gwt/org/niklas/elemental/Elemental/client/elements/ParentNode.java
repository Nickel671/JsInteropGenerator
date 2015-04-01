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

  Element query(String relativeSelectors);

  Elements queryAll(String relativeSelectors);

  Element querySelector(String selectors);

  NodeList querySelectorAll(String selectors);
}
