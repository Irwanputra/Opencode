package dev.epro.r0;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F4137010166961084814 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ K1755082528704418605 A;
    public H15186625828076266306 t;
    public K1755082528704418605 u;
    public long v;
    public byte w;
    public /* synthetic */ Object x;
    public final /* synthetic */ CharSequence y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4137010166961084814(long j, R4833348786910499294 r4833348786910499294, K1755082528704418605 k1755082528704418605, CharSequence charSequence) {
        super(2, r4833348786910499294);
        this.y = charSequence;
        this.z = j;
        this.A = k1755082528704418605;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        F4137010166961084814 f4137010166961084814 = new F4137010166961084814(this.z, r4833348786910499294, this.A, this.y);
        f4137010166961084814.x = obj;
        return f4137010166961084814;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((F4137010166961084814) create((R4833348786910499294) obj2, T15589241373902147015.h(obj))).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        long j;
        TextClassification textClassification;
        TextClassification textClassification2;
        D6481647950163785171 d6481647950163785171;
        K1755082528704418605 k1755082528704418605;
        H15186625828076266306 h15186625828076266306;
        byte b = this.w;
        if (b == 0) {
            E17665849472693074628.k(obj);
            TextClassifier textClassifier = (TextClassifier) this.x;
            long j2 = this.z;
            int g = F12478849263529740365.g(j2);
            int f = F12478849263529740365.f(j2);
            CharSequence charSequence = this.y;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, g, f);
            K1755082528704418605 k17550825287044186052 = this.A;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(k17550825287044186052.c());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long d = T1335862270807194835.d(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (i >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    textClassification2 = suggestSelection.getTextClassification();
                    textClassification2.getClass();
                    D6481647950163785171 b2 = k17550825287044186052.b(charSequence, d, textClassification2);
                    H15186625828076266306 h151866258280762663062 = k17550825287044186052.e;
                    this.x = b2;
                    this.t = h151866258280762663062;
                    this.u = k17550825287044186052;
                    this.v = d;
                    this.w = (byte) 1;
                    if (h151866258280762663062.c(this) != z3437138737604933638) {
                        d6481647950163785171 = b2;
                        k1755082528704418605 = k17550825287044186052;
                        h15186625828076266306 = h151866258280762663062;
                        j = d;
                        k1755082528704418605.g.setValue(d6481647950163785171);
                    }
                    return z3437138737604933638;
                }
            }
            this.v = d;
            this.w = (byte) 2;
            if (k17550825287044186052.a(this.y, d, textClassifier, this) != z3437138737604933638) {
                j = d;
            }
            return z3437138737604933638;
        }
        if (b == 1) {
            j = this.v;
            k1755082528704418605 = this.u;
            h15186625828076266306 = this.t;
            d6481647950163785171 = (D6481647950163785171) this.x;
            E17665849472693074628.k(obj);
            try {
                k1755082528704418605.g.setValue(d6481647950163785171);
            } finally {
                h15186625828076266306.b(null);
            }
        } else {
            if (b != 2) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.v;
            E17665849472693074628.k(obj);
        }
        return new F12478849263529740365(j);
    }
}
