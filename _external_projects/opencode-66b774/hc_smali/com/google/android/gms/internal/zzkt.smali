.class public abstract Lcom/google/android/gms/internal/zzkt;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzks;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static zzf(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzks;
    .registers 3

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzks;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzks;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzku;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzku;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzev;->zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    const/4 v0, 0x1

    if-eqz p4, :cond_8

    return v0

    :cond_8
    const/4 p4, 0x0

    packed-switch p1, :pswitch_data_17e

    :pswitch_c
    const/4 p1, 0x0

    return p1

    :pswitch_e
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->zzcp()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_c3

    :pswitch_14
    invoke-static {p2}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;)Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->setImmersiveMode(Z)V

    goto/16 :goto_16f

    :pswitch_1d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->zzce()Lcom/google/android/gms/internal/zzkh;

    move-result-object p1

    goto/16 :goto_177

    :pswitch_23
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->zzcd()Lcom/google/android/gms/internal/zzkx;

    move-result-object p1

    goto/16 :goto_177

    :pswitch_29
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->getAdUnitId()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_c3

    :pswitch_2f
    sget-object p1, Lcom/google/android/gms/internal/zzlr;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzlr;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzlr;)V

    goto/16 :goto_16f

    :pswitch_3c
    sget-object p1, Lcom/google/android/gms/internal/zzmr;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzmr;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzmr;)V

    goto/16 :goto_16f

    :pswitch_49
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->getVideoController()Lcom/google/android/gms/internal/zzll;

    move-result-object p1

    goto/16 :goto_177

    :pswitch_4f
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->setUserId(Ljava/lang/String;)V

    goto/16 :goto_16f

    :pswitch_58
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzadq;->zzaa(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzadp;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzadp;)V

    goto/16 :goto_16f

    :pswitch_65
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->isLoading()Z

    move-result p1

    goto/16 :goto_165

    :pswitch_6b
    invoke-static {p2}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;)Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->setManualImpressionsEnabled(Z)V

    goto/16 :goto_16f

    :pswitch_74
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_7b

    goto :goto_8e

    :cond_7b
    const-string p2, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzld;

    if-eqz p4, :cond_89

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/zzld;

    goto :goto_8e

    :cond_89
    new-instance p4, Lcom/google/android/gms/internal/zzlf;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/zzlf;-><init>(Landroid/os/IBinder;)V

    :goto_8e
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzld;)V

    goto/16 :goto_16f

    :pswitch_93
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_9a

    goto :goto_ad

    :cond_9a
    const-string p2, "com.google.android.gms.ads.internal.client.IAdClickListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzke;

    if-eqz p4, :cond_a8

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/zzke;

    goto :goto_ad

    :cond_a8
    new-instance p4, Lcom/google/android/gms/internal/zzkg;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/zzkg;-><init>(Landroid/os/IBinder;)V

    :goto_ad
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzke;)V

    goto/16 :goto_16f

    :pswitch_b2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzob;->zzi(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzoa;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzoa;)V

    goto/16 :goto_16f

    :pswitch_bf
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object p1

    :goto_c3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto/16 :goto_17d

    :pswitch_cb
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzxs;->zzy(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzxr;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzxr;Ljava/lang/String;)V

    goto/16 :goto_16f

    :pswitch_dc
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzxm;->zzw(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzxl;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzxl;)V

    goto/16 :goto_16f

    :pswitch_e9
    sget-object p1, Lcom/google/android/gms/internal/zzjn;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzjn;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzjn;)V

    goto/16 :goto_16f

    :pswitch_f6
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->zzbs()Lcom/google/android/gms/internal/zzjn;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto/16 :goto_17d

    :pswitch_102
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->zzbu()V

    goto/16 :goto_16f

    :pswitch_107
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->stopLoading()V

    goto/16 :goto_16f

    :pswitch_10c
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->showInterstitial()V

    goto :goto_16f

    :pswitch_110
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_117

    goto :goto_12a

    :cond_117
    const-string p2, "com.google.android.gms.ads.internal.client.IAppEventListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzkx;

    if-eqz p4, :cond_125

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/zzkx;

    goto :goto_12a

    :cond_125
    new-instance p4, Lcom/google/android/gms/internal/zzkz;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/zzkz;-><init>(Landroid/os/IBinder;)V

    :goto_12a
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkx;)V

    goto :goto_16f

    :pswitch_12e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_135

    goto :goto_148

    :cond_135
    const-string p2, "com.google.android.gms.ads.internal.client.IAdListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzkh;

    if-eqz p4, :cond_143

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/zzkh;

    goto :goto_148

    :cond_143
    new-instance p4, Lcom/google/android/gms/internal/zzkj;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/zzkj;-><init>(Landroid/os/IBinder;)V

    :goto_148
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkh;)V

    goto :goto_16f

    :pswitch_14c
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->resume()V

    goto :goto_16f

    :pswitch_150
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->pause()V

    goto :goto_16f

    :pswitch_154
    sget-object p1, Lcom/google/android/gms/internal/zzjj;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzjj;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzks;->zzb(Lcom/google/android/gms/internal/zzjj;)Z

    move-result p1

    goto :goto_165

    :pswitch_161
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->isReady()Z

    move-result p1

    :goto_165
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_17d

    :pswitch_16c
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->destroy()V

    :goto_16f
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_17d

    :pswitch_173
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzks;->zzbr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    :goto_177
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_17d
    return v0

    :pswitch_data_17e
    .packed-switch 0x1
        :pswitch_173
        :pswitch_16c
        :pswitch_161
        :pswitch_154
        :pswitch_150
        :pswitch_14c
        :pswitch_12e
        :pswitch_110
        :pswitch_10c
        :pswitch_107
        :pswitch_102
        :pswitch_f6
        :pswitch_e9
        :pswitch_dc
        :pswitch_cb
        :pswitch_c
        :pswitch_c
        :pswitch_bf
        :pswitch_b2
        :pswitch_93
        :pswitch_74
        :pswitch_6b
        :pswitch_65
        :pswitch_58
        :pswitch_4f
        :pswitch_49
        :pswitch_c
        :pswitch_c
        :pswitch_3c
        :pswitch_2f
        :pswitch_29
        :pswitch_23
        :pswitch_1d
        :pswitch_14
        :pswitch_e
    .end packed-switch
.end method
