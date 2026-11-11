.class public final Lcom/google/android/gms/internal/zzaak;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaam;


# instance fields
.field private synthetic val$context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaak;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzakd;)Z
    .registers 7

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaak;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzajr;->zzbe(Landroid/content/Context;)Z

    move-result v0

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbrg:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_23

    iget-boolean v1, p1, Lcom/google/android/gms/internal/zzakd;->zzdel:Z

    if-eqz v1, :cond_23

    const/4 v1, 0x1

    goto :goto_24

    :cond_23
    const/4 v1, 0x0

    :goto_24
    iget-object v4, p0, Lcom/google/android/gms/internal/zzaak;->val$context:Landroid/content/Context;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/zzakd;->zzdel:Z

    invoke-static {v4, p1}, Lcom/google/android/gms/internal/zzaaj;->zze(Landroid/content/Context;Z)Z

    move-result p1

    if-eqz p1, :cond_4e

    if-eqz v0, :cond_4e

    if-nez v1, :cond_4e

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaak;->val$context:Landroid/content/Context;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〺えなひあ(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_4d

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbjg:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4d

    goto :goto_4e

    :cond_4d
    return v3

    :cond_4e
    :goto_4e
    return v2
.end method
