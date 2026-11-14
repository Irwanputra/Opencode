package dev.epro.r0;

import ads_mobile_sdk.f7;
import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T2935108450471281937 implements R3171298526896875739 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f7 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ T2935108450471281937(f7 f7Var, Context context, String str, View view, Activity activity, byte b) {
        this.a = b;
        this.b = f7Var;
        this.c = context;
        this.d = str;
        this.e = view;
        this.f = activity;
    }

    @Override // dev.epro.r0.R3171298526896875739
    public final D16915945238461757356 apply(Object obj) {
        byte b = this.a;
        Activity activity = this.f;
        View view = this.e;
        String str = this.d;
        Context context = this.c;
        f7 f7Var = this.b;
        switch (b) {
            case 0:
                return ((K17751841687800543607) f7Var.b.f.get()).a(context, str, view, activity);
            default:
                return ((K17751841687800543607) f7Var.b.f.get()).b(context, str, view, activity);
        }
    }
}
