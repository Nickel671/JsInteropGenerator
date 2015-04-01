package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLOptionsCollection"
)
interface HTMLOptionsCollection extends HTMLCollection {
  @JsProperty
  int getLength();

  @JsProperty
  void setLength(int value);

  @JsProperty
  int getSelectedIndex();

  @JsProperty
  void setSelectedIndex(int value);

  int remove(int index);
}
