package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "MediaController"
)
interface MediaController extends EventTarget {
  @JsProperty
  short getReadyState();

  @JsProperty
  TimeRanges getBuffered();

  @JsProperty
  TimeRanges getSeekable();

  @JsProperty
  double getDuration();

  @JsProperty
  double getCurrentTime();

  @JsProperty
  void setCurrentTime(double value);

  @JsProperty
  boolean getPaused();

  @JsProperty
  String getPlaybackState();

  @JsProperty
  TimeRanges getPlayed();

  @JsProperty
  double getDefaultPlaybackRate();

  @JsProperty
  void setDefaultPlaybackRate(double value);

  @JsProperty
  double getPlaybackRate();

  @JsProperty
  void setPlaybackRate(double value);

  @JsProperty
  double getVolume();

  @JsProperty
  void setVolume(double value);

  @JsProperty
  boolean getMuted();

  @JsProperty
  void setMuted(boolean value);

  @JsProperty
  EventHandlerNonNull getOnemptied();

  @JsProperty
  void setOnemptied(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnloadedmetadata();

  @JsProperty
  void setOnloadedmetadata(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnloadeddata();

  @JsProperty
  void setOnloadeddata(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOncanplay();

  @JsProperty
  void setOncanplay(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOncanplaythrough();

  @JsProperty
  void setOncanplaythrough(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnplaying();

  @JsProperty
  void setOnplaying(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnended();

  @JsProperty
  void setOnended(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnwaiting();

  @JsProperty
  void setOnwaiting(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOndurationchange();

  @JsProperty
  void setOndurationchange(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOntimeupdate();

  @JsProperty
  void setOntimeupdate(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnplay();

  @JsProperty
  void setOnplay(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnpause();

  @JsProperty
  void setOnpause(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnratechange();

  @JsProperty
  void setOnratechange(EventHandlerNonNull value);

  @JsProperty
  EventHandlerNonNull getOnvolumechange();

  @JsProperty
  void setOnvolumechange(EventHandlerNonNull value);

  void pause();

  void unpause();

  void play();
}
