package p034.p050.p060;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p043.C1067;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p035.p045.C1104;
import p034.p035.p045.C1112;
import p034.p050.C1147;
import p034.p050.C1148;
import p034.p050.C1263;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.p051.AbstractC1154;
import p034.p050.p051.C1153;
import p034.p050.p051.C1158;
import p034.p050.p051.WindowCallbackC1149;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1181;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p053.C1209;
import p034.p050.p053.C1234;
import p034.p050.p053.C1242;
import p034.p050.p053.C1260;
import p034.p050.p053.InterfaceC1226;
import p034.p050.p053.InterfaceC1258;
import p034.p050.p055.p056.C1266;
import p034.p050.p060.C1290;
import p034.p080.C1493;
import p034.p080.C1504;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class LayoutInflaterFactory2C1320 extends AbstractC1345 implements C1164.InterfaceC1166, LayoutInflater.Factory2 {

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public static boolean f6345;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public static final boolean f6346;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public static final int[] f6347;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public static final C1493<String, Integer> f6348 = new C1493<>();

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public static final boolean f6349;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public static final boolean f6350;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public C1309 f6351;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final InterfaceC1301 f6352;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public boolean f6353;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public View f6354;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1331 f6355;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public boolean f6356;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public MenuInflater f6357;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f6358;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f6359;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public boolean f6360;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public ActionBarContextView f6361;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public AbstractC1321 f6362;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f6363;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public PopupWindow f6364;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public C1334[] f6365;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public boolean f6366;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public AbstractC1154 f6367;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public Rect f6368;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public boolean f6369;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public int f6370;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public int f6373;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f6374;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Runnable f6375;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public boolean f6376;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public C1334 f6377;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public AbstractC1321 f6378;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Context f6379;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public boolean f6380;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public InterfaceC1258 f6381;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public ViewGroup f6382;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f6383;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public int f6384;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Window f6385;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f6386;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public Rect f6387;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C1332 f6388;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean f6390;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f6391;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Object f6392;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public TextView f6393;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public boolean f6394;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C1330 f6395;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ActionBar f6396;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public boolean f6397;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public boolean f6398;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public CharSequence f6399;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public C1104 f6389 = null;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f6372 = true;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public final Runnable f6371 = new RunnableC1323();

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$〳ぜぞぜべっ, reason: contains not printable characters */
    public abstract class AbstractC1321 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public BroadcastReceiver f6401;

        /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C1322 extends BroadcastReceiver {
            public C1322() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC1321.this.mo3022();
            }
        }

        public AbstractC1321() {
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public abstract IntentFilter mo3018();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public abstract int mo3019();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3020() {
            BroadcastReceiver broadcastReceiver = this.f6401;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C1320.this.f6379.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f6401 = null;
            }
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void m3021() {
            m3020();
            IntentFilter mo3018 = mo3018();
            if (mo3018 == null || mo3018.countActions() == 0) {
                return;
            }
            if (this.f6401 == null) {
                this.f6401 = new C1322();
            }
            LayoutInflaterFactory2C1320.this.f6379.registerReceiver(this.f6401, mo3018);
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public abstract void mo3022();
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1323 implements Runnable {
        public RunnableC1323() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            if ((layoutInflaterFactory2C1320.f6373 & 1) != 0) {
                layoutInflaterFactory2C1320.m2988(0);
            }
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C13202 = LayoutInflaterFactory2C1320.this;
            if ((layoutInflaterFactory2C13202.f6373 & NotificationCompat.FLAG_BUBBLE) != 0) {
                layoutInflaterFactory2C13202.m2988(108);
            }
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C13203 = LayoutInflaterFactory2C1320.this;
            layoutInflaterFactory2C13203.f6390 = false;
            layoutInflaterFactory2C13203.f6373 = 0;
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぁごぐすすぃ, reason: contains not printable characters */
    public class C1324 extends AbstractC1321 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final PowerManager f6404;

        public C1324(Context context) {
            super();
            this.f6404 = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p034.p050.p060.LayoutInflaterFactory2C1320.AbstractC1321
        /* renamed from: 〺つふすそ */
        public IntentFilter mo3018() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p034.p050.p060.LayoutInflaterFactory2C1320.AbstractC1321
        /* renamed from: くし〴〺ぅ */
        public int mo3019() {
            return (Build.VERSION.SDK_INT < 21 || !this.f6404.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // p034.p050.p060.LayoutInflaterFactory2C1320.AbstractC1321
        /* renamed from: びぐびあび */
        public void mo3022() {
            LayoutInflaterFactory2C1320.this.m3004();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$いいにぽつ, reason: contains not printable characters */
    public class C1325 extends ContentFrameLayout {
        public C1325(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C1320.this.m3012(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
                    layoutInflaterFactory2C1320.m2982(layoutInflaterFactory2C1320.m2998(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C1266.m2928(getContext(), i));
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$くし〴〺ぅ, reason: contains not printable characters */
    public class C1326 implements C1290.InterfaceC1293 {
        public C1326() {
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: 〺つふすそ */
        public boolean mo2953() {
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            layoutInflaterFactory2C1320.m2979();
            ActionBar actionBar = layoutInflaterFactory2C1320.f6396;
            return (actionBar == null || (actionBar.mo57() & 4) == 0) ? false : true;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: くし〴〺ぅ */
        public Drawable mo2954() {
            C1260 m2909 = C1260.m2909(LayoutInflaterFactory2C1320.this.m3002(), null, new int[]{C1264.homeAsUpIndicator});
            Drawable m2913 = m2909.m2913(0);
            m2909.f6162.recycle();
            return m2913;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: げつ〴ぬぐ */
        public void mo2955(Drawable drawable, int i) {
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            layoutInflaterFactory2C1320.m2979();
            ActionBar actionBar = layoutInflaterFactory2C1320.f6396;
            if (actionBar != null) {
                actionBar.mo48(drawable);
                actionBar.mo58(i);
            }
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: づざかべべ */
        public Context mo2956() {
            return LayoutInflaterFactory2C1320.this.m3002();
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: びぐびあび */
        public void mo2957(int i) {
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            layoutInflaterFactory2C1320.m2979();
            ActionBar actionBar = layoutInflaterFactory2C1320.f6396;
            if (actionBar != null) {
                actionBar.mo58(i);
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1327 implements Thread.UncaughtExceptionHandler {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f6408;

        public C1327(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f6408 = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (!z) {
                this.f6408.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f6408.uncaughtException(thread, notFoundException);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$づざかべべ, reason: contains not printable characters */
    public class C1328 implements AbstractC1154.InterfaceC1155 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public AbstractC1154.InterfaceC1155 f6410;

        /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C1329 extends C1112 {
            public C1329() {
            }

            @Override // p034.p035.p045.InterfaceC1108
            /* renamed from: 〺つふすそ */
            public void mo2539(View view) {
                LayoutInflaterFactory2C1320.this.f6361.setVisibility(8);
                LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
                PopupWindow popupWindow = layoutInflaterFactory2C1320.f6364;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1320.f6361.getParent() instanceof View) {
                    C1096.m2518((View) LayoutInflaterFactory2C1320.this.f6361.getParent());
                }
                LayoutInflaterFactory2C1320.this.f6361.removeAllViews();
                LayoutInflaterFactory2C1320.this.f6389.m2538(null);
                LayoutInflaterFactory2C1320 layoutInflaterFactory2C13202 = LayoutInflaterFactory2C1320.this;
                layoutInflaterFactory2C13202.f6389 = null;
                C1096.m2518(layoutInflaterFactory2C13202.f6382);
            }
        }

        public C1328(AbstractC1154.InterfaceC1155 interfaceC1155) {
            this.f6410 = interfaceC1155;
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: 〺つふすそ */
        public void mo2597(AbstractC1154 abstractC1154) {
            this.f6410.mo2597(abstractC1154);
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            if (layoutInflaterFactory2C1320.f6364 != null) {
                layoutInflaterFactory2C1320.f6385.getDecorView().removeCallbacks(LayoutInflaterFactory2C1320.this.f6375);
            }
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C13202 = LayoutInflaterFactory2C1320.this;
            if (layoutInflaterFactory2C13202.f6361 != null) {
                layoutInflaterFactory2C13202.m2983();
                LayoutInflaterFactory2C1320 layoutInflaterFactory2C13203 = LayoutInflaterFactory2C1320.this;
                C1104 m2495 = C1096.m2495(layoutInflaterFactory2C13203.f6361);
                m2495.m2535(0.0f);
                layoutInflaterFactory2C13203.f6389 = m2495;
                LayoutInflaterFactory2C1320.this.f6389.m2538(new C1329());
            }
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C13204 = LayoutInflaterFactory2C1320.this;
            InterfaceC1301 interfaceC1301 = layoutInflaterFactory2C13204.f6352;
            if (interfaceC1301 != null) {
                interfaceC1301.mo73(layoutInflaterFactory2C13204.f6367);
            }
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C13205 = LayoutInflaterFactory2C1320.this;
            layoutInflaterFactory2C13205.f6367 = null;
            C1096.m2518(layoutInflaterFactory2C13205.f6382);
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: くし〴〺ぅ */
        public boolean mo2598(AbstractC1154 abstractC1154, MenuItem menuItem) {
            return this.f6410.mo2598(abstractC1154, menuItem);
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2599(AbstractC1154 abstractC1154, Menu menu) {
            C1096.m2518(LayoutInflaterFactory2C1320.this.f6382);
            return this.f6410.mo2599(abstractC1154, menu);
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: びぐびあび */
        public boolean mo2600(AbstractC1154 abstractC1154, Menu menu) {
            return this.f6410.mo2600(abstractC1154, menu);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$てぜきぽく, reason: contains not printable characters */
    public final class C1330 implements InterfaceC1186.InterfaceC1187 {
        public C1330() {
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: 〺つふすそ */
        public boolean mo131(C1164 c1164) {
            Window.Callback m2996;
            if (c1164 != c1164.mo2637()) {
                return true;
            }
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            if (!layoutInflaterFactory2C1320.f6391 || (m2996 = layoutInflaterFactory2C1320.m2996()) == null || LayoutInflaterFactory2C1320.this.f6360) {
                return true;
            }
            m2996.onMenuOpened(108, c1164);
            return true;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: げつ〴ぬぐ */
        public void mo132(C1164 c1164, boolean z) {
            C1164 mo2637 = c1164.mo2637();
            boolean z2 = mo2637 != c1164;
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            if (z2) {
                c1164 = mo2637;
            }
            C1334 m2989 = layoutInflaterFactory2C1320.m2989(c1164);
            if (m2989 != null) {
                if (!z2) {
                    LayoutInflaterFactory2C1320.this.m2982(m2989, z);
                } else {
                    LayoutInflaterFactory2C1320.this.m2994(m2989.f6425, m2989, mo2637);
                    LayoutInflaterFactory2C1320.this.m2982(m2989, true);
                }
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$びぐびあび, reason: contains not printable characters */
    public final class C1332 implements InterfaceC1186.InterfaceC1187 {
        public C1332() {
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: 〺つふすそ */
        public boolean mo131(C1164 c1164) {
            Window.Callback m2996 = LayoutInflaterFactory2C1320.this.m2996();
            if (m2996 == null) {
                return true;
            }
            m2996.onMenuOpened(108, c1164);
            return true;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: げつ〴ぬぐ */
        public void mo132(C1164 c1164, boolean z) {
            LayoutInflaterFactory2C1320.this.m3016(c1164);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぺぁあねじ, reason: contains not printable characters */
    public class C1333 extends AbstractC1321 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final C1340 f6415;

        public C1333(C1340 c1340) {
            super();
            this.f6415 = c1340;
        }

        @Override // p034.p050.p060.LayoutInflaterFactory2C1320.AbstractC1321
        /* renamed from: 〺つふすそ */
        public IntentFilter mo3018() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x00fb A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        @Override // p034.p050.p060.LayoutInflaterFactory2C1320.AbstractC1321
        /* renamed from: くし〴〺ぅ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo3019() {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.C1333.mo3019():int");
        }

        @Override // p034.p050.p060.LayoutInflaterFactory2C1320.AbstractC1321
        /* renamed from: びぐびあび */
        public void mo3022() {
            LayoutInflaterFactory2C1320.this.m3004();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぺふねづ〺, reason: contains not printable characters */
    public static final class C1334 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public C1164 f6417;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6418;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public View f6419;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public Context f6420;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public boolean f6421;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public Bundle f6422;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public boolean f6423 = false;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6424;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f6425;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public ViewGroup f6426;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public boolean f6427;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public View f6428;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean f6429;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6430;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean f6431;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public C1181 f6432;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f6433;

        public C1334(int i) {
            this.f6425 = i;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3024(C1164 c1164) {
            C1181 c1181;
            C1164 c11642 = this.f6417;
            if (c1164 == c11642) {
                return;
            }
            if (c11642 != null) {
                c11642.m2622(this.f6432);
            }
            this.f6417 = c1164;
            if (c1164 == null || (c1181 = this.f6432) == null) {
                return;
            }
            c1164.m2610(c1181, c1164.f5774);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 21;
        f6349 = z;
        f6347 = new int[]{R.attr.windowBackground};
        f6346 = !"robolectric".equals(Build.FINGERPRINT);
        f6350 = i >= 17;
        if (!z || f6345) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C1327(Thread.getDefaultUncaughtExceptionHandler()));
        f6345 = true;
    }

    public LayoutInflaterFactory2C1320(Context context, Window window, InterfaceC1301 interfaceC1301, Object obj) {
        C1493<String, Integer> c1493;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f6370 = -100;
        this.f6379 = context;
        this.f6352 = interfaceC1301;
        this.f6392 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f6370 = appCompatActivity.m79().mo2972();
            }
        }
        if (this.f6370 == -100 && (orDefault = (c1493 = f6348).getOrDefault(this.f6392.getClass().getName(), null)) != null) {
            this.f6370 = orDefault.intValue();
            c1493.remove(this.f6392.getClass().getName());
        }
        if (window != null) {
            m2975(window);
        }
        C1242.m2868();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:60:0x0219
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0205 A[Catch: all -> 0x0211, Exception -> 0x0219, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0219, all -> 0x0211, blocks: (B:47:0x01d7, B:50:0x01e6, B:52:0x01eb, B:63:0x0205), top: B:46:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00da  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public final void m2968() {
        if (this.f6374) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public MenuInflater mo2969() {
        if (this.f6357 == null) {
            m2979();
            ActionBar actionBar = this.f6396;
            this.f6357 = new C1158(actionBar != null ? actionBar.mo52() : this.f6379);
        }
        return this.f6357;
    }

    @Override // p034.p050.p051.p052.C1164.InterfaceC1166
    /* renamed from: 〺つふすそ */
    public void mo141(C1164 c1164) {
        InterfaceC1258 interfaceC1258 = this.f6381;
        if (interfaceC1258 == null || !interfaceC1258.mo109() || (ViewConfiguration.get(this.f6379).hasPermanentMenuKey() && !this.f6381.mo101())) {
            C1334 m2998 = m2998(0);
            m2998.f6423 = true;
            m2982(m2998, false);
            m2990(m2998, null);
            return;
        }
        Window.Callback m2996 = m2996();
        if (this.f6381.mo108()) {
            this.f6381.mo107();
            if (this.f6360) {
                return;
            }
            m2996.onPanelClosed(108, m2998(0).f6417);
            return;
        }
        if (m2996 == null || this.f6360) {
            return;
        }
        if (this.f6390 && (1 & this.f6373) != 0) {
            this.f6385.getDecorView().removeCallbacks(this.f6371);
            this.f6371.run();
        }
        C1334 m29982 = m2998(0);
        C1164 c11642 = m29982.f6417;
        if (c11642 == null || m29982.f6421 || !m2996.onPreparePanel(0, m29982.f6419, c11642)) {
            return;
        }
        m2996.onMenuOpened(108, m29982.f6417);
        this.f6381.mo113();
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final void m2970() {
        ViewGroup viewGroup;
        if (this.f6374) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f6379.obtainStyledAttributes(C1148.AppCompatTheme);
        int i = C1148.AppCompatTheme_windowActionBar;
        if (!obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C1148.AppCompatTheme_windowNoTitle, false)) {
            mo2992(1);
        } else if (obtainStyledAttributes.getBoolean(i, false)) {
            mo2992(108);
        }
        if (obtainStyledAttributes.getBoolean(C1148.AppCompatTheme_windowActionBarOverlay, false)) {
            mo2992(109);
        }
        if (obtainStyledAttributes.getBoolean(C1148.AppCompatTheme_windowActionModeOverlay, false)) {
            mo2992(10);
        }
        this.f6358 = obtainStyledAttributes.getBoolean(C1148.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        m2977();
        this.f6385.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f6379);
        if (this.f6376) {
            viewGroup = (ViewGroup) from.inflate(this.f6383 ? C1147.abc_screen_simple_overlay_action_mode : C1147.abc_screen_simple, (ViewGroup) null);
        } else if (this.f6358) {
            viewGroup = (ViewGroup) from.inflate(C1147.abc_dialog_title_material, (ViewGroup) null);
            this.f6386 = false;
            this.f6391 = false;
        } else if (this.f6391) {
            TypedValue typedValue = new TypedValue();
            this.f6379.getTheme().resolveAttribute(C1264.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1153(this.f6379, typedValue.resourceId) : this.f6379).inflate(C1147.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1258 interfaceC1258 = (InterfaceC1258) viewGroup.findViewById(C1268.decor_content_parent);
            this.f6381 = interfaceC1258;
            interfaceC1258.setWindowCallback(m2996());
            if (this.f6386) {
                this.f6381.mo115(109);
            }
            if (this.f6363) {
                this.f6381.mo115(2);
            }
            if (this.f6359) {
                this.f6381.mo115(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder m4207 = C2098.m4207("AppCompat does not support the current theme features: { windowActionBar: ");
            m4207.append(this.f6391);
            m4207.append(", windowActionBarOverlay: ");
            m4207.append(this.f6386);
            m4207.append(", android:windowIsFloating: ");
            m4207.append(this.f6358);
            m4207.append(", windowActionModeOverlay: ");
            m4207.append(this.f6383);
            m4207.append(", windowNoTitle: ");
            m4207.append(this.f6376);
            m4207.append(" }");
            throw new IllegalArgumentException(m4207.toString());
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C1096.m2503(viewGroup, new C1337(this));
        } else if (viewGroup instanceof InterfaceC1226) {
            ((InterfaceC1226) viewGroup).setOnFitSystemWindowsListener(new C1342(this));
        }
        if (this.f6381 == null) {
            this.f6393 = (TextView) viewGroup.findViewById(C1268.title);
        }
        Method method = C1209.f5983;
        if (i2 >= 16) {
            try {
                Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method2.isAccessible()) {
                    method2.setAccessible(true);
                }
                method2.invoke(viewGroup, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1268.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6385.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6385.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C1305(this));
        this.f6382 = viewGroup;
        Object obj = this.f6392;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6399;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1258 interfaceC12582 = this.f6381;
            if (interfaceC12582 != null) {
                interfaceC12582.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.f6396;
                if (actionBar != null) {
                    actionBar.mo51(title);
                } else {
                    TextView textView = this.f6393;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f6382.findViewById(R.id.content);
        View decorView = this.f6385.getDecorView();
        contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes2 = this.f6379.obtainStyledAttributes(C1148.AppCompatTheme);
        obtainStyledAttributes2.getValue(C1148.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(C1148.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        int i3 = C1148.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes2.hasValue(i3)) {
            obtainStyledAttributes2.getValue(i3, contentFrameLayout2.getFixedWidthMajor());
        }
        int i4 = C1148.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes2.hasValue(i4)) {
            obtainStyledAttributes2.getValue(i4, contentFrameLayout2.getFixedWidthMinor());
        }
        int i5 = C1148.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes2.hasValue(i5)) {
            obtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedHeightMajor());
        }
        int i6 = C1148.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes2.hasValue(i6)) {
            obtainStyledAttributes2.getValue(i6, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f6374 = true;
        C1334 m2998 = m2998(0);
        if (this.f6360 || m2998.f6417 != null) {
            return;
        }
        m3008(108);
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void mo2971(View view, ViewGroup.LayoutParams layoutParams) {
        m2970();
        ViewGroup viewGroup = (ViewGroup) this.f6382.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6355.f5682.onContentChanged();
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int mo2972() {
        return this.f6370;
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final AbstractC1321 m2973(Context context) {
        if (this.f6378 == null) {
            if (C1340.f6443 == null) {
                Context applicationContext = context.getApplicationContext();
                C1340.f6443 = new C1340(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6378 = new C1333(C1340.f6443);
        }
        return this.f6378;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void mo2974() {
        LayoutInflater from = LayoutInflater.from(this.f6379);
        if (from.getFactory() == null) {
            C2786.m4815(from, this);
        } else {
            boolean z = from.getFactory2() instanceof LayoutInflaterFactory2C1320;
        }
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final void m2975(Window window) {
        if (this.f6385 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C1331) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C1331 c1331 = new C1331(callback);
        this.f6355 = c1331;
        window.setCallback(c1331);
        C1260 m2909 = C1260.m2909(this.f6379, null, f6347);
        Drawable m2911 = m2909.m2911(0);
        if (m2911 != null) {
            window.setBackgroundDrawable(m2911);
        }
        m2909.f6162.recycle();
        this.f6385 = window;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void mo2976(int i) {
        this.f6384 = i;
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final void m2977() {
        if (this.f6385 == null) {
            Object obj = this.f6392;
            if (obj instanceof Activity) {
                m2975(((Activity) obj).getWindow());
            }
        }
        if (this.f6385 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void mo2978() {
        m2979();
        ActionBar actionBar = this.f6396;
        if (actionBar != null) {
            actionBar.mo46(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: えがぐせほち, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2979() {
        /*
            r3 = this;
            r3.m2970()
            boolean r0 = r3.f6391
            if (r0 == 0) goto L37
            androidx.appcompat.app.ActionBar r0 = r3.f6396
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f6392
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻 r0 = new づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻
            java.lang.Object r1 = r3.f6392
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f6386
            r0.<init>(r1, r2)
        L1d:
            r3.f6396 = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻 r0 = new づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻
            java.lang.Object r1 = r3.f6392
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.ActionBar r0 = r3.f6396
            if (r0 == 0) goto L37
            boolean r1 = r3.f6397
            r0.mo53(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.m2979():void");
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void mo2980(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f6392 instanceof Activity) {
            m2979();
            ActionBar actionBar = this.f6396;
            if (actionBar instanceof C1295) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f6357 = null;
            if (actionBar != null) {
                actionBar.mo42();
            }
            if (toolbar != null) {
                Object obj = this.f6392;
                C1311 c1311 = new C1311(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6399, this.f6355);
                this.f6396 = c1311;
                window = this.f6385;
                callback = c1311.f6328;
            } else {
                this.f6396 = null;
                window = this.f6385;
                callback = this.f6355;
            }
            window.setCallback(callback);
            mo3017();
        }
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo2981(Bundle bundle) {
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m2982(C1334 c1334, boolean z) {
        ViewGroup viewGroup;
        InterfaceC1258 interfaceC1258;
        if (z && c1334.f6425 == 0 && (interfaceC1258 = this.f6381) != null && interfaceC1258.mo108()) {
            m3016(c1334.f6417);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f6379.getSystemService("window");
        if (windowManager != null && c1334.f6429 && (viewGroup = c1334.f6426) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m2994(c1334.f6425, c1334, null);
            }
        }
        c1334.f6433 = false;
        c1334.f6427 = false;
        c1334.f6429 = false;
        c1334.f6428 = null;
        c1334.f6423 = true;
        if (this.f6377 == c1334) {
            this.f6377 = null;
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public void m2983() {
        C1104 c1104 = this.f6389;
        if (c1104 != null) {
            c1104.m2532();
        }
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void mo2984(Bundle bundle) {
        m2970();
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public final int m2985(C1072 c1072, Rect rect) {
        boolean z;
        boolean z2;
        Context context;
        int i;
        int m2424 = c1072 != null ? c1072.m2424() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f6361;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6361.getLayoutParams();
            if (this.f6361.isShown()) {
                if (this.f6387 == null) {
                    this.f6387 = new Rect();
                    this.f6368 = new Rect();
                }
                Rect rect2 = this.f6387;
                Rect rect3 = this.f6368;
                if (c1072 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c1072.m2422(), c1072.m2424(), c1072.m2426(), c1072.m2420());
                }
                ViewGroup viewGroup = this.f6382;
                Method method = C1209.f5983;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                ViewGroup viewGroup2 = this.f6382;
                AtomicInteger atomicInteger = C1096.f5578;
                C1072 m2418 = Build.VERSION.SDK_INT >= 23 ? C1072.m2418(viewGroup2.getRootWindowInsets()) : null;
                int m2422 = m2418 == null ? 0 : m2418.m2422();
                int m2426 = m2418 == null ? 0 : m2418.m2426();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.f6354 != null) {
                    View view = this.f6354;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != m2422 || marginLayoutParams2.rightMargin != m2426) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = m2422;
                            marginLayoutParams2.rightMargin = m2426;
                            this.f6354.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f6379);
                    this.f6354 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m2422;
                    layoutParams.rightMargin = m2426;
                    this.f6382.addView(this.f6354, -1, layoutParams);
                }
                View view3 = this.f6354;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f6354;
                    if ((C1096.m2499(view4) & 8192) != 0) {
                        context = this.f6379;
                        i = C1263.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f6379;
                        i = C1263.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(C1067.m2405(context, i));
                }
                if (!this.f6383 && z) {
                    m2424 = 0;
                }
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.f6361.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f6354;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return m2424;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo2986(View view, ViewGroup.LayoutParams layoutParams) {
        m2970();
        ((ViewGroup) this.f6382.findViewById(R.id.content)).addView(view, layoutParams);
        this.f6355.f5682.onContentChanged();
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public final boolean m2987() {
        ViewGroup viewGroup;
        return this.f6374 && (viewGroup = this.f6382) != null && C1096.m2517(viewGroup);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public void m2988(int i) {
        C1334 m2998 = m2998(i);
        if (m2998.f6417 != null) {
            Bundle bundle = new Bundle();
            m2998.f6417.m2611(bundle);
            if (bundle.size() > 0) {
                m2998.f6422 = bundle;
            }
            m2998.f6417.m2627();
            m2998.f6417.clear();
        }
        m2998.f6421 = true;
        m2998.f6423 = true;
        if ((i == 108 || i == 0) && this.f6381 != null) {
            C1334 m29982 = m2998(0);
            m29982.f6433 = false;
            m3005(m29982, null);
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public C1334 m2989(Menu menu) {
        C1334[] c1334Arr = this.f6365;
        int length = c1334Arr != null ? c1334Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C1334 c1334 = c1334Arr[i];
            if (c1334 != null && c1334.f6417 == menu) {
                return c1334;
            }
        }
        return null;
    }

    @Override // p034.p050.p051.p052.C1164.InterfaceC1166
    /* renamed from: げつ〴ぬぐ */
    public boolean mo142(C1164 c1164, MenuItem menuItem) {
        C1334 m2989;
        Window.Callback m2996 = m2996();
        if (m2996 == null || this.f6360 || (m2989 = m2989(c1164.mo2637())) == null) {
            return false;
        }
        return m2996.onMenuItemSelected(m2989.f6425, menuItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0144, code lost:
    
        if (r14 != null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2990(p034.p050.p060.LayoutInflaterFactory2C1320.C1334 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.m2990(づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぺふねづ〺, android.view.KeyEvent):void");
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public int m2991(Context context, int i) {
        AbstractC1321 m2973;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.f6362 == null) {
                        this.f6362 = new C1324(context);
                    }
                    m2973 = this.f6362;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                m2973 = m2973(context);
            }
            return m2973.mo3019();
        }
        return i;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean mo2992(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f6376 && i == 108) {
            return false;
        }
        if (this.f6391 && i == 1) {
            this.f6391 = false;
        }
        if (i == 1) {
            m2968();
            this.f6376 = true;
            return true;
        }
        if (i == 2) {
            m2968();
            this.f6363 = true;
            return true;
        }
        if (i == 5) {
            m2968();
            this.f6359 = true;
            return true;
        }
        if (i == 10) {
            m2968();
            this.f6383 = true;
            return true;
        }
        if (i == 108) {
            m2968();
            this.f6391 = true;
            return true;
        }
        if (i != 109) {
            return this.f6385.requestFeature(i);
        }
        m2968();
        this.f6386 = true;
        return true;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void mo2993() {
        this.f6353 = true;
        m3004();
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void m2994(int i, C1334 c1334, Menu menu) {
        if (menu == null && c1334 != null) {
            menu = c1334.f6417;
        }
        if ((c1334 == null || c1334.f6429) && !this.f6360) {
            this.f6355.f5682.onPanelClosed(i, menu);
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final Configuration m2995(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public final Window.Callback m2996() {
        return this.f6385.getCallback();
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public <T extends View> T mo2997(int i) {
        m2970();
        return (T) this.f6385.findViewById(i);
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public C1334 m2998(int i) {
        C1334[] c1334Arr = this.f6365;
        if (c1334Arr == null || c1334Arr.length <= i) {
            C1334[] c1334Arr2 = new C1334[i + 1];
            if (c1334Arr != null) {
                System.arraycopy(c1334Arr, 0, c1334Arr2, 0, c1334Arr.length);
            }
            this.f6365 = c1334Arr2;
            c1334Arr = c1334Arr2;
        }
        C1334 c1334 = c1334Arr[i];
        if (c1334 != null) {
            return c1334;
        }
        C1334 c13342 = new C1334(i);
        c1334Arr[i] = c13342;
        return c13342;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo2999(Configuration configuration) {
        if (this.f6391 && this.f6374) {
            m2979();
            ActionBar actionBar = this.f6396;
            if (actionBar != null) {
                actionBar.mo44(configuration);
            }
        }
        C1242 m2867 = C1242.m2867();
        Context context = this.f6379;
        synchronized (m2867) {
            C1234 c1234 = m2867.f6097;
            synchronized (c1234) {
                C1504<WeakReference<Drawable.ConstantState>> c1504 = c1234.f6091.get(context);
                if (c1504 != null) {
                    c1504.m3276();
                }
            }
        }
        m3001(false);
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: でどあくず, reason: contains not printable characters */
    public void mo3000(int i) {
        m2970();
        ViewGroup viewGroup = (ViewGroup) this.f6382.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6379).inflate(i, viewGroup);
        this.f6355.f5682.onContentChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0242, code lost:
    
        if ((((p034.p094.C1661) ((p034.p094.InterfaceC1664) r0).mo36()).f7776.compareTo(p034.p094.AbstractC1680.EnumC1681.STARTED) >= 0) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0249, code lost:
    
        r0.onConfigurationChanged(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0247, code lost:
    
        if (r18.f6353 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144 A[ADDED_TO_REGION] */
    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3001(boolean r19) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.m3001(boolean):boolean");
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final Context m3002() {
        m2979();
        ActionBar actionBar = this.f6396;
        Context mo52 = actionBar != null ? actionBar.mo52() : null;
        return mo52 == null ? this.f6379 : mo52;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C1290.InterfaceC1293 mo3003() {
        return new C1326();
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean m3004() {
        return m3001(true);
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public final boolean m3005(C1334 c1334, KeyEvent keyEvent) {
        InterfaceC1258 interfaceC1258;
        InterfaceC1258 interfaceC12582;
        Resources.Theme theme;
        InterfaceC1258 interfaceC12583;
        InterfaceC1258 interfaceC12584;
        if (this.f6360) {
            return false;
        }
        if (c1334.f6433) {
            return true;
        }
        C1334 c13342 = this.f6377;
        if (c13342 != null && c13342 != c1334) {
            m2982(c13342, false);
        }
        Window.Callback m2996 = m2996();
        if (m2996 != null) {
            c1334.f6419 = m2996.onCreatePanelView(c1334.f6425);
        }
        int i = c1334.f6425;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC12584 = this.f6381) != null) {
            interfaceC12584.setMenuPrepared();
        }
        if (c1334.f6419 == null && (!z || !(this.f6396 instanceof C1311))) {
            C1164 c1164 = c1334.f6417;
            if (c1164 == null || c1334.f6421) {
                if (c1164 == null) {
                    Context context = this.f6379;
                    int i2 = c1334.f6425;
                    if ((i2 == 0 || i2 == 108) && this.f6381 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(C1264.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(C1264.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(C1264.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1153 c1153 = new C1153(context, 0);
                            c1153.getTheme().setTo(theme);
                            context = c1153;
                        }
                    }
                    C1164 c11642 = new C1164(context);
                    c11642.f5778 = this;
                    c1334.m3024(c11642);
                    if (c1334.f6417 == null) {
                        return false;
                    }
                }
                if (z && (interfaceC12582 = this.f6381) != null) {
                    if (this.f6388 == null) {
                        this.f6388 = new C1332();
                    }
                    interfaceC12582.setMenu(c1334.f6417, this.f6388);
                }
                c1334.f6417.m2627();
                if (!m2996.onCreatePanelMenu(c1334.f6425, c1334.f6417)) {
                    c1334.m3024(null);
                    if (z && (interfaceC1258 = this.f6381) != null) {
                        interfaceC1258.setMenu(null, this.f6388);
                    }
                    return false;
                }
                c1334.f6421 = false;
            }
            c1334.f6417.m2627();
            Bundle bundle = c1334.f6422;
            if (bundle != null) {
                c1334.f6417.m2626(bundle);
                c1334.f6422 = null;
            }
            if (!m2996.onPreparePanel(0, c1334.f6419, c1334.f6417)) {
                if (z && (interfaceC12583 = this.f6381) != null) {
                    interfaceC12583.setMenu(null, this.f6388);
                }
                c1334.f6417.m2629();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c1334.f6431 = z2;
            c1334.f6417.setQwertyMode(z2);
            c1334.f6417.m2629();
        }
        c1334.f6433 = true;
        c1334.f6427 = false;
        this.f6377 = c1334;
        return true;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void mo3006(Bundle bundle) {
        this.f6369 = true;
        m3001(false);
        m2977();
        Object obj = this.f6392;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = C2786.m4811(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f6396;
                if (actionBar == null) {
                    this.f6397 = true;
                } else {
                    actionBar.mo53(true);
                }
            }
            synchronized (AbstractC1345.f6454) {
                AbstractC1345.m3033(this);
                AbstractC1345.f6453.add(new WeakReference<>(this));
            }
        }
        this.f6366 = true;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void mo3007() {
        this.f6353 = false;
        m2979();
        ActionBar actionBar = this.f6396;
        if (actionBar != null) {
            actionBar.mo46(false);
        }
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public final void m3008(int i) {
        this.f6373 = (1 << i) | this.f6373;
        if (this.f6390) {
            return;
        }
        C1096.m2482(this.f6385.getDecorView(), this.f6371);
        this.f6390 = true;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final void mo3009(CharSequence charSequence) {
        this.f6399 = charSequence;
        InterfaceC1258 interfaceC1258 = this.f6381;
        if (interfaceC1258 != null) {
            interfaceC1258.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f6396;
        if (actionBar != null) {
            actionBar.mo51(charSequence);
            return;
        }
        TextView textView = this.f6393;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x019a  */
    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Context mo3010(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.mo3010(android.content.Context):android.content.Context");
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void mo3011(View view) {
        m2970();
        ViewGroup viewGroup = (ViewGroup) this.f6382.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6355.f5682.onContentChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3012(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.m3012(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3013() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6392
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p034.p050.p060.AbstractC1345.f6454
            monitor-enter(r0)
            p034.p050.p060.AbstractC1345.m3033(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f6390
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f6385
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f6371
            r0.removeCallbacks(r1)
        L20:
            r0 = 0
            r3.f6353 = r0
            r0 = 1
            r3.f6360 = r0
            int r0 = r3.f6370
            r1 = -100
            if (r0 == r1) goto L50
            java.lang.Object r0 = r3.f6392
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L50
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L50
            づざかべべ.づざかべべ.〳ぜぞぜべっ<java.lang.String, java.lang.Integer> r0 = p034.p050.p060.LayoutInflaterFactory2C1320.f6348
            java.lang.Object r1 = r3.f6392
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6370
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5f
        L50:
            づざかべべ.づざかべべ.〳ぜぞぜべっ<java.lang.String, java.lang.Integer> r0 = p034.p050.p060.LayoutInflaterFactory2C1320.f6348
            java.lang.Object r1 = r3.f6392
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5f:
            androidx.appcompat.app.ActionBar r0 = r3.f6396
            if (r0 == 0) goto L66
            r0.mo42()
        L66:
            づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$〳ぜぞぜべっ r0 = r3.f6378
            if (r0 == 0) goto L6d
            r0.m3020()
        L6d:
            づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$〳ぜぞぜべっ r0 = r3.f6362
            if (r0 == 0) goto L74
            r0.m3020()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.mo3013():void");
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ActionBar mo3014() {
        m2979();
        return this.f6396;
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public final boolean m3015(C1334 c1334, int i, KeyEvent keyEvent, int i2) {
        C1164 c1164;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1334.f6433 || m3005(c1334, keyEvent)) && (c1164 = c1334.f6417) != null) {
            z = c1164.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f6381 == null) {
            m2982(c1334, true);
        }
        return z;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m3016(C1164 c1164) {
        if (this.f6398) {
            return;
        }
        this.f6398 = true;
        this.f6381.mo103();
        Window.Callback m2996 = m2996();
        if (m2996 != null && !this.f6360) {
            m2996.onPanelClosed(108, c1164);
        }
        this.f6398 = false;
    }

    @Override // p034.p050.p060.AbstractC1345
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo3017() {
        m2979();
        ActionBar actionBar = this.f6396;
        if (actionBar == null || !actionBar.mo54()) {
            m3008(0);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$なぎぱいぢぎ, reason: contains not printable characters */
    public class C1331 extends WindowCallbackC1149 {
        public C1331(Window.Callback callback) {
            super(callback);
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C1320.this.m3012(keyEvent) || this.f5682.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r6 != false) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f5682
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4f
                づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく r0 = p034.p050.p060.LayoutInflaterFactory2C1320.this
                int r3 = r6.getKeyCode()
                r0.m2979()
                androidx.appcompat.app.ActionBar r4 = r0.f6396
                if (r4 == 0) goto L1f
                boolean r3 = r4.mo59(r3, r6)
                if (r3 == 0) goto L1f
            L1d:
                r6 = 1
                goto L4d
            L1f:
                づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぺふねづ〺 r3 = r0.f6377
                if (r3 == 0) goto L34
                int r4 = r6.getKeyCode()
                boolean r3 = r0.m3015(r3, r4, r6, r2)
                if (r3 == 0) goto L34
                づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぺふねづ〺 r6 = r0.f6377
                if (r6 == 0) goto L1d
                r6.f6427 = r2
                goto L1d
            L34:
                づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぺふねづ〺 r3 = r0.f6377
                if (r3 != 0) goto L4c
                づざかべべ.〺つふすそ.ぺふねづ〺.てぜきぽく$ぺふねづ〺 r3 = r0.m2998(r1)
                r0.m3005(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.m3015(r3, r4, r6, r2)
                r3.f6433 = r1
                if (r6 == 0) goto L4c
                goto L1d
            L4c:
                r6 = 0
            L4d:
                if (r6 == 0) goto L50
            L4f:
                r1 = 1
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.C1331.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C1164)) {
                return this.f5682.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            this.f5682.onMenuOpened(i, menu);
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            layoutInflaterFactory2C1320.getClass();
            if (i == 108) {
                layoutInflaterFactory2C1320.m2979();
                ActionBar actionBar = layoutInflaterFactory2C1320.f6396;
                if (actionBar != null) {
                    actionBar.mo49(true);
                }
            }
            return true;
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.f5682.onPanelClosed(i, menu);
            LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = LayoutInflaterFactory2C1320.this;
            layoutInflaterFactory2C1320.getClass();
            if (i == 108) {
                layoutInflaterFactory2C1320.m2979();
                ActionBar actionBar = layoutInflaterFactory2C1320.f6396;
                if (actionBar != null) {
                    actionBar.mo49(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                C1334 m2998 = layoutInflaterFactory2C1320.m2998(i);
                if (m2998.f6429) {
                    layoutInflaterFactory2C1320.m2982(m2998, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C1164 c1164 = menu instanceof C1164 ? (C1164) menu : null;
            if (i == 0 && c1164 == null) {
                return false;
            }
            if (c1164 != null) {
                c1164.f5767 = true;
            }
            boolean onPreparePanel = this.f5682.onPreparePanel(i, view, menu);
            if (c1164 != null) {
                c1164.f5767 = false;
            }
            return onPreparePanel;
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C1164 c1164 = LayoutInflaterFactory2C1320.this.m2998(0).f6417;
            if (c1164 != null) {
                this.f5682.onProvideKeyboardShortcuts(list, c1164, i);
            } else {
                this.f5682.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C1320.this.f6372 ? m3023(callback) : this.f5682.onWindowStartingActionMode(callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.view.ActionMode m3023(android.view.ActionMode.Callback r10) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.LayoutInflaterFactory2C1320.C1331.m3023(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (LayoutInflaterFactory2C1320.this.f6372 && i == 0) {
                return m3023(callback);
            }
            return this.f5682.onWindowStartingActionMode(callback, i);
        }
    }
}
