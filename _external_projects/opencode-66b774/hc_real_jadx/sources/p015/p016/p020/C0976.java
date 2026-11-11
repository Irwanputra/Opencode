package p015.p016.p020;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p015.p016.p017.AbstractC0786;
import p015.p016.p017.C0784;
import p015.p016.p018.C0800;
import p015.p016.p019.C0913;
import p015.p016.p019.InterfaceC0915;
import p015.p016.p020.C0958;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0976 extends AbstractC0974 {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final List<AbstractC0974> f5312 = Collections.emptyList();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String f5313;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C0956 f5314;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public WeakReference<List<C0976>> f5315;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public List<AbstractC0974> f5316;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C0800 f5317;

    /* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ$〺つふすそ, reason: contains not printable characters */
    public static final class C0977 extends AbstractC0786<AbstractC0974> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C0976 f5318;

        public C0977(C0976 c0976, int i) {
            super(i);
            this.f5318 = c0976;
        }

        @Override // p015.p016.p017.AbstractC0786
        /* renamed from: げつ〴ぬぐ */
        public void mo2114() {
            this.f5318.f5315 = null;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0978 implements InterfaceC0915 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ StringBuilder f5319;

        public C0978(C0976 c0976, StringBuilder sb) {
            this.f5319 = sb;
        }

        @Override // p015.p016.p019.InterfaceC0915
        /* renamed from: 〺つふすそ */
        public void mo2240(AbstractC0974 abstractC0974, int i) {
            if ((abstractC0974 instanceof C0976) && ((C0976) abstractC0974).f5317.f5065 && (abstractC0974.m2291() instanceof C0965) && !C0965.m2276(this.f5319)) {
                this.f5319.append(' ');
            }
        }

        @Override // p015.p016.p019.InterfaceC0915
        /* renamed from: げつ〴ぬぐ */
        public void mo2241(AbstractC0974 abstractC0974, int i) {
            if (abstractC0974 instanceof C0965) {
                C0976.m2297(this.f5319, (C0965) abstractC0974);
                return;
            }
            if (abstractC0974 instanceof C0976) {
                C0976 c0976 = (C0976) abstractC0974;
                if (this.f5319.length() > 0) {
                    C0800 c0800 = c0976.f5317;
                    if ((c0800.f5065 || c0800.f5068.equals("br")) && !C0965.m2276(this.f5319)) {
                        this.f5319.append(' ');
                    }
                }
            }
        }
    }

    static {
        Pattern.compile("\\s+");
    }

    public C0976(C0800 c0800, String str, C0956 c0956) {
        C1687.m3701(c0800);
        C1687.m3701(str);
        this.f5316 = f5312;
        this.f5313 = str;
        this.f5314 = c0956;
        this.f5317 = c0800;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static void m2297(StringBuilder sb, C0965 c0965) {
        String m2288 = c0965.m2288();
        if (m2299(c0965.f5308) || (c0965 instanceof C0973)) {
            sb.append(m2288);
            return;
        }
        boolean m2276 = C0965.m2276(sb);
        String[] strArr = C0784.f5013;
        int length = m2288.length();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < length) {
            int codePointAt = m2288.codePointAt(i);
            if (!(codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160)) {
                if (!(Character.getType(codePointAt) == 16 && (codePointAt == 8203 || codePointAt == 8204 || codePointAt == 8205 || codePointAt == 173))) {
                    sb.appendCodePoint(codePointAt);
                    z = true;
                    z2 = false;
                }
            } else if ((!m2276 || z) && !z2) {
                sb.append(' ');
                z2 = true;
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static <E extends C0976> int m2298(C0976 c0976, List<E> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == c0976) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static boolean m2299(AbstractC0974 abstractC0974) {
        if (abstractC0974 != null && (abstractC0974 instanceof C0976)) {
            C0976 c0976 = (C0976) abstractC0974;
            int i = 0;
            while (!c0976.f5317.f5066) {
                c0976 = (C0976) c0976.f5308;
                i++;
                if (i < 6 && c0976 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p015.p016.p020.AbstractC0974
    public String toString() {
        return mo2268();
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: 〳ぜぞぜべっ */
    public AbstractC0974 mo2290(AbstractC0974 abstractC0974) {
        C0976 c0976 = (C0976) super.mo2290(abstractC0974);
        C0956 c0956 = this.f5314;
        c0976.f5314 = c0956 != null ? c0956.clone() : null;
        c0976.f5313 = this.f5313;
        C0977 c0977 = new C0977(c0976, this.f5316.size());
        c0976.f5316 = c0977;
        c0977.addAll(this.f5316);
        return c0976;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: いいにぽつ */
    public List<AbstractC0974> mo2280() {
        if (this.f5316 == f5312) {
            this.f5316 = new C0977(this, 4);
        }
        return this.f5316;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public C0913 m2300() {
        return new C0913(m2301());
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ぇぬぎばつ */
    public String mo2252() {
        return this.f5317.f5068;
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final List<C0976> m2301() {
        List<C0976> list;
        WeakReference<List<C0976>> weakReference = this.f5315;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f5316.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC0974 abstractC0974 = this.f5316.get(i);
            if (abstractC0974 instanceof C0976) {
                arrayList.add((C0976) abstractC0974);
            }
        }
        this.f5315 = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public C0976 m2302() {
        AbstractC0974 abstractC0974 = this.f5308;
        if (abstractC0974 == null) {
            return null;
        }
        List<C0976> m2301 = ((C0976) abstractC0974).m2301();
        Integer valueOf = Integer.valueOf(m2298(this, m2301));
        C1687.m3701(valueOf);
        if (valueOf.intValue() > 0) {
            return m2301.get(valueOf.intValue() - 1);
        }
        return null;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ざとぅぼこ〺 */
    public void mo2253(Appendable appendable, int i, C0958.C0960 c0960) {
        C0976 c0976;
        if (c0960.f5282 && ((this.f5317.f5067 || ((c0976 = (C0976) this.f5308) != null && c0976.f5317.f5067)) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0))) {
            m2295(appendable, i, c0960);
        }
        appendable.append('<').append(this.f5317.f5068);
        C0956 c0956 = this.f5314;
        if (c0956 != null) {
            c0956.m2256(appendable, c0960);
        }
        if (this.f5316.isEmpty()) {
            C0800 c0800 = this.f5317;
            boolean z = c0800.f5069;
            if ((z || c0800.f5070) && (c0960.f5277 != C0958.C0960.EnumC0961.html || !z)) {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public String m2303() {
        StringBuilder sb = new StringBuilder();
        for (AbstractC0974 abstractC0974 : this.f5316) {
            if (abstractC0974 instanceof C0965) {
                m2297(sb, (C0965) abstractC0974);
            } else if ((abstractC0974 instanceof C0976) && ((C0976) abstractC0974).f5317.f5068.equals("br") && !C0965.m2276(sb)) {
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public String m2304() {
        StringBuilder sb = new StringBuilder();
        C1687.m3698(new C0978(this, sb), this);
        return sb.toString().trim();
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: づざかべべ */
    public String mo2283() {
        return this.f5313;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public int m2305() {
        AbstractC0974 abstractC0974 = this.f5308;
        if (((C0976) abstractC0974) == null) {
            return 0;
        }
        return m2298(this, ((C0976) abstractC0974).m2301());
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: なぎぱいぢぎ */
    public int mo2285() {
        return this.f5316.size();
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public String m2306() {
        String m2288;
        StringBuilder sb = new StringBuilder();
        for (AbstractC0974 abstractC0974 : this.f5316) {
            if (abstractC0974 instanceof C0971) {
                m2288 = ((C0971) abstractC0974).m2288();
            } else if (abstractC0974 instanceof C0969) {
                m2288 = ((C0969) abstractC0974).m2288();
            } else if (abstractC0974 instanceof C0976) {
                m2288 = ((C0976) abstractC0974).m2306();
            } else if (abstractC0974 instanceof C0973) {
                m2288 = ((C0973) abstractC0974).m2288();
            }
            sb.append(m2288);
        }
        return sb.toString();
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: のぷのちつ */
    public boolean mo2286() {
        return this.f5314 != null;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: は〲ぱなで */
    public void mo2254(Appendable appendable, int i, C0958.C0960 c0960) {
        if (this.f5316.isEmpty()) {
            C0800 c0800 = this.f5317;
            if (c0800.f5069 || c0800.f5070) {
                return;
            }
        }
        if (c0960.f5282 && !this.f5316.isEmpty() && this.f5317.f5067) {
            m2295(appendable, i, c0960);
        }
        appendable.append("</").append(this.f5317.f5068).append('>');
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: びえぁぜい, reason: merged with bridge method [inline-methods] */
    public C0976 mo2267() {
        return (C0976) super.mo2267();
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: びぐびあび */
    public C0956 mo2287() {
        if (!(this.f5314 != null)) {
            this.f5314 = new C0956();
        }
        return this.f5314;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public C0976 m2307(AbstractC0974 abstractC0974) {
        C1687.m3701(abstractC0974);
        C1687.m3701(this);
        AbstractC0974 abstractC09742 = abstractC0974.f5308;
        if (abstractC09742 != null) {
            abstractC09742.mo2294(abstractC0974);
        }
        abstractC0974.f5308 = this;
        mo2280();
        this.f5316.add(abstractC0974);
        abstractC0974.f5309 = this.f5316.size() - 1;
        return this;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ぺぁあねじ */
    public void mo2289(String str) {
        this.f5313 = str;
    }
}
