package ads_mobile_sdk;

import android.app.AlertDialog;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class af0 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ AlertDialog.Builder a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(AlertDialog.Builder builder, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = builder;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                return new af0(builder, r4833348786910499294, (byte) 0);
            case 1:
                return new af0(builder, r4833348786910499294, (byte) 1);
            case 2:
                return new af0(builder, r4833348786910499294, (byte) 2);
            default:
                return new af0(builder, r4833348786910499294, (byte) 3);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                new af0(builder, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new af0(builder, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                new af0(builder, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
            default:
                new af0(builder, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                builder.create().show();
                break;
            case 1:
                E17665849472693074628.k(obj);
                builder.create().show();
                break;
            case 2:
                E17665849472693074628.k(obj);
                builder.create().show();
                break;
            default:
                E17665849472693074628.k(obj);
                builder.create().show();
                break;
        }
        return o9245300239821758723;
    }
}
