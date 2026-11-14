package dev.epro.r0;

import android.R;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class W8455343525638953052 implements A16637565109935164485, T3455454122937680569, V8232844453216786975, V14977941268796428117, L6498280162989651404 {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public W8455343525638953052(EditText editText, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = editText;
                R198795765466717154 r198795765466717154 = new R198795765466717154(editText);
                this.c = r198795765466717154;
                editText.addTextChangedListener(r198795765466717154);
                if (U5279105031341998911.b == null) {
                    synchronized (U5279105031341998911.a) {
                        try {
                            if (U5279105031341998911.b == null) {
                                U5279105031341998911 u5279105031341998911 = new U5279105031341998911();
                                try {
                                    U5279105031341998911.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, U5279105031341998911.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                U5279105031341998911.b = u5279105031341998911;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(U5279105031341998911.b);
                return;
            default:
                this.b = editText;
                this.c = new F6942723054099263096(editText);
                return;
        }
    }

    public static String D(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public static void j(Context context, String str, X9877988182490498425 x9877988182490498425) {
        x9877988182490498425.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, x9877988182490498425, 33);
    }

    public ClipboardManager A() {
        ClipboardManager clipboardManager = (ClipboardManager) this.c;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.b).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.c = clipboardManager2;
        return clipboardManager2;
    }

    public InputMethodManager B() {
        return (InputMethodManager) ((K7493131619793429513) this.c).getValue();
    }

    public KeyListener C(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof F1387830060088959982)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new F1387830060088959982(keyListener);
    }

    public void E(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.a) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(absSeekBar.getContext(), attributeSet, d, i);
                Drawable drawableI = i1632105416032993715T.i(0);
                if (drawableI != null) {
                    if (drawableI instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableI;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableP = P(animationDrawable.getFrame(i2), true);
                            drawableP.setLevel(10000);
                            animationDrawable2.addFrame(drawableP, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableI = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableI);
                }
                Drawable drawableI2 = i1632105416032993715T.i(1);
                if (drawableI2 != null) {
                    absSeekBar.setProgressDrawable(P(drawableI2, false));
                }
                i1632105416032993715T.v();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, Y17304307076558258116.i, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    M(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void F() throws IOException {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            throw new IllegalStateException(G6547577305291411977.s("Unable to lock file: '", str, "'."), th);
        }
    }

    public AutofillId G(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionF = A13780509468012278052.f(this.c);
        Z6787503239643758223 z6787503239643758223M = E2166724654553415323.m((View) this.b);
        Objects.requireNonNull(z6787503239643758223M);
        return N13459929895848246258.e(contentCaptureSessionF, D1067171241640027219.b(z6787503239643758223M.a), j);
    }

    public G10370325506019749574 H(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        F6942723054099263096 f6942723054099263096 = (F6942723054099263096) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            W8455343525638953052 w8455343525638953052 = (W8455343525638953052) f6942723054099263096.b;
            if (!(inputConnection instanceof G10370325506019749574)) {
                inputConnection = new G10370325506019749574(editorInfo, inputConnection, (EditText) w8455343525638953052.b);
            }
            inputConnection2 = inputConnection;
        }
        return (G10370325506019749574) inputConnection2;
    }

    public void I(F3205875925450835131 f3205875925450835131) {
        J15730374346044043770 j15730374346044043770 = (J15730374346044043770) this.b;
        ((ActionMode.Callback) j15730374346044043770.c).onDestroyActionMode(j15730374346044043770.D(f3205875925450835131));
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) this.c;
        if (l9687083612725928934.v != null) {
            l9687083612725928934.l.getDecorView().removeCallbacks(l9687083612725928934.w);
        }
        if (l9687083612725928934.u != null) {
            Q1445202285683234142 q1445202285683234142 = l9687083612725928934.x;
            if (q1445202285683234142 != null) {
                q1445202285683234142.b();
            }
            Q1445202285683234142 q1445202285683234142A = W10240872260424387225.a(l9687083612725928934.u);
            q1445202285683234142A.a(0.0f);
            l9687083612725928934.x = q1445202285683234142A;
            q1445202285683234142A.d(new W8479308777628047383(this, (byte) 2));
        }
        l9687083612725928934.t = null;
        ViewGroup viewGroup = l9687083612725928934.z;
        WeakHashMap weakHashMap = W10240872260424387225.a;
        viewGroup.requestApplyInsets();
        l9687083612725928934.G();
    }

    public boolean J(F3205875925450835131 f3205875925450835131, Menu menu) {
        ViewGroup viewGroup = ((L9687083612725928934) this.c).z;
        WeakHashMap weakHashMap = W10240872260424387225.a;
        viewGroup.requestApplyInsets();
        J15730374346044043770 j15730374346044043770 = (J15730374346044043770) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) j15730374346044043770.c;
        A8443250024445789105 a8443250024445789105D = j15730374346044043770.D(f3205875925450835131);
        W929662112881511578 w929662112881511578 = (W929662112881511578) j15730374346044043770.b;
        Menu c2329263103474904727 = (Menu) w929662112881511578.get(menu);
        if (c2329263103474904727 == null) {
            c2329263103474904727 = new C2329263103474904727((Context) j15730374346044043770.d, (T8605657386197958581) menu);
            w929662112881511578.put(menu, c2329263103474904727);
        }
        return callback.onPrepareActionMode(a8443250024445789105D, c2329263103474904727);
    }

    public void K(T9198164096090695723 t9198164096090695723) {
        Q9579657892041446906 q9579657892041446906 = (Q9579657892041446906) this.c;
        M9197813449740923653 m9197813449740923653 = (M9197813449740923653) this.b;
        int i = t9198164096090695723.b;
        if (i == 0) {
            q9579657892041446906.execute(new I3863025946240164840(m9197813449740923653, t9198164096090695723.a, (byte) 5));
        } else {
            q9579657892041446906.execute(new A8962658062045365505(m9197813449740923653, i));
        }
    }

    public InputMethodManager L() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.c;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.b).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.c = inputMethodManager2;
        return inputMethodManager2;
    }

    public void M(boolean z) {
        R198795765466717154 r198795765466717154 = (R198795765466717154) ((W8455343525638953052) ((F6942723054099263096) this.c).b).c;
        if (r198795765466717154.c != z) {
            if (r198795765466717154.b != null) {
                D3638978315442423989 d3638978315442423989A = D3638978315442423989.a();
                L6247643214555492915 l6247643214555492915 = r198795765466717154.b;
                d3638978315442423989A.getClass();
                K5751602218013079365.x("initCallback cannot be null", l6247643214555492915);
                ReentrantReadWriteLock reentrantReadWriteLock = d3638978315442423989A.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    d3638978315442423989A.b.remove(l6247643214555492915);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            r198795765466717154.c = z;
            if (z) {
                R198795765466717154.a(r198795765466717154.a, D3638978315442423989.a().c());
            }
        }
    }

    public void N(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public Drawable P(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = P(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    @Override // dev.epro.r0.V14977941268796428117
    public Object a() {
        return (R7425115471872029899) this.b;
    }

    @Override // dev.epro.r0.L6498280162989651404
    public S7370861580758580261 c() {
        return (R174161856403953334) this.c;
    }

    @Override // dev.epro.r0.V8232844453216786975
    public O4470875117480878473 e(V4878375136513573151 v4878375136513573151, Object obj) {
        O4470875117480878473 o4470875117480878473E;
        S12944751221596631194 s12944751221596631194 = (S12944751221596631194) this.b;
        if (s12944751221596631194 == null) {
            s12944751221596631194 = null;
        }
        O4470875117480878473 o4470875117480878473 = O4470875117480878473.a;
        if (s12944751221596631194 == null || (o4470875117480878473E = s12944751221596631194.e(v4878375136513573151, obj)) == null) {
            o4470875117480878473E = o4470875117480878473;
        }
        if (o4470875117480878473E != o4470875117480878473) {
            return o4470875117480878473E;
        }
        Y6676784304453696344 y6676784304453696344 = (Y6676784304453696344) this.c;
        y6676784304453696344.f = R9411874267597469228.P0(y6676784304453696344.f, new H9390398899829886498(v4878375136513573151, obj));
        return O4470875117480878473.b;
    }

    public void f(G8961598259406769987 g8961598259406769987, int i, int i2, int i3, boolean z) {
        int i4;
        D389890677992184566 d389890677992184566 = (D389890677992184566) this.c;
        int i5 = d389890677992184566.c;
        boolean z2 = true;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            K2042933864045806308.n("MutableVector is empty.");
            return;
        } else {
            G8961598259406769987 g89615982594067699872 = (G8961598259406769987) d389890677992184566.a[i5 - 1];
            i4 = g89615982594067699872.b - g89615982594067699872.d;
        }
        if (g8961598259406769987 == null) {
            int i6 = i - i4;
            g8961598259406769987 = new G8961598259406769987(i, i2 + i3, i6, (i2 - i) + i6, z);
        } else {
            if (!g8961598259406769987.e && !z) {
                z2 = false;
            }
            g8961598259406769987.e = z2;
            if (g8961598259406769987.a > i) {
                g8961598259406769987.a = i;
                g8961598259406769987.c = i;
            }
            int i7 = g8961598259406769987.b;
            if (i2 > i7) {
                int i8 = i7 - g8961598259406769987.d;
                g8961598259406769987.b = i2;
                g8961598259406769987.d = i2 - i8;
            } else {
                i2 = i7;
            }
            g8961598259406769987.b = i2 + i3;
        }
        d389890677992184566.b(g8961598259406769987);
    }

    @Override // dev.epro.r0.V14977941268796428117
    public boolean g(CharSequence charSequence, int i, int i2, D14027398382627356533 d14027398382627356533) {
        if ((d14027398382627356533.c & 4) > 0) {
            return true;
        }
        if (((R7425115471872029899) this.b) == null) {
            this.b = new R7425115471872029899(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((J3301701597851028733) this.c).getClass();
        ((R7425115471872029899) this.b).setSpan(new A7769137806217985202(d14027398382627356533), i, i2, 33);
        return true;
    }

    public F13241018602672925865 h(List list) {
        C2322693828285680440 c2322693828285680440;
        Exception e;
        C2322693828285680440 c23226938282856804402;
        try {
            int size = list.size();
            int i = 0;
            c2322693828285680440 = null;
            while (i < size) {
                try {
                    c23226938282856804402 = (C2322693828285680440) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    c23226938282856804402.a((K15317901533566777301) this.c);
                    i++;
                    c2322693828285680440 = c23226938282856804402;
                } catch (Exception e3) {
                    e = e3;
                    c2322693828285680440 = c23226938282856804402;
                    StringBuilder sb = new StringBuilder();
                    int iC = ((K15317901533566777301) this.c).a.c();
                    F12478849263529740365 f12478849263529740365C = ((K15317901533566777301) this.c).c();
                    K15317901533566777301 k15317901533566777301 = (K15317901533566777301) this.c;
                    sb.append("Error while applying EditCommand batch to buffer (length=" + iC + ", composition=" + f12478849263529740365C + ", selection=" + F12478849263529740365.i(T1335862270807194835.d(k15317901533566777301.b, k15317901533566777301.c)) + "):");
                    sb.append('\n');
                    R9411874267597469228.I0(list, sb, new A6662317080022852970(c2322693828285680440, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            K15317901533566777301 k153179015335667773012 = (K15317901533566777301) this.c;
            k153179015335667773012.getClass();
            M11181104712105445833 m11181104712105445833 = new M11181104712105445833(k153179015335667773012.a.toString());
            K15317901533566777301 k153179015335667773013 = (K15317901533566777301) this.c;
            long jD = T1335862270807194835.d(k153179015335667773013.b, k153179015335667773013.c);
            F12478849263529740365 f12478849263529740365 = F12478849263529740365.h(((F13241018602672925865) this.b).b) ? null : new F12478849263529740365(jD);
            F13241018602672925865 f13241018602672925865 = new F13241018602672925865(m11181104712105445833, f12478849263529740365 != null ? f12478849263529740365.a : T1335862270807194835.d(F12478849263529740365.f(jD), F12478849263529740365.g(jD)), ((K15317901533566777301) this.c).c());
            this.b = f13241018602672925865;
            return f13241018602672925865;
        } catch (Exception e4) {
            c2322693828285680440 = null;
            e = e4;
        }
    }

    @Override // dev.epro.r0.T3455454122937680569
    public boolean hasConnectionPool() {
        return ((T3455454122937680569) this.b).hasConnectionPool();
    }

    @Override // dev.epro.r0.L6498280162989651404
    public U10510841700634832156 i() {
        return (L18291040423514828915) this.b;
    }

    public Z14277976092397041931 k() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            W4415201450379021245.c("Key size is not set");
            return null;
        }
        if (((D14731132657808549702) this.c) != null) {
            return new Z14277976092397041931(num.intValue(), (D14731132657808549702) this.c);
        }
        W4415201450379021245.c("Variant is not set");
        return null;
    }

    public A3294381126080083909 l() throws GeneralSecurityException {
        ECPoint eCPoint;
        A7792011892930360131 a7792011892930360131 = (A7792011892930360131) this.b;
        if (a7792011892930360131 == null) {
            W4415201450379021245.c("Cannot build without a ecdsa public key");
            return null;
        }
        M9197813449740923653 m9197813449740923653 = (M9197813449740923653) this.c;
        if (m9197813449740923653 == null) {
            W4415201450379021245.c("Cannot build without a private value");
            return null;
        }
        BigInteger bigInteger = (BigInteger) m9197813449740923653.b;
        ECPoint eCPoint2 = a7792011892930360131.k;
        H5270339962551858100 h5270339962551858100 = a7792011892930360131.j.b;
        BigInteger order = h5270339962551858100.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            W4415201450379021245.c("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = h5270339962551858100.b;
        if (!R11362382501444029219.f(eCParameterSpec, R11362382501444029219.a) && !R11362382501444029219.f(eCParameterSpec, R11362382501444029219.b) && !R11362382501444029219.f(eCParameterSpec, R11362382501444029219.c)) {
            W4415201450379021245.c("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            W4415201450379021245.c("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            W4415201450379021245.c("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        R11362382501444029219.b(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerD = R11362382501444029219.d(curve);
        M1314633093170584971 m1314633093170584971G = R11362382501444029219.g(ECPoint.POINT_INFINITY, bigIntegerD);
        M1314633093170584971 m1314633093170584971G2 = R11362382501444029219.g(generator, bigIntegerD);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                m1314633093170584971G = R11362382501444029219.a(m1314633093170584971G, m1314633093170584971G2, a, bigIntegerD);
                m1314633093170584971G2 = R11362382501444029219.c(m1314633093170584971G2, a, bigIntegerD);
            } else {
                m1314633093170584971G2 = R11362382501444029219.a(m1314633093170584971G, m1314633093170584971G2, a, bigIntegerD);
                m1314633093170584971G = R11362382501444029219.c(m1314633093170584971G, a, bigIntegerD);
            }
        }
        if (m1314633093170584971G.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = m1314633093170584971G.c.modInverse(bigIntegerD);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerD);
            eCPoint = new ECPoint(m1314633093170584971G.a.multiply(bigIntegerMod).mod(bigIntegerD), m1314633093170584971G.b.multiply(bigIntegerMod).mod(bigIntegerD).multiply(bigIntegerModInverse).mod(bigIntegerD));
        }
        R11362382501444029219.b(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new A3294381126080083909((A7792011892930360131) this.b, (M9197813449740923653) this.c);
        }
        W4415201450379021245.c("Invalid private value");
        return null;
    }

    public void m() {
        ((D389890677992184566) this.b).i();
    }

    public void n(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void o(boolean z) {
        P14575954172000745949 p14575954172000745949 = (P14575954172000745949) this.c;
        R13227154569034155950 r13227154569034155950 = p14575954172000745949.t.r;
        C13374971588771233833 c13374971588771233833 = p14575954172000745949.v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005d, B:29:0x0064, B:31:0x006f, B:33:0x007a, B:32:0x0075, B:27:0x0061, B:28:0x0063, B:45:0x0096, B:46:0x009d, B:24:0x0058), top: B:69:0x0048, outer: #1, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005d, B:29:0x0064, B:31:0x006f, B:33:0x007a, B:32:0x0075, B:27:0x0061, B:28:0x0063, B:45:0x0096, B:46:0x009d, B:24:0x0058), top: B:69:0x0048, outer: #1, inners: #0 }] */
    @Override // dev.epro.r0.T3455454122937680569
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.sqlite.SQLiteConnection open(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W8455343525638953052.open(java.lang.String):androidx.sqlite.SQLiteConnection");
    }

    public void p(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(boolean z) {
        P14575954172000745949 p14575954172000745949 = (P14575954172000745949) this.c;
        R13227154569034155950 r13227154569034155950 = p14575954172000745949.t.r;
        C13374971588771233833 c13374971588771233833 = p14575954172000745949.v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 13:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                D389890677992184566 d389890677992184566 = (D389890677992184566) this.b;
                Object[] objArr = d389890677992184566.a;
                int i = d389890677992184566.c;
                for (int i2 = 0; i2 < i; i2++) {
                    G8961598259406769987 g8961598259406769987 = (G8961598259406769987) objArr[i2];
                    int i3 = g8961598259406769987.c;
                    int i4 = g8961598259406769987.d;
                    int i5 = g8961598259406769987.a;
                    int i6 = g8961598259406769987.b;
                    StringBuilder sbP = E12098517352909843120.p(i3, i4, "(", ",", ")->(");
                    sbP.append(i5);
                    sbP.append(",");
                    sbP.append(i6);
                    sbP.append(")");
                    sb.append(sbP.toString());
                    if (i2 < ((D389890677992184566) this.b).c - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void w(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void x(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void y(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void z(boolean z) {
        C13374971588771233833 c13374971588771233833 = ((P14575954172000745949) this.c).v;
        if (c13374971588771233833 != null) {
            c13374971588771233833.k().l.z(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                Z3383101362411723454.s();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void O() {
    }

    @Override // dev.epro.r0.V8232844453216786975
    public void b() {
    }

    public /* synthetic */ W8455343525638953052(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ W8455343525638953052(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ W8455343525638953052(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public W8455343525638953052(String str, M2066880349381062048 m2066880349381062048, M10846389789027735899 m10846389789027735899) {
        this.a = (byte) 6;
        this.c = str;
        this.b = m2066880349381062048;
    }

    public W8455343525638953052(W8455343525638953052 w8455343525638953052) {
        D389890677992184566 d389890677992184566;
        this.a = (byte) 13;
        this.b = new D389890677992184566(0, new G8961598259406769987[16]);
        this.c = new D389890677992184566(0, new G8961598259406769987[16]);
        if (w8455343525638953052 == null || (d389890677992184566 = (D389890677992184566) w8455343525638953052.b) == null) {
            return;
        }
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            G8961598259406769987 g8961598259406769987 = (G8961598259406769987) objArr[i2];
            ((D389890677992184566) this.b).b(new G8961598259406769987(g8961598259406769987.a, g8961598259406769987.b, g8961598259406769987.c, g8961598259406769987.d, g8961598259406769987.e));
        }
    }

    @Override // dev.epro.r0.V8232844453216786975
    public void d(Object obj) {
    }

    public W8455343525638953052(String str) {
        this.a = (byte) 27;
        this.b = str.concat(".lck");
    }

    public /* synthetic */ W8455343525638953052(byte b, boolean z) {
        this.a = b;
    }

    public W8455343525638953052(P14575954172000745949 p14575954172000745949) {
        this.a = (byte) 28;
        this.b = new CopyOnWriteArrayList();
        this.c = p14575954172000745949;
    }

    public W8455343525638953052(View view) {
        this.a = (byte) 0;
        this.b = view;
        this.c = M9216324016624295870.L(G14718160286012243331.c, new W2269277550458425547(this, (byte) 5));
    }

    public W8455343525638953052(R3533078172067811153 r3533078172067811153, T3455454122937680569 t3455454122937680569) {
        this.a = (byte) 10;
        t3455454122937680569.getClass();
        this.c = r3533078172067811153;
        this.b = t3455454122937680569;
    }

    public W8455343525638953052(T558270488962777544 t558270488962777544) {
        this.a = (byte) 25;
        R8365488887580997185 r8365488887580997185 = (R8365488887580997185) t558270488962777544.d;
        this.b = new L18291040423514828915(t558270488962777544, r8365488887580997185.e().i(), -1L, true);
        this.c = new R174161856403953334(t558270488962777544, r8365488887580997185.e().c(), -1L, true);
    }

    public W8455343525638953052(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 29;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public W8455343525638953052(int i, int i2) {
        this.a = (byte) 29;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public W8455343525638953052(byte b) {
        this.a = b;
        switch (b) {
            case 19:
                this.b = new F15711662138251908495(true);
                this.c = new F15711662138251908495(true);
                break;
            case 26:
                this.b = new byte[2048];
                break;
            default:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
        }
    }

    public W8455343525638953052(int i, int i2, int i3) {
        this.a = (byte) 29;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public W8455343525638953052(Z10690282603965943320 z10690282603965943320) {
        this.a = (byte) 4;
        this.c = z10690282603965943320;
    }
}
