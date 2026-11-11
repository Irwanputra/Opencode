.class public final Lcom/google/android/gms/internal/zzpt;
.super Lcom/google/android/gms/ads/formats/NativeAd$Image;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mDrawable:Landroid/graphics/drawable/Drawable;

.field private final mUri:Landroid/net/Uri;

.field private final zzbtr:D

.field private final zzbwd:Lcom/google/android/gms/internal/zzpq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzpq;)V
    .registers 5

    invoke-direct {p0}, Lcom/google/android/gms/ads/formats/NativeAd$Image;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpt;->zzbwd:Lcom/google/android/gms/internal/zzpq;

    const/4 v0, 0x0

    :try_start_6
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzpq;->zzjr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    if-eqz p1, :cond_19

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_12} :catch_13

    goto :goto_1a

    :catch_13
    move-exception p1

    const-string v1, "Failed to get drawable."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    move-object p1, v0

    :goto_1a
    iput-object p1, p0, Lcom/google/android/gms/internal/zzpt;->mDrawable:Landroid/graphics/drawable/Drawable;

    :try_start_1c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzpt;->zzbwd:Lcom/google/android/gms/internal/zzpq;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzpq;->getUri()Landroid/net/Uri;

    move-result-object v0
    :try_end_22
    .catch Landroid/os/RemoteException; {:try_start_1c .. :try_end_22} :catch_23

    goto :goto_29

    :catch_23
    move-exception p1

    const-string v1, "Failed to get uri."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_29
    iput-object v0, p0, Lcom/google/android/gms/internal/zzpt;->mUri:Landroid/net/Uri;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    :try_start_2d
    iget-object p1, p0, Lcom/google/android/gms/internal/zzpt;->zzbwd:Lcom/google/android/gms/internal/zzpq;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzpq;->getScale()D

    move-result-wide v0
    :try_end_33
    .catch Landroid/os/RemoteException; {:try_start_2d .. :try_end_33} :catch_34

    goto :goto_3a

    :catch_34
    move-exception p1

    const-string v2, "Failed to get scale."

    invoke-static {v2, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3a
    iput-wide v0, p0, Lcom/google/android/gms/internal/zzpt;->zzbtr:D

    return-void
.end method


# virtual methods
.method public final getDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpt;->mDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getScale()D
    .registers 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzpt;->zzbtr:D

    return-wide v0
.end method

.method public final getUri()Landroid/net/Uri;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpt;->mUri:Landroid/net/Uri;

    return-object v0
.end method
