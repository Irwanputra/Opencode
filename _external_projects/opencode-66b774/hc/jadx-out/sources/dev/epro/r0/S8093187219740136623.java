package dev.epro.r0;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S8093187219740136623 {
    public final P8755783434649014957 a;
    public final String b;
    public final M17133811648581684718 c;
    public final O12545633033254628644 d;
    public final K12238100791927223227 e;

    public S8093187219740136623(Context context, P8755783434649014957 p8755783434649014957, O12545633033254628644 o12545633033254628644) {
        M17133811648581684718 m17133811648581684718 = new M17133811648581684718();
        this.c = m17133811648581684718;
        this.b = context.getPackageName();
        this.a = p8755783434649014957;
        this.d = o12545633033254628644;
        K12238100791927223227 k12238100791927223227 = new K12238100791927223227(context, p8755783434649014957, Q5261744017529230279.a, new O12545633033254628644((byte) 8));
        this.e = k12238100791927223227;
        k12238100791927223227.a().post(new J17313542139155020164(this, m17133811648581684718, context));
    }

    public static Bundle a(S8093187219740136623 s8093187219740136623, F2666344450883603512 f2666344450883603512, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", s8093187219740136623.b);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", f2666344450883603512.a);
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(f2666344450883603512.b));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new P8563912062511171325(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(E15826830759497041750.g(arrayList)));
        return bundle;
    }

    public static Bundle b(S8093187219740136623 s8093187219740136623, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", s8093187219740136623.b);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new P8563912062511171325(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(E15826830759497041750.g(arrayList)));
        return bundle;
    }

    public static boolean c(S8093187219740136623 s8093187219740136623) {
        M17133811648581684718 m17133811648581684718 = s8093187219740136623.c;
        return m17133811648581684718.a.d() && ((Integer) m17133811648581684718.a.c()).intValue() < 83420000;
    }

    public static boolean d(S8093187219740136623 s8093187219740136623) {
        M17133811648581684718 m17133811648581684718 = s8093187219740136623.c;
        return m17133811648581684718.a.d() && ((Integer) m17133811648581684718.a.c()).intValue() == 0;
    }
}
