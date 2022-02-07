package com.darktornado.umm2lua;

public class Umm2Lua {
	
	public static String compile(String source) {
		Compiler cmp = new Compiler();
		cmp.setSource(source);
		return cmp.execute();
	}
	
	public static void main(String[] args) {
		String src = "어떻게\n\n"+
	            "엄.\n"+
	            "엄어.\n"+
	            "식어!\n"+
	            "준...\n"+
	            "식.......... ..........,,,ㅋ\n"+
				"\n\n이 사람이름이냐ㅋㅋ";
		System.out.println("----- Before -----");
		System.out.println(src);
		System.out.println("----- After -----");
		System.out.println(compile(src));
		System.out.println("----- End -----");
	}
	

}