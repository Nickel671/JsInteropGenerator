package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "FileCallback"
)
interface FileCallback {
  void run(Object file);
}
