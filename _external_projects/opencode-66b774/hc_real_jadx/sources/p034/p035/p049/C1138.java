package p034.p035.p049;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1138 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final InterfaceC1144 f5675;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final InterfaceC1144 f5677;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final InterfaceC1144 f5676 = new C1142(null, false);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final InterfaceC1144 f5674 = new C1142(null, true);

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.づざかべべ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1139 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        int mo2575(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.づざかべべ$くし〴〺ぅ, reason: contains not printable characters */
    public static abstract class AbstractC1140 implements InterfaceC1144 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final InterfaceC1139 f5678;

        public AbstractC1140(InterfaceC1139 interfaceC1139) {
            this.f5678 = interfaceC1139;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean m2576(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            InterfaceC1139 interfaceC1139 = this.f5678;
            if (interfaceC1139 == null) {
                return mo2577();
            }
            int mo2575 = interfaceC1139.mo2575(charSequence, i, i2);
            if (mo2575 == 0) {
                return true;
            }
            if (mo2575 != 1) {
                return mo2577();
            }
            return false;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract boolean mo2577();
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1141 implements InterfaceC1139 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final C1141 f5679 = new C1141();

        @Override // p034.p035.p049.C1138.InterfaceC1139
        /* renamed from: げつ〴ぬぐ */
        public int mo2575(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                InterfaceC1144 interfaceC1144 = C1138.f5676;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                        i++;
                    }
                    i4 = 0;
                    i++;
                }
                i4 = 1;
                i++;
            }
            return i4;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.づざかべべ$びぐびあび, reason: contains not printable characters */
    public static class C1142 extends AbstractC1140 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final boolean f5680;

        public C1142(InterfaceC1139 interfaceC1139, boolean z) {
            super(interfaceC1139);
            this.f5680 = z;
        }

        @Override // p034.p035.p049.C1138.AbstractC1140
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2577() {
            return this.f5680;
        }
    }

    static {
        C1141 c1141 = C1141.f5679;
        f5675 = new C1142(c1141, false);
        f5677 = new C1142(c1141, true);
    }
}
