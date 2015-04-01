package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "WindowTimers"
)
interface WindowTimers {
  void clearTimeout(int handle);

  void clearInterval(int handle);
}
