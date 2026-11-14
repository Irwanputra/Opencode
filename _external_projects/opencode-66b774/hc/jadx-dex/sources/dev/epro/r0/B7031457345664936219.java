package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B7031457345664936219 {
    public java.lang.Integer a;

    public final java.lang.Integer a(android.view.KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.a = java.lang.Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        java.lang.Integer num = this.a;
        if (num == null) {
            return java.lang.Integer.valueOf(unicodeChar);
        }
        this.a = null;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(android.view.KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        java.lang.Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            unicodeChar = num2.intValue();
        }
        return java.lang.Integer.valueOf(unicodeChar);
    }
}
