package com.image.struct;

public class Image {
	
	private String name;
	private String path;
	private boolean exists;

	public Image(String name, String path, boolean exists) {
		super();
		this.name = name;
		this.path = path;
		this.exists = exists;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isExists() {
		return exists;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}

	public Image() {
		// TODO Auto-generated constructor stub
	}

}
