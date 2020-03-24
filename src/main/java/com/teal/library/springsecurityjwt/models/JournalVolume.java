package com.teal.library.springsecurityjwt.models;

public class JournalVolume {
	private int docId;
	private int jVolume;
	private int editorId;
	public JournalVolume(int docId, int jVolume, int editorId) {
		super();
		this.docId = docId;
		this.jVolume = jVolume;
		this.editorId = editorId;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public int getjVolume() {
		return jVolume;
	}
	public void setjVolume(int jVolume) {
		this.jVolume = jVolume;
	}
	public int getEditorId() {
		return editorId;
	}
	public void setEditorId(int editorId) {
		this.editorId = editorId;
	}
	@Override
	public String toString() {
		return "JournalVolume [docId=" + docId + ", jVolume=" + jVolume + ", editorId=" + editorId + "]";
	}

	
}
