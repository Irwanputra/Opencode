package p107.p108.p109.p110.p120;

import android.annotation.SuppressLint;
import java.io.File;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.のぷのちつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1929 implements Comparable<C1929> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f8407;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public File f8408;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f8409;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f8410;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f8411;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f8412;

    public C1929(String str, String str2, String str3, String str4, String str5, File file) {
        this.f8407 = str;
        this.f8409 = str2;
        this.f8412 = str3;
        this.f8410 = str4;
        this.f8411 = str5;
        this.f8408 = file;
    }

    @Override // java.lang.Comparable
    @SuppressLint({"UseValueOf"})
    public int compareTo(C1929 c1929) {
        C1929 c19292 = c1929;
        if (this.f8408 != null) {
            return new Long(this.f8408.lastModified()).compareTo(new Long(c19292.f8408.lastModified()));
        }
        throw new IllegalArgumentException();
    }
}
