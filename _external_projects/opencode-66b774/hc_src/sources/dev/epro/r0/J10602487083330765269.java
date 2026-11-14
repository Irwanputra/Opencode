package dev.epro.r0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J10602487083330765269 implements R1924881055215602246 {
    public final Context a;
    public A2789795882633926065 b;
    public final O15319392248629494012 c = new O15319392248629494012(1.0f);
    public X7175349259954592591 d;

    public J10602487083330765269(Context context) {
        this.a = context;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final Object fold(L12639328004344855510 l12639328004344855510, Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.I(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.M(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 plus(G8001132634698687269 g8001132634698687269) {
        return S10823041268949770285.O(this, g8001132634698687269);
    }

    @Override // dev.epro.r0.R1924881055215602246
    public final float q() {
        R4833348786910499294 r4833348786910499294;
        T10320069907180517450 t10320069907180517450;
        if (this.d == null) {
            Context context = this.a;
            A4559761392562572984 a4559761392562572984 = B15311772965484989679.a;
            synchronized (a4559761392562572984) {
                try {
                    Object g = a4559761392562572984.g(context);
                    r4833348786910499294 = null;
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        H17686692708284905246 a = I3887072968740112330.a(-1, 6, null);
                        G6219617120344415229 g6219617120344415229 = new G6219617120344415229(new X14700554270388218583(contentResolver, uriFor, new R15649496231182150652(a, U15853425786981391261.D(Looper.getMainLooper())), a, context, null), (byte) 5);
                        P9515452679798920290 b = V3311072669930093336.b();
                        Y10288379321248498973 y10288379321248498973 = M979257876727257621.a;
                        g = S2941385686793915703.c0(g6219617120344415229, new A2789795882633926065(S10823041268949770285.O(b, S14277978768267526585.a)), new P1480303480448191796(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        a4559761392562572984.n(context, g);
                    }
                    t10320069907180517450 = (T10320069907180517450) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.h(((Number) t10320069907180517450.getValue()).floatValue());
            A2789795882633926065 a2789795882633926065 = this.b;
            if (a2789795882633926065 == null) {
                S10973172697741180971.m("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.d = R7033599853981556291.E(a2789795882633926065, null, null, new Y14354959068095823168(t10320069907180517450, this, r4833348786910499294, (byte) 28), 3);
        }
        return this.c.g();
    }
}
