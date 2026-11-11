package p015.p016.p020;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import p015.p016.C0787;
import p015.p016.p017.C0784;
import p015.p016.p019.InterfaceC0915;
import p015.p016.p020.C0958;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0974 implements Cloneable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC0974 f5308;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f5309;

    /* renamed from: いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0975 implements InterfaceC0915 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0958.C0960 f5310;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Appendable f5311;

        public C0975(Appendable appendable, C0958.C0960 c0960) {
            this.f5311 = appendable;
            this.f5310 = c0960;
            c0960.m2271();
        }

        @Override // p015.p016.p019.InterfaceC0915
        /* renamed from: 〺つふすそ */
        public void mo2240(AbstractC0974 abstractC0974, int i) {
            if (abstractC0974.mo2252().equals("#text")) {
                return;
            }
            try {
                abstractC0974.mo2254(this.f5311, i, this.f5310);
            } catch (IOException e) {
                throw new C0787(e);
            }
        }

        @Override // p015.p016.p019.InterfaceC0915
        /* renamed from: げつ〴ぬぐ */
        public void mo2241(AbstractC0974 abstractC0974, int i) {
            try {
                abstractC0974.mo2253(this.f5311, i, this.f5310);
            } catch (IOException e) {
                throw new C0787(e);
            }
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public String toString() {
        return mo2268();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public AbstractC0974 mo2290(AbstractC0974 abstractC0974) {
        try {
            AbstractC0974 abstractC09742 = (AbstractC0974) super.clone();
            abstractC09742.f5308 = abstractC0974;
            abstractC09742.f5309 = abstractC0974 == null ? 0 : this.f5309;
            return abstractC09742;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 〺つふすそ */
    public String mo2278(String str) {
        C1687.m3701(str);
        if (!mo2286()) {
            return "";
        }
        String m2258 = mo2287().m2258(str);
        return m2258.length() > 0 ? m2258 : str.startsWith("abs:") ? mo2282(str.substring(4)) : "";
    }

    @Override // 
    /* renamed from: ぁごぐすすぃ, reason: merged with bridge method [inline-methods] */
    public AbstractC0974 mo2267() {
        AbstractC0974 mo2290 = mo2290(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(mo2290);
        while (!linkedList.isEmpty()) {
            AbstractC0974 abstractC0974 = (AbstractC0974) linkedList.remove();
            int mo2285 = abstractC0974.mo2285();
            for (int i = 0; i < mo2285; i++) {
                List<AbstractC0974> mo2280 = abstractC0974.mo2280();
                AbstractC0974 mo22902 = mo2280.get(i).mo2290(abstractC0974);
                mo2280.set(i, mo22902);
                linkedList.add(mo22902);
            }
        }
        return mo2290;
    }

    /* renamed from: いいにぽつ */
    public abstract List<AbstractC0974> mo2280();

    /* renamed from: ぇぬぎばつ */
    public abstract String mo2252();

    /* renamed from: ぉざぅち〻 */
    public String mo2268() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        C1687.m3698(new C0975(sb, m2296()), this);
        return sb.toString();
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public AbstractC0974 m2291() {
        AbstractC0974 abstractC0974 = this.f5308;
        if (abstractC0974 == null) {
            return null;
        }
        List<AbstractC0974> mo2280 = abstractC0974.mo2280();
        int i = this.f5309 + 1;
        if (mo2280.size() > i) {
            return mo2280.get(i);
        }
        return null;
    }

    /* renamed from: くし〴〺ぅ */
    public AbstractC0974 mo2281(String str, String str2) {
        C0956 mo2287 = mo2287();
        int m2259 = mo2287.m2259(str);
        if (m2259 != -1) {
            mo2287.f5268[m2259] = str2;
            if (!mo2287.f5267[m2259].equals(str)) {
                mo2287.f5267[m2259] = str;
            }
        } else {
            mo2287.m2261(str, str2);
        }
        return this;
    }

    /* renamed from: げつ〴ぬぐ */
    public String mo2282(String str) {
        C1687.m3654(str);
        String str2 = "";
        if (!mo2284(str)) {
            return "";
        }
        String mo2283 = mo2283();
        String mo2278 = mo2278(str);
        String[] strArr = C0784.f5013;
        try {
            try {
                str2 = C0784.m2112(new URL(mo2283), mo2278).toExternalForm();
            } catch (MalformedURLException unused) {
                str2 = new URL(mo2278).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
        }
        return str2;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final void m2292(int i) {
        List<AbstractC0974> mo2280 = mo2280();
        while (i < mo2280.size()) {
            mo2280.get(i).f5309 = i;
            i++;
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m2293() {
        C1687.m3701(this.f5308);
        this.f5308.mo2294(this);
    }

    /* renamed from: ざとぅぼこ〺 */
    public abstract void mo2253(Appendable appendable, int i, C0958.C0960 c0960);

    /* renamed from: づざかべべ */
    public abstract String mo2283();

    /* renamed from: てぜきぽく */
    public boolean mo2284(String str) {
        C1687.m3701(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if ((mo2287().m2259(substring) != -1) && !mo2282(substring).equals("")) {
                return true;
            }
        }
        return mo2287().m2259(str) != -1;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void mo2294(AbstractC0974 abstractC0974) {
        C1687.m3722(abstractC0974.f5308 == this);
        int i = abstractC0974.f5309;
        mo2280().remove(i);
        m2292(i);
        abstractC0974.f5308 = null;
    }

    /* renamed from: なぎぱいぢぎ */
    public abstract int mo2285();

    /* renamed from: のぷのちつ */
    public abstract boolean mo2286();

    /* renamed from: は〲ぱなで */
    public abstract void mo2254(Appendable appendable, int i, C0958.C0960 c0960);

    /* renamed from: びぐびあび */
    public abstract C0956 mo2287();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m2295(Appendable appendable, int i, C0958.C0960 c0960) {
        String valueOf;
        Appendable append = appendable.append('\n');
        int i2 = i * c0960.f5279;
        String[] strArr = C0784.f5013;
        if (i2 < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        String[] strArr2 = C0784.f5013;
        if (i2 < strArr2.length) {
            valueOf = strArr2[i2];
        } else {
            char[] cArr = new char[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = ' ';
            }
            valueOf = String.valueOf(cArr);
        }
        append.append(valueOf);
    }

    /* renamed from: ぺぁあねじ */
    public abstract void mo2289(String str);

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C0958.C0960 m2296() {
        AbstractC0974 abstractC0974 = this;
        while (true) {
            AbstractC0974 abstractC09742 = abstractC0974.f5308;
            if (abstractC09742 == null) {
                break;
            }
            abstractC0974 = abstractC09742;
        }
        C0958 c0958 = abstractC0974 instanceof C0958 ? (C0958) abstractC0974 : null;
        if (c0958 == null) {
            c0958 = new C0958("");
        }
        return c0958.f5271;
    }
}
