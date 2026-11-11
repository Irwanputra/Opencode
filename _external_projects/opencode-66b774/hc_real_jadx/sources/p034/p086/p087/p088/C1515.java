package p034.p086.p087.p088;

import java.util.HashMap;
import p034.p086.p087.C1548;
import p034.p086.p087.C1550;
import p034.p086.p087.C1558;
import p034.p086.p087.p088.C1517;
import p034.p086.p087.p088.C1544;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1515 extends C1544 {

    /* renamed from: はぁとそぎ, reason: contains not printable characters */
    public boolean f6990;

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public float f6988 = -1.0f;

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public int f6986 = -1;

    /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
    public int f6987 = -1;

    /* renamed from: びがえ〱な, reason: contains not printable characters */
    public C1517 f6991 = this.f7179;

    /* renamed from: かちして〹づ, reason: contains not printable characters */
    public int f6989 = 0;

    public C1515() {
        this.f7211.clear();
        this.f7211.add(this.f6991);
        int length = this.f7190.length;
        for (int i = 0; i < length; i++) {
            this.f7190[i] = this.f6991;
        }
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean mo3312() {
        return true;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public void m3313(int i) {
        C1517 c1517 = this.f6991;
        c1517.f6994 = i;
        c1517.f6996 = true;
        this.f6990 = true;
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public void mo3314(C1558 c1558, boolean z) {
        if (this.f7203 == null) {
            return;
        }
        int m3482 = c1558.m3482(this.f6991);
        if (this.f6989 == 1) {
            this.f7234 = m3482;
            this.f7216 = 0;
            m3421(this.f7203.m3418());
            m3416(0);
            return;
        }
        this.f7234 = 0;
        this.f7216 = m3482;
        m3416(this.f7203.m3438());
        m3421(0);
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public boolean mo3315() {
        return this.f6990;
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo3316(C1558 c1558, boolean z) {
        C1550 m3489;
        C1550 m34892;
        C1550 m34893;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.WRAP_CONTENT;
        C1520 c1520 = (C1520) this.f7203;
        if (c1520 == null) {
            return;
        }
        Object mo3317 = c1520.mo3317(C1517.EnumC1518.LEFT);
        Object mo33172 = c1520.mo3317(C1517.EnumC1518.RIGHT);
        C1544 c1544 = this.f7203;
        boolean z2 = c1544 != null && c1544.f7206[0] == enumC1545;
        if (this.f6989 == 0) {
            mo3317 = c1520.mo3317(C1517.EnumC1518.TOP);
            mo33172 = c1520.mo3317(C1517.EnumC1518.BOTTOM);
            C1544 c15442 = this.f7203;
            z2 = c15442 != null && c15442.f7206[1] == enumC1545;
        }
        if (this.f6990) {
            C1517 c1517 = this.f6991;
            if (c1517.f6996) {
                C1550 m34894 = c1558.m3489(c1517);
                c1558.m3488(m34894, this.f6991.m3333());
                if (this.f6986 != -1) {
                    if (z2) {
                        m34893 = c1558.m3489(mo33172);
                        c1558.m3490(m34893, m34894, 0, 5);
                    }
                    this.f6990 = false;
                    return;
                }
                if (this.f6987 != -1 && z2) {
                    m34893 = c1558.m3489(mo33172);
                    c1558.m3490(m34894, c1558.m3489(mo3317), 0, 5);
                    c1558.m3490(m34893, m34894, 0, 5);
                }
                this.f6990 = false;
                return;
            }
        }
        if (this.f6986 != -1) {
            m3489 = c1558.m3489(this.f6991);
            c1558.m3493(m3489, c1558.m3489(mo3317), this.f6986, 8);
            if (!z2) {
                return;
            } else {
                m34892 = c1558.m3489(mo33172);
            }
        } else {
            if (this.f6987 == -1) {
                if (this.f6988 != -1.0f) {
                    C1550 m34895 = c1558.m3489(this.f6991);
                    C1550 m34896 = c1558.m3489(mo33172);
                    float f = this.f6988;
                    C1548 m3491 = c1558.m3491();
                    m3491.f7259.mo3458(m34895, -1.0f);
                    m3491.f7259.mo3458(m34896, f);
                    c1558.m3483(m3491);
                    return;
                }
                return;
            }
            m3489 = c1558.m3489(this.f6991);
            m34892 = c1558.m3489(mo33172);
            c1558.m3493(m3489, m34892, -this.f6987, 8);
            if (!z2) {
                return;
            } else {
                c1558.m3490(m3489, c1558.m3489(mo3317), 0, 5);
            }
        }
        c1558.m3490(m34892, m3489, 0, 5);
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C1517 mo3317(C1517.EnumC1518 enumC1518) {
        switch (enumC1518) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
            case RIGHT:
                if (this.f6989 == 1) {
                    return this.f6991;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f6989 == 0) {
                    return this.f6991;
                }
                break;
        }
        throw new AssertionError(enumC1518.name());
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public void m3318(int i) {
        if (this.f6989 == i) {
            return;
        }
        this.f6989 = i;
        this.f7211.clear();
        this.f6991 = this.f6989 == 1 ? this.f7235 : this.f7179;
        this.f7211.add(this.f6991);
        int length = this.f7190.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f7190[i2] = this.f6991;
        }
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public boolean mo3319() {
        return this.f6990;
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo3320(C1544 c1544, HashMap<C1544, C1544> hashMap) {
        super.mo3320(c1544, hashMap);
        C1515 c1515 = (C1515) c1544;
        this.f6988 = c1515.f6988;
        this.f6986 = c1515.f6986;
        this.f6987 = c1515.f6987;
        m3318(c1515.f6989);
    }
}
