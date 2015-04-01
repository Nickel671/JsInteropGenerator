package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLAnchorElement"
)
interface HTMLAnchorElement extends HTMLElement {
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
  String getText();

  @JsProperty
  void setText(String value);

  @JsProperty
  String getCoords();

  @JsProperty
  void setCoords(String value);

  @JsProperty
  String getCharset();

  @JsProperty
  void setCharset(String value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  String getRev();

  @JsProperty
  void setRev(String value);

  @JsProperty
  String getShape();

  @JsProperty
  void setShape(String value);
}
