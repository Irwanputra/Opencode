package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface zzva extends IInterface {
    void destroy();

    Bundle getInterstitialAdapterInfo();

    zzll getVideoController();

    InterfaceC2455 getView();

    boolean isInitialized();

    void pause();

    void resume();

    void setImmersiveMode(boolean z);

    void showInterstitial();

    void showVideo();

    void zza(zzjj zzjjVar, String str, String str2);

    void zza(InterfaceC2455 interfaceC2455, zzaem zzaemVar, List<String> list);

    void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzaem zzaemVar, String str2);

    void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzvd zzvdVar);

    void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar);

    void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar, zzpe zzpeVar, List<String> list);

    void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, zzvd zzvdVar);

    void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, String str2, zzvd zzvdVar);

    void zzc(zzjj zzjjVar, String str);

    void zzg(InterfaceC2455 interfaceC2455);

    zzvj zzme();

    zzvm zzmf();

    Bundle zzmg();

    Bundle zzmh();

    boolean zzmi();

    zzqm zzmj();
}
