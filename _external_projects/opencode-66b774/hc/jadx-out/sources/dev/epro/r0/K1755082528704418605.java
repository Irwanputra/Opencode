package dev.epro.r0;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, dev.epro.r0.K14749510448791472029 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K1755082528704418605.a(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final D6481647950163785171 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction remoteActionC = M13159286552657112763.c(obj);
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteActionC.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteActionC2 = M13159286552657112763.c(obj);
            if (remoteActionC2 != null && (icon = remoteActionC2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new D6481647950163785171(charSequence, j, textClassification, arrayList);
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
