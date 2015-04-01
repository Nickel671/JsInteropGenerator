package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLIFrameElement"
)
interface HTMLIFrameElement extends HTMLElement {
  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getSrcdoc();

  @JsProperty
  void setSrcdoc(String value);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String value);

  @JsProperty
  DOMSettableTokenList getSandbox();

  @JsProperty
  boolean getSeamless();

  @JsProperty
  void setSeamless(boolean value);

  @JsProperty
  boolean getAllowFullscreen();

  @JsProperty
  void setAllowFullscreen(boolean value);

  @JsProperty
  String getWidth();

  @JsProperty
  void setWidth(String value);

  @JsProperty
  String getHeight();

  @JsProperty
  void setHeight(String value);

  @JsProperty
  Document getContentDocument();

  @JsProperty
  String getAlign();

  @JsProperty
  void setAlign(String value);

  @JsProperty
  String getScrolling();

  @JsProperty
  void setScrolling(String value);

  @JsProperty
  String getFrameBorder();

  @JsProperty
  void setFrameBorder(String value);

  @JsProperty
  String getLongDesc();

  @JsProperty
  void setLongDesc(String value);

  @JsProperty
  String getMarginHeight();

  @JsProperty
  void setMarginHeight(String value);

  @JsProperty
  String getMarginWidth();

  @JsProperty
  void setMarginWidth(String value);

  Document getSVGDocument();
}
