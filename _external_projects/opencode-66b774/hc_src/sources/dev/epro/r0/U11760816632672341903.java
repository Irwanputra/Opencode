package dev.epro.r0;

import java.text.BreakIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U11760816632672341903 extends R4239627874707364917 {
    public static U11760816632672341903 q;
    public static U11760816632672341903 r;
    public static U11760816632672341903 s;
    public static final O16392062884302746898 t = O16392062884302746898.b;
    public static final O16392062884302746898 u = O16392062884302746898.a;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f516o;
    public Object p;

    @Override // dev.epro.r0.R4239627874707364917
    public final int[] i(int i) {
        int i2;
        switch (this.f516o) {
            case 0:
                int length = m().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.p;
                    if (breakIterator == null) {
                        S10823041268949770285.b0("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.p;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            S10823041268949770285.b0("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return l(i, following);
                    }
                    if (breakIterator2 == null) {
                        S10823041268949770285.b0("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (m().length() <= 0 || i >= m().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!t(i) && (!t(i) || (i != 0 && t(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.p;
                    if (breakIterator3 == null) {
                        S10823041268949770285.b0("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.p;
                if (breakIterator4 == null) {
                    S10823041268949770285.b0("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !s(following2)) {
                    return null;
                }
                return l(i, following2);
            default:
                if (m().length() <= 0 || i >= m().length()) {
                    return null;
                }
                Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) this.p;
                O16392062884302746898 o16392062884302746898 = t;
                if (i < 0) {
                    if (q17957571128037780363 == null) {
                        S10823041268949770285.b0("layoutResult");
                        throw null;
                    }
                    i2 = q17957571128037780363.b.d(0);
                } else {
                    if (q17957571128037780363 == null) {
                        S10823041268949770285.b0("layoutResult");
                        throw null;
                    }
                    int d = q17957571128037780363.b.d(i);
                    i2 = q(d, o16392062884302746898) == i ? d : d + 1;
                }
                Q17957571128037780363 q179575711280377803632 = (Q17957571128037780363) this.p;
                if (q179575711280377803632 == null) {
                    S10823041268949770285.b0("layoutResult");
                    throw null;
                }
                if (i2 >= q179575711280377803632.b.f) {
                    return null;
                }
                return l(q(i2, o16392062884302746898), q(i2, u) + 1);
        }
    }

    @Override // dev.epro.r0.R4239627874707364917
    public final int[] o(int i) {
        int i2;
        switch (this.f516o) {
            case 0:
                int length = m().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.p;
                    if (breakIterator == null) {
                        S10823041268949770285.b0("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.p;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            S10823041268949770285.b0("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return l(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        S10823041268949770285.b0("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = m().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !t(i - 1) && !s(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.p;
                    if (breakIterator3 == null) {
                        S10823041268949770285.b0("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.p;
                if (breakIterator4 == null) {
                    S10823041268949770285.b0("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !t(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !t(preceding2 - 1)) {
                    return l(preceding2, i);
                }
                return null;
            default:
                if (m().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = m().length();
                Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) this.p;
                O16392062884302746898 o16392062884302746898 = u;
                if (i > length3) {
                    if (q17957571128037780363 == null) {
                        S10823041268949770285.b0("layoutResult");
                        throw null;
                    }
                    i2 = q17957571128037780363.b.d(m().length());
                } else {
                    if (q17957571128037780363 == null) {
                        S10823041268949770285.b0("layoutResult");
                        throw null;
                    }
                    int d = q17957571128037780363.b.d(i);
                    i2 = q(d, o16392062884302746898) + 1 == i ? d : d - 1;
                }
                if (i2 < 0) {
                    return null;
                }
                return l(q(i2, t), q(i2, o16392062884302746898) + 1);
        }
    }

    public int q(int i, O16392062884302746898 o16392062884302746898) {
        Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) this.p;
        if (q17957571128037780363 == null) {
            S10823041268949770285.b0("layoutResult");
            throw null;
        }
        int h = q17957571128037780363.h(i);
        Q17957571128037780363 q179575711280377803632 = (Q17957571128037780363) this.p;
        if (q179575711280377803632 == null) {
            S10823041268949770285.b0("layoutResult");
            throw null;
        }
        O16392062884302746898 i2 = q179575711280377803632.i(h);
        Q17957571128037780363 q179575711280377803633 = (Q17957571128037780363) this.p;
        if (o16392062884302746898 != i2) {
            if (q179575711280377803633 != null) {
                return q179575711280377803633.h(i);
            }
            S10823041268949770285.b0("layoutResult");
            throw null;
        }
        if (q179575711280377803633 != null) {
            return q179575711280377803633.b.c(i, false) - 1;
        }
        S10823041268949770285.b0("layoutResult");
        throw null;
    }

    public void r(String str) {
        switch (this.f516o) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.p;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    S10823041268949770285.b0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.p;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    S10823041268949770285.b0("impl");
                    throw null;
                }
        }
    }

    public boolean s(int i) {
        if (i <= 0 || !t(i - 1)) {
            return false;
        }
        return i == m().length() || !t(i);
    }

    public boolean t(int i) {
        if (i < 0 || i >= m().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m().codePointAt(i));
    }
}
