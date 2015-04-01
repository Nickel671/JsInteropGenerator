package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Attr"
)
interface Attr {
  @JsProperty
  String getNamespaceURI();

  @JsProperty
  String getPrefix();

  @JsProperty
  String getLocalName();

  @JsProperty
  String getName();

  @JsProperty
  String getValue();

  @JsProperty
  void setValue(String value);

  @JsProperty
  String getNodeValue();

  @JsProperty
  void setNodeValue(String value);

  @JsProperty
  String getTextContent();

  @JsProperty
  void setTextContent(String value);

  @JsProperty
  Element getOwnerElement();

  @JsProperty
  boolean getSpecified();
}
