package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P14363171583196137821;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S17468460685202108735;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.Y2666402291564931474;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class x5 implements K4548097313143615345 {
    public final O16637889491137121389 a;
    public final U4857089234315512256 b;
    public final Optional c;
    public final sv2 d;
    public final Context e;
    public final qw2 f;
    public final boolean g;
    public final jr0 h;
    public final long i;
    public final boolean j;
    public final Optional k;

    public x5(O16637889491137121389 o16637889491137121389, U4857089234315512256 u4857089234315512256, Optional optional, sv2 sv2Var, Context context, qw2 qw2Var, boolean z, jr0 jr0Var, long j, boolean z2, Optional optional2) {
        o16637889491137121389.getClass();
        u4857089234315512256.getClass();
        optional.getClass();
        sv2Var.getClass();
        context.getClass();
        qw2Var.getClass();
        jr0Var.getClass();
        optional2.getClass();
        this.a = o16637889491137121389;
        this.b = u4857089234315512256;
        this.c = optional;
        this.d = sv2Var;
        this.e = context;
        this.f = qw2Var;
        this.g = z;
        this.h = jr0Var;
        this.i = j;
        this.j = z2;
        this.k = optional2;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.AD_REQUEST;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        E4916761685899363666 a = this.d.a();
        P5733283974459951585 p5733283974459951585 = rw0.f;
        boolean a2 = (Y2666402291564931474.f() && this.b.d.getBoolean("_emulatorLiveAds", false)) ? false : a.a(this.e);
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a.getClass();
        P14363171583196137821 p14363171583196137821 = a.a;
        byte b = a.c.a;
        S17468460685202108735 s17468460685202108735 = (S17468460685202108735) M18113111391818111737.H(this.c);
        boolean d = s17468460685202108735 != null ? s17468460685202108735.d() : false;
        long j = elapsedRealtime - this.i;
        Boolean bool = (Boolean) M18113111391818111737.H(this.k);
        return new xu0(new w5(this.b, elapsedRealtime, p14363171583196137821, a2, this.f, b, d, this.g, this.h, j, this.j, bool != null ? bool.booleanValue() : false));
    }
}
