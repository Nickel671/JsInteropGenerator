package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "Document"
)
interface Document extends NonElementParentNode, ParentNode, Node, GlobalEventHandlers {
  @JsProperty
  DOMImplementation getImplementation();

  @JsProperty
  String getURL();

  @JsProperty
  String getDocumentURI();

  @JsProperty
  String getOrigin();

  @JsProperty
  String getCompatMode();

  @JsProperty
  String getCharacterSet();

  @JsProperty
  String getInputEncoding();

  @JsProperty
  String getContentType();

  @JsProperty
  DocumentType getDoctype();

  @JsProperty
  Element getDocumentElement();

  @JsProperty
  Location getLocation();

  @JsProperty
  String getDomain();

  @JsProperty
  void setDomain(String value);

  @JsProperty
  String getReferrer();

  @JsProperty
  String getCookie();

  @JsProperty
  void setCookie(String value);

  @JsProperty
  String getLastModified();

  @JsProperty
  String getReadyState();

  @JsProperty
  String getTitle();

  @JsProperty
  void setTitle(String value);

  @JsProperty
  String getDir();

  @JsProperty
  void setDir(String value);

  @JsProperty
  HTMLElement getBody();

  @JsProperty
  void setBody(HTMLElement value);

  @JsProperty
  HTMLHeadElement getHead();

  @JsProperty
  HTMLCollection getImages();

  @JsProperty
  HTMLCollection getEmbeds();

  @JsProperty
  HTMLCollection getPlugins();

  @JsProperty
  HTMLCollection getLinks();

  @JsProperty
  HTMLCollection getForms();

  @JsProperty
  HTMLCollection getScripts();

  @JsProperty
  DOMElementMap getCssElementMap();

  @JsProperty
  HTMLScriptElement getCurrentScript();

  @JsProperty
  Element getActiveElement();

  @JsProperty
  String getDesignMode();

  @JsProperty
  void setDesignMode(String value);

  @JsProperty
  HTMLCollection getCommands();

  @JsProperty
  EventHandlerNonNull getOnreadystatechange();

  @JsProperty
  void setOnreadystatechange(EventHandlerNonNull value);

  @JsProperty
  String getFgColor();

  @JsProperty
  void setFgColor(String value);

  @JsProperty
  String getLinkColor();

  @JsProperty
  void setLinkColor(String value);

  @JsProperty
  String getVlinkColor();

  @JsProperty
  void setVlinkColor(String value);

  @JsProperty
  String getAlinkColor();

  @JsProperty
  void setAlinkColor(String value);

  @JsProperty
  String getBgColor();

  @JsProperty
  void setBgColor(String value);

  @JsProperty
  HTMLCollection getAnchors();

  @JsProperty
  HTMLCollection getApplets();

  @JsProperty
  HTMLAllCollection getAll();

  String getElementsByTagName(String localName);

  String getElementsByTagNameNS(String namespace, String localName);

  String getElementsByClassName(String classNames);

  String createElement(String localName);

  String createElementNS(String namespace, String qualifiedName);

  DocumentFragment createDocumentFragment();

  String createTextNode(String data);

  String createComment(String data);

  String createProcessingInstruction(String target, String data);

  boolean importNode(Node node, boolean deep);

  Node adoptNode(Node node);

  String createAttribute(String localName);

  String createAttributeNS(String namespace, String name);

  String createEvent(String interface_);

  Range createRange();

  NodeFilter createNodeIterator(Node root, int whatToShow, NodeFilter filter);

  NodeFilter createTreeWalker(Node root, int whatToShow, NodeFilter filter);

  String getElementsByName(String elementName);

  String getItems(String typeNames);

  String open(String type, String replace);

  boolean open(String url, String name, String features, boolean replace);

  void close();

  String write(String text);

  String writeln(String text);

  boolean hasFocus();

  String execCommand(String commandId, boolean showUI, String value);

  String queryCommandEnabled(String commandId);

  String queryCommandIndeterm(String commandId);

  String queryCommandState(String commandId);

  String queryCommandSupported(String commandId);

  String queryCommandValue(String commandId);

  void clear();

  void captureEvents();

  void releaseEvents();
}
