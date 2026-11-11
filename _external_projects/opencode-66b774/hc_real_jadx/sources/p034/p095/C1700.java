package p034.p095;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.は〲ぱなで.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1700 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public View f7838;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Map<String, Object> f7840 = new HashMap();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ArrayList<Transition> f7839 = new ArrayList<>();

    @Deprecated
    public C1700() {
    }

    public C1700(View view) {
        this.f7838 = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1700)) {
            return false;
        }
        C1700 c1700 = (C1700) obj;
        return this.f7838 == c1700.f7838 && this.f7840.equals(c1700.f7840);
    }

    public int hashCode() {
        return this.f7840.hashCode() + (this.f7838.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("TransitionValues@");
        m4207.append(Integer.toHexString(hashCode()));
        m4207.append(":\n");
        StringBuilder m4179 = C2098.m4179(m4207.toString(), "    view = ");
        m4179.append(this.f7838);
        m4179.append("\n");
        String m4205 = C2098.m4205(m4179.toString(), "    values:");
        for (String str : this.f7840.keySet()) {
            m4205 = m4205 + "    " + str + ": " + this.f7840.get(str) + "\n";
        }
        return m4205;
    }
}
