package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dev.epro.r0.B2635172028927931615;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.V5431423861497278836;
import java.lang.reflect.Method;
import java.util.Map;
import net.zetetic.database.CursorWindow;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qh3 extends t93 {
    public final Map f;
    public final Object g;
    public final Object h;
    public final /* synthetic */ byte l = 1;

    public qh3(V5431423861497278836 v5431423861497278836, rp1 rp1Var, sb3 sb3Var, Context context, Map map, vi3 vi3Var) {
        super("CE5tOv+A3M/hiYupoeeMea7pTAoLkqAWSIWorcc4Mn4bGBP7QNA+DiAmYsyGdi77", "zRuqYvyllHMHZUJ/EPl1E7kaCO145iOH7MbVT0Nbt24=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_SCREEN_SIGNALS_TASK));
        this.g = sb3Var;
        this.h = context;
        this.f = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.lang.Object[]] */
    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.l) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) this.f.get("nv");
                try {
                    Object[] objArr = (Object[]) method.invoke("", motionEvent, (DisplayMetrics) this.h);
                    objArr.getClass();
                    B2635172028927931615 o2 = md.o();
                    Object obj = objArr[0];
                    if (obj != null && objArr[1] != null) {
                        long longValue = ((Long) obj).longValue();
                        o2.b();
                        md mdVar = (md) o2.b;
                        i12 = mdVar.bitField0_;
                        mdVar.bitField0_ = i12 | 1;
                        mdVar.tcxSignal_ = longValue;
                        long longValue2 = ((Long) objArr[1]).longValue();
                        o2.b();
                        md mdVar2 = (md) o2.b;
                        i13 = mdVar2.bitField0_;
                        mdVar2.bitField0_ = i13 | 2;
                        mdVar2.tcySignal_ = longValue2;
                    }
                    Object obj2 = objArr[2];
                    if (obj2 != null) {
                        long longValue3 = ((Long) obj2).longValue();
                        o2.b();
                        md mdVar3 = (md) o2.b;
                        i11 = mdVar3.bitField0_;
                        mdVar3.bitField0_ = i11 | 128;
                        mdVar3.tctMs_ = longValue3;
                    }
                    Object obj3 = objArr[3];
                    if (obj3 != null) {
                        long longValue4 = ((Long) obj3).longValue();
                        o2.b();
                        md mdVar4 = (md) o2.b;
                        i10 = mdVar4.bitField0_;
                        mdVar4.bitField0_ = i10 | 16;
                        mdVar4.tcp_ = longValue4;
                    }
                    Object obj4 = objArr[4];
                    if (obj4 != null) {
                        long longValue5 = ((Long) obj4).longValue();
                        o2.b();
                        md mdVar5 = (md) o2.b;
                        i9 = mdVar5.bitField0_;
                        mdVar5.bitField0_ = i9 | 4;
                        mdVar5.tcd_ = longValue5;
                    }
                    Object obj5 = objArr[5];
                    if (obj5 != null) {
                        int i18 = ((Long) obj5).longValue() != 0 ? 2 : 1;
                        o2.b();
                        md mdVar6 = (md) o2.b;
                        mdVar6.getClass();
                        mdVar6.obscured_ = G6547577305291411977.f(i18);
                        i8 = mdVar6.bitField0_;
                        mdVar6.bitField0_ = i8 | 64;
                    }
                    Object obj6 = objArr[6];
                    if (obj6 != null) {
                        long longValue6 = ((Long) obj6).longValue();
                        o2.b();
                        md mdVar7 = (md) o2.b;
                        i7 = mdVar7.bitField0_;
                        mdVar7.bitField0_ = i7 | 512;
                        mdVar7.source_ = longValue6;
                    }
                    Object obj7 = objArr[7];
                    if (obj7 != null) {
                        long longValue7 = ((Long) obj7).longValue();
                        o2.b();
                        md mdVar8 = (md) o2.b;
                        i6 = mdVar8.bitField0_;
                        mdVar8.bitField0_ = i6 | 256;
                        mdVar8.toolType_ = longValue7;
                    }
                    Object obj8 = objArr[8];
                    if (obj8 != null) {
                        int i19 = ((Long) obj8).longValue() != 0 ? 2 : 1;
                        o2.b();
                        md mdVar9 = (md) o2.b;
                        mdVar9.getClass();
                        mdVar9.isPhysicalTouch_ = G6547577305291411977.f(i19);
                        i5 = mdVar9.bitField0_;
                        mdVar9.bitField0_ = i5 | 1024;
                    }
                    synchronized (v5431423861497278836) {
                        a(v5431423861497278836);
                        o61 o61Var = (o61) this.f.get("oe");
                        if (o61Var != null) {
                            long j = o61Var.a;
                            if (j > 0) {
                                v5431423861497278836.b();
                                pd pdVar = (pd) v5431423861497278836.b;
                                i4 = pdVar.bitField1_;
                                pdVar.bitField1_ = 8 | i4;
                                pdVar.tcdnSignal_ = j;
                            }
                            long j2 = o61Var.b;
                            if (j2 > 0) {
                                v5431423861497278836.b();
                                pd pdVar2 = (pd) v5431423861497278836.b;
                                i3 = pdVar2.bitField1_;
                                pdVar2.bitField1_ = 4 | i3;
                                pdVar2.tcmSignal_ = j2;
                            }
                            long j3 = o61Var.c;
                            if (j3 > 0) {
                                v5431423861497278836.b();
                                pd pdVar3 = (pd) v5431423861497278836.b;
                                i2 = pdVar3.bitField1_;
                                pdVar3.bitField1_ = 2 | i2;
                                pdVar3.tcuSignal_ = j3;
                            }
                            long j4 = o61Var.d;
                            if (j4 > 0) {
                                v5431423861497278836.b();
                                pd pdVar4 = (pd) v5431423861497278836.b;
                                i = pdVar4.bitField1_;
                                pdVar4.bitField1_ = i | 16;
                                pdVar4.tccSignal_ = j4;
                            }
                        }
                        a(o2);
                        v5431423861497278836.b();
                        ((pd) v5431423861497278836.b).b((md) o2.a());
                        b(v5431423861497278836);
                    }
                    if (motionEvent != null) {
                        motionEvent.recycle();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    throw th;
                }
            default:
                Integer valueOf = Integer.valueOf(((sb3) this.g).ordinal());
                Context context = (Context) this.h;
                Object obj9 = this.f.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj9 == null) {
                    obj9 = bool;
                }
                ?? r12 = (Object[]) method.invoke("", valueOf, context, obj9);
                r12.getClass();
                synchronized (v5431423861497278836) {
                    try {
                        if (((sb3) this.g) == sb3.a) {
                            ?? r11 = r12[0];
                            long longValue8 = (r11 != 0 ? r11 : -1L).longValue();
                            v5431423861497278836.b();
                            pd pdVar5 = (pd) v5431423861497278836.b;
                            i16 = pdVar5.bitField0_;
                            pdVar5.bitField0_ = i16 | 33554432;
                            pdVar5.uwSignal_ = longValue8;
                            ?? r112 = r12[1];
                            long longValue9 = (r112 != 0 ? r112 : -1L).longValue();
                            v5431423861497278836.b();
                            pd pdVar6 = (pd) v5431423861497278836.b;
                            i17 = pdVar6.bitField0_;
                            pdVar6.bitField0_ = i17 | 67108864;
                            pdVar6.uhSignal_ = longValue9;
                        }
                        long longValue10 = ((Long) r12[2]).longValue();
                        v5431423861497278836.b();
                        pd pdVar7 = (pd) v5431423861497278836.b;
                        i14 = pdVar7.bitField0_;
                        pdVar7.bitField0_ = i14 | 2048;
                        pdVar7.ornSignal_ = longValue10;
                        long longValue11 = ((Long) r12[3]).longValue();
                        v5431423861497278836.b();
                        pd pdVar8 = (pd) v5431423861497278836.b;
                        i15 = pdVar8.bitField1_;
                        pdVar8.bitField1_ = i15 | 8388608;
                        pdVar8.screenStateSignal_ = longValue11;
                    } finally {
                    }
                }
                return;
        }
    }

    public void b(V5431423861497278836 v5431423861497278836) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = (DisplayMetrics) this.h;
        p61[] p61VarArr = (p61[]) this.f.get("ro");
        if (p61VarArr == null || displayMetrics == null || displayMetrics.density == 0.0f) {
            return;
        }
        for (int i3 = 0; i3 <= p61VarArr.length - 2; i3++) {
            p61 p61Var = p61VarArr[i3];
            B2635172028927931615 o2 = md.o();
            long round = Math.round(p61Var.a / displayMetrics.density);
            o2.b();
            md mdVar = (md) o2.b;
            i = mdVar.bitField0_;
            mdVar.bitField0_ = i | 1;
            mdVar.tcxSignal_ = round;
            long round2 = Math.round(p61Var.b / displayMetrics.density);
            o2.b();
            md mdVar2 = (md) o2.b;
            i2 = mdVar2.bitField0_;
            mdVar2.bitField0_ = i2 | 2;
            mdVar2.tcySignal_ = round2;
            md mdVar3 = (md) o2.a();
            v5431423861497278836.b();
            ((pd) v5431423861497278836.b).a(mdVar3);
        }
    }

    public qh3(V5431423861497278836 v5431423861497278836, rp1 rp1Var, Map map, DisplayMetrics displayMetrics, vi3 vi3Var) {
        super("uOrK1kTnXRTTSJW/YCZX3lyn8uXdJpJys2ygb8g3n+oFt80nTScn8URsSHrAIKla", "bIvSx3Gq9c4v1xFy65vEuq3pJRpdZ5Ra5bUyn86wRYE=", v5431423861497278836, rp1Var, vi3Var.a(yk0.EVENT_ID_TOUCH_SIGNALS_TASK));
        this.g = rp1Var;
        this.f = map;
        this.h = displayMetrics;
    }

    public void a(V5431423861497278836 v5431423861497278836) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Method a = ((rp1) this.g).a("PWiojthJG8/WRgA+PUOqmqhrQ0WIHzDD01sltzf5IH2YkZjzf011wvIYbN8mOwRT", "aDgsekf14FKBle3V7IHtjDdBgqTx76akhtQx4u35MSk=");
        a.getClass();
        Object[] objArr = (Object[]) a.invoke("", (MotionEvent) this.f.get("nv"), (DisplayMetrics) this.h);
        objArr.getClass();
        Object obj = objArr[0];
        if (obj != null) {
            long longValue = ((Long) obj).longValue();
            v5431423861497278836.b();
            pd pdVar = (pd) v5431423861497278836.b;
            i5 = pdVar.bitField0_;
            pdVar.bitField0_ = i5 | 8192;
            pdVar.tcxSignal_ = longValue;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            long longValue2 = ((Long) obj2).longValue();
            v5431423861497278836.b();
            pd pdVar2 = (pd) v5431423861497278836.b;
            i4 = pdVar2.bitField0_;
            pdVar2.bitField0_ = i4 | CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            pdVar2.tcySignal_ = longValue2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            long longValue3 = ((Long) obj3).longValue();
            v5431423861497278836.b();
            pd pdVar3 = (pd) v5431423861497278836.b;
            i3 = pdVar3.bitField0_;
            pdVar3.bitField0_ = i3 | 32768;
            pdVar3.tctSignal_ = longValue3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            long longValue4 = ((Long) obj4).longValue();
            v5431423861497278836.b();
            pd pdVar4 = (pd) v5431423861497278836.b;
            i2 = pdVar4.bitField0_;
            pdVar4.bitField0_ = i2 | 1073741824;
            pdVar4.tcpSignal_ = longValue4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            long longValue5 = ((Long) obj5).longValue();
            v5431423861497278836.b();
            pd pdVar5 = (pd) v5431423861497278836.b;
            i = pdVar5.bitField0_;
            pdVar5.bitField0_ = i | Integer.MIN_VALUE;
            pdVar5.tcdSignal_ = longValue5;
        }
    }

    public void a(B2635172028927931615 b2635172028927931615) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        DisplayMetrics displayMetrics = (DisplayMetrics) this.h;
        Map map = this.f;
        o61 o61Var = (o61) map.get("oe");
        if (o61Var == null || o61Var.a == 0 || displayMetrics == null) {
            return;
        }
        float f = displayMetrics.density;
        if (f != 0.0f) {
            long round = Math.round(o61Var.g / f);
            b2635172028927931615.b();
            md mdVar = (md) b2635172028927931615.b;
            i = mdVar.bitField0_;
            mdVar.bitField0_ = i | 4096;
            mdVar.pathDistanceSignal_ = round;
            long round2 = Math.round((o61Var.j - o61Var.h) / displayMetrics.density);
            b2635172028927931615.b();
            md mdVar2 = (md) b2635172028927931615.b;
            i2 = mdVar2.bitField0_;
            mdVar2.bitField0_ = i2 | 8192;
            mdVar2.viewXSignal_ = round2;
            long round3 = Math.round((o61Var.k - o61Var.i) / displayMetrics.density);
            b2635172028927931615.b();
            md mdVar3 = (md) b2635172028927931615.b;
            i3 = mdVar3.bitField0_;
            mdVar3.bitField0_ = i3 | CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            mdVar3.viewYSignal_ = round3;
            long round4 = Math.round(o61Var.h / displayMetrics.density);
            b2635172028927931615.b();
            md mdVar4 = (md) b2635172028927931615.b;
            i4 = mdVar4.bitField0_;
            mdVar4.bitField0_ = i4 | 131072;
            mdVar4.tcxDownSignal_ = round4;
            long round5 = Math.round(o61Var.i / displayMetrics.density);
            b2635172028927931615.b();
            md mdVar5 = (md) b2635172028927931615.b;
            i5 = mdVar5.bitField0_;
            mdVar5.bitField0_ = i5 | 262144;
            mdVar5.tcyDownSignal_ = round5;
            if (((MotionEvent) map.get("nv")) == null) {
                return;
            }
            long round6 = Math.round(((r9.getRawX() + (o61Var.h - o61Var.j)) - r9.getX()) / displayMetrics.density);
            if (round6 != 0) {
                b2635172028927931615.b();
                md mdVar6 = (md) b2635172028927931615.b;
                i7 = mdVar6.bitField0_;
                mdVar6.bitField0_ = i7 | 32768;
                mdVar6.viewDxSignal_ = round6;
            }
            long round7 = Math.round(((r9.getRawY() + (o61Var.i - o61Var.k)) - r9.getY()) / displayMetrics.density);
            if (round7 != 0) {
                b2635172028927931615.b();
                md mdVar7 = (md) b2635172028927931615.b;
                i6 = mdVar7.bitField0_;
                mdVar7.bitField0_ = i6 | 65536;
                mdVar7.viewDySignal_ = round7;
            }
        }
    }
}
