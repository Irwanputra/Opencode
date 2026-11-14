package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class P13193549499509261669 extends M8821877208104636290 {
    public final String a;
    public final F16470721565862751885 b;
    public final String c;
    public final F16470721565862751885 d;

    public P13193549499509261669(String str, F16470721565862751885 f16470721565862751885, String str2, F16470721565862751885 f164707215658627518852, Throwable th, int i) {
        super(str + "; " + str2 + "; " + f164707215658627518852, th);
        this.a = str;
        this.b = f16470721565862751885;
        this.c = str2;
        this.d = f164707215658627518852;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("\n");
        }
        F16470721565862751885 f16470721565862751885 = this.b;
        if (f16470721565862751885 != null) {
            sb.append(f16470721565862751885);
            sb.append("\n");
        }
        String str2 = this.c;
        if (str2 != null) {
            sb.append(str2);
            sb.append("\n");
        }
        F16470721565862751885 f164707215658627518852 = this.d;
        if (f164707215658627518852 != null) {
            sb.append(f164707215658627518852);
            sb.append("\n");
        }
        return sb.toString();
    }

    public /* synthetic */ P13193549499509261669(String str, F16470721565862751885 f16470721565862751885, String str2, F16470721565862751885 f164707215658627518852) {
        this(str, f16470721565862751885, str2, f164707215658627518852, null, 0);
    }

    public P13193549499509261669(String str, F16470721565862751885 f16470721565862751885) {
        this(null, null, str, f16470721565862751885, null, 0);
    }
}
