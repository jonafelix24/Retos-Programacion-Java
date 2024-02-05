package dev.silenzz.retos.nivel_1.repetir_texto;

public class RepeatStr {
	
	public static String repeat(final int repeat, final String text) {
        return repeat > 0 && text != null ? text.repeat(repeat) : "";
    }

}
