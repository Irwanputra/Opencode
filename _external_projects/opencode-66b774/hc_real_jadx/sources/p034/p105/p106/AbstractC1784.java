package p034.p105.p106;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1784<E> extends AbstractC1812 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Activity f8024;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Context f8025;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f8026;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final LayoutInflaterFactory2C1815 f8027;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Handler f8028;

    public AbstractC1784(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f8027 = new LayoutInflaterFactory2C1815();
        this.f8024 = fragmentActivity;
        C2786.m4836(fragmentActivity, "context == null");
        this.f8025 = fragmentActivity;
        C2786.m4836(handler, "handler == null");
        this.f8028 = handler;
        this.f8026 = 0;
    }

    /* renamed from: 〳ぜぞぜべっ */
    public abstract E mo539();

    /* renamed from: ぁごぐすすぃ */
    public abstract void mo541(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: いいにぽつ */
    public abstract int mo542();

    /* renamed from: ぇぬぎばつ */
    public abstract void mo543();

    /* renamed from: おぐぴう〸ず */
    public abstract void mo544(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle);

    /* renamed from: てぜきぽく */
    public abstract void mo546(Fragment fragment, String[] strArr, int i);

    /* renamed from: のぷのちつ */
    public abstract boolean mo547(Fragment fragment);

    /* renamed from: びぐびあび */
    public abstract void mo548(Fragment fragment);

    /* renamed from: へぬ〴づぞ */
    public abstract boolean mo549(String str);

    /* renamed from: ぺぁあねじ */
    public abstract LayoutInflater mo550();

    /* renamed from: ぺふねづ〺 */
    public abstract boolean mo551();
}
