.class public final Lcom/google/android/gms/internal/zzte;
.super Lcom/google/android/gms/internal/zzki;
.source ""


# instance fields
.field private final zzbzo:Lcom/google/android/gms/internal/zzkh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzkh;)V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzki;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzkh;->onAdClicked()V

    return-void
.end method

.method public final onAdClosed()V
    .registers 5

    invoke-static {}, Lcom/google/android/gms/internal/zztn;->zzlm()Z

    move-result v0

    if-eqz v0, :cond_47

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbmc:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbmd:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v0, :cond_40

    if-gez v1, :cond_2b

    goto :goto_40

    :cond_2b
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/2addr v1, v0

    int-to-long v0, v1

    sget-object v2, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    sget-object v3, Lcom/google/android/gms/internal/zztf;->zzbzp:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_47

    :cond_40
    :goto_40
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeu()Lcom/google/android/gms/internal/zztg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztg;->zzkv()V

    :cond_47
    :goto_47
    iget-object v0, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzkh;->onAdClosed()V

    return-void
.end method

.method public final onAdFailedToLoad(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzkh;->onAdFailedToLoad(I)V

    return-void
.end method

.method public final onAdImpression()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzkh;->onAdImpression()V

    return-void
.end method

.method public final onAdLeftApplication()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzkh;->onAdLeftApplication()V

    return-void
.end method

.method public final onAdLoaded()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzkh;->onAdLoaded()V

    return-void
.end method

.method public final onAdOpened()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzte;->zzbzo:Lcom/google/android/gms/internal/zzkh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzkh;->onAdOpened()V

    return-void
.end method
