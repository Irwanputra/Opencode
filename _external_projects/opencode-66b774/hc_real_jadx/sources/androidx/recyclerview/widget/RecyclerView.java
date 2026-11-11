package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.app.NotificationCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p035.p045.C1113;
import p034.p035.p045.InterfaceC1110;
import p034.p035.p045.p046.C1084;
import p034.p035.p048.C1132;
import p034.p065.C1363;
import p034.p065.C1364;
import p034.p065.p066.AbstractC1377;
import p034.p065.p066.C1366;
import p034.p065.p066.C1369;
import p034.p065.p066.C1380;
import p034.p065.p066.C1382;
import p034.p065.p066.C1395;
import p034.p065.p066.C1396;
import p034.p065.p066.C1397;
import p034.p065.p066.C1405;
import p034.p065.p066.C1412;
import p034.p065.p066.RunnableC1381;
import p034.p065.p066.RunnableC1389;
import p034.p065.p066.RunnableC1400;
import p034.p065.p066.RunnableC1408;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RecyclerView extends ViewGroup implements InterfaceC1110 {

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public static final Class<?>[] f1375;

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public static final boolean f1376;

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public static final Interpolator f1377;

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public static final int[] f1378 = {R.attr.nestedScrollingEnabled};

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public static final boolean f1379;

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public static final boolean f1380;

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public static final boolean f1381;

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public static final boolean f1382;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public List<AbstractC0206> f1383;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public boolean f1384;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f1385;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public final C0224 f1386;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0213 f1387;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public AbstractC0231 f1388;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f1389;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C1397 f1390;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public final int[] f1391;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public int f1392;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Rect f1393;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public Runnable f1394;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f1395;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f1396;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public C1369 f1397;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public int f1398;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final ArrayList<InterfaceC0210> f1399;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public int f1400;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f1401;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public InterfaceC0210 f1402;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public final int[] f1403;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public C0201 f1404;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public EdgeEffect f1405;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final ArrayList<AbstractC0235> f1406;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public RunnableC1400.C1401 f1407;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public AbstractC0231.InterfaceC0232 f1408;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public boolean f1409;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public final RunnableC0203 f1410;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0217 f1411;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public float f1412;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public EdgeEffect f1413;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public int f1414;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public final int f1415;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f1416;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public AbstractC0230 f1417;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f1418;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f1419;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public final int[] f1420;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f1421;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public RunnableC1400 f1422;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public final C1397.InterfaceC1398 f1423;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public EdgeEffect f1424;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public int f1425;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1382 f1426;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public int f1427;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public AbstractC0228 f1428;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f1429;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f1430;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public boolean f1431;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public VelocityTracker f1432;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1366 f1433;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public List<InterfaceC0226> f1434;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public C1113 f1435;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public float f1436;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public boolean f1437;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public AbstractC0219 f1438;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f1439;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public AbstractC0206 f1440;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public int f1441;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final AccessibilityManager f1442;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public SavedState f1443;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public InterfaceC0204 f1444;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f1445;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public EdgeEffect f1446;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public final List<AbstractC0207> f1447;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public InterfaceC0227 f1448;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public final int[] f1449;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Rect f1450;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public final int f1451;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f1452;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final RectF f1453;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Rect f1454;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f1455;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public AbstractC0207 f1456;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1457;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1454 = new Rect();
            this.f1455 = true;
            this.f1457 = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1454 = new Rect();
            this.f1455 = true;
            this.f1457 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1454 = new Rect();
            this.f1455 = true;
            this.f1457 = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1454 = new Rect();
            this.f1455 = true;
            this.f1457 = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f1454 = new Rect();
            this.f1455 = true;
            this.f1457 = false;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean m752() {
            return this.f1456.m766();
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean m753() {
            return this.f1456.m778();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int m754() {
            return this.f1456.m777();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0200();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Parcelable f1458;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0200 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1458 = parcel.readParcelable(classLoader == null ? AbstractC0219.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeParcelable(this.f1458, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C0201 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public EdgeEffect m755(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$〺つふすそ, reason: contains not printable characters */
    public static class InterpolatorC0202 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$〻ぞまぎな〻, reason: contains not printable characters */
    public class RunnableC0203 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1460;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f1461;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1462;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Interpolator f1463;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f1464;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public OverScroller f1465;

        public RunnableC0203() {
            Interpolator interpolator = RecyclerView.f1377;
            this.f1463 = interpolator;
            this.f1464 = false;
            this.f1461 = false;
            this.f1465 = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1438 == null) {
                m757();
                return;
            }
            this.f1461 = false;
            this.f1464 = true;
            recyclerView.m748();
            OverScroller overScroller = this.f1465;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f1460;
                int i4 = currY - this.f1462;
                this.f1460 = currX;
                this.f1462 = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f1391;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m720(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f1391;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m740(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f1428 != null) {
                    int[] iArr3 = recyclerView3.f1391;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m733(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f1391;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    AbstractC0214 abstractC0214 = recyclerView4.f1438.f1520;
                    if (abstractC0214 != null && !abstractC0214.f1502 && abstractC0214.f1500) {
                        int m881 = recyclerView4.f1386.m881();
                        if (m881 == 0) {
                            abstractC0214.m793();
                        } else {
                            if (abstractC0214.f1499 >= m881) {
                                abstractC0214.f1499 = m881 - 1;
                            }
                            abstractC0214.m794(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f1406.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f1391;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m722(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f1391;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.m731(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                AbstractC0214 abstractC02142 = recyclerView7.f1438.f1520;
                if ((abstractC02142 != null && abstractC02142.f1502) || !z) {
                    m758();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    RunnableC1400 runnableC1400 = recyclerView8.f1422;
                    if (runnableC1400 != null) {
                        runnableC1400.m3165(recyclerView8, i2, i);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        recyclerView9.getClass();
                        if (i7 < 0) {
                            recyclerView9.m696();
                            if (recyclerView9.f1424.isFinished()) {
                                recyclerView9.f1424.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView9.m707();
                            if (recyclerView9.f1413.isFinished()) {
                                recyclerView9.f1413.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.m702();
                            if (recyclerView9.f1446.isFinished()) {
                                recyclerView9.f1446.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.m746();
                            if (recyclerView9.f1405.isFinished()) {
                                recyclerView9.f1405.onAbsorb(currVelocity);
                            }
                        }
                        if (i7 != 0 || currVelocity != 0) {
                            AtomicInteger atomicInteger = C1096.f5578;
                            if (Build.VERSION.SDK_INT >= 16) {
                                recyclerView9.postInvalidateOnAnimation();
                            } else {
                                recyclerView9.postInvalidate();
                            }
                        }
                    }
                    if (RecyclerView.f1381) {
                        RunnableC1400.C1401 c1401 = RecyclerView.this.f1407;
                        int[] iArr7 = c1401.f6617;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        c1401.f6619 = 0;
                    }
                }
            }
            AbstractC0214 abstractC02143 = RecyclerView.this.f1438.f1520;
            if (abstractC02143 != null && abstractC02143.f1502) {
                abstractC02143.m794(0, 0);
            }
            this.f1464 = false;
            if (this.f1461) {
                RecyclerView.this.removeCallbacks(this);
                C1096.m2482(RecyclerView.this, this);
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m749(1);
            }
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m756(int i, int i2, int i3, Interpolator interpolator) {
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i5 = width / 2;
                float f = width;
                float f2 = i5;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((abs / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, 2000);
            }
            int i6 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f1377;
            }
            if (this.f1463 != interpolator) {
                this.f1463 = interpolator;
                this.f1465 = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1462 = 0;
            this.f1460 = 0;
            RecyclerView.this.setScrollState(2);
            this.f1465.startScroll(0, 0, i, i2, i6);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1465.computeScrollOffset();
            }
            m758();
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void m757() {
            RecyclerView.this.removeCallbacks(this);
            this.f1465.abortAnimation();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m758() {
            if (this.f1464) {
                this.f1461 = true;
            } else {
                RecyclerView.this.removeCallbacks(this);
                C1096.m2482(RecyclerView.this, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ぁごぐすすぃ, reason: contains not printable characters */
    public interface InterfaceC0204 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        int m759(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$いいにぽつ, reason: contains not printable characters */
    public class C0205 implements AbstractC0231.InterfaceC0232 {
        public C0205() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ぇぬぎばつ, reason: contains not printable characters */
    public static abstract class AbstractC0206 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo760(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo761(RecyclerView recyclerView, int i) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ぉ〲なぱぽた, reason: contains not printable characters */
    public static abstract class AbstractC0207 {

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public static final List<Object> f1467 = Collections.emptyList();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public WeakReference<RecyclerView> f1469;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f1471;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final View f1476;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public RecyclerView f1477;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1475 = -1;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1482 = -1;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public long f1478 = -1;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1480 = -1;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f1470 = -1;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public AbstractC0207 f1468 = null;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public AbstractC0207 f1484 = null;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public List<Object> f1485 = null;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public List<Object> f1479 = null;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public int f1481 = 0;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public C0217 f1483 = null;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public boolean f1474 = false;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public int f1472 = 0;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public int f1473 = -1;

        public AbstractC0207(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f1476 = view;
        }

        public String toString() {
            StringBuilder m4179 = C2098.m4179(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            m4179.append(Integer.toHexString(hashCode()));
            m4179.append(" position=");
            m4179.append(this.f1475);
            m4179.append(" id=");
            m4179.append(this.f1478);
            m4179.append(", oldPos=");
            m4179.append(this.f1482);
            m4179.append(", pLpos:");
            m4179.append(this.f1470);
            StringBuilder sb = new StringBuilder(m4179.toString());
            if (m781()) {
                sb.append(" scrap ");
                sb.append(this.f1474 ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m783()) {
                sb.append(" invalid");
            }
            if (!m765()) {
                sb.append(" unbound");
            }
            if ((this.f1471 & 2) != 0) {
                sb.append(" update");
            }
            if (m778()) {
                sb.append(" removed");
            }
            if (m772()) {
                sb.append(" ignored");
            }
            if (m768()) {
                sb.append(" tmpDetached");
            }
            if (!m775()) {
                StringBuilder m4207 = C2098.m4207(" not recyclable(");
                m4207.append(this.f1481);
                m4207.append(")");
                sb.append(m4207.toString());
            }
            if ((this.f1471 & 512) != 0 || m783()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1476.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean m762(int i) {
            return (i & this.f1471) != 0;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m763(int i) {
            this.f1471 = i | this.f1471;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public List<Object> m764() {
            if ((this.f1471 & 1024) != 0) {
                return f1467;
            }
            List<Object> list = this.f1485;
            return (list == null || list.size() == 0) ? f1467 : this.f1479;
        }

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean m765() {
            return (this.f1471 & 1) != 0;
        }

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public boolean m766() {
            return (this.f1471 & 2) != 0;
        }

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public void m767(int i, boolean z) {
            if (this.f1482 == -1) {
                this.f1482 = this.f1475;
            }
            if (this.f1470 == -1) {
                this.f1470 = this.f1475;
            }
            if (z) {
                this.f1470 += i;
            }
            this.f1475 += i;
            if (this.f1476.getLayoutParams() != null) {
                ((LayoutParams) this.f1476.getLayoutParams()).f1455 = true;
            }
        }

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public boolean m768() {
            return (this.f1471 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void m769() {
            this.f1482 = -1;
            this.f1470 = -1;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m770(Object obj) {
            if (obj == null) {
                m763(1024);
                return;
            }
            if ((1024 & this.f1471) == 0) {
                if (this.f1485 == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1485 = arrayList;
                    this.f1479 = Collections.unmodifiableList(arrayList);
                }
                this.f1485.add(obj);
            }
        }

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public final void m771(boolean z) {
            int i;
            int i2 = this.f1481;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f1481 = i3;
            if (i3 < 0) {
                this.f1481 = 0;
                String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
                return;
            }
            if (!z && i3 == 1) {
                i = this.f1471 | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.f1471 & (-17);
            }
            this.f1471 = i;
        }

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public boolean m772() {
            return (this.f1471 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
        }

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public void m773() {
            this.f1471 = 0;
            this.f1475 = -1;
            this.f1482 = -1;
            this.f1478 = -1L;
            this.f1470 = -1;
            this.f1481 = 0;
            this.f1468 = null;
            this.f1484 = null;
            List<Object> list = this.f1485;
            if (list != null) {
                list.clear();
            }
            this.f1471 &= -1025;
            this.f1472 = 0;
            this.f1473 = -1;
            RecyclerView.m690(this);
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final int m774() {
            RecyclerView recyclerView = this.f1477;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m727(this);
        }

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public final boolean m775() {
            if ((this.f1471 & 16) != 0) {
                return false;
            }
            View view = this.f1476;
            AtomicInteger atomicInteger = C1096.f5578;
            return !(Build.VERSION.SDK_INT >= 16 ? view.hasTransientState() : false);
        }

        /* renamed from: でどあくず, reason: contains not printable characters */
        public boolean m776() {
            return (this.f1471 & 32) != 0;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final int m777() {
            int i = this.f1470;
            return i == -1 ? this.f1475 : i;
        }

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean m778() {
            return (this.f1471 & 8) != 0;
        }

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public void m779(int i, int i2) {
            this.f1471 = (i & i2) | (this.f1471 & (i2 ^ (-1)));
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m780() {
            this.f1471 &= -33;
        }

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean m781() {
            return this.f1483 != null;
        }

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean m782() {
            return (this.f1476.getParent() == null || this.f1476.getParent() == this.f1477) ? false : true;
        }

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean m783() {
            return (this.f1471 & 4) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ぉざぅち〻, reason: contains not printable characters */
    public static class C0208 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public SparseArray<C0209> f1487 = new SparseArray<>();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1486 = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ぉざぅち〻$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0209 {

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public final ArrayList<AbstractC0207> f1490 = new ArrayList<>();

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public int f1488 = 5;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public long f1489 = 0;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public long f1491 = 0;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public long m784(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C0209 m785(int i) {
            C0209 c0209 = this.f1487.get(i);
            if (c0209 != null) {
                return c0209;
            }
            C0209 c02092 = new C0209();
            this.f1487.put(i, c02092);
            return c02092;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$おぐぴう〸ず, reason: contains not printable characters */
    public interface InterfaceC0210 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        void mo786(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        void mo787(boolean z);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        boolean mo788(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$くし〴〺ぅ, reason: contains not printable characters */
    public class C0211 implements C1397.InterfaceC1398 {
        public C0211() {
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m789(AbstractC0207 abstractC0207, AbstractC0231.C0233 c0233, AbstractC0231.C0233 c02332) {
            boolean z;
            RecyclerView.this.f1411.m804(abstractC0207);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m735(abstractC0207);
            abstractC0207.m771(false);
            AbstractC1377 abstractC1377 = (AbstractC1377) recyclerView.f1388;
            abstractC1377.getClass();
            int i = c0233.f1564;
            int i2 = c0233.f1563;
            View view = abstractC0207.f1476;
            int left = c02332 == null ? view.getLeft() : c02332.f1564;
            int top = c02332 == null ? view.getTop() : c02332.f1563;
            if (abstractC0207.m778() || (i == left && i2 == top)) {
                C1412 c1412 = (C1412) abstractC1377;
                c1412.m3181(abstractC0207);
                c1412.f6649.add(abstractC0207);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = abstractC1377.mo3108(abstractC0207, i, i2, left, top);
            }
            if (z) {
                recyclerView.m692();
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m790(AbstractC0207 abstractC0207, AbstractC0231.C0233 c0233, AbstractC0231.C0233 c02332) {
            boolean z;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getClass();
            abstractC0207.m771(false);
            AbstractC1377 abstractC1377 = (AbstractC1377) recyclerView.f1388;
            abstractC1377.getClass();
            if (c0233 == null || ((i = c0233.f1564) == (i2 = c02332.f1564) && c0233.f1563 == c02332.f1563)) {
                C1412 c1412 = (C1412) abstractC1377;
                c1412.m3181(abstractC0207);
                abstractC0207.f1476.setAlpha(0.0f);
                c1412.f6658.add(abstractC0207);
                z = true;
            } else {
                z = abstractC1377.mo3108(abstractC0207, i, c0233.f1563, i2, c02332.f1563);
            }
            if (z) {
                recyclerView.m692();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0212 implements Runnable {
        public RunnableC0212() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0231 abstractC0231 = RecyclerView.this.f1388;
            if (abstractC0231 != null) {
                C1412 c1412 = (C1412) abstractC0231;
                boolean z = !c1412.f6649.isEmpty();
                boolean z2 = !c1412.f6650.isEmpty();
                boolean z3 = !c1412.f6659.isEmpty();
                boolean z4 = !c1412.f6658.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<AbstractC0207> it = c1412.f6649.iterator();
                    while (it.hasNext()) {
                        AbstractC0207 next = it.next();
                        View view = next.f1476;
                        ViewPropertyAnimator animate = view.animate();
                        c1412.f6652.add(next);
                        animate.setDuration(c1412.f1562).alpha(0.0f).setListener(new C1396(c1412, next, animate, view)).start();
                    }
                    c1412.f6649.clear();
                    if (z2) {
                        ArrayList<C1412.C1413> arrayList = new ArrayList<>();
                        arrayList.addAll(c1412.f6650);
                        c1412.f6656.add(arrayList);
                        c1412.f6650.clear();
                        RunnableC1381 runnableC1381 = new RunnableC1381(c1412, arrayList);
                        if (z) {
                            C1096.m2501(arrayList.get(0).f6662.f1476, runnableC1381, c1412.f1562);
                        } else {
                            runnableC1381.run();
                        }
                    }
                    if (z3) {
                        ArrayList<C1412.C1414> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(c1412.f6659);
                        c1412.f6657.add(arrayList2);
                        c1412.f6659.clear();
                        RunnableC1408 runnableC1408 = new RunnableC1408(c1412, arrayList2);
                        if (z) {
                            C1096.m2501(arrayList2.get(0).f6667.f1476, runnableC1408, c1412.f1562);
                        } else {
                            runnableC1408.run();
                        }
                    }
                    if (z4) {
                        ArrayList<AbstractC0207> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(c1412.f6658);
                        c1412.f6655.add(arrayList3);
                        c1412.f6658.clear();
                        RunnableC1389 runnableC1389 = new RunnableC1389(c1412, arrayList3);
                        if (z || z2 || z3) {
                            C1096.m2501(arrayList3.get(0).f1476, runnableC1389, Math.max(z2 ? c1412.f1560 : 0L, z3 ? c1412.f1561 : 0L) + (z ? c1412.f1562 : 0L));
                        } else {
                            runnableC1389.run();
                        }
                    }
                }
            }
            RecyclerView.this.f1437 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ごづごきえ, reason: contains not printable characters */
    public class C0213 extends AbstractC0225 {
        public C0213() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0225
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo791() {
            RecyclerView.this.m750(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1386.f1549 = true;
            recyclerView.m726(true);
            if (RecyclerView.this.f1426.m3114()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ざっざへづ, reason: contains not printable characters */
    public static abstract class AbstractC0214 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f1495;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public RecyclerView f1496;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public AbstractC0219 f1498;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f1500;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public View f1501;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1502;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f1499 = -1;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final C0216 f1497 = new C0216(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ざっざへづ$〺つふすそ, reason: contains not printable characters */
        public interface InterfaceC0215 {
            /* renamed from: げつ〴ぬぐ */
            PointF mo648(int i);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ざっざへづ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0216 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public int f1503;

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public int f1506;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public int f1509 = -1;

            /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
            public boolean f1508 = false;

            /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
            public int f1504 = 0;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public int f1505 = Integer.MIN_VALUE;

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public Interpolator f1507 = null;

            public C0216(int i, int i2) {
                this.f1506 = i;
                this.f1503 = i2;
            }

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public void m795(int i, int i2, int i3, Interpolator interpolator) {
                this.f1506 = i;
                this.f1503 = i2;
                this.f1505 = i3;
                this.f1507 = interpolator;
                this.f1508 = true;
            }

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public void m796(RecyclerView recyclerView) {
                int i = this.f1509;
                if (i >= 0) {
                    this.f1509 = -1;
                    recyclerView.m699(i);
                    this.f1508 = false;
                } else {
                    if (!this.f1508) {
                        this.f1504 = 0;
                        return;
                    }
                    Interpolator interpolator = this.f1507;
                    if (interpolator != null && this.f1505 < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i2 = this.f1505;
                    if (i2 < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    recyclerView.f1410.m756(this.f1506, this.f1503, i2, interpolator);
                    this.f1504++;
                    this.f1508 = false;
                }
            }
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public abstract void mo792(View view, C0224 c0224, C0216 c0216);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m793() {
            if (this.f1500) {
                this.f1500 = false;
                C1380 c1380 = (C1380) this;
                c1380.f6537 = 0;
                c1380.f6538 = 0;
                c1380.f6543 = null;
                this.f1496.f1386.f1546 = -1;
                this.f1501 = null;
                this.f1499 = -1;
                this.f1502 = false;
                AbstractC0219 abstractC0219 = this.f1498;
                if (abstractC0219.f1520 == this) {
                    abstractC0219.f1520 = null;
                }
                this.f1498 = null;
                this.f1496 = null;
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m794(int i, int i2) {
            Object obj;
            RecyclerView recyclerView = this.f1496;
            if (this.f1499 == -1 || recyclerView == null) {
                m793();
            }
            if (this.f1502 && this.f1501 == null && (obj = this.f1498) != null) {
                PointF mo648 = obj instanceof InterfaceC0215 ? ((InterfaceC0215) obj).mo648(this.f1499) : null;
                if (mo648 != null) {
                    float f = mo648.x;
                    if (f != 0.0f || mo648.y != 0.0f) {
                        recyclerView.m733((int) Math.signum(f), (int) Math.signum(mo648.y), null);
                    }
                }
            }
            this.f1502 = false;
            View view = this.f1501;
            if (view != null) {
                this.f1496.getClass();
                AbstractC0207 m684 = RecyclerView.m684(view);
                if ((m684 != null ? m684.m777() : -1) == this.f1499) {
                    mo792(this.f1501, recyclerView.f1386, this.f1497);
                    this.f1497.m796(recyclerView);
                    m793();
                } else {
                    this.f1501 = null;
                }
            }
            if (this.f1500) {
                C0224 c0224 = recyclerView.f1386;
                C0216 c0216 = this.f1497;
                C1380 c1380 = (C1380) this;
                if (c1380.f1496.f1438.m836() == 0) {
                    c1380.m793();
                } else {
                    int i3 = c1380.f6538;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    c1380.f6538 = i4;
                    int i5 = c1380.f6537;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    c1380.f6537 = i6;
                    if (i4 == 0 && i6 == 0) {
                        int i7 = c1380.f1499;
                        Object obj2 = c1380.f1498;
                        PointF mo6482 = obj2 instanceof InterfaceC0215 ? ((InterfaceC0215) obj2).mo648(i7) : null;
                        if (mo6482 != null) {
                            if (mo6482.x != 0.0f || mo6482.y != 0.0f) {
                                float f2 = mo6482.y;
                                float sqrt = (float) Math.sqrt((f2 * f2) + (r8 * r8));
                                float f3 = mo6482.x / sqrt;
                                mo6482.x = f3;
                                float f4 = mo6482.y / sqrt;
                                mo6482.y = f4;
                                c1380.f6543 = mo6482;
                                c1380.f6538 = (int) (f3 * 10000.0f);
                                c1380.f6537 = (int) (f4 * 10000.0f);
                                c0216.m795((int) (c1380.f6538 * 1.2f), (int) (c1380.f6537 * 1.2f), (int) (c1380.mo3109(10000) * 1.2f), c1380.f6542);
                            }
                        }
                        c0216.f1509 = c1380.f1499;
                        c1380.m793();
                    }
                }
                C0216 c02162 = this.f1497;
                boolean z = c02162.f1509 >= 0;
                c02162.m796(recyclerView);
                if (z && this.f1500) {
                    this.f1502 = true;
                    recyclerView.f1410.m758();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ざとぅぼこ〺, reason: contains not printable characters */
    public final class C0217 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ArrayList<AbstractC0207> f1511;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public C0208 f1512;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ArrayList<AbstractC0207> f1513;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final ArrayList<AbstractC0207> f1514;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1515;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1516;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final List<AbstractC0207> f1517;

        public C0217() {
            ArrayList<AbstractC0207> arrayList = new ArrayList<>();
            this.f1514 = arrayList;
            this.f1511 = null;
            this.f1513 = new ArrayList<>();
            this.f1517 = Collections.unmodifiableList(arrayList);
            this.f1515 = 2;
            this.f1516 = 2;
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void m797(View view) {
            AbstractC0207 m684 = RecyclerView.m684(view);
            if (m684.m768()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m684.m781()) {
                m684.f1483.m804(m684);
            } else if (m684.m776()) {
                m684.m780();
            }
            m808(m684);
            if (RecyclerView.this.f1388 == null || m684.m775()) {
                return;
            }
            RecyclerView.this.f1388.mo897(m684);
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m798() {
            this.f1514.clear();
            m805();
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void m799(int i) {
            m802(this.f1513.get(i), true);
            this.f1513.remove(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
        /* renamed from: いいにぽつ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m800(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$ぉ〲なぱぽた r5 = androidx.recyclerview.widget.RecyclerView.m684(r5)
                r0 = 12
                boolean r0 = r5.m762(r0)
                r1 = 0
                if (r0 != 0) goto L55
                boolean r0 = r5.m766()
                if (r0 == 0) goto L55
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ぺぁあねじ r0 = r0.f1388
                r2 = 1
                if (r0 == 0) goto L3f
                java.util.List r3 = r5.m764()
                づざかべべ.ぇぬぎばつ.びぐびあび.ぺふねづ〺 r0 = (p034.p065.p066.C1412) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L39
                boolean r0 = r0.f6534
                if (r0 == 0) goto L33
                boolean r0 = r5.m783()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = 0
                goto L34
            L33:
                r0 = 1
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = 0
                goto L3a
            L39:
                r0 = 1
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = 0
                goto L40
            L3f:
                r0 = 1
            L40:
                if (r0 == 0) goto L43
                goto L55
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ぉ〲なぱぽた> r0 = r4.f1511
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f1511 = r0
            L4e:
                r5.f1483 = r4
                r5.f1474 = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ぉ〲なぱぽた> r0 = r4.f1511
                goto L82
            L55:
                boolean r0 = r5.m783()
                if (r0 == 0) goto L7c
                boolean r0 = r5.m778()
                if (r0 != 0) goto L7c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$びぐびあび r0 = r0.f1428
                boolean r0 = r0.f1555
                if (r0 == 0) goto L6a
                goto L7c
            L6a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p131.p155.p156.p157.C2098.m4192(r1, r0)
                r5.<init>(r0)
                throw r5
            L7c:
                r5.f1483 = r4
                r5.f1474 = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ぉ〲なぱぽた> r0 = r4.f1514
            L82:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0217.m800(android.view.View):void");
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int m801(int i) {
            if (i >= 0 && i < RecyclerView.this.f1386.m881()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.f1386.f1543 ? i : recyclerView.f1426.m3120(i, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.f1386.m881());
            throw new IndexOutOfBoundsException(C2098.m4192(RecyclerView.this, sb));
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m802(AbstractC0207 abstractC0207, boolean z) {
            RecyclerView.m690(abstractC0207);
            View view = abstractC0207.f1476;
            C1369 c1369 = RecyclerView.this.f1397;
            if (c1369 != null) {
                C1369.C1370 c1370 = c1369.f6514;
                C1096.m2490(view, c1370 instanceof C1369.C1370 ? c1370.f6516.remove(view) : null);
            }
            if (z) {
                InterfaceC0227 interfaceC0227 = RecyclerView.this.f1448;
                if (interfaceC0227 != null) {
                    interfaceC0227.m885(abstractC0207);
                }
                AbstractC0228 abstractC0228 = RecyclerView.this.f1428;
                if (abstractC0228 != null) {
                    abstractC0228.mo890(abstractC0207);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f1386 != null) {
                    recyclerView.f1390.m3155(abstractC0207);
                }
            }
            abstractC0207.f1477 = null;
            C0208 m807 = m807();
            m807.getClass();
            int i = abstractC0207.f1480;
            ArrayList<AbstractC0207> arrayList = m807.m785(i).f1490;
            if (m807.f1487.get(i).f1488 <= arrayList.size()) {
                return;
            }
            abstractC0207.m773();
            arrayList.add(abstractC0207);
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final void m803(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m803((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public void m804(AbstractC0207 abstractC0207) {
            (abstractC0207.f1474 ? this.f1511 : this.f1514).remove(abstractC0207);
            abstractC0207.f1483 = null;
            abstractC0207.f1474 = false;
            abstractC0207.m780();
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void m805() {
            for (int size = this.f1513.size() - 1; size >= 0; size--) {
                m799(size);
            }
            this.f1513.clear();
            if (RecyclerView.f1381) {
                RunnableC1400.C1401 c1401 = RecyclerView.this.f1407;
                int[] iArr = c1401.f6617;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c1401.f6619 = 0;
            }
        }

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public void m806() {
            AbstractC0219 abstractC0219 = RecyclerView.this.f1438;
            this.f1516 = this.f1515 + (abstractC0219 != null ? abstractC0219.f1528 : 0);
            for (int size = this.f1513.size() - 1; size >= 0 && this.f1513.size() > this.f1516; size--) {
                m799(size);
            }
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C0208 m807() {
            if (this.f1512 == null) {
                this.f1512 = new C0208();
            }
            return this.f1512;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m808(androidx.recyclerview.widget.RecyclerView.AbstractC0207 r6) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0217.m808(androidx.recyclerview.widget.RecyclerView$ぉ〲なぱぽた):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:168:0x02ff, code lost:
        
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:262:0x0457, code lost:
        
            if (r7.m783() == false) goto L249;
         */
        /* JADX WARN: Code restructure failed: missing block: B:271:0x048b, code lost:
        
            if ((r10 == 0 || r10 + r8 < r20) == false) goto L249;
         */
        /* JADX WARN: Removed duplicated region for block: B:126:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x041f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x053a  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x055d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:251:0x0541  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x0474  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x049d  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x04b8  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x04cb  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x04fb  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x052f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0207 m809(int r18, boolean r19, long r20) {
            /*
                Method dump skipped, instructions count: 1430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0217.m809(int, boolean, long):androidx.recyclerview.widget.RecyclerView$ぉ〲なぱぽた");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$づざかべべ, reason: contains not printable characters */
    public static class C0218 extends Observable<AbstractC0225> {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m810() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0225) ((Observable) this).mObservers.get(size)).mo791();
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m811() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$てぜきぽく, reason: contains not printable characters */
    public static abstract class AbstractC0219 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f1518;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public RecyclerView f1519;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public AbstractC0214 f1520;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean f1521;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public int f1522;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public int f1523;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public int f1524;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final C1405.InterfaceC1406 f1525;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1366 f1526;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C1405 f1527;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public int f1528;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C1405 f1529;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean f1530;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final C1405.InterfaceC1406 f1531;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public int f1532;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean f1533;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f1534;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$てぜきぽく$〺つふすそ, reason: contains not printable characters */
        public class C0220 implements C1405.InterfaceC1406 {
            public C0220() {
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public int mo876(View view) {
                return AbstractC0219.this.m856(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public View mo877(int i) {
                return AbstractC0219.this.m826(i);
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public int mo878() {
                AbstractC0219 abstractC0219 = AbstractC0219.this;
                return abstractC0219.f1523 - abstractC0219.m847();
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: づざかべべ, reason: contains not printable characters */
            public int mo879(View view) {
                return AbstractC0219.this.m863(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: びぐびあび, reason: contains not printable characters */
            public int mo880() {
                return AbstractC0219.this.m860();
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$てぜきぽく$くし〴〺ぅ, reason: contains not printable characters */
        public interface InterfaceC0221 {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$てぜきぽく$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0222 implements C1405.InterfaceC1406 {
            public C0222() {
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: 〺つふすそ */
            public int mo876(View view) {
                return AbstractC0219.this.m831(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: くし〴〺ぅ */
            public View mo877(int i) {
                return AbstractC0219.this.m826(i);
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: げつ〴ぬぐ */
            public int mo878() {
                AbstractC0219 abstractC0219 = AbstractC0219.this;
                return abstractC0219.f1522 - abstractC0219.m828();
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: づざかべべ */
            public int mo879(View view) {
                return AbstractC0219.this.m839(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }

            @Override // p034.p065.p066.C1405.InterfaceC1406
            /* renamed from: びぐびあび */
            public int mo880() {
                return AbstractC0219.this.m862();
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$てぜきぽく$びぐびあび, reason: contains not printable characters */
        public static class C0223 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public int f1537;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public boolean f1538;

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public int f1539;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public boolean f1540;
        }

        public AbstractC0219() {
            C0222 c0222 = new C0222();
            this.f1525 = c0222;
            C0220 c0220 = new C0220();
            this.f1531 = c0220;
            this.f1527 = new C1405(c0222);
            this.f1529 = new C1405(c0220);
            this.f1518 = false;
            this.f1533 = false;
            this.f1521 = true;
            this.f1534 = true;
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public static int m812(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m813(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0219.m813(int, int, int, int, boolean):int");
        }

        /* renamed from: えがぐせほち, reason: contains not printable characters */
        public static C0223 m814(Context context, AttributeSet attributeSet, int i, int i2) {
            C0223 c0223 = new C0223();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1363.RecyclerView, i, i2);
            c0223.f1539 = obtainStyledAttributes.getInt(C1363.RecyclerView_android_orientation, 1);
            c0223.f1537 = obtainStyledAttributes.getInt(C1363.RecyclerView_spanCount, 1);
            c0223.f1538 = obtainStyledAttributes.getBoolean(C1363.RecyclerView_reverseLayout, false);
            c0223.f1540 = obtainStyledAttributes.getBoolean(C1363.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return c0223;
        }

        /* renamed from: くねねぱす〻, reason: contains not printable characters */
        public static boolean m815(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
        public void mo816(int i) {
        }

        /* renamed from: 〱〵つてう */
        public void mo630(Parcelable parcelable) {
        }

        /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
        public void m817() {
        }

        /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
        public boolean m818(View view, boolean z) {
            boolean z2 = this.f1527.m3169(view, 24579) && this.f1529.m3169(view, 24579);
            return z ? z2 : !z2;
        }

        /* renamed from: 〳に〴あぽ */
        public boolean mo591() {
            return false;
        }

        /* renamed from: 〴ぐち〱へ, reason: contains not printable characters */
        public void m819(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f1519 = null;
                this.f1526 = null;
                height = 0;
                this.f1522 = 0;
            } else {
                this.f1519 = recyclerView;
                this.f1526 = recyclerView.f1433;
                this.f1522 = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f1523 = height;
            this.f1532 = 1073741824;
            this.f1524 = 1073741824;
        }

        /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
        public void m820() {
        }

        /* renamed from: 〺〲に〼へ〸 */
        public void mo594(C0224 c0224) {
        }

        /* renamed from: 〺えなひあ, reason: contains not printable characters */
        public boolean m821() {
            return false;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m822(View view) {
            m845(view, -1, false);
        }

        /* renamed from: 〺でおいここ, reason: contains not printable characters */
        public int m823() {
            return C1096.m2485(this.f1519);
        }

        /* renamed from: 〻えぱひがこ, reason: contains not printable characters */
        public void m824(int i, int i2) {
            int m836 = m836();
            if (m836 == 0) {
                this.f1519.m711(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < m836; i7++) {
                View m826 = m826(i7);
                Rect rect = this.f1519.f1450;
                m861(m826, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f1519.f1450.set(i5, i6, i3, i4);
            mo628(this.f1519.f1450, i, i2);
        }

        /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
        public void m825(int i, C0217 c0217) {
            View m826 = m826(i);
            m827(i);
            c0217.m797(m826);
        }

        /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
        public View m826(int i) {
            C1366 c1366 = this.f1526;
            if (c1366 == null) {
                return null;
            }
            return ((C1395) c1366.f6511).m3153(c1366.m3084(i));
        }

        /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
        public void m827(int i) {
            C1366 c1366;
            int m3084;
            View m3153;
            if (m826(i) == null || (m3153 = ((C1395) c1366.f6511).m3153((m3084 = (c1366 = this.f1526).m3084(i)))) == null) {
                return;
            }
            if (c1366.f6509.m3094(m3084)) {
                c1366.m3083(m3153);
            }
            ((C1395) c1366.f6511).m3152(m3084);
        }

        /* renamed from: ぁごぐすすぃ */
        public boolean mo596(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: ぁないぼぎへ */
        public void mo597(RecyclerView recyclerView) {
        }

        /* renamed from: ぁにあがあ */
        public Parcelable mo635() {
            return null;
        }

        /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
        public int m828() {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: いいにぽつ */
        public void mo637(int i, InterfaceC0221 interfaceC0221) {
        }

        /* renamed from: いおてぢび, reason: contains not printable characters */
        public void m829(AbstractC0214 abstractC0214) {
            AbstractC0214 abstractC02142 = this.f1520;
            if (abstractC02142 != null && abstractC0214 != abstractC02142 && abstractC02142.f1500) {
                abstractC02142.m793();
            }
            this.f1520 = abstractC0214;
            RecyclerView recyclerView = this.f1519;
            recyclerView.f1410.m757();
            if (abstractC0214.f1495) {
                abstractC0214.getClass().getSimpleName();
                abstractC0214.getClass().getSimpleName();
            }
            abstractC0214.f1496 = recyclerView;
            abstractC0214.f1498 = this;
            int i = abstractC0214.f1499;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f1386.f1546 = i;
            abstractC0214.f1500 = true;
            abstractC0214.f1502 = true;
            abstractC0214.f1501 = recyclerView.f1438.mo649(i);
            abstractC0214.f1496.f1410.m758();
            abstractC0214.f1495 = true;
        }

        /* renamed from: いたぷすいだ, reason: contains not printable characters */
        public boolean mo830(C0217 c0217, C0224 c0224, int i, Bundle bundle) {
            int m860;
            int m862;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f1519;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                m860 = recyclerView.canScrollVertically(1) ? (this.f1523 - m860()) - m847() : 0;
                if (this.f1519.canScrollHorizontally(1)) {
                    m862 = (this.f1522 - m862()) - m828();
                    i2 = m860;
                    i3 = m862;
                }
                i2 = m860;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                m860 = recyclerView.canScrollVertically(-1) ? -((this.f1523 - m860()) - m847()) : 0;
                if (this.f1519.canScrollHorizontally(-1)) {
                    m862 = -((this.f1522 - m862()) - m828());
                    i2 = m860;
                    i3 = m862;
                }
                i2 = m860;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f1519.m703(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: ぅばづそほせ */
        public void mo599(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
        public int m831(View view) {
            return view.getLeft() - ((LayoutParams) view.getLayoutParams()).f1454.left;
        }

        /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
        public void m832(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1519.canScrollVertically(-1) && !this.f1519.canScrollHorizontally(-1) && !this.f1519.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0228 abstractC0228 = this.f1519.f1428;
            if (abstractC0228 != null) {
                accessibilityEvent.setItemCount(abstractC0228.mo888());
            }
        }

        /* renamed from: ぇとしたべど, reason: contains not printable characters */
        public int m833() {
            return C1096.m2488(this.f1519);
        }

        /* renamed from: ぇぬぎばつ */
        public int mo601(C0224 c0224) {
            return 0;
        }

        /* renamed from: え〱さぽぜ, reason: contains not printable characters */
        public boolean m834(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.f1521 && m815(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m815(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: えみにぃほす, reason: contains not printable characters */
        public void m835(View view, C0217 c0217) {
            C1366 c1366 = this.f1526;
            int indexOfChild = ((C1395) c1366.f6511).f6599.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c1366.f6509.m3094(indexOfChild)) {
                    c1366.m3083(view);
                }
                ((C1395) c1366.f6511).m3152(indexOfChild);
            }
            c0217.m797(view);
        }

        /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
        public int m836() {
            C1366 c1366 = this.f1526;
            if (c1366 != null) {
                return c1366.m3082();
            }
            return 0;
        }

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public void m837(C0217 c0217) {
            int m836 = m836();
            while (true) {
                m836--;
                if (m836 < 0) {
                    return;
                }
                View m826 = m826(m836);
                AbstractC0207 m684 = RecyclerView.m684(m826);
                if (!m684.m772()) {
                    if (!m684.m783() || m684.m778() || this.f1519.f1428.f1555) {
                        m826(m836);
                        m851(m836);
                        c0217.m800(m826);
                        this.f1519.f1390.m3159(m684);
                    } else {
                        m827(m836);
                        c0217.m808(m684);
                    }
                }
            }
        }

        /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
        public void m838(View view, C1084 c1084) {
            AbstractC0207 m684 = RecyclerView.m684(view);
            if (m684 == null || m684.m778() || this.f1526.m3087(m684.f1476)) {
                return;
            }
            RecyclerView recyclerView = this.f1519;
            mo615(recyclerView.f1411, recyclerView.f1386, view, c1084);
        }

        /* renamed from: ぉひのべい, reason: contains not printable characters */
        public int m839(View view) {
            return view.getRight() + ((LayoutParams) view.getLayoutParams()).f1454.right;
        }

        /* renamed from: おかぷせ〱, reason: contains not printable characters */
        public int m840() {
            return C1096.m2491(this.f1519);
        }

        /* renamed from: おぐぴう〸ず */
        public int mo602(C0224 c0224) {
            return 0;
        }

        /* renamed from: かちして〹づ, reason: contains not printable characters */
        public void m841() {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
        public void mo842(int i) {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                int m3082 = recyclerView.f1433.m3082();
                for (int i2 = 0; i2 < m3082; i2++) {
                    recyclerView.f1433.m3085(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* renamed from: がぐくいおす */
        public void mo605(RecyclerView recyclerView, int i, int i2, Object obj) {
            m855();
        }

        /* renamed from: きぬどぼみ〸 */
        public View mo606(View view, int i, C0217 c0217, C0224 c0224) {
            return null;
        }

        @Deprecated
        /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
        public void m843() {
        }

        /* renamed from: く〱なおぎ */
        public int mo607(int i, C0217 c0217, C0224 c0224) {
            return 0;
        }

        /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
        public void m844(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f1454;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m845(View view, int i, boolean z) {
            AbstractC0207 m684 = RecyclerView.m684(view);
            if (z || m684.m778()) {
                this.f1519.f1390.m3157(m684);
            } else {
                this.f1519.f1390.m3159(m684);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (m684.m776() || m684.m781()) {
                if (m684.m781()) {
                    m684.f1483.m804(m684);
                } else {
                    m684.m780();
                }
                this.f1526.m3077(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f1519) {
                    int m3079 = this.f1526.m3079(view);
                    if (i == -1) {
                        i = this.f1526.m3082();
                    }
                    if (m3079 == -1) {
                        StringBuilder m4207 = C2098.m4207("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        m4207.append(this.f1519.indexOfChild(view));
                        throw new IllegalStateException(C2098.m4192(this.f1519, m4207));
                    }
                    if (m3079 != i) {
                        AbstractC0219 abstractC0219 = this.f1519.f1438;
                        View m826 = abstractC0219.m826(m3079);
                        if (m826 == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + m3079 + abstractC0219.f1519.toString());
                        }
                        abstractC0219.m826(m3079);
                        abstractC0219.m851(m3079);
                        LayoutParams layoutParams2 = (LayoutParams) m826.getLayoutParams();
                        AbstractC0207 m6842 = RecyclerView.m684(m826);
                        if (m6842.m778()) {
                            abstractC0219.f1519.f1390.m3157(m6842);
                        } else {
                            abstractC0219.f1519.f1390.m3159(m6842);
                        }
                        abstractC0219.f1526.m3077(m826, i, layoutParams2, m6842.m778());
                    }
                } else {
                    this.f1526.m3081(view, i, false);
                    layoutParams.f1455 = true;
                    AbstractC0214 abstractC0214 = this.f1520;
                    if (abstractC0214 != null && abstractC0214.f1500) {
                        abstractC0214.f1496.getClass();
                        AbstractC0207 m6843 = RecyclerView.m684(view);
                        if ((m6843 != null ? m6843.m777() : -1) == abstractC0214.f1499) {
                            abstractC0214.f1501 = view;
                        }
                    }
                }
            }
            if (layoutParams.f1457) {
                m684.f1476.invalidate();
                layoutParams.f1457 = false;
            }
        }

        /* renamed from: けときぜと, reason: contains not printable characters */
        public int m846() {
            RecyclerView recyclerView = this.f1519;
            AbstractC0228 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo888();
            }
            return 0;
        }

        /* renamed from: げがぴうあだ, reason: contains not printable characters */
        public int m847() {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: こ〲しでおか, reason: contains not printable characters */
        public void m848(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f1454;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f1519 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1519.f1453;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: ごづごきえ */
        public View mo649(int i) {
            int m836 = m836();
            for (int i2 = 0; i2 < m836; i2++) {
                View m826 = m826(i2);
                AbstractC0207 m684 = RecyclerView.m684(m826);
                if (m684 != null && m684.m777() == i && !m684.m772() && (this.f1519.f1386.f1543 || !m684.m778())) {
                    return m826;
                }
            }
            return null;
        }

        /* renamed from: ごまぉてう, reason: contains not printable characters */
        public void m849(RecyclerView recyclerView) {
            m873(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: ごまけがぢは, reason: contains not printable characters */
        public int m850() {
            return 0;
        }

        /* renamed from: ざっざへづ */
        public abstract LayoutParams mo609();

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public final void m851(int i) {
            this.f1526.m3080(i);
        }

        /* renamed from: しげにけぃ */
        public void mo610(C0217 c0217, C0224 c0224) {
        }

        /* renamed from: しぷげへが, reason: contains not printable characters */
        public View m852() {
            return null;
        }

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public int m853(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f1454;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: ずまげせび〳, reason: contains not printable characters */
        public void mo854(int i) {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                int m3082 = recyclerView.f1433.m3082();
                for (int i2 = 0; i2 < m3082; i2++) {
                    recyclerView.f1433.m3085(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: せだてはぺて, reason: contains not printable characters */
        public void m855() {
        }

        /* renamed from: せづっ〸ちね, reason: contains not printable characters */
        public int m856(View view) {
            return view.getTop() - ((LayoutParams) view.getLayoutParams()).f1454.top;
        }

        /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
        public int m857(View view) {
            return ((LayoutParams) view.getLayoutParams()).m754();
        }

        @Deprecated
        /* renamed from: つしけおつ, reason: contains not printable characters */
        public boolean m858(RecyclerView recyclerView) {
            AbstractC0214 abstractC0214 = this.f1520;
            return (abstractC0214 != null && abstractC0214.f1500) || recyclerView.m734();
        }

        /* renamed from: づあてぐく, reason: contains not printable characters */
        public boolean m859(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.f1521 && m815(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m815(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: づおぴ〱いづ */
        public void mo656(RecyclerView recyclerView, C0224 c0224, int i) {
        }

        /* renamed from: づざかべべ */
        public boolean mo657() {
            return false;
        }

        /* renamed from: ておぞぞはね, reason: contains not printable characters */
        public int m860() {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: てぜきぽく */
        public int mo612(C0224 c0224) {
            return 0;
        }

        /* renamed from: でどあくず */
        public LayoutParams mo614(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: どぇぞほだ, reason: contains not printable characters */
        public void m861(View view, Rect rect) {
            int[] iArr = RecyclerView.f1378;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect2 = layoutParams.f1454;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        /* renamed from: な〱ちぉじ */
        public void mo662(RecyclerView recyclerView, C0217 c0217) {
            m843();
        }

        /* renamed from: ながふずは, reason: contains not printable characters */
        public int m862() {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: なぎぱいぢぎ */
        public boolean mo663() {
            return false;
        }

        /* renamed from: なぶひせが, reason: contains not printable characters */
        public int m863(View view) {
            return view.getBottom() + ((LayoutParams) view.getLayoutParams()).f1454.bottom;
        }

        /* renamed from: にぢ〱ぁな */
        public void mo615(C0217 c0217, C0224 c0224, View view, C1084 c1084) {
            c1084.m2457(C1084.C1086.m2470(mo663() ? m857(view) : 0, 1, mo657() ? m857(view) : 0, 1, false, false));
        }

        /* renamed from: にぷきなせこ */
        public boolean mo664() {
            return false;
        }

        /* renamed from: のかまじえ, reason: contains not printable characters */
        public void m864(C0217 c0217) {
            int size = c0217.f1514.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = c0217.f1514.get(i).f1476;
                AbstractC0207 m684 = RecyclerView.m684(view);
                if (!m684.m772()) {
                    m684.m771(false);
                    if (m684.m768()) {
                        this.f1519.removeDetachedView(view, false);
                    }
                    AbstractC0231 abstractC0231 = this.f1519.f1388;
                    if (abstractC0231 != null) {
                        abstractC0231.mo897(m684);
                    }
                    m684.m771(true);
                    AbstractC0207 m6842 = RecyclerView.m684(view);
                    m6842.f1483 = null;
                    m6842.f1474 = false;
                    m6842.m780();
                    c0217.m808(m6842);
                }
            }
            c0217.f1514.clear();
            ArrayList<AbstractC0207> arrayList = c0217.f1511;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1519.invalidate();
            }
        }

        /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
        public boolean m865() {
            return false;
        }

        /* renamed from: のびぶけせ */
        public void mo666(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1519;
            C0217 c0217 = recyclerView.f1411;
            C0224 c0224 = recyclerView.f1386;
            m832(accessibilityEvent);
        }

        /* renamed from: のぷのちつ */
        public int mo616(C0224 c0224) {
            return 0;
        }

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public View m866(View view) {
            View m732;
            RecyclerView recyclerView = this.f1519;
            if (recyclerView == null || (m732 = recyclerView.m732(view)) == null || this.f1526.f6510.contains(m732)) {
                return null;
            }
            return m732;
        }

        /* renamed from: はぁとそぎ */
        public int mo617(int i, C0217 c0217, C0224 c0224) {
            return 0;
        }

        /* renamed from: はつきどっ, reason: contains not printable characters */
        public boolean m867() {
            return false;
        }

        /* renamed from: ばおぢでぎか */
        public int mo618(C0217 c0217, C0224 c0224) {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView == null || recyclerView.f1428 == null || !mo663()) {
                return 1;
            }
            return this.f1519.f1428.mo888();
        }

        /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
        public void m868(int i, int i2) {
            this.f1519.m711(i, i2);
        }

        /* renamed from: ひぞ〴つき, reason: contains not printable characters */
        public void m869(C0217 c0217) {
            for (int m836 = m836() - 1; m836 >= 0; m836--) {
                if (!RecyclerView.m684(m826(m836)).m772()) {
                    m825(m836, c0217);
                }
            }
        }

        /* renamed from: びえぁぜい */
        public int mo622(C0217 c0217, C0224 c0224) {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView == null || recyclerView.f1428 == null || !mo657()) {
                return 1;
            }
            return this.f1519.f1428.mo888();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
        
            if (r1 == false) goto L34;
         */
        /* renamed from: びがえ〱な, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo870(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.m862()
                int r4 = r18.m860()
                int r5 = r0.f1522
                int r6 = r18.m828()
                int r5 = r5 - r6
                int r6 = r0.f1523
                int r7 = r18.m847()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.m840()
                r11 = 1
                if (r6 != r11) goto L63
                if (r5 == 0) goto L5e
                goto L6b
            L5e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L6b
            L63:
                if (r10 == 0) goto L66
                goto L6a
            L66:
                int r10 = java.lang.Math.min(r7, r5)
            L6a:
                r5 = r10
            L6b:
                if (r4 == 0) goto L6e
                goto L72
            L6e:
                int r4 = java.lang.Math.min(r8, r1)
            L72:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto Lba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L83
                goto Lb7
            L83:
                int r2 = r18.m862()
                int r4 = r18.m860()
                int r5 = r0.f1522
                int r6 = r18.m828()
                int r5 = r5 - r6
                int r6 = r0.f1523
                int r7 = r18.m847()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f1519
                android.graphics.Rect r7 = r7.f1450
                r0.m861(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto Lb7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto Lb7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto Lb7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto Lb5
                goto Lb7
            Lb5:
                r1 = 1
                goto Lb8
            Lb7:
                r1 = 0
            Lb8:
                if (r1 == 0) goto Lbf
            Lba:
                if (r13 != 0) goto Lc0
                if (r14 == 0) goto Lbf
                goto Lc0
            Lbf:
                return r3
            Lc0:
                if (r22 == 0) goto Lc8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto Ld4
            Lc8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.m703(r13, r14, r15, r16, r17)
            Ld4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0219.mo870(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: びぐびあび */
        public void mo667(String str) {
            RecyclerView recyclerView = this.f1519;
            if (recyclerView != null) {
                recyclerView.m750(str);
            }
        }

        /* renamed from: びちづぼぬ, reason: contains not printable characters */
        public void mo871(C0217 c0217, C0224 c0224, C1084 c1084) {
            if (this.f1519.canScrollVertically(-1) || this.f1519.canScrollHorizontally(-1)) {
                c1084.f5550.addAction(8192);
                c1084.f5550.setScrollable(true);
            }
            if (this.f1519.canScrollVertically(1) || this.f1519.canScrollHorizontally(1)) {
                c1084.f5550.addAction(NotificationCompat.FLAG_BUBBLE);
                c1084.f5550.setScrollable(true);
            }
            c1084.m2456(C1084.C1085.m2469(mo618(c0217, c0224), mo622(c0217, c0224), m865(), m850()));
        }

        /* renamed from: ぶでにく〼〳 */
        public LayoutParams mo623(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        /* renamed from: ぷぞてのほき, reason: contains not printable characters */
        public View m872() {
            View focusedChild;
            RecyclerView recyclerView = this.f1519;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1526.f6510.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: ぷちぅぐね, reason: contains not printable characters */
        public void m873(int i, int i2) {
            this.f1522 = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f1532 = mode;
            if (mode == 0 && !RecyclerView.f1376) {
                this.f1522 = 0;
            }
            this.f1523 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1524 = mode2;
            if (mode2 != 0 || RecyclerView.f1376) {
                return;
            }
            this.f1523 = 0;
        }

        /* renamed from: へ〱そかのず, reason: contains not printable characters */
        public boolean m874(RecyclerView recyclerView, View view, View view2) {
            return m858(recyclerView);
        }

        /* renamed from: へえどぜせ */
        public void mo624(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: へぬ〴づぞ */
        public int mo670(C0224 c0224) {
            return 0;
        }

        /* renamed from: へぼ〳〻び */
        public void mo627(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: ぺぁあねじ */
        public void mo671(int i, int i2, C0224 c0224, InterfaceC0221 interfaceC0221) {
        }

        /* renamed from: ぺぃつぢぼ */
        public void mo672(int i) {
        }

        /* renamed from: ぺがぅす〹ち */
        public boolean mo673() {
            return false;
        }

        /* renamed from: ぺづげぺが, reason: contains not printable characters */
        public int m875(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f1454;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: ぺでどぜべ */
        public void mo628(Rect rect, int i, int i2) {
            int m828 = m828() + m862() + rect.width();
            int m847 = m847() + m860() + rect.height();
            this.f1519.setMeasuredDimension(m812(i, m828, m833()), m812(i2, m847, m823()));
        }

        /* renamed from: ぺふねづ〺 */
        public int mo674(C0224 c0224) {
            return 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$でどあくず, reason: contains not printable characters */
    public static class C0224 {

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public int f1548;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public long f1550;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public int f1552;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f1546 = -1;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1542 = 0;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1545 = 0;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1551 = 1;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1547 = 0;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f1549 = false;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f1543 = false;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f1541 = false;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean f1553 = false;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean f1544 = false;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f1554 = false;

        public String toString() {
            StringBuilder m4207 = C2098.m4207("State{mTargetPosition=");
            m4207.append(this.f1546);
            m4207.append(", mData=");
            m4207.append((Object) null);
            m4207.append(", mItemCount=");
            m4207.append(this.f1547);
            m4207.append(", mIsMeasuring=");
            m4207.append(this.f1553);
            m4207.append(", mPreviousLayoutItemCount=");
            m4207.append(this.f1542);
            m4207.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            m4207.append(this.f1545);
            m4207.append(", mStructureChanged=");
            m4207.append(this.f1549);
            m4207.append(", mInPreLayout=");
            m4207.append(this.f1543);
            m4207.append(", mRunSimpleAnimations=");
            m4207.append(this.f1544);
            m4207.append(", mRunPredictiveAnimations=");
            m4207.append(this.f1554);
            m4207.append('}');
            return m4207.toString();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int m881() {
            return this.f1543 ? this.f1542 - this.f1545 : this.f1547;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m882(int i) {
            if ((this.f1551 & i) != 0) {
                return;
            }
            StringBuilder m4207 = C2098.m4207("Layout state should be one of ");
            m4207.append(Integer.toBinaryString(i));
            m4207.append(" but it is ");
            m4207.append(Integer.toBinaryString(this.f1551));
            throw new IllegalStateException(m4207.toString());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$なぎぱいぢぎ, reason: contains not printable characters */
    public static abstract class AbstractC0225 {
        /* renamed from: げつ〴ぬぐ */
        public void mo791() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$のぷのちつ, reason: contains not printable characters */
    public interface InterfaceC0226 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        void mo883(View view);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo884(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$は〲ぱなで, reason: contains not printable characters */
    public interface InterfaceC0227 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m885(AbstractC0207 abstractC0207);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$びぐびあび, reason: contains not printable characters */
    public static abstract class AbstractC0228<VH extends AbstractC0207> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C0218 f1556 = new C0218();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f1555 = false;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public long mo886(int i) {
            return -1L;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int mo887(int i) {
            return 0;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract int mo888();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public abstract VH mo889(ViewGroup viewGroup, int i);

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void mo890(VH vh) {
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public abstract void mo891(VH vh, int i);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ぶでにく〼〳, reason: contains not printable characters */
    public static abstract class AbstractC0229 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$へぬ〴づぞ, reason: contains not printable characters */
    public static abstract class AbstractC0230 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ぺぁあねじ, reason: contains not printable characters */
    public static abstract class AbstractC0231 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public InterfaceC0232 f1559 = null;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ArrayList<InterfaceC0234> f1557 = new ArrayList<>();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public long f1558 = 120;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public long f1562 = 120;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public long f1560 = 250;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public long f1561 = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ぺぁあねじ$〺つふすそ, reason: contains not printable characters */
        public interface InterfaceC0232 {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ぺぁあねじ$くし〴〺ぅ, reason: contains not printable characters */
        public static class C0233 {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public int f1563;

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public int f1564;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ぺぁあねじ$げつ〴ぬぐ, reason: contains not printable characters */
        public interface InterfaceC0234 {
            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            void m900();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static int m892(AbstractC0207 abstractC0207) {
            int i = abstractC0207.f1471 & 14;
            if (abstractC0207.m783()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = abstractC0207.f1482;
            int m774 = abstractC0207.m774();
            return (i2 == -1 || m774 == -1 || i2 == m774) ? i : i | 2048;
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public C0233 m893(AbstractC0207 abstractC0207) {
            C0233 c0233 = new C0233();
            View view = abstractC0207.f1476;
            c0233.f1564 = view.getLeft();
            c0233.f1563 = view.getTop();
            view.getRight();
            view.getBottom();
            return c0233;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public abstract boolean mo894();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m895(AbstractC0207 abstractC0207) {
            InterfaceC0232 interfaceC0232 = this.f1559;
            if (interfaceC0232 != null) {
                C0205 c0205 = (C0205) interfaceC0232;
                c0205.getClass();
                boolean z = true;
                abstractC0207.m771(true);
                if (abstractC0207.f1468 != null && abstractC0207.f1484 == null) {
                    abstractC0207.f1468 = null;
                }
                abstractC0207.f1484 = null;
                if ((abstractC0207.f1471 & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = abstractC0207.f1476;
                recyclerView.m709();
                C1366 c1366 = recyclerView.f1433;
                int indexOfChild = ((C1395) c1366.f6511).f6599.indexOfChild(view);
                if (indexOfChild == -1) {
                    c1366.m3083(view);
                } else if (c1366.f6509.m3095(indexOfChild)) {
                    c1366.f6509.m3094(indexOfChild);
                    c1366.m3083(view);
                    ((C1395) c1366.f6511).m3152(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    AbstractC0207 m684 = RecyclerView.m684(view);
                    recyclerView.f1411.m804(m684);
                    recyclerView.f1411.m808(m684);
                }
                recyclerView.m724(!z);
                if (z || !abstractC0207.m768()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(abstractC0207.f1476, false);
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract boolean mo896(AbstractC0207 abstractC0207, AbstractC0207 abstractC02072, C0233 c0233, C0233 c02332);

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public abstract void mo897(AbstractC0207 abstractC0207);

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public abstract void mo898();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final void m899() {
            int size = this.f1557.size();
            for (int i = 0; i < size; i++) {
                this.f1557.get(i).m900();
            }
            this.f1557.clear();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ぺふねづ〺, reason: contains not printable characters */
    public static abstract class AbstractC0235 {
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void mo901(Canvas canvas, RecyclerView recyclerView, C0224 c0224) {
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void mo902(Canvas canvas, RecyclerView recyclerView, C0224 c0224) {
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo903(Rect rect, View view, RecyclerView recyclerView, C0224 c0224) {
            ((LayoutParams) view.getLayoutParams()).m754();
            rect.set(0, 0, 0, 0);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1379 = i == 18 || i == 19 || i == 20;
        f1376 = i >= 23;
        f1381 = i >= 21;
        f1380 = i <= 15;
        f1382 = i <= 15;
        Class<?> cls = Integer.TYPE;
        f1375 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1377 = new InterpolatorC0202();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1364.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:43)(10:81|(1:83)|45|46|47|(1:49)(1:65)|50|51|52|53)|46|47|(0)(0)|50|51|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0275, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0277, code lost:
    
        r0 = r3.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028e, code lost:
    
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02ae, code lost:
    
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0243 A[Catch: ClassCastException -> 0x02af, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, ClassNotFoundException -> 0x0327, TryCatch #4 {ClassCastException -> 0x02af, ClassNotFoundException -> 0x0327, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, blocks: (B:47:0x023d, B:49:0x0243, B:50:0x0250, B:52:0x025a, B:53:0x027f, B:58:0x0277, B:62:0x028e, B:63:0x02ae, B:65:0x024c), top: B:46:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024c A[Catch: ClassCastException -> 0x02af, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, ClassNotFoundException -> 0x0327, TryCatch #4 {ClassCastException -> 0x02af, ClassNotFoundException -> 0x0327, IllegalAccessException -> 0x02ce, InstantiationException -> 0x02ed, InvocationTargetException -> 0x030a, blocks: (B:47:0x023d, B:49:0x0243, B:50:0x0250, B:52:0x025a, B:53:0x027f, B:58:0x0277, B:62:0x028e, B:63:0x02ae, B:65:0x024c), top: B:46:0x023d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private C1113 getScrollingChildHelper() {
        if (this.f1435 == null) {
            this.f1435 = new C1113(this);
        }
        return this.f1435;
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static AbstractC0207 m684(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f1456;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static RecyclerView m689(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m689 = m689(viewGroup.getChildAt(i));
            if (m689 != null) {
                return m689;
            }
        }
        return null;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static void m690(AbstractC0207 abstractC0207) {
        WeakReference<RecyclerView> weakReference = abstractC0207.f1469;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == abstractC0207.f1476) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                abstractC0207.f1469 = null;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null || !abstractC0219.m867()) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f1438.mo596((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null && abstractC0219.mo657()) {
            return this.f1438.mo674(this.f1386);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null && abstractC0219.mo657()) {
            return this.f1438.mo612(this.f1386);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null && abstractC0219.mo657()) {
            return this.f1438.mo616(this.f1386);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null && abstractC0219.mo663()) {
            return this.f1438.mo670(this.f1386);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null && abstractC0219.mo663()) {
            return this.f1438.mo602(this.f1386);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null && abstractC0219.mo663()) {
            return this.f1438.mo601(this.f1386);
        }
        return 0;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m2551(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m2547(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2550(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m2552(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.f1406.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f1406.get(i).mo902(canvas, this, this.f1386);
        }
        EdgeEffect edgeEffect = this.f1424;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1385 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1424;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1446;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1385) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1446;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1413;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1385 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1413;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1405;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1385) {
                f = getPaddingRight() + (-getWidth());
                f2 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f2 = -getHeight();
            }
            canvas.translate(f, f2);
            EdgeEffect edgeEffect8 = this.f1405;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.f1388 == null || this.f1406.size() <= 0 || !this.f1388.mo894()) ? z : true) {
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
    
        if (r6 > 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0192, code lost:
    
        if (r3 < 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0195, code lost:
    
        if (r6 < 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x019e, code lost:
    
        if ((r6 * r1) < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a7, code lost:
    
        if ((r6 * r1) > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0175, code lost:
    
        if (r3 > 0) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            return abstractC0219.mo609();
        }
        throw new IllegalStateException(C2098.m4192(this, C2098.m4207("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            return abstractC0219.mo614(getContext(), attributeSet);
        }
        throw new IllegalStateException(C2098.m4192(this, C2098.m4207("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            return abstractC0219.mo623(layoutParams);
        }
        throw new IllegalStateException(C2098.m4192(this, C2098.m4207("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0228 getAdapter() {
        return this.f1428;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null) {
            return super.getBaseline();
        }
        abstractC0219.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC0204 interfaceC0204 = this.f1444;
        return interfaceC0204 == null ? super.getChildDrawingOrder(i, i2) : interfaceC0204.m759(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1385;
    }

    public C1369 getCompatAccessibilityDelegate() {
        return this.f1397;
    }

    public C0201 getEdgeEffectFactory() {
        return this.f1404;
    }

    public AbstractC0231 getItemAnimator() {
        return this.f1388;
    }

    public int getItemDecorationCount() {
        return this.f1406.size();
    }

    public AbstractC0219 getLayoutManager() {
        return this.f1438;
    }

    public int getMaxFlingVelocity() {
        return this.f1451;
    }

    public int getMinFlingVelocity() {
        return this.f1415;
    }

    public long getNanoTime() {
        if (f1381) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0230 getOnFlingListener() {
        return this.f1417;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1384;
    }

    public C0208 getRecycledViewPool() {
        return this.f1411.m807();
    }

    public int getScrollState() {
        return this.f1398;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2546(0);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f1419;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1389;
    }

    @Override // android.view.View, p034.p035.p045.InterfaceC1110
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f5611;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1421 = 0;
        this.f1419 = true;
        this.f1418 = this.f1418 && !isLayoutRequested();
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            abstractC0219.f1533 = true;
            abstractC0219.m817();
        }
        this.f1437 = false;
        if (f1381) {
            ThreadLocal<RunnableC1400> threadLocal = RunnableC1400.f6611;
            RunnableC1400 runnableC1400 = threadLocal.get();
            this.f1422 = runnableC1400;
            if (runnableC1400 == null) {
                this.f1422 = new RunnableC1400();
                AtomicInteger atomicInteger = C1096.f5578;
                Display display = Build.VERSION.SDK_INT >= 17 ? getDisplay() : C1096.m2507(this) ? ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay() : null;
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC1400 runnableC14002 = this.f1422;
                runnableC14002.f6615 = (long) (1.0E9f / f);
                threadLocal.set(runnableC14002);
            }
            this.f1422.f6612.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC1400 runnableC1400;
        super.onDetachedFromWindow();
        AbstractC0231 abstractC0231 = this.f1388;
        if (abstractC0231 != null) {
            abstractC0231.mo898();
        }
        m698();
        this.f1419 = false;
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            C0217 c0217 = this.f1411;
            abstractC0219.f1533 = false;
            abstractC0219.mo662(this, c0217);
        }
        this.f1447.clear();
        removeCallbacks(this.f1394);
        this.f1390.getClass();
        while (C1397.C1399.f6606.mo2386() != null) {
        }
        if (!f1381 || (runnableC1400 = this.f1422) == null) {
            return;
        }
        runnableC1400.f6612.remove(this);
        this.f1422 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1406.size();
        for (int i = 0; i < size; i++) {
            this.f1406.get(i).mo901(canvas, this, this.f1386);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r0 = r5.f1438
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f1389
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r0 = r5.f1438
            boolean r0 = r0.mo663()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r3 = r5.f1438
            boolean r3 = r3.mo657()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r3 = r5.f1438
            boolean r3 = r3.mo663()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r3 = r5.f1438
            boolean r3 = r3.mo657()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.f1436
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f1412
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m714(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f1389) {
            return false;
        }
        this.f1402 = null;
        if (m701(motionEvent)) {
            m700();
            return true;
        }
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null) {
            return false;
        }
        boolean mo657 = abstractC0219.mo657();
        boolean mo663 = this.f1438.mo663();
        if (this.f1432 == null) {
            this.f1432 = VelocityTracker.obtain();
        }
        this.f1432.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1401) {
                this.f1401 = false;
            }
            this.f1414 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f1425 = x;
            this.f1392 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f1400 = y;
            this.f1427 = y;
            if (this.f1398 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m749(1);
            }
            int[] iArr = this.f1449;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo657;
            if (mo663) {
                i = (mo657 ? 1 : 0) | 2;
            }
            m737(i, 0);
        } else if (actionMasked == 1) {
            this.f1432.clear();
            m749(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1414);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1398 != 1) {
                int i2 = x2 - this.f1392;
                int i3 = y2 - this.f1427;
                if (mo657 == 0 || Math.abs(i2) <= this.f1441) {
                    z = false;
                } else {
                    this.f1425 = x2;
                    z = true;
                }
                if (mo663 && Math.abs(i3) > this.f1441) {
                    this.f1400 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m700();
        } else if (actionMasked == 5) {
            this.f1414 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1425 = x3;
            this.f1392 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1400 = y3;
            this.f1427 = y3;
        } else if (actionMasked == 6) {
            m751(motionEvent);
        }
        return this.f1398 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1132.m2568("RV OnLayout");
        m708();
        C1132.m2567();
        this.f1418 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null) {
            m711(i, i2);
            return;
        }
        boolean z = false;
        if (!abstractC0219.mo673()) {
            if (this.f1439) {
                this.f1438.m868(i, i2);
                return;
            }
            C0224 c0224 = this.f1386;
            if (c0224.f1554) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0228 abstractC0228 = this.f1428;
            if (abstractC0228 != null) {
                c0224.f1547 = abstractC0228.mo888();
            } else {
                c0224.f1547 = 0;
            }
            m709();
            this.f1438.m868(i, i2);
            m724(false);
            this.f1386.f1543 = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1438.m868(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        if (z || this.f1428 == null) {
            return;
        }
        if (this.f1386.f1551 == 1) {
            m723();
        }
        this.f1438.m873(i, i2);
        this.f1386.f1553 = true;
        m741();
        this.f1438.m824(i, i2);
        if (this.f1438.mo664()) {
            this.f1438.m873(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.f1386.f1553 = true;
            m741();
            this.f1438.m824(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m734()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f1443 = savedState;
        super.onRestoreInstanceState(savedState.f1099);
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null || (parcelable2 = this.f1443.f1458) == null) {
            return;
        }
        abstractC0219.mo630(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f1443;
        if (savedState2 != null) {
            savedState.f1458 = savedState2.f1458;
        } else {
            AbstractC0219 abstractC0219 = this.f1438;
            savedState.f1458 = abstractC0219 != null ? abstractC0219.mo635() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m718();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0285, code lost:
    
        if (r1 != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022d, code lost:
    
        if (r7 == false) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0207 m684 = m684(view);
        if (m684 != null) {
            if (m684.m768()) {
                m684.f1471 &= -257;
            } else if (!m684.m772()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(m684);
                throw new IllegalArgumentException(C2098.m4192(this, sb));
            }
        }
        view.clearAnimation();
        m705(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f1438.m874(this, view, view2) && view2 != null) {
            m742(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1438.mo870(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f1399.size();
        for (int i = 0; i < size; i++) {
            this.f1399.get(i).mo787(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1429 != 0 || this.f1389) {
            this.f1445 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null || this.f1389) {
            return;
        }
        boolean mo657 = abstractC0219.mo657();
        boolean mo663 = this.f1438.mo663();
        if (mo657 || mo663) {
            if (!mo657) {
                i = 0;
            }
            if (!mo663) {
                i2 = 0;
            }
            m714(i, i2, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m734()) {
            int contentChangeTypes = (accessibilityEvent == null || Build.VERSION.SDK_INT < 19) ? 0 : accessibilityEvent.getContentChangeTypes();
            this.f1396 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1369 c1369) {
        this.f1397 = c1369;
        C1096.m2490(this, c1369);
    }

    public void setAdapter(AbstractC0228 abstractC0228) {
        setLayoutFrozen(false);
        AbstractC0228 abstractC02282 = this.f1428;
        if (abstractC02282 != null) {
            abstractC02282.f1556.unregisterObserver(this.f1387);
            this.f1428.getClass();
        }
        m694();
        C1382 c1382 = this.f1426;
        c1382.m3119(c1382.f6546);
        c1382.m3119(c1382.f6547);
        AbstractC0228 abstractC02283 = this.f1428;
        this.f1428 = abstractC0228;
        if (abstractC0228 != null) {
            abstractC0228.f1556.registerObserver(this.f1387);
        }
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            abstractC0219.m820();
        }
        C0217 c0217 = this.f1411;
        AbstractC0228 abstractC02284 = this.f1428;
        c0217.m798();
        C0208 m807 = c0217.m807();
        m807.getClass();
        if (abstractC02283 != null) {
            m807.f1486--;
        }
        if (m807.f1486 == 0) {
            for (int i = 0; i < m807.f1487.size(); i++) {
                m807.f1487.valueAt(i).f1490.clear();
            }
        }
        if (abstractC02284 != null) {
            m807.f1486++;
        }
        this.f1386.f1549 = true;
        m726(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0204 interfaceC0204) {
        if (interfaceC0204 == this.f1444) {
            return;
        }
        this.f1444 = interfaceC0204;
        setChildrenDrawingOrderEnabled(interfaceC0204 != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f1385) {
            m718();
        }
        this.f1385 = z;
        super.setClipToPadding(z);
        if (this.f1418) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0201 c0201) {
        c0201.getClass();
        this.f1404 = c0201;
        m718();
    }

    public void setHasFixedSize(boolean z) {
        this.f1439 = z;
    }

    public void setItemAnimator(AbstractC0231 abstractC0231) {
        AbstractC0231 abstractC02312 = this.f1388;
        if (abstractC02312 != null) {
            abstractC02312.mo898();
            this.f1388.f1559 = null;
        }
        this.f1388 = abstractC0231;
        if (abstractC0231 != null) {
            abstractC0231.f1559 = this.f1408;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0217 c0217 = this.f1411;
        c0217.f1515 = i;
        c0217.m806();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0219 abstractC0219) {
        if (abstractC0219 == this.f1438) {
            return;
        }
        m698();
        if (this.f1438 != null) {
            AbstractC0231 abstractC0231 = this.f1388;
            if (abstractC0231 != null) {
                abstractC0231.mo898();
            }
            this.f1438.m869(this.f1411);
            this.f1438.m864(this.f1411);
            this.f1411.m798();
            if (this.f1419) {
                AbstractC0219 abstractC02192 = this.f1438;
                C0217 c0217 = this.f1411;
                abstractC02192.f1533 = false;
                abstractC02192.mo662(this, c0217);
            }
            this.f1438.m819(null);
            this.f1438 = null;
        } else {
            this.f1411.m798();
        }
        C1366 c1366 = this.f1433;
        C1366.C1368 c1368 = c1366.f6509;
        c1368.f6513 = 0L;
        C1366.C1368 c13682 = c1368.f6512;
        if (c13682 != null) {
            c13682.m3090();
        }
        int size = c1366.f6510.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1366.InterfaceC1367 interfaceC1367 = c1366.f6511;
            View view = c1366.f6510.get(size);
            C1395 c1395 = (C1395) interfaceC1367;
            c1395.getClass();
            AbstractC0207 m684 = m684(view);
            if (m684 != null) {
                c1395.f6599.m739(m684, m684.f1472);
                m684.f1472 = 0;
            }
            c1366.f6510.remove(size);
        }
        C1395 c13952 = (C1395) c1366.f6511;
        int m3151 = c13952.m3151();
        for (int i = 0; i < m3151; i++) {
            View m3153 = c13952.m3153(i);
            c13952.f6599.m705(m3153);
            m3153.clearAnimation();
        }
        c13952.f6599.removeAllViews();
        this.f1438 = abstractC0219;
        if (abstractC0219 != null) {
            if (abstractC0219.f1519 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(abstractC0219);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(C2098.m4192(abstractC0219.f1519, sb));
            }
            abstractC0219.m819(this);
            if (this.f1419) {
                AbstractC0219 abstractC02193 = this.f1438;
                abstractC02193.f1533 = true;
                abstractC02193.m817();
            }
        }
        this.f1411.m806();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m2555(z);
    }

    public void setOnFlingListener(AbstractC0230 abstractC0230) {
        this.f1417 = abstractC0230;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0206 abstractC0206) {
        this.f1440 = abstractC0206;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f1384 = z;
    }

    public void setRecycledViewPool(C0208 c0208) {
        C0217 c0217 = this.f1411;
        if (c0217.f1512 != null) {
            r1.f1486--;
        }
        c0217.f1512 = c0208;
        if (c0208 == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        c0217.f1512.f1486++;
    }

    public void setRecyclerListener(InterfaceC0227 interfaceC0227) {
        this.f1448 = interfaceC0227;
    }

    public void setScrollState(int i) {
        AbstractC0214 abstractC0214;
        if (i == this.f1398) {
            return;
        }
        this.f1398 = i;
        if (i != 2) {
            this.f1410.m757();
            AbstractC0219 abstractC0219 = this.f1438;
            if (abstractC0219 != null && (abstractC0214 = abstractC0219.f1520) != null) {
                abstractC0214.m793();
            }
        }
        AbstractC0219 abstractC02192 = this.f1438;
        if (abstractC02192 != null) {
            abstractC02192.mo816(i);
        }
        m738();
        AbstractC0206 abstractC0206 = this.f1440;
        if (abstractC0206 != null) {
            abstractC0206.mo761(this, i);
        }
        List<AbstractC0206> list = this.f1383;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f1383.get(size).mo761(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1441 = i != 1 ? viewConfiguration.getScaledTouchSlop() : viewConfiguration.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0229 abstractC0229) {
        this.f1411.getClass();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m2549(i, 0);
    }

    @Override // android.view.View, p034.p035.p045.InterfaceC1110
    public void stopNestedScroll() {
        getScrollingChildHelper().m2556(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f1389) {
            m750("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f1389 = true;
                this.f1401 = true;
                m698();
                return;
            }
            this.f1389 = false;
            if (this.f1445 && this.f1438 != null && this.f1428 != null) {
                requestLayout();
            }
            this.f1445 = false;
        }
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public final void m691() {
        VelocityTracker velocityTracker = this.f1432;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        m749(0);
        EdgeEffect edgeEffect = this.f1424;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f1424.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1446;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f1446.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1413;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f1413.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1405;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f1405.isFinished();
        }
        if (z) {
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public void m692() {
        if (this.f1437 || !this.f1419) {
            return;
        }
        C1096.m2482(this, this.f1394);
        this.f1437 = true;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m693(AbstractC0206 abstractC0206) {
        if (this.f1383 == null) {
            this.f1383 = new ArrayList();
        }
        this.f1383.add(abstractC0206);
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public void m694() {
        AbstractC0231 abstractC0231 = this.f1388;
        if (abstractC0231 != null) {
            abstractC0231.mo898();
        }
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            abstractC0219.m869(this.f1411);
            this.f1438.m864(this.f1411);
        }
        this.f1411.m798();
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public Rect m695(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f1455) {
            return layoutParams.f1454;
        }
        if (this.f1386.f1543 && (layoutParams.m752() || layoutParams.f1456.m783())) {
            return layoutParams.f1454;
        }
        Rect rect = layoutParams.f1454;
        rect.set(0, 0, 0, 0);
        int size = this.f1406.size();
        for (int i = 0; i < size; i++) {
            this.f1450.set(0, 0, 0, 0);
            this.f1406.get(i).mo903(this.f1450, view, this, this.f1386);
            int i2 = rect.left;
            Rect rect2 = this.f1450;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f1455 = false;
        return rect;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m696() {
        int measuredHeight;
        int measuredWidth;
        if (this.f1424 != null) {
            return;
        }
        EdgeEffect m755 = this.f1404.m755(this);
        this.f1424 = m755;
        if (this.f1385) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m755.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m697(AbstractC0235 abstractC0235) {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 != null) {
            abstractC0219.mo667("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1406.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f1406.add(abstractC0235);
        m729();
        requestLayout();
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public void m698() {
        AbstractC0214 abstractC0214;
        setScrollState(0);
        this.f1410.m757();
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null || (abstractC0214 = abstractC0219.f1520) == null) {
            return;
        }
        abstractC0214.m793();
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public void m699(int i) {
        if (this.f1438 == null) {
            return;
        }
        setScrollState(2);
        this.f1438.mo672(i);
        awakenScrollBars();
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m700() {
        m691();
        setScrollState(0);
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final boolean m701(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1399.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0210 interfaceC0210 = this.f1399.get(i);
            if (interfaceC0210.mo788(this, motionEvent) && action != 3) {
                this.f1402 = interfaceC0210;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void m702() {
        int measuredWidth;
        int measuredHeight;
        if (this.f1446 != null) {
            return;
        }
        EdgeEffect m755 = this.f1404.m755(this);
        this.f1446 = m755;
        if (this.f1385) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m755.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public void m703(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null || this.f1389) {
            return;
        }
        if (!abstractC0219.mo657()) {
            i = 0;
        }
        if (!this.f1438.mo663()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            m737(i4, 1);
        }
        this.f1410.m756(i, i2, i3, interpolator);
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public boolean m704() {
        return !this.f1418 || this.f1430 || this.f1426.m3114();
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void m705(View view) {
        AbstractC0207 m684 = m684(view);
        m743();
        AbstractC0228 abstractC0228 = this.f1428;
        if (abstractC0228 != null && m684 != null) {
            abstractC0228.getClass();
        }
        List<InterfaceC0226> list = this.f1434;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1434.get(size).mo883(view);
            }
        }
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public void m706() {
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void m707() {
        int measuredHeight;
        int measuredWidth;
        if (this.f1413 != null) {
            return;
        }
        EdgeEffect m755 = this.f1404.m755(this);
        this.f1413 = m755;
        if (this.f1385) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m755.setSize(measuredHeight, measuredWidth);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0304, code lost:
    
        if (r15.f1433.m3087(r0) == false) goto L212;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x036e  */
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m708() {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m708():void");
    }

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public void m709() {
        int i = this.f1429 + 1;
        this.f1429 = i;
        if (i != 1 || this.f1389) {
            return;
        }
        this.f1445 = false;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public AbstractC0207 m710(int i) {
        AbstractC0207 abstractC0207 = null;
        if (this.f1430) {
            return null;
        }
        int m3076 = this.f1433.m3076();
        for (int i2 = 0; i2 < m3076; i2++) {
            AbstractC0207 m684 = m684(this.f1433.m3078(i2));
            if (m684 != null && !m684.m778() && m727(m684) == i) {
                if (!this.f1433.m3087(m684.f1476)) {
                    return m684;
                }
                abstractC0207 = m684;
            }
        }
        return abstractC0207;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m711(int i, int i2) {
        setMeasuredDimension(AbstractC0219.m812(i, getPaddingRight() + getPaddingLeft(), C1096.m2488(this)), AbstractC0219.m812(i2, getPaddingBottom() + getPaddingTop(), C1096.m2485(this)));
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public void m712(AbstractC0207 abstractC0207, AbstractC0231.C0233 c0233) {
        abstractC0207.m779(0, 8192);
        if (this.f1386.f1541 && abstractC0207.m766() && !abstractC0207.m778() && !abstractC0207.m772()) {
            this.f1390.f6604.m3277(m747(abstractC0207), abstractC0207);
        }
        this.f1390.m3156(abstractC0207, c0233);
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public void m713(int i) {
        if (this.f1389) {
            return;
        }
        m698();
        AbstractC0219 abstractC0219 = this.f1438;
        if (abstractC0219 == null) {
            return;
        }
        abstractC0219.mo672(i);
        awakenScrollBars();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m714(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m714(int, int, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if ((r6.f1388 != null && r6.f1438.mo591()) != false) goto L51;
     */
    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m715() {
        /*
            r6 = this;
            boolean r0 = r6.f1430
            if (r0 == 0) goto L19
            づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ r0 = r6.f1426
            java.util.ArrayList<づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ$〺つふすそ> r1 = r0.f6546
            r0.m3119(r1)
            java.util.ArrayList<づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ$〺つふすそ> r1 = r0.f6547
            r0.m3119(r1)
            boolean r0 = r6.f1395
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r0 = r6.f1438
            r0.mo597(r6)
        L19:
            androidx.recyclerview.widget.RecyclerView$ぺぁあねじ r0 = r6.f1388
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r0 = r6.f1438
            boolean r0 = r0.mo591()
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L32
            づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ r0 = r6.f1426
            r0.m3115()
            goto L37
        L32:
            づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ r0 = r6.f1426
            r0.m3116()
        L37:
            boolean r0 = r6.f1409
            if (r0 != 0) goto L42
            boolean r0 = r6.f1431
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = 0
            goto L43
        L42:
            r0 = 1
        L43:
            androidx.recyclerview.widget.RecyclerView$でどあくず r3 = r6.f1386
            boolean r4 = r6.f1418
            if (r4 == 0) goto L63
            androidx.recyclerview.widget.RecyclerView$ぺぁあねじ r4 = r6.f1388
            if (r4 == 0) goto L63
            boolean r4 = r6.f1430
            if (r4 != 0) goto L59
            if (r0 != 0) goto L59
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r5 = r6.f1438
            boolean r5 = r5.f1518
            if (r5 == 0) goto L63
        L59:
            if (r4 == 0) goto L61
            androidx.recyclerview.widget.RecyclerView$びぐびあび r4 = r6.f1428
            boolean r4 = r4.f1555
            if (r4 == 0) goto L63
        L61:
            r4 = 1
            goto L64
        L63:
            r4 = 0
        L64:
            r3.f1544 = r4
            if (r4 == 0) goto L80
            if (r0 == 0) goto L80
            boolean r0 = r6.f1430
            if (r0 != 0) goto L80
            androidx.recyclerview.widget.RecyclerView$ぺぁあねじ r0 = r6.f1388
            if (r0 == 0) goto L7c
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r0 = r6.f1438
            boolean r0 = r0.mo591()
            if (r0 == 0) goto L7c
            r0 = 1
            goto L7d
        L7c:
            r0 = 0
        L7d:
            if (r0 == 0) goto L80
            goto L81
        L80:
            r1 = 0
        L81:
            r3.f1554 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m715():void");
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public void m716() {
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public AbstractC0207 m717(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m684(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public void m718() {
        this.f1405 = null;
        this.f1446 = null;
        this.f1413 = null;
        this.f1424 = null;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public void m719(boolean z) {
        int i;
        int i2 = this.f1421 - 1;
        this.f1421 = i2;
        if (i2 < 1) {
            this.f1421 = 0;
            if (z) {
                int i3 = this.f1396;
                this.f1396 = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f1442;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        if (Build.VERSION.SDK_INT >= 19) {
                            obtain.setContentChangeTypes(i3);
                        }
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f1447.size() - 1; size >= 0; size--) {
                    AbstractC0207 abstractC0207 = this.f1447.get(size);
                    if (abstractC0207.f1476.getParent() == this && !abstractC0207.m772() && (i = abstractC0207.f1473) != -1) {
                        C1096.m2505(abstractC0207.f1476, i);
                        abstractC0207.f1473 = -1;
                    }
                }
                this.f1447.clear();
            }
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean m720(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m2550(i, i2, iArr, null, i3);
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public void m721() {
        this.f1421++;
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m722(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m2553(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final void m723() {
        int id;
        View m732;
        this.f1386.m882(1);
        m736(this.f1386);
        this.f1386.f1553 = false;
        m709();
        C1397 c1397 = this.f1390;
        c1397.f6605.clear();
        c1397.f6604.m3276();
        m721();
        m715();
        View focusedChild = (this.f1384 && hasFocus() && this.f1428 != null) ? getFocusedChild() : null;
        AbstractC0207 m717 = (focusedChild == null || (m732 = m732(focusedChild)) == null) ? null : m717(m732);
        if (m717 == null) {
            C0224 c0224 = this.f1386;
            c0224.f1550 = -1L;
            c0224.f1548 = -1;
            c0224.f1552 = -1;
        } else {
            C0224 c02242 = this.f1386;
            c02242.f1550 = this.f1428.f1555 ? m717.f1478 : -1L;
            c02242.f1548 = this.f1430 ? -1 : m717.m778() ? m717.f1482 : m717.m774();
            C0224 c02243 = this.f1386;
            View view = m717.f1476;
            loop3: while (true) {
                id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        break;
                    }
                }
            }
            c02243.f1552 = id;
        }
        C0224 c02244 = this.f1386;
        c02244.f1541 = c02244.f1544 && this.f1431;
        this.f1431 = false;
        this.f1409 = false;
        c02244.f1543 = c02244.f1554;
        c02244.f1547 = this.f1428.mo888();
        m725(this.f1403);
        if (this.f1386.f1544) {
            int m3082 = this.f1433.m3082();
            for (int i = 0; i < m3082; i++) {
                AbstractC0207 m684 = m684(this.f1433.m3085(i));
                if (!m684.m772() && (!m684.m783() || this.f1428.f1555)) {
                    AbstractC0231 abstractC0231 = this.f1388;
                    AbstractC0231.m892(m684);
                    m684.m764();
                    this.f1390.m3156(m684, abstractC0231.m893(m684));
                    if (this.f1386.f1541 && m684.m766() && !m684.m778() && !m684.m772() && !m684.m783()) {
                        this.f1390.f6604.m3277(m747(m684), m684);
                    }
                }
            }
        }
        if (this.f1386.f1554) {
            int m3076 = this.f1433.m3076();
            for (int i2 = 0; i2 < m3076; i2++) {
                AbstractC0207 m6842 = m684(this.f1433.m3078(i2));
                if (!m6842.m772() && m6842.f1482 == -1) {
                    m6842.f1482 = m6842.f1475;
                }
            }
            C0224 c02245 = this.f1386;
            boolean z = c02245.f1549;
            c02245.f1549 = false;
            this.f1438.mo610(this.f1411, c02245);
            this.f1386.f1549 = z;
            for (int i3 = 0; i3 < this.f1433.m3082(); i3++) {
                AbstractC0207 m6843 = m684(this.f1433.m3085(i3));
                if (!m6843.m772()) {
                    C1397.C1399 orDefault = this.f1390.f6605.getOrDefault(m6843, null);
                    if (!((orDefault == null || (orDefault.f6609 & 4) == 0) ? false : true)) {
                        AbstractC0231.m892(m6843);
                        boolean m762 = m6843.m762(8192);
                        AbstractC0231 abstractC02312 = this.f1388;
                        m6843.m764();
                        AbstractC0231.C0233 m893 = abstractC02312.m893(m6843);
                        if (m762) {
                            m712(m6843, m893);
                        } else {
                            C1397 c13972 = this.f1390;
                            C1397.C1399 orDefault2 = c13972.f6605.getOrDefault(m6843, null);
                            if (orDefault2 == null) {
                                orDefault2 = C1397.C1399.m3162();
                                c13972.f6605.put(m6843, orDefault2);
                            }
                            orDefault2.f6609 |= 2;
                            orDefault2.f6607 = m893;
                        }
                    }
                }
            }
        }
        m730();
        m719(true);
        m724(false);
        this.f1386.f1551 = 2;
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public void m724(boolean z) {
        if (this.f1429 < 1) {
            this.f1429 = 1;
        }
        if (!z && !this.f1389) {
            this.f1445 = false;
        }
        if (this.f1429 == 1) {
            if (z && this.f1445 && !this.f1389 && this.f1438 != null && this.f1428 != null) {
                m708();
            }
            if (!this.f1389) {
                this.f1445 = false;
            }
        }
        this.f1429--;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m725(int[] iArr) {
        int m3082 = this.f1433.m3082();
        if (m3082 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m3082; i3++) {
            AbstractC0207 m684 = m684(this.f1433.m3085(i3));
            if (!m684.m772()) {
                int m777 = m684.m777();
                if (m777 < i) {
                    i = m777;
                }
                if (m777 > i2) {
                    i2 = m777;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public void m726(boolean z) {
        this.f1395 = z | this.f1395;
        this.f1430 = true;
        int m3076 = this.f1433.m3076();
        for (int i = 0; i < m3076; i++) {
            AbstractC0207 m684 = m684(this.f1433.m3078(i));
            if (m684 != null && !m684.m772()) {
                m684.m763(6);
            }
        }
        m729();
        C0217 c0217 = this.f1411;
        int size = c0217.f1513.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0207 abstractC0207 = c0217.f1513.get(i2);
            if (abstractC0207 != null) {
                abstractC0207.m763(6);
                abstractC0207.m770(null);
            }
        }
        AbstractC0228 abstractC0228 = RecyclerView.this.f1428;
        if (abstractC0228 == null || !abstractC0228.f1555) {
            c0217.m805();
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int m727(AbstractC0207 abstractC0207) {
        if (!abstractC0207.m762(524) && abstractC0207.m765()) {
            C1382 c1382 = this.f1426;
            int i = abstractC0207.f1475;
            int size = c1382.f6546.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1382.C1383 c1383 = c1382.f6546.get(i2);
                int i3 = c1383.f6553;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c1383.f6551;
                        if (i4 <= i) {
                            int i5 = c1383.f6554;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c1383.f6551;
                        if (i6 == i) {
                            i = c1383.f6554;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c1383.f6554 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c1383.f6551 <= i) {
                    i += c1383.f6554;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public void m728(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m3076 = this.f1433.m3076();
        for (int i4 = 0; i4 < m3076; i4++) {
            AbstractC0207 m684 = m684(this.f1433.m3078(i4));
            if (m684 != null && !m684.m772()) {
                int i5 = m684.f1475;
                if (i5 >= i3) {
                    m684.m767(-i2, z);
                } else if (i5 >= i) {
                    m684.m763(8);
                    m684.m767(-i2, z);
                    m684.f1475 = i - 1;
                }
                this.f1386.f1549 = true;
            }
        }
        C0217 c0217 = this.f1411;
        int size = c0217.f1513.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            AbstractC0207 abstractC0207 = c0217.f1513.get(size);
            if (abstractC0207 != null) {
                int i6 = abstractC0207.f1475;
                if (i6 >= i3) {
                    abstractC0207.m767(-i2, z);
                } else if (i6 >= i) {
                    abstractC0207.m763(8);
                    c0217.m799(size);
                }
            }
        }
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public void m729() {
        int m3076 = this.f1433.m3076();
        for (int i = 0; i < m3076; i++) {
            ((LayoutParams) this.f1433.m3078(i).getLayoutParams()).f1455 = true;
        }
        C0217 c0217 = this.f1411;
        int size = c0217.f1513.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) c0217.f1513.get(i2).f1476.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f1455 = true;
            }
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m730() {
        int m3076 = this.f1433.m3076();
        for (int i = 0; i < m3076; i++) {
            AbstractC0207 m684 = m684(this.f1433.m3078(i));
            if (!m684.m772()) {
                m684.m769();
            }
        }
        C0217 c0217 = this.f1411;
        int size = c0217.f1513.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0217.f1513.get(i2).m769();
        }
        int size2 = c0217.f1514.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c0217.f1514.get(i3).m769();
        }
        ArrayList<AbstractC0207> arrayList = c0217.f1511;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c0217.f1511.get(i4).m769();
            }
        }
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void m731(int i, int i2) {
        this.f1452++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m716();
        AbstractC0206 abstractC0206 = this.f1440;
        if (abstractC0206 != null) {
            abstractC0206.mo760(this, i, i2);
        }
        List<AbstractC0206> list = this.f1383;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1383.get(size).mo760(this, i, i2);
            }
        }
        this.f1452--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m732(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m732(android.view.View):android.view.View");
    }

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public void m733(int i, int i2, int[] iArr) {
        AbstractC0207 abstractC0207;
        m709();
        m721();
        C1132.m2568("RV Scroll");
        m736(this.f1386);
        int mo617 = i != 0 ? this.f1438.mo617(i, this.f1411, this.f1386) : 0;
        int mo607 = i2 != 0 ? this.f1438.mo607(i2, this.f1411, this.f1386) : 0;
        C1132.m2567();
        int m3082 = this.f1433.m3082();
        for (int i3 = 0; i3 < m3082; i3++) {
            View m3085 = this.f1433.m3085(i3);
            AbstractC0207 m717 = m717(m3085);
            if (m717 != null && (abstractC0207 = m717.f1484) != null) {
                View view = abstractC0207.f1476;
                int left = m3085.getLeft();
                int top = m3085.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m719(true);
        m724(false);
        if (iArr != null) {
            iArr[0] = mo617;
            iArr[1] = mo607;
        }
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public boolean m734() {
        return this.f1421 > 0;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m735(AbstractC0207 abstractC0207) {
        View view = abstractC0207.f1476;
        boolean z = view.getParent() == this;
        this.f1411.m804(m717(view));
        if (abstractC0207.m768()) {
            this.f1433.m3077(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1366 c1366 = this.f1433;
        if (!z) {
            c1366.m3081(view, -1, true);
            return;
        }
        int indexOfChild = ((C1395) c1366.f6511).f6599.indexOfChild(view);
        if (indexOfChild >= 0) {
            c1366.f6509.m3088(indexOfChild);
            c1366.m3086(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m736(C0224 c0224) {
        if (getScrollState() != 2) {
            c0224.getClass();
            return;
        }
        OverScroller overScroller = this.f1410.f1465;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0224.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public boolean m737(int i, int i2) {
        return getScrollingChildHelper().m2549(i, i2);
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public void m738() {
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public boolean m739(AbstractC0207 abstractC0207, int i) {
        if (!m734()) {
            C1096.m2505(abstractC0207.f1476, i);
            return true;
        }
        abstractC0207.f1473 = i;
        this.f1447.add(abstractC0207);
        return false;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m740(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f1424;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f1424.onRelease();
            z = this.f1424.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1413;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1413.onRelease();
            z |= this.f1413.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1446;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1446.onRelease();
            z |= this.f1446.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1405;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1405.onRelease();
            z |= this.f1405.isFinished();
        }
        if (z) {
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final void m741() {
        m709();
        m721();
        this.f1386.m882(6);
        this.f1426.m3116();
        this.f1386.f1547 = this.f1428.mo888();
        C0224 c0224 = this.f1386;
        c0224.f1545 = 0;
        c0224.f1543 = false;
        this.f1438.mo610(this.f1411, c0224);
        C0224 c02242 = this.f1386;
        c02242.f1549 = false;
        this.f1443 = null;
        c02242.f1544 = c02242.f1544 && this.f1388 != null;
        c02242.f1551 = 4;
        m719(true);
        m724(false);
    }

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public final void m742(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1450.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f1455) {
                Rect rect = layoutParams2.f1454;
                Rect rect2 = this.f1450;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1450);
            offsetRectIntoDescendantCoords(view, this.f1450);
        }
        this.f1438.mo870(this, view, this.f1450, !this.f1418, view2 == null);
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public void m743() {
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public String m744() {
        StringBuilder m4207 = C2098.m4207(" ");
        m4207.append(super.toString());
        m4207.append(", adapter:");
        m4207.append(this.f1428);
        m4207.append(", layout:");
        m4207.append(this.f1438);
        m4207.append(", context:");
        m4207.append(getContext());
        return m4207.toString();
    }

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public void m745(int i) {
        AbstractC0219 abstractC0219;
        if (this.f1389 || (abstractC0219 = this.f1438) == null) {
            return;
        }
        abstractC0219.mo656(this, this.f1386, i);
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m746() {
        int measuredWidth;
        int measuredHeight;
        if (this.f1405 != null) {
            return;
        }
        EdgeEffect m755 = this.f1404.m755(this);
        this.f1405 = m755;
        if (this.f1385) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m755.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public long m747(AbstractC0207 abstractC0207) {
        return this.f1428.f1555 ? abstractC0207.f1478 : abstractC0207.f1475;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m748() {
        if (!this.f1418 || this.f1430) {
            C1132.m2568("RV FullInvalidate");
            m708();
            C1132.m2567();
        } else if (this.f1426.m3114()) {
            this.f1426.getClass();
            if (this.f1426.m3114()) {
                C1132.m2568("RV FullInvalidate");
                m708();
                C1132.m2567();
            }
        }
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public void m749(int i) {
        getScrollingChildHelper().m2556(i);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m750(String str) {
        if (m734()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(C2098.m4192(this, C2098.m4207("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1452 > 0) {
            new IllegalStateException(C2098.m4192(this, C2098.m4207("")));
        }
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public final void m751(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1414) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1414 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1425 = x;
            this.f1392 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f1400 = y;
            this.f1427 = y;
        }
    }
}
