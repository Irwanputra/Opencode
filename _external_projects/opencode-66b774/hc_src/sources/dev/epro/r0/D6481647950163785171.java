package dev.epro.r0;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D6481647950163785171 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public D6481647950163785171(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D6481647950163785171)) {
            return false;
        }
        D6481647950163785171 d6481647950163785171 = (D6481647950163785171) obj;
        return S10823041268949770285.t(this.a, d6481647950163785171.a) && F12478849263529740365.c(this.b, d6481647950163785171.b) && S10823041268949770285.t(this.c, d6481647950163785171.c) && this.d.equals(d6481647950163785171.d);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = F12478849263529740365.c;
        int j = G6547577305291411977.j(hashCode2, this.b, 31);
        hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + j) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + F12478849263529740365.i(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
