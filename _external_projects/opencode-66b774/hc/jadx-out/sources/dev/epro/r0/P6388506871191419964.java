package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P6388506871191419964 extends R4239627874707364917 {
    public static P6388506871191419964 q;
    public static final O16392062884302746898 r = O16392062884302746898.b;
    public static final O16392062884302746898 s = O16392062884302746898.a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Q17957571128037780363 f434o;
    public R6653624393204003746 p;

    @Override // dev.epro.r0.R4239627874707364917
    public final int[] i(int i) {
        int iE;
        if (m().length() > 0 && i < m().length()) {
            try {
                R6653624393204003746 r6653624393204003746 = this.p;
                if (r6653624393204003746 == null) {
                    S10823041268949770285.b0("node");
                    throw null;
                }
                S6349823729575121924 s6349823729575121924G = r6653624393204003746.g();
                int iRound = Math.round(s6349823729575121924G.d - s6349823729575121924G.b);
                if (i <= 0) {
                    i = 0;
                }
                Q17957571128037780363 q17957571128037780363 = this.f434o;
                if (q17957571128037780363 == null) {
                    S10823041268949770285.b0("layoutResult");
                    throw null;
                }
                int iD = q17957571128037780363.b.d(i);
                Q17957571128037780363 q179575711280377803632 = this.f434o;
                if (q179575711280377803632 == null) {
                    S10823041268949770285.b0("layoutResult");
                    throw null;
                }
                float f = q179575711280377803632.b.f(iD) + iRound;
                Q17957571128037780363 q179575711280377803633 = this.f434o;
                if (q179575711280377803633 == null) {
                    S10823041268949770285.b0("layoutResult");
                    throw null;
                }
                float f2 = q179575711280377803633.b.f(r0.f - 1);
                Q17957571128037780363 q179575711280377803634 = this.f434o;
                if (f < f2) {
                    if (q179575711280377803634 == null) {
                        S10823041268949770285.b0("layoutResult");
                        throw null;
                    }
                    iE = q179575711280377803634.b.e(f);
                } else {
                    if (q179575711280377803634 == null) {
                        S10823041268949770285.b0("layoutResult");
                        throw null;
                    }
                    iE = q179575711280377803634.b.f;
                }
                return l(i, q(iE - 1, s) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // dev.epro.r0.R4239627874707364917
    public final int[] o(int i) {
        int iE;
        if (m().length() > 0 && i > 0) {
            try {
                R6653624393204003746 r6653624393204003746 = this.p;
                if (r6653624393204003746 == null) {
                    S10823041268949770285.b0("node");
                    throw null;
                }
                S6349823729575121924 s6349823729575121924G = r6653624393204003746.g();
                int iRound = Math.round(s6349823729575121924G.d - s6349823729575121924G.b);
                int length = m().length();
                if (length <= i) {
                    i = length;
                }
                Q17957571128037780363 q17957571128037780363 = this.f434o;
                if (q17957571128037780363 == null) {
                    S10823041268949770285.b0("layoutResult");
                    throw null;
                }
                int iD = q17957571128037780363.b.d(i);
                Q17957571128037780363 q179575711280377803632 = this.f434o;
                if (q179575711280377803632 == null) {
                    S10823041268949770285.b0("layoutResult");
                    throw null;
                }
                float f = q179575711280377803632.b.f(iD) - iRound;
                if (f > 0.0f) {
                    Q17957571128037780363 q179575711280377803633 = this.f434o;
                    if (q179575711280377803633 == null) {
                        S10823041268949770285.b0("layoutResult");
                        throw null;
                    }
                    iE = q179575711280377803633.b.e(f);
                } else {
                    iE = 0;
                }
                if (i == m().length() && iE < iD) {
                    iE++;
                }
                return l(q(iE, r), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int q(int i, O16392062884302746898 o16392062884302746898) {
        Q17957571128037780363 q17957571128037780363 = this.f434o;
        if (q17957571128037780363 == null) {
            S10823041268949770285.b0("layoutResult");
            throw null;
        }
        int iH = q17957571128037780363.h(i);
        Q17957571128037780363 q179575711280377803632 = this.f434o;
        if (q179575711280377803632 == null) {
            S10823041268949770285.b0("layoutResult");
            throw null;
        }
        O16392062884302746898 o16392062884302746898I = q179575711280377803632.i(iH);
        Q17957571128037780363 q179575711280377803633 = this.f434o;
        if (o16392062884302746898 != o16392062884302746898I) {
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
}
