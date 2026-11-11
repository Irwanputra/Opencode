.class public final Lcom/google/android/gms/internal/zzpp;
.super Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzbth:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/formats/NativeAd$Image;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbwb:Lcom/google/android/gms/internal/zzpm;

.field private zzbwc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzpm;)V
    .registers 5

    invoke-direct {p0}, Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpp;->zzbth:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpp;->zzbwb:Lcom/google/android/gms/internal/zzpm;

    :try_start_c
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzpm;->getText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpp;->zzbwc:Ljava/lang/String;
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_12} :catch_13

    goto :goto_1d

    :catch_13
    move-exception v0

    const-string v1, "Error while obtaining attribution text."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpp;->zzbwc:Ljava/lang/String;

    :goto_1d
    :try_start_1d
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzpm;->zzjm()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_25
    :goto_25
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_58

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/os/IBinder;

    if-eqz v1, :cond_4a

    check-cast v0, Landroid/os/IBinder;

    if-eqz v0, :cond_4a

    const-string v1, "com.google.android.gms.ads.internal.formats.client.INativeAdImage"

    invoke-interface {v0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lcom/google/android/gms/internal/zzpq;

    if-eqz v2, :cond_44

    check-cast v1, Lcom/google/android/gms/internal/zzpq;

    goto :goto_4b

    :cond_44
    new-instance v1, Lcom/google/android/gms/internal/zzps;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/zzps;-><init>(Landroid/os/IBinder;)V

    goto :goto_4b

    :cond_4a
    const/4 v1, 0x0

    :goto_4b
    if-eqz v1, :cond_25

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpp;->zzbth:Ljava/util/List;

    new-instance v2, Lcom/google/android/gms/internal/zzpt;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/zzpt;-><init>(Lcom/google/android/gms/internal/zzpq;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_57
    .catch Landroid/os/RemoteException; {:try_start_1d .. :try_end_57} :catch_59

    goto :goto_25

    :cond_58
    return-void

    :catch_59
    move-exception p1

    const-string v0, "Error while obtaining image."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getImages()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/formats/NativeAd$Image;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpp;->zzbth:Ljava/util/List;

    return-object v0
.end method

.method public final getText()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpp;->zzbwc:Ljava/lang/String;

    return-object v0
.end method
