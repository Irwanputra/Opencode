package dev.epro.r0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G17662402151818006683 extends R4239627874707364917 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f251o = 0;
    public final /* synthetic */ L9687083612725928934 p;
    public final Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G17662402151818006683(L9687083612725928934 l9687083612725928934, Context context) {
        super(l9687083612725928934);
        this.p = l9687083612725928934;
        this.q = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // dev.epro.r0.R4239627874707364917
    public final IntentFilter h() {
        switch (this.f251o) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // dev.epro.r0.R4239627874707364917
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G17662402151818006683.j():int");
    }

    @Override // dev.epro.r0.R4239627874707364917
    public final void n() {
        byte b = this.f251o;
        L9687083612725928934 l9687083612725928934 = this.p;
        switch (b) {
            case 0:
                l9687083612725928934.k(true, true);
                break;
            default:
                l9687083612725928934.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G17662402151818006683(L9687083612725928934 l9687083612725928934, I1632105416032993715 i1632105416032993715) {
        super(l9687083612725928934);
        this.p = l9687083612725928934;
        this.q = i1632105416032993715;
    }
}
