package dev.epro.r0;

import ads_mobile_sdk.ci3;
import ads_mobile_sdk.dj1;
import ads_mobile_sdk.fb;
import ads_mobile_sdk.j52;
import ads_mobile_sdk.m72;
import ads_mobile_sdk.pu0;
import ads_mobile_sdk.sb;
import ads_mobile_sdk.vw;
import ads_mobile_sdk.x52;
import ads_mobile_sdk.xu0;
import ads_mobile_sdk.zi3;
import ads_mobile_sdk.zj1;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P10410169637657332617 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P10410169637657332617(m72 m72Var, WebView webView, boolean z, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.t = (byte) 4;
        this.v = m72Var;
        this.w = webView;
        this.u = z;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.w;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new P10410169637657332617((m72) obj3, (WebView) obj2, this.u, (R4833348786910499294) obj).invokeSuspend(o9245300239821758723);
            case 5:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 6).invokeSuspend(o9245300239821758723);
            case 7:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 7).invokeSuspend(o9245300239821758723);
            case 8:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 8).invokeSuspend(o9245300239821758723);
            default:
                return new P10410169637657332617(obj3, obj2, (R4833348786910499294) obj, (byte) 9).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        A18371761705606051847 a18371761705606051847;
        Handler handler;
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        byte b2 = 0;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj2 = this.v;
        Object obj3 = this.w;
        Object obj4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj5 = null;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (z) {
                    if (z) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                F9886074403848142923 f9886074403848142923 = (F9886074403848142923) obj2;
                C8204629009676477017 c8204629009676477017 = new C8204629009676477017(f9886074403848142923, (byte) 3);
                H4546125934900659656 h4546125934900659656 = new H4546125934900659656(obj3, (Object) f9886074403848142923, (R4833348786910499294) (objArr == true ? 1 : 0), (byte) 27);
                this.u = true;
                return Q3181834110876746778.N(c8204629009676477017, h4546125934900659656, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            case 1:
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                sb sbVar = (sb) obj2;
                W5797197595347441198 w5797197595347441198 = sbVar.a;
                fb fbVar = new fb((Object) sbVar, obj3, (R4833348786910499294) (objArr2 == true ? 1 : 0), b2);
                w5797197595347441198.getClass();
                X7175349259954592591 E = R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(fbVar, null, (byte) 1), 2);
                this.u = true;
                return E.v(this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    zj1 zj1Var = ((vw) obj2).h;
                    this.u = true;
                    zj1Var.getClass();
                    obj = zj1Var.a("google.afma.config.fetchAppSettings", ((I16631908410500040363) obj3).toString(), this);
                    if (obj == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z3) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                M16184408391440927034 m16184408391440927034 = (M16184408391440927034) obj;
                if (m16184408391440927034 instanceof xu0) {
                    return (I16631908410500040363) ((xu0) m16184408391440927034).b;
                }
                if (m16184408391440927034 instanceof pu0) {
                    zi3.a((pu0) m16184408391440927034, false);
                } else {
                    Z3383101362411723454.g();
                }
                return null;
            case 3:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    obj = vw.a((vw) obj2, (B9015851108731615764) obj3, this);
                    if (obj == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z4) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                M16184408391440927034 m161844083914409270342 = (M16184408391440927034) obj;
                if (m161844083914409270342 instanceof xu0) {
                    return (I16631908410500040363) ((xu0) m161844083914409270342).b;
                }
                if (m161844083914409270342 instanceof pu0) {
                    zi3.a((pu0) m161844083914409270342, false);
                } else {
                    Z3383101362411723454.g();
                }
                return null;
            case 4:
                E17665849472693074628.k(obj);
                x52 x52Var = ((m72) obj2).c;
                WebView webView = (WebView) obj3;
                boolean z5 = this.u;
                x52Var.getClass();
                webView.getClass();
                ci3 ci3Var = x52Var.f;
                j52 j52Var = new j52(x52Var, webView, z5);
                ci3Var.getClass();
                try {
                    obj5 = j52Var.invoke();
                } catch (Exception e) {
                    ci3Var.a("CreateJavaScriptSessionService", (Throwable) e);
                }
                return (dj1) obj5;
            case 5:
                F9886074403848142923 f98860744038481429232 = (F9886074403848142923) obj2;
                boolean z6 = this.u;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    F4327950643552689 f4327950643552689 = new F4327950643552689(f98860744038481429232, (byte) 2);
                    H4546125934900659656 h45461259349006596562 = new H4546125934900659656(obj3, (Object) f98860744038481429232, (R4833348786910499294) (objArr3 == true ? 1 : 0), (byte) 28);
                    this.u = true;
                    if (D15445857918358799638.W(f4327950643552689, h45461259349006596562, this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z6) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                V4351601219763732262 d = f98860744038481429232.d();
                O15319392248629494012 o15319392248629494012 = f98860744038481429232.f;
                Object a = d.a(o15319392248629494012.g());
                if (a == null) {
                    return o9245300239821758723;
                }
                if (Math.abs(o15319392248629494012.g() - f98860744038481429232.d().c(a)) >= 0.5f || !((Boolean) f98860744038481429232.b.invoke(a)).booleanValue()) {
                    return o9245300239821758723;
                }
                f98860744038481429232.d.setValue(a);
                f98860744038481429232.c.setValue(a);
                return o9245300239821758723;
            case 6:
                L10855672692117722047 l10855672692117722047 = (L10855672692117722047) obj2;
                O1149508413621311762 o1149508413621311762 = l10855672692117722047.e;
                View view = l10855672692117722047.a;
                boolean z7 = this.u;
                try {
                    if (!z7) {
                        E17665849472693074628.k(obj);
                        S10719162835224151221 s10719162835224151221 = new S10719162835224151221();
                        U6292466256832577288 u6292466256832577288 = (U6292466256832577288) obj3;
                        A18371761705606051847 a183717617056060518472 = new A18371761705606051847(s10719162835224151221, new P5601053304583610420(l10855672692117722047, u6292466256832577288, (byte) 0), new P5601053304583610420(l10855672692117722047, u6292466256832577288, (byte) 1), view);
                        F4096073349764486348 f4096073349764486348 = l10855672692117722047.b;
                        if (f4096073349764486348 != null && (a18371761705606051847 = (A18371761705606051847) f4096073349764486348.invoke(a183717617056060518472)) != null) {
                            a183717617056060518472 = a18371761705606051847;
                        }
                        Looper myLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (myLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            E138661690457992157 e138661690457992157 = l10855672692117722047.i;
                            if (e138661690457992157 == null) {
                                e138661690457992157 = new E138661690457992157(l10855672692117722047, a183717617056060518472, s10719162835224151221, b2);
                                l10855672692117722047.i = e138661690457992157;
                            }
                            view.post(e138661690457992157);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new O18193234200241516073(a183717617056060518472), 1);
                            if (startActionMode == null) {
                                return o9245300239821758723;
                            }
                            l10855672692117722047.h = startActionMode;
                        }
                        this.u = true;
                        Object n = s10719162835224151221.a.n(this);
                        if (n != z3437138737604933638) {
                            n = o9245300239821758723;
                        }
                        if (n == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    } else {
                        if (!z7) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        E17665849472693074628.k(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable = l10855672692117722047.j;
                        if (runnable == null) {
                            runnable = new W13948953340889349604(l10855672692117722047, (byte) 4);
                            l10855672692117722047.j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = l10855672692117722047.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    Runnable runnable2 = l10855672692117722047.i;
                    if (runnable2 != null) {
                        view.removeCallbacks(runnable2);
                    }
                    l10855672692117722047.h = null;
                    return o9245300239821758723;
                } finally {
                    o1149508413621311762.a();
                    Looper myLooper2 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (myLooper2 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable runnable3 = l10855672692117722047.j;
                        if (runnable3 == null) {
                            runnable3 = new W13948953340889349604(l10855672692117722047, (byte) 4);
                            l10855672692117722047.j = runnable3;
                        }
                        view.post(runnable3);
                    } else {
                        ActionMode actionMode2 = l10855672692117722047.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    Runnable runnable4 = l10855672692117722047.i;
                    if (runnable4 != null) {
                        view.removeCallbacks(runnable4);
                    }
                    l10855672692117722047.h = null;
                }
            case 7:
                P5434885953103119039 p5434885953103119039 = (P5434885953103119039) obj3;
                V697849047308847220 v697849047308847220 = ((Q3290033537611024070) obj2).c;
                boolean z8 = this.u;
                try {
                    if (!z8) {
                        E17665849472693074628.k(obj);
                        v697849047308847220.setValue(p5434885953103119039);
                        this.u = true;
                        Object n2 = p5434885953103119039.b.n(this);
                        if (n2 != z3437138737604933638) {
                            n2 = o9245300239821758723;
                        }
                        if (n2 == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    } else {
                        if (!z8) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        E17665849472693074628.k(obj);
                    }
                    return o9245300239821758723;
                } finally {
                    v697849047308847220.setValue(null);
                }
            case 8:
                boolean z9 = this.u;
                if (z9) {
                    if (z9) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                J196785984016436306 j196785984016436306 = (J196785984016436306) obj2;
                L17941041579542105815 l17941041579542105815 = new L17941041579542105815(j196785984016436306, objArr4 == true ? 1 : 0, (F4096073349764486348) obj3, b2);
                this.u = true;
                Object r = j196785984016436306.r(false, l17941041579542105815, this);
                return r == z3437138737604933638 ? z3437138737604933638 : r;
            default:
                A7209497065939201693 a7209497065939201693 = (A7209497065939201693) obj3;
                boolean z10 = this.u;
                if (!z10) {
                    E17665849472693074628.k(obj);
                    S7864201625552763331 s7864201625552763331 = (S7864201625552763331) obj2;
                    D14731132657808549702 d14731132657808549702 = V12319504402545346730.g;
                    Object obj6 = a7209497065939201693.a;
                    if (obj6 == d14731132657808549702) {
                        obj6 = null;
                    }
                    this.u = true;
                    if (s7864201625552763331.emit(obj6, this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z10) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                a7209497065939201693.a = null;
                return o9245300239821758723;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P10410169637657332617(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }
}
