package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DOMImplementation"
)
interface DOMImplementation {
  String createDocumentType(String qualifiedName, String publicId, String systemId);

  DocumentType createDocument(String namespace, String qualifiedName, DocumentType doctype);

  String createHTMLDocument(String title);

  boolean hasFeature();
}
