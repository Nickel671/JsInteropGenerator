package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "ValidityState"
)
interface ValidityState {
  @JsProperty
  boolean getValueMissing();

  @JsProperty
  boolean getTypeMismatch();

  @JsProperty
  boolean getPatternMismatch();

  @JsProperty
  boolean getTooLong();

  @JsProperty
  boolean getTooShort();

  @JsProperty
  boolean getRangeUnderflow();

  @JsProperty
  boolean getRangeOverflow();

  @JsProperty
  boolean getStepMismatch();

  @JsProperty
  boolean getBadInput();

  @JsProperty
  boolean getCustomError();

  @JsProperty
  boolean getValid();
}
