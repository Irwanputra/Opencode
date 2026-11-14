package dev.epro.r0;

import ads_mobile_sdk.g1;
import ads_mobile_sdk.k43;
import ads_mobile_sdk.s43;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R17532065970449779817 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ F4096073349764486348 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R17532065970449779817(R4833348786910499294 r4833348786910499294, F4096073349764486348 f4096073349764486348, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = f4096073349764486348;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        F4096073349764486348 f4096073349764486348 = this.v;
        switch (b) {
            case 0:
                R17532065970449779817 r17532065970449779817 = new R17532065970449779817(r4833348786910499294, f4096073349764486348, (byte) 0);
                r17532065970449779817.u = obj;
                return r17532065970449779817;
            case 1:
                R17532065970449779817 r175320659704497798172 = new R17532065970449779817(f4096073349764486348, r4833348786910499294, (byte) 1);
                r175320659704497798172.u = obj;
                return r175320659704497798172;
            case 2:
                R17532065970449779817 r175320659704497798173 = new R17532065970449779817(f4096073349764486348, r4833348786910499294, (byte) 2);
                r175320659704497798173.u = obj;
                return r175320659704497798173;
            default:
                R17532065970449779817 r175320659704497798174 = new R17532065970449779817(r4833348786910499294, f4096073349764486348, (byte) 3);
                r175320659704497798174.u = obj;
                return r175320659704497798174;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        F4096073349764486348 f4096073349764486348 = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((R17532065970449779817) create((R4833348786910499294) obj2, (B1062434985168244363) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                R17532065970449779817 r17532065970449779817 = new R17532065970449779817(f4096073349764486348, (R4833348786910499294) obj2, (byte) 1);
                r17532065970449779817.u = (g1) obj;
                return r17532065970449779817.invokeSuspend(o9245300239821758723);
            case 2:
                R17532065970449779817 r175320659704497798172 = new R17532065970449779817(f4096073349764486348, (R4833348786910499294) obj2, (byte) 2);
                r175320659704497798172.u = (k43) obj;
                return r175320659704497798172.invokeSuspend(o9245300239821758723);
            default:
                return ((R17532065970449779817) create((R4833348786910499294) obj2, (B1062434985168244363) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        F4096073349764486348 f4096073349764486348 = this.v;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                B1062434985168244363 b1062434985168244363 = (B1062434985168244363) this.u;
                b1062434985168244363.getClass();
                return f4096073349764486348.invoke(b1062434985168244363.b());
            case 1:
                E17665849472693074628.k(obj);
                return f4096073349764486348.invoke((g1) this.u);
            case 2:
                E17665849472693074628.k(obj);
                J8109720887967463919 j8109720887967463919 = (J8109720887967463919) ((k43) this.u).n();
                f4096073349764486348.invoke(new s43(j8109720887967463919));
                return (k43) j8109720887967463919.a();
            default:
                E17665849472693074628.k(obj);
                B1062434985168244363 b10624349851682443632 = (B1062434985168244363) this.u;
                b10624349851682443632.getClass();
                return f4096073349764486348.invoke(b10624349851682443632.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R17532065970449779817(F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = f4096073349764486348;
    }
}
