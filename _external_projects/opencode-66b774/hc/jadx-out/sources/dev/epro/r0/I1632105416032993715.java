package dev.epro.r0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.WindowManager;
import androidx.webkit.WebViewStartUpResult;
import androidx.work.impl.foreground.SystemForegroundService;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I1632105416032993715 implements R11800251031747375035, WebViewStartUpResult, I3673563500665330592 {
    public static I1632105416032993715 e;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d3 A[LOOP:1: B:118:0x03d1->B:119:0x03d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027a  */
    /* JADX WARN: Type inference failed for: r17v2, types: [android.graphics.Bitmap, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I1632105416032993715(dev.epro.r0.J16704254777695610861 r30) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I1632105416032993715.<init>(dev.epro.r0.J16704254777695610861):void");
    }

    public static I1632105416032993715 d(String str, D14731132657808549702 d14731132657808549702, N17666688112968464504 n17666688112968464504) {
        int i = Z12670897225348479586.a;
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i2] = (byte) cCharAt;
        }
        J4250663911053539605.a(bArr);
        return new I1632105416032993715(n17666688112968464504, str, d14731132657808549702, (byte) 6);
    }

    public static I1632105416032993715 t(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new I1632105416032993715(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public M10089736868580320414 a() {
        UUID uuid = (UUID) this.b;
        L16425900549479658727 l16425900549479658727 = (L16425900549479658727) this.c;
        M10089736868580320414 m10089736868580320414 = new M10089736868580320414(uuid, l16425900549479658727, (Set) this.d);
        K13184022901285147448 k13184022901285147448 = l16425900549479658727.j;
        boolean z = !k13184022901285147448.i.isEmpty() || k13184022901285147448.e || k13184022901285147448.c || k13184022901285147448.d;
        L16425900549479658727 l164259005494796587272 = (L16425900549479658727) this.c;
        if (l164259005494796587272.q) {
            if (z) {
                S10973172697741180971.j("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (l164259005494796587272.g > 0) {
                S10973172697741180971.j("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = l164259005494796587272.x;
        if (str == null) {
            List listP0 = M8927913404651150384.p0(l164259005494796587272.c, new String[]{"."}, 6);
            String strB0 = listP0.size() == 1 ? (String) listP0.get(0) : (String) R9411874267597469228.K0(listP0);
            if (strB0.length() > 127) {
                strB0 = M8927913404651150384.B0(127, strB0);
            }
            l164259005494796587272.x = strB0;
        } else if (str.length() > 127) {
            ((L16425900549479658727) this.c).x = M8927913404651150384.B0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        L16425900549479658727 l164259005494796587273 = (L16425900549479658727) this.c;
        this.c = new L16425900549479658727(string, l164259005494796587273.b, l164259005494796587273.c, l164259005494796587273.d, new Z4023314114778119473(l164259005494796587273.e), new Z4023314114778119473(l164259005494796587273.f), l164259005494796587273.g, l164259005494796587273.h, l164259005494796587273.i, new K13184022901285147448(l164259005494796587273.j), l164259005494796587273.k, l164259005494796587273.l, l164259005494796587273.m, l164259005494796587273.n, l164259005494796587273.f345o, l164259005494796587273.p, l164259005494796587273.q, l164259005494796587273.r, l164259005494796587273.s, l164259005494796587273.u, l164259005494796587273.v, l164259005494796587273.w, l164259005494796587273.x, l164259005494796587273.y, 524288);
        return m10089736868580320414;
    }

    public G5183794802785878636 b() {
        J4250663911053539605 j4250663911053539605A;
        if (((C5880096771922761272) this.b) == null) {
            W4415201450379021245.c("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.c;
        if (bigInteger == null) {
            W4415201450379021245.c("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        C5880096771922761272 c5880096771922761272 = (C5880096771922761272) this.b;
        int i = c5880096771922761272.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(E12098517352909843120.l("Got modulus size ", iBitLength, i, ", but parameters requires modulus size "));
        }
        if (c5880096771922761272.a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C5880096771922761272) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((C5880096771922761272) this.b).c;
        if (d14731132657808549702 == D14731132657808549702.s0) {
            j4250663911053539605A = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.r0 || d14731132657808549702 == D14731132657808549702.q0) {
            j4250663911053539605A = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.p0) {
                S10973172697741180971.m("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605A = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new G5183794802785878636((C5880096771922761272) this.b, (BigInteger) this.c, j4250663911053539605A, (Integer) this.d);
    }

    public S14902715661559460346 c() {
        J4250663911053539605 j4250663911053539605A;
        if (((M5876618289820536996) this.b) == null) {
            W4415201450379021245.c("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.c;
        if (bigInteger == null) {
            W4415201450379021245.c("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        M5876618289820536996 m5876618289820536996 = (M5876618289820536996) this.b;
        int i = m5876618289820536996.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(E12098517352909843120.l("Got modulus size ", iBitLength, i, ", but parameters requires modulus size "));
        }
        if (m5876618289820536996.a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((M5876618289820536996) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((M5876618289820536996) this.b).c;
        if (d14731132657808549702 == D14731132657808549702.w0) {
            j4250663911053539605A = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.v0 || d14731132657808549702 == D14731132657808549702.u0) {
            j4250663911053539605A = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.t0) {
                S10973172697741180971.m("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605A = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new S14902715661559460346((M5876618289820536996) this.b, (BigInteger) this.c, j4250663911053539605A, (Integer) this.d);
    }

    public Object e() {
        long jG = Q9282725956684299602.g();
        if (jG == T16412979936017733173.a) {
            return this.d;
        }
        Z2969552471667004782 z2969552471667004782 = (Z2969552471667004782) ((AtomicReference) this.b).get();
        int iA = z2969552471667004782.a(jG);
        if (iA >= 0) {
            return z2969552471667004782.c[iA];
        }
        return null;
    }

    public ColorStateList f(int i) {
        int resourceId;
        ColorStateList colorStateListR;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListR = B5998207562248239613.r((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListR;
    }

    public Drawable g(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : M9216324016624295870.G((Context) this.b, resourceId);
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getMaxTimePerTaskInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.d).getMaxTimePerTaskInUiThreadMillis();
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getNonUiThreadBlockingStartUpLocations() {
        return (List) this.c;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getTotalTimeInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.d).getTotalTimeInUiThreadMillis();
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getUiThreadBlockingStartUpLocations() {
        return (ArrayList) this.b;
    }

    @Override // dev.epro.r0.I3673563500665330592
    public Object h() {
        Application application = (Application) ((Z6787503239643758223) this.c).a;
        L10699316803831699764 l10699316803831699764 = L7597948271951285043.b;
        Q3791352212346016950.m(l10699316803831699764);
        return new A7202329723792933819(application, l10699316803831699764, (D6285004323073107982) ((D9201356603168736774) this.d).h(), false);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        D6070089955350435999 d6070089955350435999A = D6070089955350435999.a();
        Context context = (Context) this.b;
        synchronized (d6070089955350435999A) {
            drawableE = d6070089955350435999A.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public int j() {
        if (n().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((A17975991316152527869) R9411874267597469228.B0(n().a)).a) - ((long) n().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [dev.epro.r0.I15162792415829416729] */
    /* JADX WARN: Type inference failed for: r11v17, types: [dev.epro.r0.I15162792415829416729, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r14v0, types: [dev.epro.r0.I15162792415829416729, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    public Typeface k(int i, int i2, I15162792415829416729 i15162792415829416729) {
        ?? r11;
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        Typeface typefaceA = null;
        typefaceA = null;
        typefaceA = null;
        typefaceA = null;
        if (resourceId != 0) {
            TypedValue typedValue = (TypedValue) this.d;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.d = typedValue;
            }
            Context context = (Context) this.b;
            ThreadLocal threadLocal = D17154507594675396172.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    i15162792415829416729.a(-3);
                    return null;
                }
                int i3 = typedValue.assetCookie;
                B1412794554478658227 b1412794554478658227 = K4066258037408482587.b;
                Typeface typeface = (Typeface) b1412794554478658227.c(K4066258037408482587.b(resources, resourceId, string, i3, i2));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new Q9622116641457785369(i15162792415829416729, typeface, (byte) 13));
                    return typeface;
                }
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        O2957401531134925886 o2957401531134925886Y = E3422549137300678133.Y(resources.getXml(resourceId), resources);
                        if (o2957401531134925886Y == null) {
                            i15162792415829416729.a(-3);
                            i15162792415829416729 = i15162792415829416729;
                        } else {
                            try {
                                typefaceA = K4066258037408482587.a(context, o2957401531134925886Y, resources, resourceId, string, typedValue.assetCookie, i2, i15162792415829416729, true);
                                i15162792415829416729 = i15162792415829416729;
                            } catch (IOException | XmlPullParserException unused) {
                                r11 = i15162792415829416729;
                                r11.a(-3);
                                return typefaceA;
                            }
                        }
                        return typefaceA;
                    }
                    r11 = i15162792415829416729;
                    try {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceK = K4066258037408482587.a.k(context, resources, resourceId, string, i2);
                        if (typefaceK != null) {
                            b1412794554478658227.d(K4066258037408482587.b(resources, resourceId, string, i4, i2), typefaceK);
                        }
                        if (typefaceK != null) {
                            new Handler(Looper.getMainLooper()).post(new Q9622116641457785369(r11, typefaceK, (byte) 13));
                        } else {
                            r11.a(-3);
                        }
                        typefaceA = typefaceK;
                        i15162792415829416729 = typefaceK;
                        return typefaceA;
                    } catch (IOException | XmlPullParserException unused2) {
                        r11.a(-3);
                        return typefaceA;
                    }
                } catch (IOException | XmlPullParserException unused3) {
                    r11 = i15162792415829416729;
                }
            }
        }
        return null;
    }

    public boolean l() {
        return !n().a.isEmpty();
    }

    public int m() {
        if (n().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((A17975991316152527869) R9411874267597469228.K0(n().a)).a) + ((long) n().h);
        long jQ = ((long) q()) - 1;
        if (j > jQ) {
            j = jQ;
        }
        return (int) j;
    }

    public Z10384052377193817149 n() {
        Z10384052377193817149 z10384052377193817149 = (Z10384052377193817149) this.c;
        if (z10384052377193817149 != null) {
            return z10384052377193817149;
        }
        S10823041268949770285.b0("layoutInfo");
        throw null;
    }

    public int o() {
        if (n().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((A17975991316152527869) R9411874267597469228.K0(n().a)).j + n().b) + n().c) - n().g);
    }

    public int p() {
        if (n().a.isEmpty()) {
            return 0;
        }
        int i = ((A17975991316152527869) R9411874267597469228.B0(n().a)).j + (-n().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public int q() {
        return ((Number) ((I126528583771688852) this.b).invoke()).intValue();
    }

    public boolean r(long j) {
        return j <= 0 || j <= ((AtomicLong) this.d).get();
    }

    public boolean s() {
        if (((L13148442655056575112) this.b).getValue() != this.d) {
            return true;
        }
        I1632105416032993715 i1632105416032993715 = (I1632105416032993715) this.c;
        return i1632105416032993715 != null && i1632105416032993715.s();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(P72364327365747079 p72364327365747079) {
        W1065890726320841559 w1065890726320841559 = (W1065890726320841559) this.d;
        if (w1065890726320841559 != null) {
            w1065890726320841559.run();
        }
        W1065890726320841559 w10658907263208415592 = new W1065890726320841559((I1283052979100930176) this.b, p72364327365747079);
        this.d = w10658907263208415592;
        ((Handler) this.c).postAtFrontOfQueue(w10658907263208415592);
    }

    public void v() {
        ((TypedArray) this.c).recycle();
    }

    public void w(Object obj) {
        long jG = Q9282725956684299602.g();
        if (jG == T16412979936017733173.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            Z2969552471667004782 z2969552471667004782 = (Z2969552471667004782) ((AtomicReference) this.b).get();
            int iA = z2969552471667004782.a(jG);
            if (iA < 0) {
                ((AtomicReference) this.b).set(z2969552471667004782.b(jG, obj));
            } else {
                z2969552471667004782.c[iA] = obj;
            }
        }
    }

    public void x() {
        A4559761392562572984 a4559761392562572984 = (A4559761392562572984) this.b;
        String str = (String) this.c;
        List list = (List) a4559761392562572984.l(str);
        if (list != null) {
            list.remove((B13729205492206812220) this.d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        a4559761392562572984.n(str, list);
    }

    public boolean y() {
        return (((Activity) this.b).getResources().getConfiguration().uiMode & 48) == 32;
    }

    public /* synthetic */ I1632105416032993715(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public I1632105416032993715(Activity activity) {
        this.a = (byte) 21;
        this.d = null;
        this.b = activity;
        this.c = (WindowManager) activity.getSystemService("window");
    }

    public I1632105416032993715(X15982999125463556553 x15982999125463556553) {
        this.a = (byte) 1;
        this.b = new X13205888428499400927(0);
        this.c = new I1581330382723795749((byte) 0);
        this.d = new P3286589736814227645((Object) this, (Object) x15982999125463556553, (byte) 3);
    }

    public I1632105416032993715(SystemForegroundService systemForegroundService) {
        this.a = (byte) 10;
        this.b = new I1283052979100930176(systemForegroundService, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public I1632105416032993715(String str) {
        this.a = (byte) 13;
        this.d = Executors.newSingleThreadScheduledExecutor(new D2517317326963530650(this));
        this.c = str;
    }

    public I1632105416032993715(I126528583771688852 i126528583771688852) {
        this.a = (byte) 4;
        this.b = i126528583771688852;
    }

    public I1632105416032993715(Class cls) {
        this.a = (byte) 3;
        cls.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = ((UUID) this.b).toString();
        string.getClass();
        this.c = new L16425900549479658727(string, (Y8203071358079267502) null, cls.getName(), (String) null, (Z4023314114778119473) null, (Z4023314114778119473) null, 0L, 0L, 0L, (K13184022901285147448) null, 0, (Y6144095862626460568) null, 0L, 0L, 0L, 0L, false, (W17497847401432715949) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(E4951175994894594588.u0(1));
        O5378677881740157249.S0(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public /* synthetic */ I1632105416032993715(byte b, boolean z) {
        this.a = b;
    }

    public I1632105416032993715(Context context, TypedArray typedArray) {
        this.a = (byte) 14;
        this.b = context;
        this.c = typedArray;
    }

    public I1632105416032993715(Context context, LocationManager locationManager) {
        this.a = (byte) 16;
        this.d = new N5212948766656490716();
        this.b = context;
        this.c = locationManager;
    }

    public I1632105416032993715(J8361625609383425129 j8361625609383425129, I1632105416032993715 i1632105416032993715) {
        this.a = (byte) 17;
        this.b = j8361625609383425129;
        this.c = i1632105416032993715;
        this.d = j8361625609383425129.a;
    }

    public I1632105416032993715(L3530692241870850490 l3530692241870850490) {
        this.a = (byte) 19;
        O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        H6810052497267380403.b.getClass();
        this.b = l3530692241870850490;
        this.c = "androidx.navigation.NavControllerViewModel";
        this.d = new O12494175665883759871(new E6464496061242537963(this, (byte) 10));
    }

    public I1632105416032993715(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new AtomicReference(M2066880349381062048.Q);
                this.c = new Object();
                break;
            case 15:
                this.b = new Object();
                this.c = new AtomicLong();
                this.d = new AtomicLong();
                break;
            case 18:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                break;
            default:
                long[] jArr = X4026756943680612204.a;
                this.b = new A4559761392562572984();
                break;
        }
    }

    public I1632105416032993715(int i) {
        this.a = (byte) 12;
        this.b = i != 1 ? new B1412794554478658227(i) : null;
    }
}
