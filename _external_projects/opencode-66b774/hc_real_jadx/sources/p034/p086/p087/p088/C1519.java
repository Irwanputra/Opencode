package p034.p086.p087.p088;

import java.util.HashMap;
import p034.p086.p087.C1548;
import p034.p086.p087.C1550;
import p034.p086.p087.C1558;
import p034.p086.p087.p088.C1517;
import p034.p086.p087.p088.C1544;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1519 extends C1546 {

    /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
    public int f7012 = 0;

    /* renamed from: びがえ〱な, reason: contains not printable characters */
    public boolean f7015 = true;

    /* renamed from: かちして〹づ, reason: contains not printable characters */
    public int f7013 = 0;

    /* renamed from: はぁとそぎ, reason: contains not printable characters */
    public boolean f7014 = false;

    @Override // p034.p086.p087.p088.C1544
    public String toString() {
        String m4198 = C2098.m4198(C2098.m4207("[Barrier] "), this.f7172, " {");
        for (int i = 0; i < this.f7242; i++) {
            C1544 c1544 = this.f7243[i];
            if (i > 0) {
                m4198 = C2098.m4205(m4198, ", ");
            }
            StringBuilder m4207 = C2098.m4207(m4198);
            m4207.append(c1544.f7172);
            m4198 = m4207.toString();
        }
        return C2098.m4205(m4198, "}");
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ぁごぐすすぃ */
    public boolean mo3312() {
        return true;
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: じぜこほぱ */
    public boolean mo3315() {
        return this.f7014;
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: なぎぱいぢぎ */
    public void mo3316(C1558 c1558, boolean z) {
        C1517[] c1517Arr;
        boolean z2;
        C1550 c1550;
        C1517 c1517;
        int i;
        int i2;
        int i3;
        C1550 c15502;
        int i4;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_CONSTRAINT;
        C1517[] c1517Arr2 = this.f7190;
        c1517Arr2[0] = this.f7235;
        c1517Arr2[2] = this.f7179;
        c1517Arr2[1] = this.f7202;
        c1517Arr2[3] = this.f7228;
        int i5 = 0;
        while (true) {
            c1517Arr = this.f7190;
            if (i5 >= c1517Arr.length) {
                break;
            }
            c1517Arr[i5].f7001 = c1558.m3489(c1517Arr[i5]);
            i5++;
        }
        int i6 = this.f7012;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        C1517 c15172 = c1517Arr[i6];
        if (!this.f7014) {
            m3338();
        }
        if (this.f7014) {
            this.f7014 = false;
            int i7 = this.f7012;
            if (i7 == 0 || i7 == 1) {
                c1558.m3488(this.f7235.f7001, this.f7234);
                c15502 = this.f7202.f7001;
                i4 = this.f7234;
            } else {
                if (i7 != 2 && i7 != 3) {
                    return;
                }
                c1558.m3488(this.f7179.f7001, this.f7216);
                c15502 = this.f7228.f7001;
                i4 = this.f7216;
            }
            c1558.m3488(c15502, i4);
            return;
        }
        for (int i8 = 0; i8 < this.f7242; i8++) {
            C1544 c1544 = this.f7243[i8];
            if ((this.f7015 || c1544.mo3312()) && ((((i2 = this.f7012) == 0 || i2 == 1) && c1544.m3424() == enumC1545 && c1544.f7235.f6999 != null && c1544.f7202.f6999 != null) || (((i3 = this.f7012) == 2 || i3 == 3) && c1544.m3430() == enumC1545 && c1544.f7179.f6999 != null && c1544.f7228.f6999 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f7235.m3325() || this.f7202.m3325();
        boolean z4 = this.f7179.m3325() || this.f7228.m3325();
        int i9 = !z2 && (((i = this.f7012) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.f7242; i10++) {
            C1544 c15442 = this.f7243[i10];
            if (this.f7015 || c15442.mo3312()) {
                C1550 m3489 = c1558.m3489(c15442.f7190[this.f7012]);
                C1517[] c1517Arr3 = c15442.f7190;
                int i11 = this.f7012;
                c1517Arr3[i11].f7001 = m3489;
                int i12 = (c1517Arr3[i11].f6999 == null || c1517Arr3[i11].f6999.f7000 != this) ? 0 : c1517Arr3[i11].f6995 + 0;
                if (i11 == 0 || i11 == 2) {
                    C1550 c15503 = c15172.f7001;
                    int i13 = this.f7013 - i12;
                    C1548 m3491 = c1558.m3491();
                    C1550 m3494 = c1558.m3494();
                    m3494.f7271 = 0;
                    m3491.m3452(c15503, m3489, m3494, i13);
                    c1558.m3483(m3491);
                } else {
                    C1550 c15504 = c15172.f7001;
                    int i14 = this.f7013 + i12;
                    C1548 m34912 = c1558.m3491();
                    C1550 m34942 = c1558.m3494();
                    m34942.f7271 = 0;
                    m34912.m3450(c15504, m3489, m34942, i14);
                    c1558.m3483(m34912);
                }
                c1558.m3493(c15172.f7001, m3489, this.f7013 + i12, i9);
            }
        }
        int i15 = this.f7012;
        if (i15 == 0) {
            c1558.m3493(this.f7202.f7001, this.f7235.f7001, 0, 8);
            c1558.m3493(this.f7235.f7001, this.f7203.f7202.f7001, 0, 4);
            c1550 = this.f7235.f7001;
            c1517 = this.f7203.f7235;
        } else if (i15 == 1) {
            c1558.m3493(this.f7235.f7001, this.f7202.f7001, 0, 8);
            c1558.m3493(this.f7235.f7001, this.f7203.f7235.f7001, 0, 4);
            c1550 = this.f7235.f7001;
            c1517 = this.f7203.f7202;
        } else if (i15 == 2) {
            c1558.m3493(this.f7228.f7001, this.f7179.f7001, 0, 8);
            c1558.m3493(this.f7179.f7001, this.f7203.f7228.f7001, 0, 4);
            c1550 = this.f7179.f7001;
            c1517 = this.f7203.f7179;
        } else {
            if (i15 != 3) {
                return;
            }
            c1558.m3493(this.f7179.f7001, this.f7228.f7001, 0, 8);
            c1558.m3493(this.f7179.f7001, this.f7203.f7179.f7001, 0, 4);
            c1550 = this.f7179.f7001;
            c1517 = this.f7203.f7228;
        }
        c1558.m3493(c1550, c1517.f7001, 0, 0);
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public int m3337() {
        int i = this.f7012;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public boolean m3338() {
        int i;
        C1517 mo3317;
        C1517 mo33172;
        C1517 mo33173;
        int i2;
        int i3;
        C1517.EnumC1518 enumC1518 = C1517.EnumC1518.BOTTOM;
        C1517.EnumC1518 enumC15182 = C1517.EnumC1518.TOP;
        C1517.EnumC1518 enumC15183 = C1517.EnumC1518.RIGHT;
        C1517.EnumC1518 enumC15184 = C1517.EnumC1518.LEFT;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f7242;
            if (i4 >= i) {
                break;
            }
            C1544 c1544 = this.f7243[i4];
            if ((this.f7015 || c1544.mo3312()) && ((((i2 = this.f7012) == 0 || i2 == 1) && !c1544.mo3315()) || (((i3 = this.f7012) == 2 || i3 == 3) && !c1544.mo3319()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f7242; i6++) {
            C1544 c15442 = this.f7243[i6];
            if (this.f7015 || c15442.mo3312()) {
                if (!z2) {
                    int i7 = this.f7012;
                    if (i7 == 0) {
                        mo33173 = c15442.mo3317(enumC15184);
                    } else if (i7 == 1) {
                        mo33173 = c15442.mo3317(enumC15183);
                    } else if (i7 == 2) {
                        mo33173 = c15442.mo3317(enumC15182);
                    } else {
                        if (i7 == 3) {
                            mo33173 = c15442.mo3317(enumC1518);
                        }
                        z2 = true;
                    }
                    i5 = mo33173.m3333();
                    z2 = true;
                }
                int i8 = this.f7012;
                if (i8 == 0) {
                    mo33172 = c15442.mo3317(enumC15184);
                } else {
                    if (i8 == 1) {
                        mo3317 = c15442.mo3317(enumC15183);
                    } else if (i8 == 2) {
                        mo33172 = c15442.mo3317(enumC15182);
                    } else if (i8 == 3) {
                        mo3317 = c15442.mo3317(enumC1518);
                    }
                    i5 = Math.max(i5, mo3317.m3333());
                }
                i5 = Math.min(i5, mo33172.m3333());
            }
        }
        int i9 = i5 + this.f7013;
        int i10 = this.f7012;
        if (i10 == 0 || i10 == 1) {
            m3408(i9, i9);
        } else {
            m3414(i9, i9);
        }
        this.f7014 = true;
        return true;
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ぺづげぺが */
    public boolean mo3319() {
        return this.f7014;
    }

    @Override // p034.p086.p087.p088.C1546, p034.p086.p087.p088.C1544
    /* renamed from: ぺふねづ〺 */
    public void mo3320(C1544 c1544, HashMap<C1544, C1544> hashMap) {
        super.mo3320(c1544, hashMap);
        C1519 c1519 = (C1519) c1544;
        this.f7012 = c1519.f7012;
        this.f7015 = c1519.f7015;
        this.f7013 = c1519.f7013;
    }
}
