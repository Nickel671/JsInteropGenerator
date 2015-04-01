package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DataTransfer"
)
interface DataTransfer {
  @JsProperty
  String getDropEffect();

  @JsProperty
  void setDropEffect(String value);

  @JsProperty
  String getEffectAllowed();

  @JsProperty
  void setEffectAllowed(String value);

  @JsProperty
  DataTransferItemList getItems();

  int setDragImage(Element image, int x, int y);

  String getData(String format);

  String setData(String format, String data);

  String clearData(String format);
}
