package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import dev.epro.r0.C13799120990122180696;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S14769385926647291222;
import dev.epro.r0.V10300877997588547986;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class w81 extends c61 {
    public static final C13799120990122180696 N = new C13799120990122180696(4, "Ad inspector cannot be opened because it is already open.");
    public static final C13799120990122180696 O = new C13799120990122180696(2, "Ad inspector failed to load.");
    public static final C13799120990122180696 P = new C13799120990122180696(1, "Ad inspector had an internal error.");
    public static final C13799120990122180696 Q = new C13799120990122180696(3, "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
    public static final C13799120990122180696 R = new C13799120990122180696(5, "Ad inspector cannot be opened because it is disabled in the AndroidManifest.xml.");
    public I16631908410500040363 A;
    public I16631908410500040363 B;
    public p71 C;
    public final H15186625828076266306 D;
    public long E;
    public final LinkedHashMap F;
    public final LinkedHashMap G;
    public final H15186625828076266306 H;
    public WeakReference I;
    public final AtomicBoolean J;
    public final AtomicBoolean K;
    public final AtomicBoolean L;
    public Boolean M;
    public final Context c;
    public final W5797197595347441198 d;
    public final String e;
    public final V2597580950516131749 f;
    public final V2597580950516131749 g;
    public final F14240031463097426304 h;
    public final jr0 i;
    public final O16637889491137121389 j;
    public final O12043144740933444288 k;
    public final da1 l;
    public final mg m;
    public final wj n;

    /* renamed from: o, reason: collision with root package name */
    public final u91 f121o;
    public final sp3 p;
    public final kz2 q;
    public final sv2 r;
    public final V2597580950516131749 s;
    public final g71 t;
    public final fz u;
    public final ri v;
    public final b41 w;
    public final H15186625828076266306 x;
    public ba1 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(Context context, W5797197595347441198 w5797197595347441198, String str, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, F14240031463097426304 f14240031463097426304, jr0 jr0Var, O16637889491137121389 o16637889491137121389, O12043144740933444288 o12043144740933444288, da1 da1Var, mg mgVar, wj wjVar, u91 u91Var, sp3 sp3Var, kz2 kz2Var, sv2 sv2Var, V2597580950516131749 v25975809505161317493, g71 g71Var, fz fzVar, ri riVar, b41 b41Var) {
        super(wv0.CUI_NAME_SDKINIT_INIT_AD_INSPECTOR, false);
        context.getClass();
        w5797197595347441198.getClass();
        str.getClass();
        v2597580950516131749.getClass();
        v25975809505161317492.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        o12043144740933444288.getClass();
        da1Var.getClass();
        mgVar.getClass();
        wjVar.getClass();
        u91Var.getClass();
        sp3Var.getClass();
        kz2Var.getClass();
        sv2Var.getClass();
        g71Var.getClass();
        fzVar.getClass();
        riVar.getClass();
        b41Var.getClass();
        this.c = context;
        this.d = w5797197595347441198;
        this.e = str;
        this.f = v2597580950516131749;
        this.g = v25975809505161317492;
        this.h = f14240031463097426304;
        this.i = jr0Var;
        this.j = o16637889491137121389;
        this.k = o12043144740933444288;
        this.l = da1Var;
        this.m = mgVar;
        this.n = wjVar;
        this.f121o = u91Var;
        this.p = sp3Var;
        this.q = kz2Var;
        this.r = sv2Var;
        this.s = v25975809505161317493;
        this.t = g71Var;
        this.u = fzVar;
        this.v = riVar;
        this.w = b41Var;
        this.x = new H15186625828076266306();
        this.A = new I16631908410500040363();
        this.B = new I16631908410500040363();
        this.C = p71.a;
        this.D = new H15186625828076266306();
        this.F = new LinkedHashMap();
        this.G = new LinkedHashMap();
        this.H = new H15186625828076266306();
        this.I = new WeakReference(null);
        this.J = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.L = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x071f, code lost:
    
        if (r3.c(r9) == r10) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0582, code lost:
    
        if (r3 == r10) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03f7, code lost:
    
        if (r4.c(r9) == r10) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x08b2, code lost:
    
        if (r3 == r10) goto L289;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06a3 A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #13 {all -> 0x00f7, blocks: (B:107:0x00e6, B:115:0x0782, B:124:0x0110, B:129:0x0726, B:135:0x08e4, B:136:0x08e7, B:138:0x0139, B:143:0x069e, B:145:0x06a3, B:148:0x06d2, B:150:0x06da, B:153:0x0709, B:157:0x08e9, B:158:0x08ed, B:160:0x0165, B:127:0x0723, B:141:0x0699), top: B:7:0x0043, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06d2 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #13 {all -> 0x00f7, blocks: (B:107:0x00e6, B:115:0x0782, B:124:0x0110, B:129:0x0726, B:135:0x08e4, B:136:0x08e7, B:138:0x0139, B:143:0x069e, B:145:0x06a3, B:148:0x06d2, B:150:0x06da, B:153:0x0709, B:157:0x08e9, B:158:0x08ed, B:160:0x0165, B:127:0x0723, B:141:0x0699), top: B:7:0x0043, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0646 A[Catch: all -> 0x08f1, TRY_LEAVE, TryCatch #9 {all -> 0x08f1, blocks: (B:165:0x0641, B:167:0x0646, B:170:0x0675, B:178:0x08f7, B:179:0x08fa, B:163:0x063a), top: B:162:0x063a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0675 A[Catch: all -> 0x08f1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x08f1, blocks: (B:165:0x0641, B:167:0x0646, B:170:0x0675, B:178:0x08f7, B:179:0x08fa, B:163:0x063a), top: B:162:0x063a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0534 A[Catch: all -> 0x05a3, TRY_LEAVE, TryCatch #2 {all -> 0x05a3, blocks: (B:200:0x052e, B:202:0x0534, B:206:0x0567, B:218:0x0490, B:220:0x0496, B:224:0x04cd, B:226:0x04d1, B:229:0x05a7, B:230:0x05ac), top: B:217:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0567 A[Catch: all -> 0x05a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x05a3, blocks: (B:200:0x052e, B:202:0x0534, B:206:0x0567, B:218:0x0490, B:220:0x0496, B:224:0x04cd, B:226:0x04d1, B:229:0x05a7, B:230:0x05ac), top: B:217:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0496 A[Catch: all -> 0x05a3, TRY_LEAVE, TryCatch #2 {all -> 0x05a3, blocks: (B:200:0x052e, B:202:0x0534, B:206:0x0567, B:218:0x0490, B:220:0x0496, B:224:0x04cd, B:226:0x04d1, B:229:0x05a7, B:230:0x05ac), top: B:217:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04cd A[Catch: all -> 0x05a3, TRY_ENTER, TryCatch #2 {all -> 0x05a3, blocks: (B:200:0x052e, B:202:0x0534, B:206:0x0567, B:218:0x0490, B:220:0x0496, B:224:0x04cd, B:226:0x04d1, B:229:0x05a7, B:230:0x05ac), top: B:217:0x0490 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0378 A[Catch: all -> 0x022e, TRY_LEAVE, TryCatch #7 {all -> 0x022e, blocks: (B:233:0x0218, B:247:0x0247, B:252:0x03fe, B:258:0x05b3, B:259:0x05b6, B:261:0x0270, B:266:0x0373, B:268:0x0378, B:271:0x03a9, B:273:0x03b1, B:276:0x03e2, B:280:0x05b8, B:281:0x05bc, B:283:0x029f, B:250:0x03fb, B:264:0x036e), top: B:7:0x0043, inners: #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a9 A[Catch: all -> 0x022e, TRY_ENTER, TryCatch #7 {all -> 0x022e, blocks: (B:233:0x0218, B:247:0x0247, B:252:0x03fe, B:258:0x05b3, B:259:0x05b6, B:261:0x0270, B:266:0x0373, B:268:0x0378, B:271:0x03a9, B:273:0x03b1, B:276:0x03e2, B:280:0x05b8, B:281:0x05bc, B:283:0x029f, B:250:0x03fb, B:264:0x036e), top: B:7:0x0043, inners: #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0860 A[Catch: all -> 0x08cf, TRY_LEAVE, TryCatch #23 {all -> 0x08cf, blocks: (B:26:0x085a, B:28:0x0860, B:32:0x0897), top: B:25:0x085a }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x031c A[Catch: all -> 0x05c0, TRY_LEAVE, TryCatch #16 {all -> 0x05c0, blocks: (B:288:0x0317, B:290:0x031c, B:294:0x0351, B:332:0x05c6, B:333:0x05c9, B:286:0x0312), top: B:285:0x0312, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d5 A[Catch: all -> 0x05e1, TryCatch #0 {all -> 0x05e1, blocks: (B:301:0x05ce, B:303:0x05d5, B:305:0x05d9, B:307:0x05dd, B:308:0x05e4, B:310:0x05e8, B:312:0x05ec, B:314:0x05f0, B:315:0x05f1, B:316:0x05f6, B:317:0x05f7, B:318:0x05fe, B:319:0x05ff, B:320:0x0606, B:321:0x0607), top: B:300:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0607 A[Catch: all -> 0x05e1, TRY_LEAVE, TryCatch #0 {all -> 0x05e1, blocks: (B:301:0x05ce, B:303:0x05d5, B:305:0x05d9, B:307:0x05dd, B:308:0x05e4, B:310:0x05e8, B:312:0x05ec, B:314:0x05f0, B:315:0x05f1, B:316:0x05f6, B:317:0x05f7, B:318:0x05fe, B:319:0x05ff, B:320:0x0606, B:321:0x0607), top: B:300:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0897 A[Catch: all -> 0x08cf, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x08cf, blocks: (B:26:0x085a, B:28:0x0860, B:32:0x0897), top: B:25:0x085a }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0906 A[Catch: all -> 0x0912, TryCatch #24 {all -> 0x0912, blocks: (B:45:0x08ff, B:47:0x0906, B:49:0x090a, B:51:0x090e, B:52:0x0915, B:54:0x0919, B:56:0x091d, B:58:0x0921, B:59:0x0922, B:60:0x0927, B:61:0x0928, B:62:0x092f, B:63:0x0930, B:64:0x0937, B:65:0x0938), top: B:44:0x08ff }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0938 A[Catch: all -> 0x0912, TRY_LEAVE, TryCatch #24 {all -> 0x0912, blocks: (B:45:0x08ff, B:47:0x0906, B:49:0x090a, B:51:0x090e, B:52:0x0915, B:54:0x0919, B:56:0x091d, B:58:0x0921, B:59:0x0922, B:60:0x0927, B:61:0x0928, B:62:0x092f, B:63:0x0930, B:64:0x0937, B:65:0x0938), top: B:44:0x08ff }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07c0 A[Catch: all -> 0x08c6, TRY_LEAVE, TryCatch #18 {all -> 0x08c6, blocks: (B:15:0x08b5, B:17:0x08bd, B:87:0x07ba, B:89:0x07c0, B:98:0x07f8, B:100:0x07fc, B:103:0x08d5, B:104:0x08da), top: B:86:0x07ba }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x07f8 A[Catch: all -> 0x08c6, TRY_ENTER, TryCatch #18 {all -> 0x08c6, blocks: (B:15:0x08b5, B:17:0x08bd, B:87:0x07ba, B:89:0x07c0, B:98:0x07f8, B:100:0x07fc, B:103:0x08d5, B:104:0x08da), top: B:86:0x07ba }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Type inference failed for: r0v113, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r0v136, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r0v142, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r0v148, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r0v36, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r0v59, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r0v65, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r0v70, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v13, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v75, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r3v11, types: [ads_mobile_sdk.em2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v90, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r29, ads_mobile_sdk.p71 r30, dev.epro.r0.V3805393212198381221 r31, dev.epro.r0.K14749510448791472029 r32) {
        /*
            Method dump skipped, instructions count: 2406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, ads_mobile_sdk.p71, dev.epro.r0.V3805393212198381221, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:16:0x00b5, B:21:0x00bf, B:24:0x00c5, B:26:0x00cd, B:28:0x00d1, B:30:0x00d7, B:32:0x00db, B:35:0x00e3, B:36:0x00e6, B:37:0x00e7, B:38:0x00ea, B:39:0x00eb, B:41:0x00f1), top: B:15:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0078 A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #3 {all -> 0x010f, blocks: (B:53:0x0074, B:56:0x0078, B:60:0x0082), top: B:52:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.w81 r18, boolean r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.b(ads_mobile_sdk.w81, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.m81
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.m81 r0 = (ads_mobile_sdk.m81) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.m81 r0 = new ads_mobile_sdk.m81
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ads_mobile_sdk.w81 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r4.v(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L3e
            return r0
        L3e:
            dev.epro.r0.W5797197595347441198 r5 = r4.d
            dev.epro.r0.N12893830608069839869 r0 = new dev.epro.r0.N12893830608069839869
            r1 = 2
            r0.<init>(r4, r2, r1)
            r5.getClass()
            dev.epro.r0.P7598478828797568949 r4 = new dev.epro.r0.P7598478828797568949
            r4.<init>(r0, r2, r3)
            dev.epro.r0.I3826119971291161142 r0 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r5, r0, r2, r4, r1)
            ads_mobile_sdk.xu0 r4 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.e(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void c() {
        Object qu0Var;
        if (this.z) {
            return;
        }
        ((b43) this.f.get()).i = this;
        nr0 nr0Var = (nr0) this.g.get();
        nr0Var.getClass();
        nr0Var.m = this;
        this.z = true;
        ba1 ba1Var = this.y;
        Drawable drawable = null;
        if (ba1Var == null) {
            S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        a(ba1Var.r$2());
        mg mgVar = this.m;
        ApplicationInfo applicationInfo = mgVar.c;
        AtomicReference atomicReference = mgVar.d;
        Context context = mgVar.a;
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        int i = 0;
        try {
            i16631908410500040363.t("name", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(applicationInfo.packageName, 0)).toString());
            i16631908410500040363.t("packageName", applicationInfo.packageName);
            V10300877997588547986 a = mgVar.b.a();
            String str = "";
            i16631908410500040363.t("adMobAppId", a != null ? (String) a.b : "");
            CharSequence charSequence = (CharSequence) atomicReference.get();
            if (charSequence == null || M8927913404651150384.Y(charSequence)) {
                try {
                    ApplicationInfo applicationInfo2 = context.getPackageManager().getApplicationInfo(context.getApplicationInfo().packageName, 0);
                    applicationInfo2.getClass();
                    drawable = context.getPackageManager().getApplicationIcon(applicationInfo2);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, 256, 256);
                    Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
                    createBitmap.getClass();
                    drawable.draw(new Canvas(createBitmap));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                }
                atomicReference.set(str);
            }
            CharSequence charSequence2 = (CharSequence) atomicReference.get();
            if (charSequence2 != null && !M8927913404651150384.Y(charSequence2)) {
                i16631908410500040363.t("icon", (String) atomicReference.get());
                i16631908410500040363.s("iconWidthPx", 256);
                i16631908410500040363.s("iconHeightPx", 256);
            }
            qu0Var = new xu0(i16631908410500040363);
        } catch (PackageManager.NameNotFoundException e) {
            qu0Var = new qu0(e, i, false ? 1 : 0, 6);
        }
        if (qu0Var instanceof xu0) {
            this.B = (I16631908410500040363) ((xu0) qu0Var).b;
        }
    }

    public final boolean d() {
        boolean z;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        jr0 jr0Var = this.i;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:inspector:disable_ad_inspector_from_manifest_enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            Boolean bool = this.M;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                try {
                    packageManager = this.c.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.c.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                    z = bundle.getBoolean("com.google.android.libraries.ads.mobile.sdk.flag.DISABLE_AD_INSPECTOR", false);
                    this.M = Boolean.valueOf(z);
                }
                z = false;
                this.M = Boolean.valueOf(z);
            }
        } else {
            z = false;
        }
        ba1 ba1Var = this.y;
        if (ba1Var == null) {
            S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        boolean s = ba1Var.s();
        boolean z2 = z && !s;
        if (z) {
            if (s) {
                if (this.L.compareAndSet(false, true)) {
                    kz2 kz2Var = this.q;
                    wv0 wv0Var = wv0.CUI_NAME_AD_INSPECTOR_GLOBAL_ALLOWLIST_OVERRIDE;
                    mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
                    if (ji3.b().a == null) {
                        kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var).close();
                    } else {
                        ji3.a(wv0Var, o2161699089510411363, true).close();
                    }
                }
            } else if (this.K.compareAndSet(false, true)) {
                kz2 kz2Var2 = this.q;
                wv0 wv0Var2 = wv0.CUI_NAME_AD_INSPECTOR_DISABLED;
                mi3 mi3Var2 = new mi3(new ur2(), new fh1(), new tu2(), new s8());
                if (ji3.b().a == null) {
                    kz2.a(kz2Var2, wv0Var2, o2161699089510411363, mi3Var2).close();
                } else {
                    ji3.a(wv0Var2, o2161699089510411363, true).close();
                }
            }
        }
        if (z2) {
            this.J.compareAndSet(false, true);
        }
        return z2;
    }

    public final boolean g() {
        if (d()) {
            return false;
        }
        ba1 ba1Var = this.y;
        if (ba1Var == null) {
            S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        if (ba1Var.u()) {
            return true;
        }
        ba1 ba1Var2 = this.y;
        if (ba1Var2 == null) {
            S10823041268949770285.b0("storedInspectorSettings");
            throw null;
        }
        if (!ba1Var2.t()) {
            return false;
        }
        jr0 jr0Var = this.i;
        jr0Var.getClass();
        return ((Boolean) jr0Var.a("gads:inspector:linked_device_enable_inspector", Boolean.TRUE, ao.a$11)).booleanValue();
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return e(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.v71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.v71 r0 = (ads_mobile_sdk.v71) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.v71 r0 = new ads_mobile_sdk.v71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2c:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.c = r2
            java.lang.String r5 = r4.b()
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = "{}"
            boolean r4 = dev.epro.r0.S10823041268949770285.t(r5, r4)
            if (r4 == 0) goto L47
            java.lang.String r4 = ""
            return r4
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.r(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #1 {all -> 0x005b, blocks: (B:32:0x0057, B:33:0x008f, B:36:0x0098, B:38:0x00a0, B:42:0x00dd, B:43:0x00e0, B:44:0x00e1, B:45:0x00e4, B:47:0x0082), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:32:0x0057, B:33:0x008f, B:36:0x0098, B:38:0x00a0, B:42:0x00dd, B:43:0x00e0, B:44:0x00e1, B:45:0x00e4, B:47:0x0082), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.s(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x022e, code lost:
    
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x051f A[Catch: all -> 0x007a, TryCatch #6 {all -> 0x007a, blocks: (B:14:0x0064, B:27:0x048a, B:30:0x0491, B:32:0x049a, B:35:0x04a8, B:37:0x04da, B:38:0x04df, B:42:0x04b4, B:43:0x04b8, B:46:0x04b9, B:48:0x04cc, B:49:0x04d4, B:54:0x0458, B:56:0x046b, B:57:0x0473, B:70:0x00ae, B:87:0x00e7, B:89:0x0379, B:96:0x0312, B:98:0x031a, B:108:0x0339, B:110:0x033d, B:115:0x051a, B:116:0x051e, B:118:0x032f, B:122:0x051f, B:123:0x0525), top: B:7:0x002b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x048a A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #6 {all -> 0x007a, blocks: (B:14:0x0064, B:27:0x048a, B:30:0x0491, B:32:0x049a, B:35:0x04a8, B:37:0x04da, B:38:0x04df, B:42:0x04b4, B:43:0x04b8, B:46:0x04b9, B:48:0x04cc, B:49:0x04d4, B:54:0x0458, B:56:0x046b, B:57:0x0473, B:70:0x00ae, B:87:0x00e7, B:89:0x0379, B:96:0x0312, B:98:0x031a, B:108:0x0339, B:110:0x033d, B:115:0x051a, B:116:0x051e, B:118:0x032f, B:122:0x051f, B:123:0x0525), top: B:7:0x002b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x049a A[Catch: all -> 0x007a, Exception -> 0x04b2, TryCatch #9 {Exception -> 0x04b2, blocks: (B:30:0x0491, B:32:0x049a, B:35:0x04a8, B:42:0x04b4, B:43:0x04b8), top: B:29:0x0491, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04b4 A[Catch: all -> 0x007a, Exception -> 0x04b2, TryCatch #9 {Exception -> 0x04b2, blocks: (B:30:0x0491, B:32:0x049a, B:35:0x04a8, B:42:0x04b4, B:43:0x04b8), top: B:29:0x0491, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x046b A[Catch: all -> 0x007a, TryCatch #6 {all -> 0x007a, blocks: (B:14:0x0064, B:27:0x048a, B:30:0x0491, B:32:0x049a, B:35:0x04a8, B:37:0x04da, B:38:0x04df, B:42:0x04b4, B:43:0x04b8, B:46:0x04b9, B:48:0x04cc, B:49:0x04d4, B:54:0x0458, B:56:0x046b, B:57:0x0473, B:70:0x00ae, B:87:0x00e7, B:89:0x0379, B:96:0x0312, B:98:0x031a, B:108:0x0339, B:110:0x033d, B:115:0x051a, B:116:0x051e, B:118:0x032f, B:122:0x051f, B:123:0x0525), top: B:7:0x002b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a A[Catch: all -> 0x007a, TryCatch #6 {all -> 0x007a, blocks: (B:14:0x0064, B:27:0x048a, B:30:0x0491, B:32:0x049a, B:35:0x04a8, B:37:0x04da, B:38:0x04df, B:42:0x04b4, B:43:0x04b8, B:46:0x04b9, B:48:0x04cc, B:49:0x04d4, B:54:0x0458, B:56:0x046b, B:57:0x0473, B:70:0x00ae, B:87:0x00e7, B:89:0x0379, B:96:0x0312, B:98:0x031a, B:108:0x0339, B:110:0x033d, B:115:0x051a, B:116:0x051e, B:118:0x032f, B:122:0x051f, B:123:0x0525), top: B:7:0x002b, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r0v19, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x02a8 -> B:124:0x02ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0274 -> B:125:0x027c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(dev.epro.r0.K14749510448791472029 r39) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.t(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:17:0x012a, B:27:0x00f7, B:29:0x00fb, B:31:0x0108, B:34:0x0130, B:35:0x0133, B:47:0x00ed, B:52:0x0136, B:53:0x013a), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:17:0x012a, B:27:0x00f7, B:29:0x00fb, B:31:0x0108, B:34:0x0130, B:35:0x0133, B:47:0x00ed, B:52:0x0136, B:53:0x013a), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:15:0x003a, B:24:0x004c, B:37:0x005c, B:38:0x00a6, B:40:0x00aa, B:41:0x00b1, B:43:0x00c3, B:45:0x00c9, B:55:0x0088), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:15:0x003a, B:24:0x004c, B:37:0x005c, B:38:0x00a6, B:40:0x00aa, B:41:0x00b1, B:43:0x00c3, B:45:0x00c9, B:55:0x0088), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:17:0x012a, B:27:0x00f7, B:29:0x00fb, B:31:0x0108, B:34:0x0130, B:35:0x0133, B:47:0x00ed, B:52:0x0136, B:53:0x013a), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Type inference failed for: r0v15, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21, types: [ads_mobile_sdk.w81, dev.epro.r0.R8015591507171738907, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r2v14, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v15, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v17, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v3, types: [dev.epro.r0.R8015591507171738907, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.u(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0054, code lost:
    
        if (u(r0) == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #1 {all -> 0x009f, blocks: (B:13:0x0095, B:15:0x009b), top: B:12:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:27:0x0070, B:29:0x0074), top: B:26:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.b81
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.b81 r0 = (ads_mobile_sdk.b81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.b81 r0 = new ads_mobile_sdk.b81
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L49
            if (r1 == r5) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L95
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r6
        L3b:
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.w81 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L70
        L43:
            ads_mobile_sdk.w81 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L57
        L49:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r8
            r0.e = r5
            java.lang.Object r9 = r8.u(r0)
            if (r9 != r7) goto L57
            goto L93
        L57:
            ads_mobile_sdk.jr0 r9 = r8.i
            boolean r9 = r9.a0()
            if (r9 == 0) goto Lad
            dev.epro.r0.H15186625828076266306 r9 = r8.x
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r7) goto L6e
            goto L93
        L6e:
            r1 = r8
            r8 = r9
        L70:
            boolean r9 = r1.z     // Catch: java.lang.Throwable -> L7d
            if (r9 != 0) goto L7f
            boolean r9 = r1.d()     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto L7b
            goto L7f
        L7b:
            r5 = 0
            goto L7f
        L7d:
            r9 = move-exception
            goto La9
        L7f:
            r8.b(r6)
            if (r5 == 0) goto L85
            goto Lad
        L85:
            dev.epro.r0.H15186625828076266306 r8 = r1.x
            r0.a = r1
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r7) goto L94
        L93:
            return r7
        L94:
            r0 = r1
        L95:
            boolean r9 = r0.g()     // Catch: java.lang.Throwable -> L9f
            if (r9 == 0) goto La1
            r0.c()     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r9 = move-exception
            goto La5
        La1:
            r8.b(r6)
            return r2
        La5:
            r8.b(r6)
            throw r9
        La9:
            r8.b(r6)
            throw r9
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.v(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r7.f(r0) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        if (r8.c(r0) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:26:0x0055, B:28:0x005f), top: B:25:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v11, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r7v16, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.w81 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.c81
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.c81 r0 = (ads_mobile_sdk.c81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.c81 r0 = new ads_mobile_sdk.c81
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.a
            dev.epro.r0.R8015591507171738907 r7 = (dev.epro.r0.R8015591507171738907) r7
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6f
        L2f:
            r8 = move-exception
            goto L75
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L37:
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.w81 r1 = (ads_mobile_sdk.w81) r1
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r1
            goto L55
        L43:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.H15186625828076266306 r8 = r7.H
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r5) goto L55
            goto L6b
        L55:
            java.lang.ref.WeakReference r7 = r7.I     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.s91 r7 = (ads_mobile_sdk.s91) r7     // Catch: java.lang.Throwable -> L6c
            if (r7 == 0) goto L6e
            r0.a = r8     // Catch: java.lang.Throwable -> L6c
            r0.b = r4     // Catch: java.lang.Throwable -> L6c
            r0.e = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.f(r0)     // Catch: java.lang.Throwable -> L6c
            if (r7 != r5) goto L6e
        L6b:
            return r5
        L6c:
            r7 = move-exception
            goto L78
        L6e:
            r7 = r8
        L6f:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r7.b(r4)
            return r8
        L75:
            r6 = r8
            r8 = r7
            r7 = r6
        L78:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.d(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.z71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.z71 r0 = (ads_mobile_sdk.z71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.z71 r0 = new ads_mobile_sdk.z71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.x
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            boolean r4 = r4.d()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            r5.b(r3)
            return r4
        L52:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.c(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x0046, B:16:0x004e, B:17:0x0053), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.y71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.y71 r0 = (ads_mobile_sdk.y71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.y71 r0 = new ads_mobile_sdk.y71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.x
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.ba1 r4 = r4.y     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4e
            r5.b(r3)
            return r4
        L4e:
            java.lang.String r4 = "storedInspectorSettings"
            dev.epro.r0.S10823041268949770285.b0(r4)     // Catch: java.lang.Throwable -> L54
            throw r3     // Catch: java.lang.Throwable -> L54
        L54:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.b(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final String b() {
        if (!g()) {
            return "{}";
        }
        ba1 ba1Var = this.y;
        R4833348786910499294 r4833348786910499294 = null;
        if (ba1Var != null) {
            if (ba1Var.w() > 0) {
                ba1 ba1Var2 = this.y;
                if (ba1Var2 == null) {
                    S10823041268949770285.b0("storedInspectorSettings");
                    throw null;
                }
                long w = ba1Var2.w();
                this.j.getClass();
                if (w < System.currentTimeMillis() / 1000) {
                    R7033599853981556291.E(this.d, null, null, new S14769385926647291222((Object) this, r4833348786910499294, (byte) 11), 3);
                    return "{}";
                }
            }
            ba1 ba1Var3 = this.y;
            if (ba1Var3 == null) {
                S10823041268949770285.b0("storedInspectorSettings");
                throw null;
            }
            String v = ba1Var3.v();
            v.getClass();
            return v;
        }
        S10823041268949770285.b0("storedInspectorSettings");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.w81 r16, java.lang.String r17, dev.epro.r0.R4833348786910499294 r18) {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.t81
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.t81 r2 = (ads_mobile_sdk.t81) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            ads_mobile_sdk.t81 r2 = new ads_mobile_sdk.t81
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r13.d
            int r2 = r13.f
            r3 = 2
            r4 = 1
            r15 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r0 = r13.a
            r2 = r0
            dev.epro.r0.R8015591507171738907 r2 = (dev.epro.r0.R8015591507171738907) r2
            dev.epro.r0.E17665849472693074628.k(r1)     // Catch: java.lang.Throwable -> L36
            goto L81
        L36:
            r0 = move-exception
            goto L87
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r15
        L3e:
            dev.epro.r0.H15186625828076266306 r0 = r13.c
            java.lang.String r2 = r13.b
            java.lang.Object r4 = r13.a
            ads_mobile_sdk.w81 r4 = (ads_mobile_sdk.w81) r4
            dev.epro.r0.E17665849472693074628.k(r1)
            r11 = r2
            r2 = r0
            r0 = r4
            goto L66
        L4d:
            dev.epro.r0.E17665849472693074628.k(r1)
            dev.epro.r0.H15186625828076266306 r1 = r0.x
            r13.a = r0
            r2 = r17
            r13.b = r2
            r13.c = r1
            r13.f = r4
            java.lang.Object r4 = r1.c(r13)
            if (r4 != r5) goto L64
            r1 = r5
            goto L80
        L64:
            r11 = r2
            r2 = r1
        L66:
            r13.a = r2     // Catch: java.lang.Throwable -> L36
            r13.b = r15     // Catch: java.lang.Throwable -> L36
            r13.c = r15     // Catch: java.lang.Throwable -> L36
            r13.f = r3     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r4 = 0
            r1 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 383(0x17f, float:5.37E-43)
            r3 = r0
            java.lang.Object r0 = a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L36
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L36
            r2.b(r15)
            return r0
        L87:
            r2.b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.b(ads_mobile_sdk.w81, java.lang.String, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable a(ads_mobile_sdk.w81 r5, java.lang.String r6, java.lang.String r7, dev.epro.r0.I16631908410500040363 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.r71
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.r71 r0 = (ads_mobile_sdk.r71) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ads_mobile_sdk.r71 r0 = new ads_mobile_sdk.r71
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L38
            android.net.Uri$Builder r5 = r0.g
            java.lang.String r6 = r0.f
            android.net.Uri$Builder r7 = r0.e
            android.net.Uri$Builder r8 = r0.d
            dev.epro.r0.I16631908410500040363 r1 = r0.c
            java.lang.String r2 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r4 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r4
            goto L6f
        L38:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L3f:
            dev.epro.r0.E17665849472693074628.k(r9)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            r0.a = r5
            r0.b = r7
            r0.c = r8
            r0.d = r6
            r0.e = r6
            java.lang.String r9 = "linkedDeviceId"
            r0.f = r9
            r0.g = r6
            r0.j = r2
            r5.getClass()
            java.lang.Object r0 = b(r5, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L68
            return r1
        L68:
            r1 = r8
            r2 = r0
            r0 = r5
            r5 = r6
            r8 = r5
            r6 = r9
            r9 = r8
        L6f:
            ads_mobile_sdk.ba1 r2 = (ads_mobile_sdk.ba1) r2
            java.lang.String r2 = r2.q()
            r5.appendQueryParameter(r6, r2)
            if (r7 == 0) goto L7f
            java.lang.String r5 = "adSlotPath"
            r8.appendQueryParameter(r5, r7)
        L7f:
            java.lang.String r5 = r0.e
            java.lang.String r6 = "afmaVersion"
            r8.appendQueryParameter(r6, r5)
            if (r1 == 0) goto L91
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "debugData"
            r8.appendQueryParameter(r6, r5)
        L91:
            android.net.Uri r5 = r9.build()
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.String, java.lang.String, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Comparable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x03c9, code lost:
    
        if (a(r5, r4, r7) != r8) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c6 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #12 {all -> 0x00b8, blocks: (B:101:0x00b3, B:102:0x0256, B:106:0x00c9, B:109:0x023d, B:114:0x00da, B:116:0x01c0, B:118:0x01c6, B:121:0x01d3, B:136:0x021b, B:145:0x025f, B:123:0x01dc, B:125:0x01e0, B:127:0x01eb, B:130:0x01f8, B:134:0x020a), top: B:7:0x0039, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d3 A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x00b8, blocks: (B:101:0x00b3, B:102:0x0256, B:106:0x00c9, B:109:0x023d, B:114:0x00da, B:116:0x01c0, B:118:0x01c6, B:121:0x01d3, B:136:0x021b, B:145:0x025f, B:123:0x01dc, B:125:0x01e0, B:127:0x01eb, B:130:0x01f8, B:134:0x020a), top: B:7:0x0039, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0281 A[Catch: all -> 0x028d, TryCatch #7 {all -> 0x028d, blocks: (B:158:0x027a, B:160:0x0281, B:162:0x0285, B:164:0x0289, B:165:0x0290, B:167:0x0294, B:169:0x0298, B:171:0x029c, B:172:0x029d, B:173:0x02a2, B:174:0x02a3, B:175:0x02aa, B:176:0x02ab, B:177:0x02b2, B:178:0x02b3), top: B:157:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b3 A[Catch: all -> 0x028d, TRY_LEAVE, TryCatch #7 {all -> 0x028d, blocks: (B:158:0x027a, B:160:0x0281, B:162:0x0285, B:164:0x0289, B:165:0x0290, B:167:0x0294, B:169:0x0298, B:171:0x029c, B:172:0x029d, B:173:0x02a2, B:174:0x02a3, B:175:0x02aa, B:176:0x02ab, B:177:0x02b2, B:178:0x02b3), top: B:157:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x033d A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #9 {all -> 0x0051, blocks: (B:13:0x004c, B:14:0x03cc, B:18:0x0062, B:21:0x03b3, B:26:0x0073, B:28:0x0337, B:30:0x033d, B:33:0x034a, B:48:0x0390, B:58:0x03d5, B:35:0x0353, B:37:0x0357, B:39:0x0362, B:42:0x036d, B:46:0x037f), top: B:7:0x0039, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x034a A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0051, blocks: (B:13:0x004c, B:14:0x03cc, B:18:0x0062, B:21:0x03b3, B:26:0x0073, B:28:0x0337, B:30:0x033d, B:33:0x034a, B:48:0x0390, B:58:0x03d5, B:35:0x0353, B:37:0x0357, B:39:0x0362, B:42:0x036d, B:46:0x037f), top: B:7:0x0039, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f7 A[Catch: all -> 0x0403, TryCatch #1 {all -> 0x0403, blocks: (B:71:0x03f0, B:73:0x03f7, B:75:0x03fb, B:77:0x03ff, B:78:0x0406, B:80:0x040a, B:82:0x040e, B:84:0x0412, B:85:0x0413, B:86:0x0418, B:87:0x0419, B:88:0x0420, B:89:0x0421, B:90:0x0428, B:91:0x0429), top: B:70:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0429 A[Catch: all -> 0x0403, TRY_LEAVE, TryCatch #1 {all -> 0x0403, blocks: (B:71:0x03f0, B:73:0x03f7, B:75:0x03fb, B:77:0x03ff, B:78:0x0406, B:80:0x040a, B:82:0x040e, B:84:0x0412, B:85:0x0413, B:86:0x0418, B:87:0x0419, B:88:0x0420, B:89:0x0421, B:90:0x0428, B:91:0x0429), top: B:70:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r2v0, types: [dev.epro.r0.I16631908410500040363] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v17, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v27, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r22, java.lang.String r23, dev.epro.r0.I16631908410500040363 r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.String, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.t71
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.t71 r0 = (ads_mobile_sdk.t71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.t71 r0 = new ads_mobile_sdk.t71
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.x
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            boolean r4 = r4.g()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            r5.b(r3)
            return r4
        L52:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x007c, blocks: (B:11:0x004e, B:14:0x0073, B:18:0x007e, B:20:0x0086, B:21:0x008e), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #0 {all -> 0x007c, blocks: (B:11:0x004e, B:14:0x0073, B:18:0x007e, B:20:0x0086, B:21:0x008e), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, ads_mobile_sdk.b71 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.q71
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.q71 r0 = (ads_mobile_sdk.q71) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.q71 r0 = new ads_mobile_sdk.q71
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            dev.epro.r0.H15186625828076266306 r7 = r0.d
            ads_mobile_sdk.b71 r9 = r0.c
            java.lang.String r8 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r7
            r7 = r0
            goto L4e
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r3
        L36:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r7
            r0.b = r8
            r0.c = r9
            dev.epro.r0.H15186625828076266306 r10 = r7.D
            r0.d = r10
            r0.g = r2
            java.lang.Object r0 = r10.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.LinkedHashMap r0 = r7.F     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap r1 = r7.G     // Catch: java.lang.Throwable -> L7c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7c
            ads_mobile_sdk.jr0 r2 = r7.i     // Catch: java.lang.Throwable -> L7c
            r2.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "gads:inspector:max_ad_life_cycles"
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L7c
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$18     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r2.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L7c
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7c
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            if (r0 < r2) goto L7e
            java.lang.String r7 = "Maximum number of stored ad requests reached. Dropping the current request."
            ads_mobile_sdk.xv.c(r7, r3)     // Catch: java.lang.Throwable -> L7c
            r10.b(r3)
            return r4
        L7c:
            r7 = move-exception
            goto L9c
        L7e:
            java.lang.Object r0 = r1.get(r8)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L8e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> L7c
        L8e:
            r0.add(r9)     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap r7 = r7.F     // Catch: java.lang.Throwable -> L7c
            java.lang.String r8 = r9.d     // Catch: java.lang.Throwable -> L7c
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L7c
            r10.b(r3)
            return r4
        L9c:
            r10.b(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(java.lang.String, ads_mobile_sdk.b71, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r16, java.lang.String r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.o81
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.o81 r2 = (ads_mobile_sdk.o81) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            ads_mobile_sdk.o81 r2 = new ads_mobile_sdk.o81
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r13.d
            int r2 = r13.f
            r3 = 2
            r4 = 1
            r15 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r0 = r13.a
            r2 = r0
            dev.epro.r0.R8015591507171738907 r2 = (dev.epro.r0.R8015591507171738907) r2
            dev.epro.r0.E17665849472693074628.k(r1)     // Catch: java.lang.Throwable -> L36
            goto L81
        L36:
            r0 = move-exception
            goto L87
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r15
        L3e:
            dev.epro.r0.H15186625828076266306 r0 = r13.c
            java.lang.String r2 = r13.b
            java.lang.Object r4 = r13.a
            ads_mobile_sdk.w81 r4 = (ads_mobile_sdk.w81) r4
            dev.epro.r0.E17665849472693074628.k(r1)
            r10 = r2
            r2 = r0
            r0 = r4
            goto L66
        L4d:
            dev.epro.r0.E17665849472693074628.k(r1)
            dev.epro.r0.H15186625828076266306 r1 = r0.x
            r13.a = r0
            r2 = r17
            r13.b = r2
            r13.c = r1
            r13.f = r4
            java.lang.Object r4 = r1.c(r13)
            if (r4 != r5) goto L64
            r1 = r5
            goto L80
        L64:
            r10 = r2
            r2 = r1
        L66:
            r13.a = r2     // Catch: java.lang.Throwable -> L36
            r13.b = r15     // Catch: java.lang.Throwable -> L36
            r13.c = r15     // Catch: java.lang.Throwable -> L36
            r13.f = r3     // Catch: java.lang.Throwable -> L36
            r6 = 0
            r4 = 0
            r1 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 447(0x1bf, float:6.26E-43)
            r3 = r0
            java.lang.Object r0 = a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L36
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L36
            r2.b(r15)
            return r0
        L87:
            r2.b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #0 {all -> 0x00d5, blocks: (B:15:0x00a8, B:20:0x00b2, B:22:0x00b8, B:37:0x00a0, B:42:0x00dc, B:43:0x00e1), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0035, B:29:0x0079, B:31:0x007d, B:35:0x0087), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /* JADX WARN: Type inference failed for: r0v10, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v9, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r17, int r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:16:0x00be, B:21:0x00c8, B:24:0x00ce, B:26:0x00d6, B:29:0x00dc, B:31:0x00e2, B:33:0x00e6, B:36:0x00ee, B:37:0x00f1, B:38:0x00f2, B:39:0x00f5, B:40:0x00f6, B:42:0x00fc), top: B:15:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r2v11, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r17, boolean r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:31:0x0067, B:46:0x006e, B:34:0x007b, B:36:0x007f, B:38:0x0085, B:43:0x00ba, B:44:0x00bf), top: B:30:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #1 {all -> 0x0077, blocks: (B:31:0x0067, B:46:0x006e, B:34:0x007b, B:36:0x007f, B:38:0x0085, B:43:0x00ba, B:44:0x00bf), top: B:30:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r16, dev.epro.r0.I16631908410500040363 r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:11:0x004a, B:13:0x006c, B:17:0x0074), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:11:0x004a, B:13:0x006c, B:17:0x0074), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.u81
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.u81 r0 = (ads_mobile_sdk.u81) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.u81 r0 = new ads_mobile_sdk.u81
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            int r9 = r0.c
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.w81 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r8
            r8 = r0
            goto L4a
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r8
            dev.epro.r0.H15186625828076266306 r10 = r8.D
            r0.b = r10
            r0.c = r9
            r0.f = r2
            java.lang.Object r0 = r10.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            long r0 = r8.E     // Catch: java.lang.Throwable -> L72
            long r4 = (long) r9     // Catch: java.lang.Throwable -> L72
            long r0 = r0 + r4
            ads_mobile_sdk.jr0 r9 = r8.i     // Catch: java.lang.Throwable -> L72
            r9.getClass()     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "gads:inspector:max_ad_response_logs_bytes"
            r6 = 20971520(0x1400000, double:1.03613076E-316)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L72
            ads_mobile_sdk.ao r7 = ads_mobile_sdk.ao.a$26     // Catch: java.lang.Throwable -> L72
            java.lang.Object r9 = r9.a(r2, r6, r7)     // Catch: java.lang.Throwable -> L72
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L72
            long r6 = r9.longValue()     // Catch: java.lang.Throwable -> L72
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 < 0) goto L74
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L72
            r10.b(r3)
            return r8
        L72:
            r8 = move-exception
            goto L7f
        L74:
            long r0 = r8.E     // Catch: java.lang.Throwable -> L72
            long r0 = r0 + r4
            r8.E = r0     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L72
            r10.b(r3)
            return r8
        L7f:
            r10.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void a(int i) {
        Sensor defaultSensor;
        int A = L11610354117192841236.A(i);
        if (A != 1) {
            if (A != 2) {
                return;
            }
            nr0 nr0Var = (nr0) this.g.get();
            synchronized (nr0Var) {
                try {
                    jr0 jr0Var = nr0Var.b;
                    jr0Var.getClass();
                    if (((Boolean) jr0Var.a("gads:inspector:flick_enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
                        SensorManager sensorManager = (SensorManager) nr0Var.a.getSystemService(SensorManager.class);
                        defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(4) : null;
                        if (!nr0Var.n && sensorManager != null && defaultSensor != null) {
                            nr0Var.e = sensorManager;
                            nr0Var.f = defaultSensor;
                            jr0 jr0Var2 = nr0Var.b;
                            jr0Var2.getClass();
                            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                            sensorManager.registerListener(nr0Var, defaultSensor, 3, ((int) E17093345031926825464.k(((E17093345031926825464) jr0Var2.a("gads:inspector:flick_reset_time_ms", new E17093345031926825464(M9216324016624295870.Z(3000, N13798149404328803870.MILLISECONDS)), ao.a)).a, N13798149404328803870.MICROSECONDS)) / 100);
                            nr0Var.n = true;
                        }
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        b43 b43Var = (b43) this.f.get();
        synchronized (b43Var) {
            try {
                jr0 jr0Var3 = b43Var.b;
                jr0Var3.getClass();
                if (((Boolean) jr0Var3.a("gads:inspector:shake_enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
                    SensorManager sensorManager2 = (SensorManager) b43Var.a.getSystemService(SensorManager.class);
                    defaultSensor = sensorManager2 != null ? sensorManager2.getDefaultSensor(1) : null;
                    if (!b43Var.j && sensorManager2 != null && defaultSensor != null) {
                        b43Var.e = sensorManager2;
                        b43Var.f = defaultSensor;
                        jr0 jr0Var4 = b43Var.b;
                        jr0Var4.getClass();
                        E17149812035295265804 e171498120352952658042 = E17093345031926825464.b;
                        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
                        E17093345031926825464 e17093345031926825464 = new E17093345031926825464(M9216324016624295870.Z(500, n13798149404328803870));
                        ao aoVar = ao.a;
                        sensorManager2.registerListener(b43Var, defaultSensor, 3, ((int) E17093345031926825464.k(((E17093345031926825464) jr0Var4.a("gads:inspector:shake_interval", e17093345031926825464, aoVar)).a, N13798149404328803870.MICROSECONDS)) / 10);
                        b43Var.c.getClass();
                        long a0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), n13798149404328803870);
                        jr0 jr0Var5 = b43Var.b;
                        jr0Var5.getClass();
                        b43Var.g = E17093345031926825464.g(a0, ((E17093345031926825464) jr0Var5.a("gads:inspector:shake_interval", new E17093345031926825464(M9216324016624295870.Z(500, n13798149404328803870)), aoVar)).a);
                        b43Var.j = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Object a(w81 w81Var, Boolean bool, Boolean bool2, int i, String str, Long l, String str2, String str3, String str4, Boolean bool3, K14749510448791472029 k14749510448791472029, int i2) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            l = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            str3 = null;
        }
        if ((i2 & 128) != 0) {
            str4 = null;
        }
        if ((i2 & 256) != 0) {
            bool3 = null;
        }
        w81Var.getClass();
        return a(w81Var, bool, bool2, i, str, l, str2, str3, str4, bool3, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w81 r8, java.lang.Boolean r9, java.lang.Boolean r10, int r11, java.lang.String r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Boolean r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w81.a(ads_mobile_sdk.w81, java.lang.Boolean, java.lang.Boolean, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
