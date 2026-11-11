.class public final Lcom/google/android/gms/internal/zzyf;
.super Lcom/google/android/gms/internal/zzyc;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation

.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private zzcjt:Ljava/lang/Object;

.field private zzcju:Landroid/widget/PopupWindow;

.field private zzcjv:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zzanh;Lcom/google/android/gms/internal/zzyb;)V
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzyc;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zzanh;Lcom/google/android/gms/internal/zzyb;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyf;->zzcjt:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzyf;->zzcjv:Z

    return-void
.end method

.method private final zznf()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzyf;->zzcjt:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzyf;->zzcjv:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzxu;->mContext:Landroid/content/Context;

    instance-of v2, v1, Landroid/app/Activity;

    const/4 v3, 0x0

    if-eqz v2, :cond_17

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_17

    iput-object v3, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_28

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_26

    iget-object v1, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_26
    iput-object v3, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    :cond_28
    monitor-exit v0

    return-void

    :catchall_2a
    move-exception v1

    monitor-exit v0
    :try_end_2c
    .catchall {:try_start_4 .. :try_end_2c} :catchall_2a

    throw v1
.end method


# virtual methods
.method public final cancel()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzyf;->zznf()V

    invoke-super {p0}, Lcom/google/android/gms/internal/zzxu;->cancel()V

    return-void
.end method

.method public final zzne()V
    .registers 9

    iget-object v0, p0, Lcom/google/android/gms/internal/zzxu;->mContext:Landroid/content/Context;

    instance-of v1, v0, Landroid/app/Activity;

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    goto :goto_f

    :cond_e
    move-object v0, v2

    :goto_f
    if-eqz v0, :cond_6d

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_18

    goto :goto_6d

    :cond_18
    iget-object v1, p0, Lcom/google/android/gms/internal/zzxu;->mContext:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_23

    return-void

    :cond_23
    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzxu;->mContext:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/zzxu;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Landroid/view/View;

    invoke-virtual {v1, v3, v4, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    iget-object v3, p0, Lcom/google/android/gms/internal/zzyf;->zzcjt:Ljava/lang/Object;

    monitor-enter v3

    :try_start_40
    iget-boolean v5, p0, Lcom/google/android/gms/internal/zzyf;->zzcjv:Z

    if-eqz v5, :cond_46

    monitor-exit v3

    return-void

    :cond_46
    new-instance v5, Landroid/widget/PopupWindow;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {v5, v1, v7, v7, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v5, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    invoke-virtual {v5, v7}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v6}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    const-string v1, "Displaying the 1x1 popup off the screen."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V
    :try_end_5c
    .catchall {:try_start_40 .. :try_end_5c} :catchall_6a

    :try_start_5c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0, v6, v4, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_65
    .catch Ljava/lang/Exception; {:try_start_5c .. :try_end_65} :catch_66
    .catchall {:try_start_5c .. :try_end_65} :catchall_6a

    goto :goto_68

    :catch_66
    :try_start_66
    iput-object v2, p0, Lcom/google/android/gms/internal/zzyf;->zzcju:Landroid/widget/PopupWindow;

    :goto_68
    monitor-exit v3

    return-void

    :catchall_6a
    move-exception v0

    monitor-exit v3
    :try_end_6c
    .catchall {:try_start_66 .. :try_end_6c} :catchall_6a

    throw v0

    :cond_6d
    :goto_6d
    return-void
.end method

.method public final zzx(I)V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzyf;->zznf()V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzxu;->zzx(I)V

    return-void
.end method
