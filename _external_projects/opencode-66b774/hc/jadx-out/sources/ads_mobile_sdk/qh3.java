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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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

    @Override // ads_mobile_sdk.t93
    public final void a(Method method, V5431423861497278836 v5431423861497278836) {
        switch (this.l) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) this.f.get("nv");
                try {
                    Object[] objArr = (Object[]) method.invoke("", motionEvent, (DisplayMetrics) this.h);
                    objArr.getClass();
                    B2635172028927931615 b2635172028927931615O = md.o();
                    Object obj = objArr[0];
                    if (obj != null && objArr[1] != null) {
                        long jLongValue = ((Long) obj).longValue();
                        b2635172028927931615O.b();
                        md mdVar = (md) b2635172028927931615O.b;
                        mdVar.bitField0_ |= 1;
                        mdVar.tcxSignal_ = jLongValue;
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        b2635172028927931615O.b();
                        md mdVar2 = (md) b2635172028927931615O.b;
                        mdVar2.bitField0_ |= 2;
                        mdVar2.tcySignal_ = jLongValue2;
                    }
                    Object obj2 = objArr[2];
                    if (obj2 != null) {
                        long jLongValue3 = ((Long) obj2).longValue();
                        b2635172028927931615O.b();
                        md mdVar3 = (md) b2635172028927931615O.b;
                        mdVar3.bitField0_ |= 128;
                        mdVar3.tctMs_ = jLongValue3;
                    }
                    Object obj3 = objArr[3];
                    if (obj3 != null) {
                        long jLongValue4 = ((Long) obj3).longValue();
                        b2635172028927931615O.b();
                        md mdVar4 = (md) b2635172028927931615O.b;
                        mdVar4.bitField0_ |= 16;
                        mdVar4.tcp_ = jLongValue4;
                    }
                    Object obj4 = objArr[4];
                    if (obj4 != null) {
                        long jLongValue5 = ((Long) obj4).longValue();
                        b2635172028927931615O.b();
                        md mdVar5 = (md) b2635172028927931615O.b;
                        mdVar5.bitField0_ |= 4;
                        mdVar5.tcd_ = jLongValue5;
                    }
                    Object obj5 = objArr[5];
                    if (obj5 != null) {
                        int i = ((Long) obj5).longValue() != 0 ? 2 : 1;
                        b2635172028927931615O.b();
                        md mdVar6 = (md) b2635172028927931615O.b;
                        mdVar6.getClass();
                        mdVar6.obscured_ = G6547577305291411977.f(i);
                        mdVar6.bitField0_ |= 64;
                    }
                    Object obj6 = objArr[6];
                    if (obj6 != null) {
                        long jLongValue6 = ((Long) obj6).longValue();
                        b2635172028927931615O.b();
                        md mdVar7 = (md) b2635172028927931615O.b;
                        mdVar7.bitField0_ |= 512;
                        mdVar7.source_ = jLongValue6;
                    }
                    Object obj7 = objArr[7];
                    if (obj7 != null) {
                        long jLongValue7 = ((Long) obj7).longValue();
                        b2635172028927931615O.b();
                        md mdVar8 = (md) b2635172028927931615O.b;
                        mdVar8.bitField0_ |= 256;
                        mdVar8.toolType_ = jLongValue7;
                    }
                    Object obj8 = objArr[8];
                    if (obj8 != null) {
                        int i2 = ((Long) obj8).longValue() != 0 ? 2 : 1;
                        b2635172028927931615O.b();
                        md mdVar9 = (md) b2635172028927931615O.b;
                        mdVar9.getClass();
                        mdVar9.isPhysicalTouch_ = G6547577305291411977.f(i2);
                        mdVar9.bitField0_ |= 1024;
                    }
                    synchronized (v5431423861497278836) {
                        a(v5431423861497278836);
                        o61 o61Var = (o61) this.f.get("oe");
                        if (o61Var != null) {
                            long j = o61Var.a;
                            if (j > 0) {
                                v5431423861497278836.b();
                                pd pdVar = (pd) v5431423861497278836.b;
                                pdVar.bitField1_ = 8 | pdVar.bitField1_;
                                pdVar.tcdnSignal_ = j;
                            }
                            long j2 = o61Var.b;
                            if (j2 > 0) {
                                v5431423861497278836.b();
                                pd pdVar2 = (pd) v5431423861497278836.b;
                                pdVar2.bitField1_ = 4 | pdVar2.bitField1_;
                                pdVar2.tcmSignal_ = j2;
                            }
                            long j3 = o61Var.c;
                            if (j3 > 0) {
                                v5431423861497278836.b();
                                pd pdVar3 = (pd) v5431423861497278836.b;
                                pdVar3.bitField1_ = 2 | pdVar3.bitField1_;
                                pdVar3.tcuSignal_ = j3;
                            }
                            long j4 = o61Var.d;
                            if (j4 > 0) {
                                v5431423861497278836.b();
                                pd pdVar4 = (pd) v5431423861497278836.b;
                                pdVar4.bitField1_ |= 16;
                                pdVar4.tccSignal_ = j4;
                            }
                        }
                        a(b2635172028927931615O);
                        v5431423861497278836.b();
                        ((pd) v5431423861497278836.b).b((md) b2635172028927931615O.a());
                        b(v5431423861497278836);
                        break;
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
                Integer numValueOf = Integer.valueOf(((sb3) this.g).ordinal());
                Context context = (Context) this.h;
                Object obj9 = this.f.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj9 == null) {
                    obj9 = bool;
                }
                Object[] objArr2 = (Object[]) method.invoke("", numValueOf, context, obj9);
                objArr2.getClass();
                synchronized (v5431423861497278836) {
                    try {
                        if (((sb3) this.g) == sb3.a) {
                            Object obj10 = objArr2[0];
                            if (obj10 == null) {
                                obj10 = obj;
                            }
                            long jLongValue8 = ((Long) obj10).longValue();
                            v5431423861497278836.b();
                            pd pdVar5 = (pd) v5431423861497278836.b;
                            pdVar5.bitField0_ |= 33554432;
                            pdVar5.uwSignal_ = jLongValue8;
                            Object obj11 = objArr2[1];
                            long jLongValue9 = ((Long) (obj11 != null ? obj11 : -1L)).longValue();
                            v5431423861497278836.b();
                            pd pdVar6 = (pd) v5431423861497278836.b;
                            pdVar6.bitField0_ |= 67108864;
                            pdVar6.uhSignal_ = jLongValue9;
                        }
                        long jLongValue10 = ((Long) objArr2[2]).longValue();
                        v5431423861497278836.b();
                        pd pdVar7 = (pd) v5431423861497278836.b;
                        pdVar7.bitField0_ |= 2048;
                        pdVar7.ornSignal_ = jLongValue10;
                        long jLongValue11 = ((Long) objArr2[3]).longValue();
                        v5431423861497278836.b();
                        pd pdVar8 = (pd) v5431423861497278836.b;
                        pdVar8.bitField1_ |= 8388608;
                        pdVar8.screenStateSignal_ = jLongValue11;
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    public void b(V5431423861497278836 v5431423861497278836) {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.h;
        p61[] p61VarArr = (p61[]) this.f.get("ro");
        if (p61VarArr == null || displayMetrics == null || displayMetrics.density == 0.0f) {
            return;
        }
        for (int i = 0; i <= p61VarArr.length - 2; i++) {
            p61 p61Var = p61VarArr[i];
            B2635172028927931615 b2635172028927931615O = md.o();
            long jRound = Math.round(((double) p61Var.a) / ((double) displayMetrics.density));
            b2635172028927931615O.b();
            md mdVar = (md) b2635172028927931615O.b;
            mdVar.bitField0_ |= 1;
            mdVar.tcxSignal_ = jRound;
            long jRound2 = Math.round(((double) p61Var.b) / ((double) displayMetrics.density));
            b2635172028927931615O.b();
            md mdVar2 = (md) b2635172028927931615O.b;
            mdVar2.bitField0_ |= 2;
            mdVar2.tcySignal_ = jRound2;
            md mdVar3 = (md) b2635172028927931615O.a();
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
        Method methodA = ((rp1) this.g).a("PWiojthJG8/WRgA+PUOqmqhrQ0WIHzDD01sltzf5IH2YkZjzf011wvIYbN8mOwRT", "aDgsekf14FKBle3V7IHtjDdBgqTx76akhtQx4u35MSk=");
        methodA.getClass();
        Object[] objArr = (Object[]) methodA.invoke("", (MotionEvent) this.f.get("nv"), (DisplayMetrics) this.h);
        objArr.getClass();
        Object obj = objArr[0];
        if (obj != null) {
            long jLongValue = ((Long) obj).longValue();
            v5431423861497278836.b();
            pd pdVar = (pd) v5431423861497278836.b;
            pdVar.bitField0_ |= 8192;
            pdVar.tcxSignal_ = jLongValue;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            long jLongValue2 = ((Long) obj2).longValue();
            v5431423861497278836.b();
            pd pdVar2 = (pd) v5431423861497278836.b;
            pdVar2.bitField0_ |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            pdVar2.tcySignal_ = jLongValue2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            long jLongValue3 = ((Long) obj3).longValue();
            v5431423861497278836.b();
            pd pdVar3 = (pd) v5431423861497278836.b;
            pdVar3.bitField0_ |= 32768;
            pdVar3.tctSignal_ = jLongValue3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            long jLongValue4 = ((Long) obj4).longValue();
            v5431423861497278836.b();
            pd pdVar4 = (pd) v5431423861497278836.b;
            pdVar4.bitField0_ |= 1073741824;
            pdVar4.tcpSignal_ = jLongValue4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            long jLongValue5 = ((Long) obj5).longValue();
            v5431423861497278836.b();
            pd pdVar5 = (pd) v5431423861497278836.b;
            pdVar5.bitField0_ |= Integer.MIN_VALUE;
            pdVar5.tcdSignal_ = jLongValue5;
        }
    }

    public void a(B2635172028927931615 b2635172028927931615) {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.h;
        Map map = this.f;
        o61 o61Var = (o61) map.get("oe");
        if (o61Var == null || o61Var.a == 0 || displayMetrics == null) {
            return;
        }
        float f = displayMetrics.density;
        if (f != 0.0f) {
            long jRound = Math.round(o61Var.g / ((double) f));
            b2635172028927931615.b();
            md mdVar = (md) b2635172028927931615.b;
            mdVar.bitField0_ |= 4096;
            mdVar.pathDistanceSignal_ = jRound;
            long jRound2 = Math.round(((double) (o61Var.j - o61Var.h)) / ((double) displayMetrics.density));
            b2635172028927931615.b();
            md mdVar2 = (md) b2635172028927931615.b;
            mdVar2.bitField0_ |= 8192;
            mdVar2.viewXSignal_ = jRound2;
            long jRound3 = Math.round(((double) (o61Var.k - o61Var.i)) / ((double) displayMetrics.density));
            b2635172028927931615.b();
            md mdVar3 = (md) b2635172028927931615.b;
            mdVar3.bitField0_ |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            mdVar3.viewYSignal_ = jRound3;
            long jRound4 = Math.round(((double) o61Var.h) / ((double) displayMetrics.density));
            b2635172028927931615.b();
            md mdVar4 = (md) b2635172028927931615.b;
            mdVar4.bitField0_ |= 131072;
            mdVar4.tcxDownSignal_ = jRound4;
            long jRound5 = Math.round(((double) o61Var.i) / ((double) displayMetrics.density));
            b2635172028927931615.b();
            md mdVar5 = (md) b2635172028927931615.b;
            mdVar5.bitField0_ |= 262144;
            mdVar5.tcyDownSignal_ = jRound5;
            MotionEvent motionEvent = (MotionEvent) map.get("nv");
            if (motionEvent == null) {
                return;
            }
            long jRound6 = Math.round(((double) ((motionEvent.getRawX() + (o61Var.h - o61Var.j)) - motionEvent.getX())) / ((double) displayMetrics.density));
            if (jRound6 != 0) {
                b2635172028927931615.b();
                md mdVar6 = (md) b2635172028927931615.b;
                mdVar6.bitField0_ |= 32768;
                mdVar6.viewDxSignal_ = jRound6;
            }
            long jRound7 = Math.round(((double) ((motionEvent.getRawY() + (o61Var.i - o61Var.k)) - motionEvent.getY())) / ((double) displayMetrics.density));
            if (jRound7 != 0) {
                b2635172028927931615.b();
                md mdVar7 = (md) b2635172028927931615.b;
                mdVar7.bitField0_ |= 65536;
                mdVar7.viewDySignal_ = jRound7;
            }
        }
    }
}
