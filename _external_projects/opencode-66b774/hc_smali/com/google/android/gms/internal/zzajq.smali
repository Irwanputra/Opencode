.class public final Lcom/google/android/gms/internal/zzajq;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mView:Landroid/view/View;

.field private zzbbh:Z

.field private zzddm:Landroid/app/Activity;

.field private zzddn:Z

.field private zzddo:Z

.field private zzddp:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private zzddq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzajq;->mView:Landroid/view/View;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzajq;->zzddp:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzajq;->zzddq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    return-void
.end method

.method private final zzqw()V
    .registers 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddn:Z

    if-nez v0, :cond_3f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddp:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-eqz v0, :cond_20

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    if-eqz v0, :cond_16

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddp:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_16
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfc()Lcom/google/android/gms/internal/zzaln;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->mView:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddp:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaln;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_20
    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_3c

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    if-eqz v0, :cond_32

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_32
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfc()Lcom/google/android/gms/internal/zzaln;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->mView:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaln;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_3c
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddn:Z

    :cond_3f
    return-void
.end method

.method private final zzqx()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddn:Z

    if-eqz v1, :cond_2f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddp:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-eqz v1, :cond_1a

    if-eqz v0, :cond_1a

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajq;->zzddp:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzaht;->zzb(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_2c

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    if-eqz v0, :cond_2c

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajq;->zzddq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzahn;->zzb(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_2c
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddn:Z

    :cond_2f
    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddo:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzbbh:Z

    if-eqz v0, :cond_a

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzajq;->zzqw()V

    :cond_a
    return-void
.end method

.method public final onDetachedFromWindow()V
    .registers 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddo:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzajq;->zzqx()V

    return-void
.end method

.method public final zzi(Landroid/app/Activity;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzajq;->zzddm:Landroid/app/Activity;

    return-void
.end method

.method public final zzqu()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzbbh:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzddo:Z

    if-eqz v0, :cond_a

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzajq;->zzqw()V

    :cond_a
    return-void
.end method

.method public final zzqv()V
    .registers 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzajq;->zzbbh:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzajq;->zzqx()V

    return-void
.end method
