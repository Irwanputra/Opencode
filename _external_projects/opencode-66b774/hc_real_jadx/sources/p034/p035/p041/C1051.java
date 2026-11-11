package p034.p035.p041;

import android.os.Bundle;
import java.util.Set;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1051 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final CharSequence f5491;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Set<String> f5492;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final CharSequence[] f5493;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f5494;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f5495;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Bundle f5496;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean f5497;

    public C1051(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f5494 = str;
        this.f5491 = charSequence;
        this.f5493 = charSequenceArr;
        this.f5497 = z;
        this.f5495 = i;
        this.f5496 = bundle;
        this.f5492 = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
