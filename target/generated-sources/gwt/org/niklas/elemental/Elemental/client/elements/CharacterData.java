package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "CharacterData"
)
interface CharacterData extends NonDocumentTypeChildNode, ChildNode, Node {
  @JsProperty
  String getData();

  @JsProperty
  void setData(String value);

  @JsProperty
  int getLength();

  int substringData(int offset, int count);

  String appendData(String data);

  String insertData(int offset, String data);

  int deleteData(int offset, int count);

  String replaceData(int offset, int count, String data);
}
