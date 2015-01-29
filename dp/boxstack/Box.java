package practice.dp.boxstack;

public class Box {
	int height;
	int width;
	int depth;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Box(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}

}
