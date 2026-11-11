package p034.p086.p087.p088;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p034.p086.p087.C1550;
import p034.p086.p087.p088.p089.C1540;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1517 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f6994;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f6996;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final EnumC1518 f6998;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1517 f6999;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1544 f7000;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1550 f7001;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public HashSet<C1517> f6997 = null;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f6995 = 0;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f6993 = -1;

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC1518 {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C1517(C1544 c1544, EnumC1518 enumC1518) {
        this.f7000 = c1544;
        this.f6998 = enumC1518;
    }

    public String toString() {
        return this.f7000.f7172 + ":" + this.f6998.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m3323() {
        HashSet<C1517> hashSet = this.f6997;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m3324(C1517 c1517, int i, int i2, boolean z) {
        if (c1517 == null) {
            m3336();
            return true;
        }
        if (!z && !m3326(c1517)) {
            return false;
        }
        this.f6999 = c1517;
        if (c1517.f6997 == null) {
            c1517.f6997 = new HashSet<>();
        }
        HashSet<C1517> hashSet = this.f6999.f6997;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f6995 = i;
        } else {
            this.f6995 = 0;
        }
        this.f6993 = i2;
        return true;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m3325() {
        HashSet<C1517> hashSet = this.f6997;
        if (hashSet == null) {
            return false;
        }
        Iterator<C1517> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m3331().m3335()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m3326(C1517 c1517) {
        EnumC1518 enumC1518 = EnumC1518.CENTER_Y;
        EnumC1518 enumC15182 = EnumC1518.CENTER_X;
        EnumC1518 enumC15183 = EnumC1518.BASELINE;
        if (c1517 == null) {
            return false;
        }
        EnumC1518 enumC15184 = c1517.f6998;
        EnumC1518 enumC15185 = this.f6998;
        if (enumC15184 == enumC15185) {
            return enumC15185 != enumC15183 || (c1517.f7000.f7224 && this.f7000.f7224);
        }
        switch (enumC15185) {
            case NONE:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z = enumC15184 == EnumC1518.LEFT || enumC15184 == EnumC1518.RIGHT;
                if (c1517.f7000 instanceof C1515) {
                    return z || enumC15184 == enumC15182;
                }
                return z;
            case TOP:
            case BOTTOM:
                boolean z2 = enumC15184 == EnumC1518.TOP || enumC15184 == EnumC1518.BOTTOM;
                if (c1517.f7000 instanceof C1515) {
                    return z2 || enumC15184 == enumC1518;
                }
                return z2;
            case CENTER:
                return (enumC15184 == enumC15183 || enumC15184 == enumC15182 || enumC15184 == enumC1518) ? false : true;
            default:
                throw new AssertionError(this.f6998.name());
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3327(int i, ArrayList<C1540> arrayList, C1540 c1540) {
        HashSet<C1517> hashSet = this.f6997;
        if (hashSet != null) {
            Iterator<C1517> it = hashSet.iterator();
            while (it.hasNext()) {
                C2786.m4776(it.next().f7000, i, arrayList, c1540);
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m3328(C1517 c1517, int i) {
        return m3324(c1517, i, -1, false);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int m3329() {
        C1517 c1517;
        if (this.f7000.f7217 == 8) {
            return 0;
        }
        int i = this.f6993;
        return (i <= -1 || (c1517 = this.f6999) == null || c1517.f7000.f7217 != 8) ? this.f6995 : i;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m3330() {
        C1550 c1550 = this.f7001;
        if (c1550 == null) {
            this.f7001 = new C1550(C1550.EnumC1551.UNRESTRICTED);
        } else {
            c1550.m3468();
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C1517 m3331() {
        switch (this.f6998) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f7000.f7202;
            case TOP:
                return this.f7000.f7228;
            case RIGHT:
                return this.f7000.f7235;
            case BOTTOM:
                return this.f7000.f7179;
            default:
                throw new AssertionError(this.f6998.name());
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m3332(int i) {
        this.f6994 = i;
        this.f6996 = true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m3333() {
        if (this.f6996) {
            return this.f6994;
        }
        return 0;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m3334(int i) {
        if (m3335()) {
            this.f6993 = i;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean m3335() {
        return this.f6999 != null;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m3336() {
        HashSet<C1517> hashSet;
        C1517 c1517 = this.f6999;
        if (c1517 != null && (hashSet = c1517.f6997) != null) {
            hashSet.remove(this);
            if (this.f6999.f6997.size() == 0) {
                this.f6999.f6997 = null;
            }
        }
        this.f6997 = null;
        this.f6999 = null;
        this.f6995 = 0;
        this.f6993 = -1;
        this.f6996 = false;
        this.f6994 = 0;
    }
}
