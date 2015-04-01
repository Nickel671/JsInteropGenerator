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

  String substringData(int offset, int count);

  void appendData(String data);

  void insertData(int offset, String data);

  void deleteData(int offset, int count);

  void replaceData(int offset, int count, String data);
}
