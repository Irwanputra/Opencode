package dev.epro.r0;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K1755082528704418605 implements S16869475527240117894 {
    public final G8001132634698687269 a;
    public final Context b;
    public final L14432282451889478852 c;
    public final A5535629440393075509 d;
    public TextClassifier f;
    public final H15186625828076266306 e = new H15186625828076266306();
    public final V697849047308847220 g = V4416135141588678913.t(null);
    public final Object h = new Object();

    public K1755082528704418605(G8001132634698687269 g8001132634698687269, Context context, L14432282451889478852 l14432282451889478852, A5535629440393075509 a5535629440393075509) {
        this.a = g8001132634698687269;
        this.b = context;
        this.c = l14432282451889478852;
        this.d = a5535629440393075509;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r6v3, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, dev.epro.r0.K14749510448791472029 r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K1755082528704418605.a(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r2 = r2.getIcon();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.D6481647950163785171 b(java.lang.CharSequence r8, long r9, android.view.textclassifier.TextClassification r11) {
        /*
            r7 = this;
            java.util.List r0 = dev.epro.r0.U14881866531452519068.k(r11)
            int r0 = r0.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            r1 = 0
        Le:
            if (r1 >= r0) goto L3f
            java.util.List r2 = dev.epro.r0.U14881866531452519068.k(r11)
            java.lang.Object r2 = r2.get(r1)
            android.app.RemoteAction r3 = dev.epro.r0.M13159286552657112763.c(r2)
            r4 = 0
            if (r1 == 0) goto L27
            boolean r3 = dev.epro.r0.V5057341886547923963.p(r3)
            if (r3 == 0) goto L26
            goto L27
        L26:
            r2 = r4
        L27:
            android.app.RemoteAction r2 = dev.epro.r0.M13159286552657112763.c(r2)
            if (r2 == 0) goto L39
            android.graphics.drawable.Icon r2 = dev.epro.r0.T15589241373902147015.e(r2)
            if (r2 == 0) goto L39
            android.content.Context r3 = r7.b
            android.graphics.drawable.Drawable r4 = r2.loadDrawable(r3)
        L39:
            r6.add(r4)
            int r1 = r1 + 1
            goto Le
        L3f:
            dev.epro.r0.D6481647950163785171 r1 = new dev.epro.r0.D6481647950163785171
            r2 = r8
            r3 = r9
            r5 = r11
            r1.<init>(r2, r3, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K1755082528704418605.b(java.lang.CharSequence, long, android.view.textclassifier.TextClassification):dev.epro.r0.D6481647950163785171");
    }

    public final LocaleList c() {
        A5535629440393075509 a5535629440393075509 = this.d;
        if (a5535629440393075509 == null) {
            return new LocaleList(((L6737218101458117862) V18101782208991304884.a.B().a.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(a5535629440393075509, 10));
        Iterator it = a5535629440393075509.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((L6737218101458117862) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object d(CharSequence charSequence, long j, R14062301455140331524 r14062301455140331524) {
        if (charSequence.length() == 0 || F12478849263529740365.d(j)) {
            return O9245300239821758723.a;
        }
        return R7033599853981556291.d0(this.a, new J13979756969328643311(this, new O11111548397065333129(j, (R4833348786910499294) null, this, charSequence), null, (byte) 8), r14062301455140331524);
    }

    public final Object e(CharSequence charSequence, long j, R14062301455140331524 r14062301455140331524) {
        R4833348786910499294 r4833348786910499294 = null;
        if (charSequence.length() == 0 || F12478849263529740365.d(j)) {
            return null;
        }
        return R7033599853981556291.d0(this.a, new J13979756969328643311(this, new F4137010166961084814(j, null, this, charSequence), r4833348786910499294, (byte) 8), r14062301455140331524);
    }
}
