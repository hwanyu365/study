package etc;

public class LargeIntegerCalculator {

	public static void main(String[] args) {
		LargeInteger value1 = new LargeInteger("567832");
		LargeInteger value2 = new LargeInteger("9423723");
		System.out.format("value1 : %s, value2 : %s", value1.print(), value2.print());
		
	}

	public LargeInteger prod(LargeInteger value1, LargeInteger value2) {

		return null;
	}

}

class LargeInteger {
	private byte[] value;

	LargeInteger(String strValue) {
		int length = strValue.length();
		value = new byte[length];
		String v;
		for (int i = 0; i < length; i++) {
			v = strValue.substring(i, (i + 1));
			value[length - i - 1] = Byte.valueOf(v);
		}
	}

	String print() {
		String strValue = "";
		if ((value == null) || value.length <= 0) {
			strValue = "0";
		} else {
			int c = 0;
			for (byte v : value) {
				if ((c > 0) && (c % 3 == 0)) {
					strValue = v + "," + strValue;
				} else {
					strValue = v + strValue;
				}
				c++;
			}
		}
		return strValue;
	}
}