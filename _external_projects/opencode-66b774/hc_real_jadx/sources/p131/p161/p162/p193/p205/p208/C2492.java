package p131.p161.p162.p193.p205.p208;

import java.util.ArrayList;
import java.util.List;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2492 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Object f9827;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final List<String> f9828;

    public C2492(Object obj, C2486 c2486) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
        this.f9827 = obj;
        this.f9828 = new ArrayList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f9827.getClass().getSimpleName());
        sb.append('{');
        int size = this.f9828.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.f9828.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2492 m4518(String str, Object obj) {
        List<String> list = this.f9828;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
        return this;
    }
}
