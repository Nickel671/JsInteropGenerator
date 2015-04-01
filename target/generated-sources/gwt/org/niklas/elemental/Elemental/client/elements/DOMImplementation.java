package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "DOMImplementation"
)
interface DOMImplementation {
  DocumentType createDocumentType(String qualifiedName, String publicId, String systemId);

  XMLDocument createDocument(String namespace, String qualifiedName, DocumentType doctype);

  Document createHTMLDocument(String title);

  boolean hasFeature();
}
