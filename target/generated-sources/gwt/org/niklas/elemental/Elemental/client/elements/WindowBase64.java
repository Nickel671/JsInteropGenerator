package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "WindowBase64"
)
interface WindowBase64 {
  String btoa(String btoa);

  String atob(String atob);
}
