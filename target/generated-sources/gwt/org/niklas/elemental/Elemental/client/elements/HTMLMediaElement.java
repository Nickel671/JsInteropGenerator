package org.niklas.elemental.Elemental.client.elements;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(
    prototype = "HTMLMediaElement"
)
interface HTMLMediaElement extends HTMLElement {
  @JsProperty
  MediaError getError();

  @JsProperty
  String getSrc();

  @JsProperty
  void setSrc(String value);

  @JsProperty
  String getCurrentSrc();

  @JsProperty
  String getCrossOrigin();

  @JsProperty
  void setCrossOrigin(String value);

  @JsProperty
  short getNetworkState();

  @JsProperty
  String getPreload();

  @JsProperty
  void setPreload(String value);

  @JsProperty
  TimeRanges getBuffered();

  @JsProperty
  short getReadyState();

  @JsProperty
  boolean getSeeking();

  @JsProperty
  double getCurrentTime();

  @JsProperty
  void setCurrentTime(double value);

  @JsProperty
  double getDuration();

  @JsProperty
  boolean getPaused();

  @JsProperty
  double getDefaultPlaybackRate();

  @JsProperty
  void setDefaultPlaybackRate(double value);

  @JsProperty
  double getPlaybackRate();

  @JsProperty
  void setPlaybackRate(double value);

  @JsProperty
  TimeRanges getPlayed();

  @JsProperty
  TimeRanges getSeekable();

  @JsProperty
  boolean getEnded();

  @JsProperty
  boolean getAutoplay();

  @JsProperty
  void setAutoplay(boolean value);

  @JsProperty
  boolean getLoop();

  @JsProperty
  void setLoop(boolean value);

  @JsProperty
  String getMediaGroup();

  @JsProperty
  void setMediaGroup(String value);

  @JsProperty
  MediaController getController();

  @JsProperty
  void setController(MediaController value);

  @JsProperty
  boolean getControls();

  @JsProperty
  void setControls(boolean value);

  @JsProperty
  double getVolume();

  @JsProperty
  void setVolume(double value);

  @JsProperty
  boolean getMuted();

  @JsProperty
  void setMuted(boolean value);

  @JsProperty
  boolean getDefaultMuted();

  @JsProperty
  void setDefaultMuted(boolean value);

  @JsProperty
  AudioTrackList getAudioTracks();

  @JsProperty
  VideoTrackList getVideoTracks();

  @JsProperty
  TextTrackList getTextTracks();

  void load();

  String canPlayType(String type);

  double fastSeek(double time);

  void play();

  void pause();

  String addTextTrack(String kind, String label, String language);
}
