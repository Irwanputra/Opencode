.class public final Lcom/google/android/gms/internal/zzph;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzbvt:Lcom/google/android/gms/internal/zzow;

.field private synthetic zzbvu:Lcom/google/android/gms/internal/zzpg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzpg;Lcom/google/android/gms/internal/zzow;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzph;->zzbvt:Lcom/google/android/gms/internal/zzow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpg;->zza(Lcom/google/android/gms/internal/zzpg;)Z

    move-result v0

    if-eqz v0, :cond_55

    iget-object v0, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpg;->zzb(Lcom/google/android/gms/internal/zzpg;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_34

    iget-object v0, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    new-instance v1, Landroid/view/View;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzpg;->zzc(Lcom/google/android/gms/internal/zzpg;)Landroid/widget/FrameLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzpg;->zza(Lcom/google/android/gms/internal/zzpg;Landroid/view/View;)Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpg;->zzb(Lcom/google/android/gms/internal/zzpg;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_34
    iget-object v0, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpg;->zzc(Lcom/google/android/gms/internal/zzpg;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzpg;->zzb(Lcom/google/android/gms/internal/zzpg;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eq v0, v1, :cond_55

    iget-object v0, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpg;->zzc(Lcom/google/android/gms/internal/zzpg;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzpg;->zzb(Lcom/google/android/gms/internal/zzpg;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_55
    const/4 v0, 0x0

    :try_start_56
    iget-object v1, p0, Lcom/google/android/gms/internal/zzph;->zzbvt:Lcom/google/android/gms/internal/zzow;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzow;->zzkg()Lcom/google/android/gms/internal/zzanh;

    move-result-object v0
    :try_end_5c
    .catch Ljava/lang/Exception; {:try_start_56 .. :try_end_5c} :catch_5d

    goto :goto_72

    :catch_5d
    move-exception v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    invoke-static {}, Lcom/google/android/gms/internal/zzaht;->zzqj()Z

    move-result v2

    if-eqz v2, :cond_6d

    const-string v1, "Privileged processes cannot create HTML overlays."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_72

    :cond_6d
    const-string v2, "Error obtaining overlay."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_72
    if-eqz v0, :cond_7f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzpg;->zzamm:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_7f

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_7f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzph;->zzbvu:Lcom/google/android/gms/internal/zzpg;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzph;->zzbvt:Lcom/google/android/gms/internal/zzow;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzpg;->zza(Lcom/google/android/gms/internal/zzpg;Lcom/google/android/gms/internal/zzow;)V

    return-void
.end method
