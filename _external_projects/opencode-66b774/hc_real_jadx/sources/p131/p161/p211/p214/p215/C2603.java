package p131.p161.p211.p214.p215;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.C2541;
import p131.p161.p211.C2655;
import p131.p161.p211.C2660;
import p131.p161.p211.C2670;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p214.C2637;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2603 extends C2535 {

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final Object f10014;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public String[] f10015;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int[] f10016;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Object[] f10017;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f10018;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2604 extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new C2604();
        f10014 = new Object();
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    private String m4602() {
        StringBuilder m4207 = C2098.m4207(" at path ");
        m4207.append(mo4561());
        return m4207.toString();
    }

    @Override // p131.p161.p211.p213.C2535, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10017 = new Object[]{f10014};
        this.f10018 = 1;
    }

    @Override // p131.p161.p211.p213.C2535
    public String toString() {
        return C2603.class.getSimpleName();
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: 〱こか〺ぃせ */
    public EnumC2533 mo4559() {
        if (this.f10018 == 0) {
            return EnumC2533.END_DOCUMENT;
        }
        Object m4605 = m4605();
        if (m4605 instanceof Iterator) {
            boolean z = this.f10017[this.f10018 - 2] instanceof C2541;
            Iterator it = (Iterator) m4605;
            if (!it.hasNext()) {
                return z ? EnumC2533.END_OBJECT : EnumC2533.END_ARRAY;
            }
            if (z) {
                return EnumC2533.NAME;
            }
            m4606(it.next());
            return mo4559();
        }
        if (m4605 instanceof C2541) {
            return EnumC2533.BEGIN_OBJECT;
        }
        if (m4605 instanceof C2670) {
            return EnumC2533.BEGIN_ARRAY;
        }
        if (!(m4605 instanceof C2655)) {
            if (m4605 instanceof C2660) {
                return EnumC2533.NULL;
            }
            if (m4605 == f10014) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Object obj = ((C2655) m4605).f10116;
        if (obj instanceof String) {
            return EnumC2533.STRING;
        }
        if (obj instanceof Boolean) {
            return EnumC2533.BOOLEAN;
        }
        if (obj instanceof Number) {
            return EnumC2533.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: 〺でおいここ */
    public String mo4561() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f10018) {
            Object[] objArr = this.f10017;
            if (objArr[i] instanceof C2670) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f10016[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C2541) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f10015;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: ぃぜぶの〸ぃ */
    public boolean mo4562() {
        m4604(EnumC2533.BOOLEAN);
        boolean m4636 = ((C2655) m4603()).m4636();
        int i = this.f10018;
        if (i > 0) {
            int[] iArr = this.f10016;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m4636;
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: ぇとしたべど */
    public boolean mo4563() {
        EnumC2533 mo4559 = mo4559();
        return (mo4559 == EnumC2533.END_OBJECT || mo4559 == EnumC2533.END_ARRAY) ? false : true;
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: えがぐせほち */
    public long mo4564() {
        EnumC2533 mo4559 = mo4559();
        EnumC2533 enumC2533 = EnumC2533.NUMBER;
        if (mo4559 != enumC2533 && mo4559 != EnumC2533.STRING) {
            throw new IllegalStateException("Expected " + enumC2533 + " but was " + mo4559 + m4602());
        }
        C2655 c2655 = (C2655) m4605();
        long longValue = c2655.f10116 instanceof Number ? c2655.m4637().longValue() : Long.parseLong(c2655.m4638());
        m4603();
        int i = this.f10018;
        if (i > 0) {
            int[] iArr = this.f10016;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return longValue;
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public final Object m4603() {
        Object[] objArr = this.f10017;
        int i = this.f10018 - 1;
        this.f10018 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public final void m4604(EnumC2533 enumC2533) {
        if (mo4559() == enumC2533) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC2533 + " but was " + mo4559() + m4602());
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: けときぜと */
    public void mo4570() {
        m4604(EnumC2533.END_OBJECT);
        m4603();
        m4603();
        int i = this.f10018;
        if (i > 0) {
            int[] iArr = this.f10016;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: こ〲しでおか */
    public void mo4572() {
        m4604(EnumC2533.NULL);
        m4603();
        int i = this.f10018;
        if (i > 0) {
            int[] iArr = this.f10016;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: じぜこほぱ */
    public void mo4574() {
        m4604(EnumC2533.BEGIN_ARRAY);
        m4606(((C2670) m4605()).iterator());
        this.f10016[this.f10018 - 1] = 0;
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: ち〴みぎ〻び */
    public int mo4577() {
        EnumC2533 mo4559 = mo4559();
        EnumC2533 enumC2533 = EnumC2533.NUMBER;
        if (mo4559 != enumC2533 && mo4559 != EnumC2533.STRING) {
            throw new IllegalStateException("Expected " + enumC2533 + " but was " + mo4559 + m4602());
        }
        C2655 c2655 = (C2655) m4605();
        int intValue = c2655.f10116 instanceof Number ? c2655.m4637().intValue() : Integer.parseInt(c2655.m4638());
        m4603();
        int i = this.f10018;
        if (i > 0) {
            int[] iArr = this.f10016;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return intValue;
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: ておぞぞはね */
    public double mo4578() {
        EnumC2533 mo4559 = mo4559();
        EnumC2533 enumC2533 = EnumC2533.NUMBER;
        if (mo4559 != enumC2533 && mo4559 != EnumC2533.STRING) {
            throw new IllegalStateException("Expected " + enumC2533 + " but was " + mo4559 + m4602());
        }
        C2655 c2655 = (C2655) m4605();
        double doubleValue = c2655.f10116 instanceof Number ? c2655.m4637().doubleValue() : Double.parseDouble(c2655.m4638());
        if (!this.f9901 && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        m4603();
        int i = this.f10018;
        if (i > 0) {
            int[] iArr = this.f10016;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return doubleValue;
    }

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public final Object m4605() {
        return this.f10017[this.f10018 - 1];
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: のね〱ばぁぢ */
    public String mo4580() {
        EnumC2533 mo4559 = mo4559();
        EnumC2533 enumC2533 = EnumC2533.STRING;
        if (mo4559 == enumC2533 || mo4559 == EnumC2533.NUMBER) {
            String m4638 = ((C2655) m4603()).m4638();
            int i = this.f10018;
            if (i > 0) {
                int[] iArr = this.f10016;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return m4638;
        }
        throw new IllegalStateException("Expected " + enumC2533 + " but was " + mo4559 + m4602());
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public final void m4606(Object obj) {
        int i = this.f10018;
        Object[] objArr = this.f10017;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f10017 = Arrays.copyOf(objArr, i2);
            this.f10016 = Arrays.copyOf(this.f10016, i2);
            this.f10015 = (String[]) Arrays.copyOf(this.f10015, i2);
        }
        Object[] objArr2 = this.f10017;
        int i3 = this.f10018;
        this.f10018 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: はつきどっ */
    public void mo4581() {
        if (mo4559() == EnumC2533.NAME) {
            mo4582();
            this.f10015[this.f10018 - 2] = "null";
        } else {
            m4603();
            int i = this.f10018;
            if (i > 0) {
                this.f10015[i - 1] = "null";
            }
        }
        int i2 = this.f10018;
        if (i2 > 0) {
            int[] iArr = this.f10016;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: ばおぢでぎか */
    public String mo4582() {
        m4604(EnumC2533.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m4605()).next();
        String str = (String) entry.getKey();
        this.f10015[this.f10018 - 1] = str;
        m4606(entry.getValue());
        return str;
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: ぷぞてのほき */
    public void mo4583() {
        m4604(EnumC2533.END_ARRAY);
        m4603();
        m4603();
        int i = this.f10018;
        if (i > 0) {
            int[] iArr = this.f10016;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p131.p161.p211.p213.C2535
    /* renamed from: ぺづげぺが */
    public void mo4585() {
        m4604(EnumC2533.BEGIN_OBJECT);
        m4606(new C2637.C2638.C2639((C2637.C2638) ((C2541) m4605()).f9912.entrySet()));
    }
}
