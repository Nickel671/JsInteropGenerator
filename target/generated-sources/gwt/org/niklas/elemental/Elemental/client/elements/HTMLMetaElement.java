package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLMetaElement"
)
interface HTMLMetaElement extends HTMLElement {
  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getHttpEquiv();

  @JsProperty
  void setHttpEquiv(String value);

  @JsProperty
  String getContent();

  @JsProperty
  void setContent(String value);

  @JsProperty
  String getScheme();

  @JsProperty
  void setScheme(String value);
}
