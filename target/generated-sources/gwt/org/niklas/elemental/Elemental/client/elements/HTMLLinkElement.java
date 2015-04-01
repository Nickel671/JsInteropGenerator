package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLLinkElement"
)
interface HTMLLinkElement extends HTMLElement {
  @JsProperty
  String getHref();

  @JsProperty
  void setHref(String value);

  @JsProperty
  String getCrossOrigin();

  @JsProperty
  void setCrossOrigin(String value);

  @JsProperty
  String getRel();

  @JsProperty
  void setRel(String value);

  @JsProperty
  DOMTokenList getRelList();

  @JsProperty
  String getMedia();

  @JsProperty
  void setMedia(String value);

  @JsProperty
  String getHreflang();

  @JsProperty
  void setHreflang(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  DOMSettableTokenList getSizes();

  @JsProperty
  String getCharset();

  @JsProperty
  void setCharset(String value);

  @JsProperty
  String getRev();

  @JsProperty
  void setRev(String value);

  @JsProperty
  String getTarget();

  @JsProperty
  void setTarget(String value);
}
