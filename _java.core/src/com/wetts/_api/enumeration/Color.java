package com.wetts._api.enumeration;

public enum Color {

	RED(255, 0, 0) {
		@Override
		public boolean isRed() {
			return true;
		}
	},
	BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
	// 鏋勯?鏋氫妇鍊硷紝姣斿RED(255,0,0)
	private Color(int rv, int gv, int bv) {
		this.redValue = rv;
		this.greenValue = gv;
		this.blueValue = bv;
	}

	public String toString() { // 瑕嗙洊浜嗙埗绫籈num鐨則oString()
		return super.toString() + "(" + redValue + "," + greenValue + "," + blueValue + ")";
	}

	private int redValue; // 鑷畾涔夋暟鎹煙锛宲rivate涓轰簡灏佽銆?
	private int greenValue;
	private int blueValue;

	public boolean isRed() {
		return false;
	}

}
