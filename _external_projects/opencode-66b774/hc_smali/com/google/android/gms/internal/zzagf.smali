.class public final Lcom/google/android/gms/internal/zzagf;
.super Lcom/google/android/gms/internal/zzakb;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# direct methods
.method public static v(Ljava/lang/String;)V
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzagf;->zzpz()Z

    move-result p0

    return-void
.end method

.method public static zzpz()Z
    .registers 2

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result v0

    if-eqz v0, :cond_1b

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbmn:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v0, 0x1

    return v0

    :cond_1b
    const/4 v0, 0x0

    return v0
.end method
