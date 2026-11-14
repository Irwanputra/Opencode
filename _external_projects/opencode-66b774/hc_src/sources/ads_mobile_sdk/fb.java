package ads_mobile_sdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceRequest;
import android.widget.RelativeLayout;
import androidx.webkit.Profile;
import androidx.webkit.WebViewFeature;
import dev.epro.r0.A5401921815192175371;
import dev.epro.r0.B2825725843028148090;
import dev.epro.r0.C13799120990122180696;
import dev.epro.r0.C5867465274389968370;
import dev.epro.r0.C9731525580007922156;
import dev.epro.r0.E14944621269592904532;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.E18444280280170001567;
import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.F16393152783805540385;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H7219028874700587498;
import dev.epro.r0.H9465056496122534476;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.J6457333644812339360;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.K8888766238980911980;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.Q15035754882231748864;
import dev.epro.r0.Q6344330807969154194;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R16580349318584449994;
import dev.epro.r0.R2847330884077978889;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.T14695866877392366749;
import dev.epro.r0.T18397286815848089648;
import dev.epro.r0.V11923105316530470448;
import dev.epro.r0.V16504496955554646429;
import dev.epro.r0.W2873663528421101773;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X11644140690951955496;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.Z3383101362411723454;
import dev.epro.r0.Z3437138737604933638;
import dev.epro.r0.Z5089078543653785389;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class fb extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public Object b;
    public final /* synthetic */ Object d;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(pm0 pm0Var, String str, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 14;
        this.b = pm0Var;
        this.d = str;
        this.a = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 0);
            case 1:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 3);
            case 4:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 4);
            case 5:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 5);
            case 6:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 6);
            case 7:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 7);
            case 8:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 8);
            case 9:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 9);
            case 10:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 10);
            case 11:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 11);
            case 12:
                fb fbVar = new fb(obj2, r4833348786910499294, (byte) 12);
                fbVar.b = obj;
                return fbVar;
            case 13:
                return new fb(obj2, r4833348786910499294, (byte) 13);
            case 14:
                return new fb((pm0) this.b, (String) obj2, this.a, r4833348786910499294);
            case 15:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 15);
            case 16:
                return new fb((Profile) obj2, (bs3) this.b, r4833348786910499294);
            case 17:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 17);
            case 18:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 18);
            case 19:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 19);
            case 20:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 20);
            case 21:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 21);
            case 22:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 22);
            case 23:
                return new fb(r4833348786910499294, (V16504496955554646429) this.b, (M16184408391440927034) obj2);
            case 24:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 24);
            case 25:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 25);
            case 26:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 26);
            case 27:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 27);
            case 28:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 28);
            default:
                return new fb(this.b, obj2, r4833348786910499294, (byte) 29);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj3 = this.d;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((fb) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
                return z3437138737604933638;
            case 5:
                new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
                return z3437138737604933638;
            case 6:
                return ((fb) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 7:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            case 8:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
            case 9:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 9).invokeSuspend(o9245300239821758723);
            case 10:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 10).invokeSuspend(o9245300239821758723);
            case 11:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 11).invokeSuspend(o9245300239821758723);
            case 12:
                return ((fb) create((R4833348786910499294) obj2, (re1) obj)).invokeSuspend(o9245300239821758723);
            case 13:
                return new fb(obj3, (R4833348786910499294) obj2, (byte) 13).invokeSuspend(o9245300239821758723);
            case 14:
                ((fb) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 15:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 15).invokeSuspend(o9245300239821758723);
            case 16:
                return new fb((Profile) obj3, (bs3) this.b, (R4833348786910499294) obj2).invokeSuspend(o9245300239821758723);
            case 17:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 17).invokeSuspend(o9245300239821758723);
            case 18:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 18).invokeSuspend(o9245300239821758723);
            case 19:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 19).invokeSuspend(o9245300239821758723);
            case 20:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 20).invokeSuspend(o9245300239821758723);
            case 21:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 21).invokeSuspend(o9245300239821758723);
            case 22:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 22).invokeSuspend(o9245300239821758723);
            case 23:
                return new fb((R4833348786910499294) obj2, (V16504496955554646429) this.b, (M16184408391440927034) obj3).invokeSuspend(o9245300239821758723);
            case 24:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 24).invokeSuspend(o9245300239821758723);
            case 25:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 25).invokeSuspend(o9245300239821758723);
            case 26:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 26).invokeSuspend(o9245300239821758723);
            case 27:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 27).invokeSuspend(o9245300239821758723);
            case 28:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 28).invokeSuspend(o9245300239821758723);
            default:
                return new fb(this.b, obj3, (R4833348786910499294) obj2, (byte) 29).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String e;
        String message;
        int i = 4;
        int i2 = 17;
        byte b = 6;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b2 = 1;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.t) {
            case 0:
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    sb sbVar = (sb) this.b;
                    Set set = (Set) this.d;
                    this.a = true;
                    if (sb.a$1(sbVar, set, this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 1:
                Z3437138737604933638 z34371387376049336382 = Z3437138737604933638.a;
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    Z5089078543653785389 z5089078543653785389 = ((cs0) this.b).F;
                    iu iuVar = (iu) this.d;
                    xr0 xr0Var = xr0.a;
                    this.a = true;
                    if (z5089078543653785389.a(iuVar, xr0Var, this) == z34371387376049336382) {
                        return z34371387376049336382;
                    }
                } else {
                    if (!z2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 2:
                Z3437138737604933638 z34371387376049336383 = Z3437138737604933638.a;
                boolean z3 = this.a;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    Z5089078543653785389 z50890785436537853892 = ((cs0) this.b).F;
                    View view = (View) this.d;
                    this.a = true;
                    if (z50890785436537853892.a(view, this) == z34371387376049336383) {
                        return z34371387376049336383;
                    }
                } else {
                    if (!z3) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 3:
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                Z3437138737604933638 z34371387376049336384 = Z3437138737604933638.a;
                boolean z4 = this.a;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    C5867465274389968370 c5867465274389968370 = ((y11) this.b).f;
                    if (c5867465274389968370 != null) {
                        Map<String, List<String>> allHeaders = ((UrlResponseInfo) this.d).getAllHeaders();
                        allHeaders.getClass();
                        this.a = true;
                        c5867465274389968370.a(allHeaders, this);
                        if (o9245300239821758723 == z34371387376049336384) {
                            return z34371387376049336384;
                        }
                    }
                } else {
                    if (!z4) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o9245300239821758723;
            case 4:
                Z3437138737604933638 z34371387376049336385 = Z3437138737604933638.a;
                boolean z5 = this.a;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    E14944621269592904532 e14944621269592904532 = ((wo2) this.b).l;
                    bo2 bo2Var = new bo2((X7175349259954592591) this.d, objArr == true ? 1 : 0);
                    this.a = true;
                    if (e14944621269592904532.collect(bo2Var, this) == z34371387376049336385) {
                        return z34371387376049336385;
                    }
                } else {
                    if (!z5) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                Z3383101362411723454.n();
                return null;
            case 5:
                Z3437138737604933638 z34371387376049336386 = Z3437138737604933638.a;
                boolean z6 = this.a;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    E14944621269592904532 e149446212695929045322 = (E14944621269592904532) this.b;
                    bo2 bo2Var2 = new bo2((Q15035754882231748864) this.d, b2);
                    this.a = true;
                    if (e149446212695929045322.collect(bo2Var2, this) == z34371387376049336386) {
                        return z34371387376049336386;
                    }
                } else {
                    if (!z6) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                Z3383101362411723454.n();
                return null;
            case 6:
                Z3437138737604933638 z34371387376049336387 = Z3437138737604933638.a;
                boolean z7 = this.a;
                if (z7) {
                    if (z7) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                jx1 jx1Var = (jx1) this.b;
                I16631908410500040363 a = d62.a((K15572083692188606544) this.d);
                this.a = true;
                int i3 = jx1.h;
                Object a2 = jx1Var.a(a, false, (K14749510448791472029) this);
                return a2 == z34371387376049336387 ? z34371387376049336387 : a2;
            case 7:
                Z3437138737604933638 z34371387376049336388 = Z3437138737604933638.a;
                boolean z8 = this.a;
                if (!z8) {
                    E17665849472693074628.k(obj);
                    O12043144740933444288 o12043144740933444288 = ((hr1) this.b).c;
                    y11 y11Var = (y11) this.d;
                    this.a = true;
                    obj = O12043144740933444288.b(o12043144740933444288, y11Var, null, this, 30);
                    if (obj == z34371387376049336388) {
                        return z34371387376049336388;
                    }
                } else {
                    if (!z8) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                M16184408391440927034 m16184408391440927034 = (M16184408391440927034) obj;
                if (m16184408391440927034 instanceof xu0) {
                    ww2 ww2Var = ((a21) ((xu0) m16184408391440927034).b).d;
                    if (ww2Var != null) {
                        return ww2.a(ww2Var);
                    }
                    return null;
                }
                if (m16184408391440927034 instanceof pu0) {
                    return null;
                }
                Z3383101362411723454.g();
                return null;
            case 8:
                O9245300239821758723 o92453002398217587232 = O9245300239821758723.a;
                Z3437138737604933638 z34371387376049336389 = Z3437138737604933638.a;
                boolean z9 = this.a;
                if (!z9) {
                    E17665849472693074628.k(obj);
                    iw1 iw1Var = (iw1) this.b;
                    boolean z10 = ((ViewGroup) this.d) != null;
                    this.a = true;
                    it1 it1Var = iw1Var.c;
                    if (it1Var.j == null || it1Var.a != 6 || (e = iw1Var.g.e()) == null || (obj2 = iw1Var.f.a(e, this, z10)) != z34371387376049336389) {
                        obj2 = o92453002398217587232;
                    }
                    if (obj2 == z34371387376049336389) {
                        return z34371387376049336389;
                    }
                } else {
                    if (!z9) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587232;
            case 9:
                Z3437138737604933638 z343713873760493363810 = Z3437138737604933638.a;
                boolean z11 = this.a;
                if (!z11) {
                    E17665849472693074628.k(obj);
                    z03 z03Var = ((iy0) this.b).u;
                    if (z03Var != null) {
                        String uri = ((WebResourceRequest) this.d).getUrl().toString();
                        uri.getClass();
                        this.a = true;
                        if (z03Var.b(uri, this) == z343713873760493363810) {
                            return z343713873760493363810;
                        }
                    }
                } else {
                    if (!z11) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 10:
                Z3437138737604933638 z343713873760493363811 = Z3437138737604933638.a;
                boolean z12 = this.a;
                if (!z12) {
                    E17665849472693074628.k(obj);
                    j01 j01Var = (j01) this.b;
                    B2825725843028148090 b2825725843028148090 = (B2825725843028148090) this.d;
                    this.a = true;
                    H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(this));
                    h7219028874700587498.t();
                    f01 f01Var = new f01(new AtomicBoolean(false), h7219028874700587498);
                    synchronized (((K8888766238980911980) j01Var.c.getValue())) {
                        K8888766238980911980 k8888766238980911980 = (K8888766238980911980) j01Var.c.getValue();
                        List W = K5751602218013079365.W(b2825725843028148090);
                        R2847330884077978889 r2847330884077978889 = (R2847330884077978889) ((V11923105316530470448) ((J6457333644812339360) k8888766238980911980).c.f());
                        r2847330884077978889.getClass();
                        r2847330884077978889.b.a(new F16393152783805540385(r2847330884077978889, W, f01Var, b));
                    }
                    if (h7219028874700587498.r() == z343713873760493363811) {
                        return z343713873760493363811;
                    }
                } else {
                    if (!z12) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 11:
                Z3437138737604933638 z343713873760493363812 = Z3437138737604933638.a;
                boolean z13 = this.a;
                if (!z13) {
                    E17665849472693074628.k(obj);
                    O12043144740933444288 o120431447409334442882 = ((m5) this.b).d;
                    URL url = new URL((String) this.d);
                    this.a = true;
                    obj = o120431447409334442882.a(url, this);
                    if (obj == z343713873760493363812) {
                        return z343713873760493363812;
                    }
                } else {
                    if (!z13) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                M16184408391440927034 m161844083914409270342 = (M16184408391440927034) obj;
                if (m161844083914409270342 instanceof xu0) {
                    ((a21) ((xu0) m161844083914409270342).b).getClass();
                }
                return O9245300239821758723.a;
            case 12:
                Z3437138737604933638 z343713873760493363813 = Z3437138737604933638.a;
                boolean z14 = this.a;
                if (!z14) {
                    E17665849472693074628.k(obj);
                    re1 re1Var = (re1) this.b;
                    I16631908410500040363 i16631908410500040363 = (I16631908410500040363) this.d;
                    this.a = true;
                    if (re1Var.a(i16631908410500040363, this) == z343713873760493363813) {
                        return z343713873760493363813;
                    }
                } else {
                    if (!z14) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 13:
                O9245300239821758723 o92453002398217587233 = O9245300239821758723.a;
                bs3 bs3Var = (bs3) this.d;
                Z3437138737604933638 z343713873760493363814 = Z3437138737604933638.a;
                boolean z15 = this.a;
                try {
                } catch (Throwable th) {
                    zi3.a(6, "Failed to initialize Profile: " + th.getMessage(), null);
                }
                if (!z15) {
                    E17665849472693074628.k(obj);
                    bs3Var.i.getClass();
                    if (!Q6344330807969154194.b(WebViewFeature.MULTI_PROFILE)) {
                        zi3.a(6, "MultiProfile is not supported", null);
                        return o92453002398217587233;
                    }
                    String str = ((Boolean) bs3Var.s.getValue()).booleanValue() ? "GMA_WEBVIEW_PROFILE" : "Default";
                    G8001132634698687269 g8001132634698687269 = bs3Var.d;
                    jr3 jr3Var = new jr3(bs3Var, str, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0);
                    this.b = bs3Var;
                    this.a = true;
                    obj = R7033599853981556291.d0(g8001132634698687269, jr3Var, this);
                    if (obj == z343713873760493363814) {
                        return z343713873760493363814;
                    }
                } else {
                    if (!z15) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bs3Var = (bs3) this.b;
                    E17665849472693074628.k(obj);
                }
                bs3Var.m = (Profile) obj;
                return o92453002398217587233;
            case 14:
                E17665849472693074628.k(obj);
                um0 um0Var = ((pm0) this.b).b;
                String str2 = (String) this.d;
                boolean z16 = this.a;
                um0Var.getClass();
                O12494175665883759871 o12494175665883759871 = um0Var.e;
                try {
                    if (o12494175665883759871.getValue() != null) {
                        Class.forName(um0Var.d.Q()).getMethod(z16 ? "beginAdUnitExposure" : "endAdUnitExposure", String.class).invoke(o12494175665883759871.getValue(), str2);
                    }
                } catch (Exception e2) {
                    um0Var.b.a("FirebaseAnalyticsAdapter.invokeMethod AdUnitExposure", (Throwable) e2);
                }
                return O9245300239821758723.a;
            case 15:
                Z3437138737604933638 z343713873760493363815 = Z3437138737604933638.a;
                boolean z17 = this.a;
                if (!z17) {
                    E17665849472693074628.k(obj);
                    V16504496955554646429 v16504496955554646429 = (V16504496955554646429) this.b;
                    T18397286815848089648 t18397286815848089648 = (T18397286815848089648) ((yo2) ((W2873663528421101773) this.d)).a;
                    this.a = true;
                    if (v16504496955554646429.a(t18397286815848089648, this) == z343713873760493363815) {
                        return z343713873760493363815;
                    }
                } else {
                    if (!z17) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 16:
                Z3437138737604933638 z343713873760493363816 = Z3437138737604933638.a;
                boolean z18 = this.a;
                if (!z18) {
                    E17665849472693074628.k(obj);
                    bs3 bs3Var2 = (bs3) this.b;
                    Profile profile = (Profile) this.d;
                    this.a = true;
                    if (bs3Var2.a(profile, this) == z343713873760493363816) {
                        return z343713873760493363816;
                    }
                } else {
                    if (!z18) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 17:
                O9245300239821758723 o92453002398217587234 = O9245300239821758723.a;
                Z3437138737604933638 z343713873760493363817 = Z3437138737604933638.a;
                boolean z19 = this.a;
                if (!z19) {
                    E17665849472693074628.k(obj);
                    ti tiVar = ((wj) this.b).b;
                    qi qiVar = (qi) this.d;
                    this.a = true;
                    Object a3 = ((A5401921815192175371) tiVar.a.get()).a(new R16580349318584449994(qiVar, objArr4 == true ? 1 : 0, (byte) 14), this);
                    if (a3 != z343713873760493363817) {
                        a3 = o92453002398217587234;
                    }
                    if (a3 == z343713873760493363817) {
                        return z343713873760493363817;
                    }
                } else {
                    if (!z19) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587234;
            case 18:
                Z3437138737604933638 z343713873760493363818 = Z3437138737604933638.a;
                boolean z20 = this.a;
                if (!z20) {
                    E17665849472693074628.k(obj);
                    I16631908410500040363 a4 = d62.a((K15572083692188606544) this.b);
                    if (a4 == null) {
                        return null;
                    }
                    c7 c7Var = (c7) this.d;
                    this.a = true;
                    obj = c7.a(c7Var, a4, this);
                    if (obj == z343713873760493363818) {
                        return z343713873760493363818;
                    }
                } else {
                    if (!z20) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return (H9465056496122534476) obj;
            case 19:
                O9245300239821758723 o92453002398217587235 = O9245300239821758723.a;
                Z3437138737604933638 z343713873760493363819 = Z3437138737604933638.a;
                boolean z21 = this.a;
                if (!z21) {
                    E17665849472693074628.k(obj);
                    bq1 bq1Var = ((u12) this.b).a;
                    tx0 tx0Var = (tx0) this.d;
                    this.a = true;
                    bq1Var.a(tx0Var);
                    if (o92453002398217587235 == z343713873760493363819) {
                        return z343713873760493363819;
                    }
                } else {
                    if (!z21) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587235;
            case 20:
                Z3437138737604933638 z343713873760493363820 = Z3437138737604933638.a;
                boolean z22 = this.a;
                if (!z22) {
                    E17665849472693074628.k(obj);
                    X11644140690951955496 x11644140690951955496 = (X11644140690951955496) this.b;
                    this.a = true;
                    obj = x11644140690951955496.s(this);
                    if (obj == z343713873760493363820) {
                        return z343713873760493363820;
                    }
                } else {
                    if (!z22) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                tx0 tx0Var2 = (tx0) obj;
                iy0 b3 = tx0Var2 != null ? tx0Var2.b() : null;
                if (b3 != null) {
                    b3.u = ((i82) this.d).h;
                }
                return O9245300239821758723.a;
            case 21:
                Z3437138737604933638 z343713873760493363821 = Z3437138737604933638.a;
                boolean z23 = this.a;
                if (!z23) {
                    E17665849472693074628.k(obj);
                    bq1 bq1Var2 = ((vr1) this.b).a;
                    tx0 tx0Var3 = (tx0) this.d;
                    this.a = true;
                    bq1Var2.getClass();
                    if (bq1.a(tx0Var3, "setOrientationProperties is only valid for fullscreen or expanded webviews.", "setOrientationProperties", this) == z343713873760493363821) {
                        return z343713873760493363821;
                    }
                } else {
                    if (!z23) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 22:
                Z3437138737604933638 z343713873760493363822 = Z3437138737604933638.a;
                boolean z24 = this.a;
                if (!z24) {
                    E17665849472693074628.k(obj);
                    et0 et0Var = (et0) this.b;
                    RelativeLayout relativeLayout = (RelativeLayout) this.d;
                    this.a = true;
                    if (et0Var.a(relativeLayout, this) == z343713873760493363822) {
                        return z343713873760493363822;
                    }
                } else {
                    if (!z24) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 23:
                Z3437138737604933638 z343713873760493363823 = Z3437138737604933638.a;
                boolean z25 = this.a;
                if (!z25) {
                    E17665849472693074628.k(obj);
                    V16504496955554646429 v165044969555546464292 = (V16504496955554646429) this.b;
                    if (v165044969555546464292 != null) {
                        T18397286815848089648 t183972868158480896482 = (T18397286815848089648) ((xu0) ((M16184408391440927034) this.d)).b;
                        this.a = true;
                        if (v165044969555546464292.a(t183972868158480896482, this) == z343713873760493363823) {
                            return z343713873760493363823;
                        }
                    }
                } else {
                    if (!z25) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 24:
                Z3437138737604933638 z343713873760493363824 = Z3437138737604933638.a;
                boolean z26 = this.a;
                if (!z26) {
                    E17665849472693074628.k(obj);
                    dq2 dq2Var = ((lu2) this.b).d;
                    if (dq2Var == null) {
                        S10823041268949770285.b0("adLoader");
                        throw null;
                    }
                    qu0 qu0Var = new qu0((kq2) this.d, i2, objArr5 == true ? 1 : 0, i);
                    this.a = true;
                    if (dq2Var.a(qu0Var, (F11004654978627682545) null, this) == z343713873760493363824) {
                        return z343713873760493363824;
                    }
                } else {
                    if (!z26) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 25:
                Z3437138737604933638 z343713873760493363825 = Z3437138737604933638.a;
                boolean z27 = this.a;
                if (!z27) {
                    E17665849472693074628.k(obj);
                    sy0 sy0Var = (sy0) this.b;
                    this.a = true;
                    obj = sy0Var.e.y(this);
                    if (obj == z343713873760493363825) {
                        return z343713873760493363825;
                    }
                } else {
                    if (!z27) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                String str3 = (String) obj;
                if (str3 == null) {
                    throw new dv0(new tu0("Immersive video media data does not exist.", 1));
                }
                ((it1) this.d).r.putString("mediaUrl", str3);
                return O9245300239821758723.a;
            case 26:
                Z3437138737604933638 z343713873760493363826 = Z3437138737604933638.a;
                boolean z28 = this.a;
                if (!z28) {
                    E17665849472693074628.k(obj);
                    dq2 dq2Var2 = ((lu2) this.b).d;
                    if (dq2Var2 == null) {
                        S10823041268949770285.b0("adLoader");
                        throw null;
                    }
                    qu0 qu0Var2 = new qu0((CancellationException) this.d, i2, objArr6 == true ? 1 : 0, i);
                    this.a = true;
                    if (dq2Var2.a(qu0Var2, (F11004654978627682545) null, this) == z343713873760493363826) {
                        return z343713873760493363826;
                    }
                } else {
                    if (!z28) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 27:
                O9245300239821758723 o92453002398217587236 = O9245300239821758723.a;
                ConsoleMessage consoleMessage = (ConsoleMessage) this.d;
                Z3437138737604933638 z343713873760493363827 = Z3437138737604933638.a;
                boolean z29 = this.a;
                if (!z29) {
                    E17665849472693074628.k(obj);
                    w81 w81Var = ((xw0) this.b).b;
                    if (w81Var != null) {
                        this.a = true;
                        obj = w81.a(w81Var, this);
                        if (obj == z343713873760493363827) {
                            return z343713873760493363827;
                        }
                    }
                    return o92453002398217587236;
                }
                if (!z29) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                if (((Boolean) obj).booleanValue() && (message = consoleMessage.message()) != null) {
                    String B0 = M8927913404651150384.B0(1000, message);
                    ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
                    String str4 = B0 + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId();
                    int i4 = messageLevel == null ? -1 : T14695866877392366749.a[messageLevel.ordinal()];
                    if (i4 == 1) {
                        xv.a(str4, (Exception) null);
                    } else if (i4 == 2) {
                        xv.c(str4, null);
                    }
                }
                return o92453002398217587236;
            case 28:
                Z3437138737604933638 z343713873760493363828 = Z3437138737604933638.a;
                boolean z30 = this.a;
                if (!z30) {
                    E17665849472693074628.k(obj);
                    rf0 rf0Var = (rf0) this.b;
                    String str5 = ((C13799120990122180696) this.d).n;
                    this.a = true;
                    if (rf0.a(rf0Var, str5, (Activity) null, false, (K14749510448791472029) this, 12) == z343713873760493363828) {
                        return z343713873760493363828;
                    }
                } else {
                    if (!z30) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            default:
                Z3437138737604933638 z343713873760493363829 = Z3437138737604933638.a;
                boolean z31 = this.a;
                if (!z31) {
                    E17665849472693074628.k(obj);
                    iy0 iy0Var = (iy0) this.b;
                    C9731525580007922156 c9731525580007922156 = iy0Var.a;
                    tx0 tx0Var4 = iy0Var.b;
                    String str6 = (String) this.d;
                    this.a = true;
                    if (c9731525580007922156.a(tx0Var4, str6, this) == z343713873760493363829) {
                        return z343713873760493363829;
                    }
                } else {
                    if (!z31) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(R4833348786910499294 r4833348786910499294, V16504496955554646429 v16504496955554646429, M16184408391440927034 m16184408391440927034) {
        super(2, r4833348786910499294);
        this.t = (byte) 23;
        this.b = v16504496955554646429;
        this.d = m16184408391440927034;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(Profile profile, bs3 bs3Var, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 16;
        this.b = bs3Var;
        this.d = profile;
    }
}
