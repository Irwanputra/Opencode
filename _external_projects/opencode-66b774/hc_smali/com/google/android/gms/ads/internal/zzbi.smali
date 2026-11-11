.class public final Lcom/google/android/gms/ads/internal/zzbi;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/Runnable;

.field public くし〴〺ぅ:Lcom/google/android/gms/internal/zzjj;

.field public final げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbk;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:J

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zza;)V
    .registers 5

    new-instance v0, Lcom/google/android/gms/ads/internal/zzbk;

    sget-object v1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/zzbk;-><init>(Landroid/os/Handler;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzbi;->づざかべべ:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/google/android/gms/ads/internal/zzbi;->なぎぱいぢぎ:J

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbk;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;

    invoke-direct {p1, p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;-><init>(Lcom/google/android/gms/ads/internal/zzbi;Ljava/lang/ref/WeakReference;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbi;->〺つふすそ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .registers 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbk;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbi;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbk;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final pause()V
    .registers 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->づざかべべ:Z

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbk;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbi;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbk;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_e
    return-void
.end method

.method public final resume()V
    .registers 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->づざかべべ:Z

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    if-eqz v1, :cond_10

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->くし〴〺ぅ:Lcom/google/android/gms/internal/zzjj;

    iget-wide v1, p0, Lcom/google/android/gms/ads/internal/zzbi;->なぎぱいぢぎ:J

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/ads/internal/zzbi;->zza(Lcom/google/android/gms/internal/zzjj;J)V

    :cond_10
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzjj;J)V
    .registers 5

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    if-eqz v0, :cond_a

    const-string p1, "An ad refresh is already scheduled."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_a
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbi;->くし〴〺ぅ:Lcom/google/android/gms/internal/zzjj;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    iput-wide p2, p0, Lcom/google/android/gms/ads/internal/zzbi;->なぎぱいぢぎ:J

    iget-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzbi;->づざかべべ:Z

    if-nez p1, :cond_37

    const/16 p1, 0x41

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Scheduling ad refresh "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " milliseconds from now."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbi;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbk;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {p1, v0, p2, p3}, Lcom/google/android/gms/ads/internal/zzbk;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_37
    return-void
.end method

.method public final zzdx()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    return v0
.end method

.method public final zzf(Lcom/google/android/gms/internal/zzjj;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbi;->くし〴〺ぅ:Lcom/google/android/gms/internal/zzjj;

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/zzjj;)V
    .registers 4

    const-wide/32 v0, 0xea60

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/zzbi;->zza(Lcom/google/android/gms/internal/zzjj;J)V

    return-void
.end method
