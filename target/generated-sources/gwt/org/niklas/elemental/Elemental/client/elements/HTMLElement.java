package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLElement"
)
interface HTMLElement extends Element, GlobalEventHandlers, ElementContentEditable {
  @JsProperty
  String getTitle();

  @JsProperty
  void setTitle(String value);

  @JsProperty
  String getLang();

  @JsProperty
  void setLang(String value);

  @JsProperty
  boolean getTranslate();

  @JsProperty
  void setTranslate(boolean value);

  @JsProperty
  String getDir();

  @JsProperty
  void setDir(String value);

  @JsProperty
  DOMStringMap getDataset();

  @JsProperty
  boolean getItemScope();

  @JsProperty
  void setItemScope(boolean value);

  @JsProperty
  DOMSettableTokenList getItemType();

  @JsProperty
  String getItemId();

  @JsProperty
  void setItemId(String value);

  @JsProperty
  DOMSettableTokenList getItemRef();

  @JsProperty
  DOMSettableTokenList getItemProp();

  @JsProperty
  HTMLPropertiesCollection getProperties();

  @JsProperty
  boolean getHidden();

  @JsProperty
  void setHidden(boolean value);

  @JsProperty
  int getTabIndex();

  @JsProperty
  void setTabIndex(int value);

  @JsProperty
  String getAccessKey();

  @JsProperty
  void setAccessKey(String value);

  @JsProperty
  String getAccessKeyLabel();

  @JsProperty
  boolean getDraggable();

  @JsProperty
  void setDraggable(boolean value);

  @JsProperty
  DOMSettableTokenList getDropzone();

  @JsProperty
  HTMLMenuElement getContextMenu();

  @JsProperty
  void setContextMenu(HTMLMenuElement value);

  @JsProperty
  boolean getSpellcheck();

  @JsProperty
  void setSpellcheck(boolean value);

  @JsProperty
  String getCommandType();

  @JsProperty
  String getCommandLabel();

  @JsProperty
  String getCommandIcon();

  @JsProperty
  boolean getCommandHidden();

  @JsProperty
  boolean getCommandDisabled();

  @JsProperty
  boolean getCommandChecked();

  void click();

  void focus();

  void blur();

  void forceSpellCheck();
}
