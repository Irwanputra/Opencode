package dev.epro.r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E11375389548855090952 implements G17207421659529280019, J8575954267469244926 {
    public final /* synthetic */ byte a = 0;
    public ClipData b;
    public byte c;
    public int d;
    public Uri e;
    public Bundle f;

    public E11375389548855090952(E11375389548855090952 e11375389548855090952) {
        ClipData clipData = e11375389548855090952.b;
        clipData.getClass();
        this.b = clipData;
        byte b = e11375389548855090952.c;
        if (b < 0) {
            Locale locale = Locale.US;
            S10973172697741180971.j("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            Locale locale2 = Locale.US;
            S10973172697741180971.j("source is out of range of [0, 5] (too high)");
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
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // dev.epro.r0.G17207421659529280019
    public P16142420860494385953 build() {
        return new P16142420860494385953(new E11375389548855090952(this));
    }

    @Override // dev.epro.r0.J8575954267469244926
    public int c() {
        return this.c;
    }

    @Override // dev.epro.r0.J8575954267469244926
    public ClipData e() {
        return this.b;
    }

    @Override // dev.epro.r0.J8575954267469244926
    public int m() {
        return this.d;
    }

    @Override // dev.epro.r0.J8575954267469244926
    public ContentInfo n() {
        return null;
    }

    @Override // dev.epro.r0.G17207421659529280019
    public void q(Uri uri) {
        this.e = uri;
    }

    @Override // dev.epro.r0.G17207421659529280019
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                byte b = this.c;
                sb.append(b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i = this.d;
                sb.append((i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return G6547577305291411977.u(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // dev.epro.r0.G17207421659529280019
    public void w(int i) {
        this.d = i;
    }

    public /* synthetic */ E11375389548855090952() {
    }
}
