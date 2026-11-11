package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface zzqi extends IInterface {
    void destroy();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Bundle getExtras();

    String getHeadline();

    List getImages();

    String getMediationAdapterClassName();

    zzll getVideoController();

    void performClick(Bundle bundle);

    boolean recordImpression(Bundle bundle);

    void reportTouchEvent(Bundle bundle);

    InterfaceC2455 zzjt();

    InterfaceC2455 zzjx();

    zzpm zzjy();

    zzpq zzjz();
}
