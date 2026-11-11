package p034.p035.p049;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import p034.p035.p049.C1138;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1136 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final C1136 f5661;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final C1136 f5662;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final String f5663;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final String f5664;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final InterfaceC1144 f5665;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f5666;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC1144 f5667;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean f5668;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1137 {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public static final byte[] f5669 = new byte[1792];

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f5670;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f5671;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final CharSequence f5672;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public char f5673;

        static {
            for (int i = 0; i < 1792; i++) {
                f5669[i] = Character.getDirectionality(i);
            }
        }

        public C1137(CharSequence charSequence, boolean z) {
            this.f5672 = charSequence;
            this.f5670 = charSequence.length();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public byte m2574() {
            char charAt = this.f5672.charAt(this.f5671 - 1);
            this.f5673 = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f5672, this.f5671);
                this.f5671 -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f5671--;
            char c = this.f5673;
            return c < 1792 ? f5669[c] : Character.getDirectionality(c);
        }
    }

    static {
        InterfaceC1144 interfaceC1144 = C1138.f5675;
        f5665 = interfaceC1144;
        f5663 = Character.toString((char) 8206);
        f5664 = Character.toString((char) 8207);
        f5662 = new C1136(false, 2, interfaceC1144);
        f5661 = new C1136(true, 2, interfaceC1144);
    }

    public C1136(boolean z, int i, InterfaceC1144 interfaceC1144) {
        this.f5668 = z;
        this.f5666 = i;
        this.f5667 = interfaceC1144;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m2570(CharSequence charSequence) {
        C1137 c1137 = new C1137(charSequence, false);
        c1137.f5671 = c1137.f5670;
        int i = 0;
        int i2 = 0;
        while (c1137.f5671 > 0) {
            byte m2574 = c1137.m2574();
            if (m2574 != 0) {
                if (m2574 == 1 || m2574 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (m2574 != 9) {
                    switch (m2574) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1136 m2571() {
        boolean z = C1143.m2578(Locale.getDefault()) == 1;
        InterfaceC1144 interfaceC1144 = f5665;
        return interfaceC1144 == f5665 ? z ? f5661 : f5662 : new C1136(z, 2, interfaceC1144);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        if (r3 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        if (r4 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0079, code lost:
    
        if (r0.f5671 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        switch(r0.m2574()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        if (r3 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008e, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008a, code lost:
    
        if (r3 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return 0;
     */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2572(java.lang.CharSequence r9) {
        /*
            づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.げつ〴ぬぐ$げつ〴ぬぐ r0 = new づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.げつ〴ぬぐ$げつ〴ぬぐ
            r1 = 0
            r0.<init>(r9, r1)
            r0.f5671 = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r0.f5671
            int r7 = r0.f5670
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f5672
            char r6 = r7.charAt(r6)
            r0.f5673 = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f5672
            int r7 = r0.f5671
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f5671
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f5671 = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f5671
            int r6 = r6 + r2
            r0.f5671 = r6
            char r6 = r0.f5673
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = p034.p035.p049.C1136.C1137.f5669
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = 0
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = 1
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = -1
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r1 = r4
            goto L91
        L77:
            int r4 = r0.f5671
            if (r4 <= 0) goto L91
            byte r4 = r0.m2574()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r1 = 1
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r1 = -1
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p049.C1136.m2572(java.lang.CharSequence):int");
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public CharSequence m2573(CharSequence charSequence, InterfaceC1144 interfaceC1144, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean m2576 = ((C1138.AbstractC1140) interfaceC1144).m2576(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f5666 & 2) != 0) && z) {
            boolean m25762 = ((C1138.AbstractC1140) (m2576 ? C1138.f5674 : C1138.f5676)).m2576(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f5668 || !(m25762 || m2572(charSequence) == 1)) ? (!this.f5668 || (m25762 && m2572(charSequence) != -1)) ? "" : f5664 : f5663));
        }
        if (m2576 != this.f5668) {
            spannableStringBuilder.append(m2576 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean m25763 = ((C1138.AbstractC1140) (m2576 ? C1138.f5674 : C1138.f5676)).m2576(charSequence, 0, charSequence.length());
            if (!this.f5668 && (m25763 || m2570(charSequence) == 1)) {
                str = f5663;
            } else if (this.f5668 && (!m25763 || m2570(charSequence) == -1)) {
                str = f5664;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
