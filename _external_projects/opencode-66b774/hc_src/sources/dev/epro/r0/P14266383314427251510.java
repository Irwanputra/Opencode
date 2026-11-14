package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P14266383314427251510 {
    public static final P14266383314427251510 d = new P14266383314427251510("\n\u0085\u2028\u2029");
    public static final P14266383314427251510 e = new P14266383314427251510("\u0000\r\n\u0085\u2028\u2029");
    public static final P14266383314427251510 f = new P14266383314427251510(" \u0000\r\n\u0085\u2028\u2029");
    public static final P14266383314427251510 g = new P14266383314427251510("\t \u0000\r\n\u0085\u2028\u2029");
    public static final P14266383314427251510 h;
    public static final P14266383314427251510 i;
    public final String a;
    public final boolean[] b;
    public final boolean c;

    static {
        new P14266383314427251510("\u0000 \t");
        h = new P14266383314427251510("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
        i = new P14266383314427251510("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
    }

    public P14266383314427251510(String str) {
        boolean[] zArr = new boolean[128];
        this.b = zArr;
        this.c = false;
        Arrays.fill(zArr, false);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt < 128) {
                this.b[codePointAt] = true;
            } else {
                sb.appendCodePoint(codePointAt);
            }
        }
        if (sb.length() > 0) {
            this.c = true;
            this.a = sb.toString();
        }
    }

    public final boolean a(int i2) {
        return i2 < 128 ? this.b[i2] : this.c && this.a.indexOf(i2) != -1;
    }

    public final boolean b(int i2) {
        return !a(i2);
    }
}
