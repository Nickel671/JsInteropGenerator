package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "WindowTimers"
)
interface WindowTimers {
  int clearTimeout(int handle);

  int clearInterval(int handle);
}
