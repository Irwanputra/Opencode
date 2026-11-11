package p034.p068;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import p131.p155.p156.p157.C2098;

@TargetApi(21)
/* renamed from: づざかべべ.おぐぴう〸ず.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1421 implements InterfaceC1429 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f6682 = -1;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AudioAttributes f6683;

    public boolean equals(Object obj) {
        if (obj instanceof C1421) {
            return this.f6683.equals(((C1421) obj).f6683);
        }
        return false;
    }

    public int hashCode() {
        return this.f6683.hashCode();
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("AudioAttributesCompat: audioattributes=");
        m4207.append(this.f6683);
        return m4207.toString();
    }
}
