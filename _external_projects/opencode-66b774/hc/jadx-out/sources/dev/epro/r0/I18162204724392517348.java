package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I18162204724392517348 {
    public final boolean a;
    public final B6798926553908941504 b;
    public int c;
    public int d;

    public I18162204724392517348(I18162204724392517348 i18162204724392517348, boolean z) {
        B6798926553908941504 b6798926553908941504;
        this.a = z;
        if (i18162204724392517348 != null) {
            B6798926553908941504 b67989265539089415042 = i18162204724392517348.b;
            b67989265539089415042.b();
            b6798926553908941504 = new B6798926553908941504(b67989265539089415042);
        } else {
            b6798926553908941504 = new B6798926553908941504(null);
        }
        this.b = b6798926553908941504;
        if (i18162204724392517348 != null) {
            this.c = i18162204724392517348.c;
            this.d = i18162204724392517348.d;
        } else {
            this.c = 0;
            this.d = 1000;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r19) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I18162204724392517348.a(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r19) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I18162204724392517348.b(int):void");
    }

    public final int c() {
        return this.d - this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I18162204724392517348)) {
            return false;
        }
        I18162204724392517348 i18162204724392517348 = (I18162204724392517348) obj;
        if (this.c == i18162204724392517348.c && this.d == i18162204724392517348.d) {
            return this.b.equals(i18162204724392517348.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }
}
