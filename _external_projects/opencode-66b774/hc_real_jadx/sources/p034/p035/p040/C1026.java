package p034.p035.p040;

import android.util.Base64;
import java.util.List;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1026 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f5421;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f5422;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f5423;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String f5424;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final List<List<byte[]>> f5425;

    public C1026(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f5423 = str;
        this.f5421 = str2;
        this.f5422 = str3;
        list.getClass();
        this.f5425 = list;
        this.f5424 = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder m4207 = C2098.m4207("FontRequest {mProviderAuthority: ");
        m4207.append(this.f5423);
        m4207.append(", mProviderPackage: ");
        m4207.append(this.f5421);
        m4207.append(", mQuery: ");
        m4207.append(this.f5422);
        m4207.append(", mCertificates:");
        sb.append(m4207.toString());
        for (int i = 0; i < this.f5425.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f5425.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return C2098.m4198(sb, "}", "mCertificatesArray: 0");
    }
}
