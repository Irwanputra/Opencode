package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class T8346709655775060714 extends U4020053660465689583 implements R4833348786910499294, W5797197595347441198 {
    public final G8001132634698687269 c;

    public T8346709655775060714(G8001132634698687269 g8001132634698687269, boolean z) {
        super(z);
        P((Q15035754882231748864) g8001132634698687269.get(P2382941533350862833.p));
        this.c = g8001132634698687269.plus(this);
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final void O(M8821877208104636290 m8821877208104636290) {
        C9869900372345142877.I(this.c, m8821877208104636290);
    }

    @Override // dev.epro.r0.U4020053660465689583
    public String U() {
        return super.U();
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final void X(Object obj) {
        if (!(obj instanceof T13610764347093379131)) {
            g0(obj);
        } else {
            T13610764347093379131 t13610764347093379131 = (T13610764347093379131) obj;
            f0(t13610764347093379131.a, T5284056093300834442.a.getIntVolatile(t13610764347093379131, T13610764347093379131.b) != 0);
        }
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return this.c;
    }

    @Override // dev.epro.r0.W5797197595347441198
    public final G8001132634698687269 h() {
        return this.c;
    }

    public final void h0(L856869997670741194 l856869997670741194, T8346709655775060714 t8346709655775060714, L12639328004344855510 l12639328004344855510) {
        Object invoke;
        int ordinal = l856869997670741194.ordinal();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (ordinal == 0) {
            try {
                J8045362843799184672.q0(E18444280280170001567.H(E18444280280170001567.z(t8346709655775060714, this, l12639328004344855510)), o9245300239821758723);
                return;
            } finally {
                resumeWith(new C10696704014433963524(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                l12639328004344855510.getClass();
                E18444280280170001567.H(E18444280280170001567.z(t8346709655775060714, this, l12639328004344855510)).resumeWith(o9245300239821758723);
                return;
            }
            if (ordinal != 3) {
                Z3383101362411723454.g();
                return;
            }
            try {
                G8001132634698687269 g8001132634698687269 = this.c;
                Object c0 = S10823041268949770285.c0(g8001132634698687269, null);
                try {
                    if (l12639328004344855510 instanceof B401944902727389462) {
                        V12319504402545346730.s(2, l12639328004344855510);
                        invoke = l12639328004344855510.invoke(t8346709655775060714, this);
                    } else {
                        invoke = E18444280280170001567.a0(l12639328004344855510, t8346709655775060714, this);
                    }
                    S10823041268949770285.X(g8001132634698687269, c0);
                    if (invoke != Z3437138737604933638.a) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    S10823041268949770285.X(g8001132634698687269, c0);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        Throwable a = I11772848013184437928.a(obj);
        if (a != null) {
            obj = new T13610764347093379131(a, false);
        }
        Object T = T(obj);
        if (T == O4077903568229246.m) {
            return;
        }
        w(T);
    }

    public void g0(Object obj) {
    }

    public void f0(Throwable th, boolean z) {
    }
}
