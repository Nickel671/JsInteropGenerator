package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLAreaElement"
)
interface HTMLAreaElement extends HTMLElement {
  @JsProperty
  String getAlt();

  @JsProperty
  void setAlt(String value);

  @JsProperty
  String getCoords();

  @JsProperty
  void setCoords(String value);

  @JsProperty
  String getShape();

  @JsProperty
  void setShape(String value);

  @JsProperty
  String getTarget();

  @JsProperty
  void setTarget(String value);

  @JsProperty
  String getDownload();

  @JsProperty
  void setDownload(String value);

  @JsProperty
  DOMSettableTokenList getPing();

  @JsProperty
  void setPing(DOMSettableTokenList value);

  @JsProperty
  String getRel();

  @JsProperty
  void setRel(String value);

  @JsProperty
  DOMTokenList getRelList();

  @JsProperty
  String getHreflang();

  @JsProperty
  void setHreflang(String value);

  @JsProperty
  String getType();

  @JsProperty
  void setType(String value);

  @JsProperty
  boolean getNoHref();

  @JsProperty
  void setNoHref(boolean value);
}
