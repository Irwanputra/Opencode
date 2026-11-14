package dev.epro.r0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F6872943321507891134 {
    public static final X354568553596380848 a = new X354568553596380848(new H475444086652660118((byte) 1), (byte) 1);
    public static final G15535714851655169452 b = new G15535714851655169452((byte) 2);

    public static final void a(Y8564331055586212282 y8564331055586212282, Context context, boolean z, CharSequence charSequence, F12478849263529740365 f12478849263529740365, S16869475527240117894 s16869475527240117894, F4096073349764486348 f4096073349764486348) {
        if (Build.VERSION.SDK_INT < 28 || charSequence == null || f12478849263529740365 == null || s16869475527240117894 == null || !(s16869475527240117894 instanceof K1755082528704418605)) {
            f4096073349764486348.invoke(y8564331055586212282);
            if (charSequence == null || f12478849263529740365 == null) {
                return;
            }
            U16229988784104357932.t(y8564331055586212282, context, z, charSequence, f12478849263529740365.a);
            return;
        }
        K1755082528704418605 k1755082528704418605 = (K1755082528704418605) s16869475527240117894;
        long j = f12478849263529740365.a;
        Object obj = k1755082528704418605.h;
        H15186625828076266306 h15186625828076266306 = k1755082528704418605.e;
        D6481647950163785171 d6481647950163785171 = null;
        if (h15186625828076266306.g()) {
            D6481647950163785171 d64816479501637851712 = (D6481647950163785171) k1755082528704418605.g.getValue();
            if (d64816479501637851712 == null || !F12478849263529740365.c(j, d64816479501637851712.b) || !S10823041268949770285.t(charSequence, d64816479501637851712.a)) {
                d64816479501637851712 = null;
            }
            h15186625828076266306.b(null);
            d6481647950163785171 = d64816479501637851712;
        }
        if (d6481647950163785171 == null) {
            f4096073349764486348.invoke(y8564331055586212282);
        } else {
            ArrayList arrayList = d6481647950163785171.d;
            TextClassification textClassification = d6481647950163785171.c;
            if (!textClassification.getActions().isEmpty()) {
                y8564331055586212282.a.a(new L1522958525456855662(obj, textClassification, 0, (Drawable) arrayList.get(0)));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                y8564331055586212282.a.a(new L1522958525456855662(obj, textClassification, -1, textClassification.getIcon()));
            }
            f4096073349764486348.invoke(y8564331055586212282);
            List actions = textClassification.getActions();
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                T15589241373902147015.v(actions.get(i));
                if (i > 0) {
                    y8564331055586212282.a.a(new L1522958525456855662(obj, textClassification, i, (Drawable) arrayList.get(i)));
                }
            }
        }
        U16229988784104357932.t(y8564331055586212282, context, z, charSequence, f12478849263529740365.a);
    }

    public static final S16869475527240117894 b(L14432282451889478852 l14432282451889478852, A5535629440393075509 a5535629440393075509, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.a0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            m3727281027331139839.q(false);
            return null;
        }
        Context context = (Context) m3727281027331139839.j(T15795698139970521497.b);
        G8001132634698687269 g8001132634698687269 = (G8001132634698687269) m3727281027331139839.j(a);
        boolean zF = ((((i & 112) ^ 48) > 32 && m3727281027331139839.f(a5535629440393075509)) || (i & 48) == 32) | m3727281027331139839.f(g8001132634698687269) | m3727281027331139839.f(context);
        Object objM = m3727281027331139839.M();
        if (zF || objM == O9023047933786425027.a) {
            b.getClass();
            objM = new K1755082528704418605(g8001132634698687269, context, l14432282451889478852, a5535629440393075509);
            m3727281027331139839.k0(objM);
        }
        S16869475527240117894 s16869475527240117894 = (S16869475527240117894) objM;
        m3727281027331139839.q(false);
        return s16869475527240117894;
    }
}
