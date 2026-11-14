package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E11375389548855090952 implements dev.epro.r0.G17207421659529280019, dev.epro.r0.J8575954267469244926 {
    public final /* synthetic */ byte a = 0;
    public android.content.ClipData b;
    public byte c;
    public int d;
    public android.net.Uri e;
    public android.os.Bundle f;

    public E11375389548855090952(dev.epro.r0.E11375389548855090952 e11375389548855090952) {
        android.content.ClipData clipData = e11375389548855090952.b;
        clipData.getClass();
        this.b = clipData;
        byte b = e11375389548855090952.c;
        if (b < 0) {
            java.util.Locale locale = java.util.Locale.US;
            dev.epro.r0.S10973172697741180971.j("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            java.util.Locale locale2 = java.util.Locale.US;
            dev.epro.r0.S10973172697741180971.j("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = b;
        int i = e11375389548855090952.d;
        if ((i & 1) == i) {
            this.d = i;
            this.e = e11375389548855090952.e;
            this.f = e11375389548855090952.f;
            return;
        }
        throw new java.lang.IllegalArgumentException("Requested flags 0x" + java.lang.Integer.toHexString(i) + ", but only 0x" + java.lang.Integer.toHexString(1) + " are allowed");
    }

    public dev.epro.r0.P16142420860494385953 build() {
        return new dev.epro.r0.P16142420860494385953(new dev.epro.r0.E11375389548855090952(this));
    }

    public int c() {
        return this.c;
    }

    public android.content.ClipData e() {
        return this.b;
    }

    public int m() {
        return this.d;
    }

    public android.view.ContentInfo n() {
        return null;
    }

    public void q(android.net.Uri uri) {
        this.e = uri;
    }

    public void setExtras(android.os.Bundle bundle) {
        this.f = bundle;
    }

    public java.lang.String toString() {
        java.lang.String str;
        switch (this.a) {
            case 1:
                android.net.Uri uri = this.e;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                byte b = this.c;
                sb.append(b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? b != 5 ? java.lang.String.valueOf((int) b) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i = this.d;
                sb.append((i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : java.lang.String.valueOf(i));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return dev.epro.r0.G6547577305291411977.u(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public void w(int i) {
        this.d = i;
    }

    public /* synthetic */ E11375389548855090952() {
    }
}
