.class public final Lcom/google/android/gms/internal/zzyt;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private final zzanj:Lcom/google/android/gms/internal/zznu;

.field private zzavb:I

.field private zzavc:I

.field private zzavd:Lcom/google/android/gms/internal/zzaji;

.field private final zzbuv:Lcom/google/android/gms/internal/zzcv;

.field private final zzcjk:Lcom/google/android/gms/internal/zzafp;

.field private final zzclf:Lcom/google/android/gms/ads/internal/zzba;

.field private zzclg:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private zzclh:Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzafp;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/ads/internal/zzba;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzyt;->mLock:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzyt;->zzavb:I

    iput v0, p0, Lcom/google/android/gms/internal/zzyt;->zzavc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyt;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzyt;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzyt;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzyt;->zzanj:Lcom/google/android/gms/internal/zznu;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzyt;->zzclf:Lcom/google/android/gms/ads/internal/zzba;

    new-instance p1, Lcom/google/android/gms/internal/zzaji;

    const-wide/16 p2, 0xc8

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/zzaji;-><init>(J)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyt;->zzavd:Lcom/google/android/gms/internal/zzaji;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzyt;Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzyt;->zza(Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object p0

    return-object p0
.end method

.method private final zza(Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;)",
            "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzyt;->zzclg:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-nez v0, :cond_b

    new-instance v0, Lcom/google/android/gms/internal/zzyz;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzyz;-><init>(Lcom/google/android/gms/internal/zzyt;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzyt;->zzclg:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    :cond_b
    iget-object p1, p0, Lcom/google/android/gms/internal/zzyt;->zzclg:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    return-object p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzyt;)Lcom/google/android/gms/ads/internal/zzba;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzyt;->zzclf:Lcom/google/android/gms/ads/internal/zzba;

    return-object p0
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzyt;Lcom/google/android/gms/internal/zzanh;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzyt;->zzf(Lcom/google/android/gms/internal/zzanh;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzyt;Ljava/lang/ref/WeakReference;Z)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzyt;->zza(Ljava/lang/ref/WeakReference;Z)V

    return-void
.end method

.method private final zza(Ljava/lang/ref/WeakReference;Z)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzanh;

    if-eqz p1, :cond_59

    move-object v0, p1

    check-cast v0, Landroid/view/View;

    if-eqz p2, :cond_19

    iget-object v1, p0, Lcom/google/android/gms/internal/zzyt;->zzavd:Lcom/google/android/gms/internal/zzaji;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaji;->tryAcquire()Z

    move-result v1

    if-nez v1, :cond_19

    return-void

    :cond_19
    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzyt;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    aget v3, v1, v2

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/zzajr;->zzd(Landroid/content/Context;I)I

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzyt;->mContext:Landroid/content/Context;

    const/4 v4, 0x1

    aget v1, v1, v4

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/zzajr;->zzd(Landroid/content/Context;I)I

    move-result v1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzyt;->mLock:Ljava/lang/Object;

    monitor-enter v3

    :try_start_3a
    iget v5, p0, Lcom/google/android/gms/internal/zzyt;->zzavb:I

    if-ne v5, v0, :cond_42

    iget v5, p0, Lcom/google/android/gms/internal/zzyt;->zzavc:I

    if-eq v5, v1, :cond_54

    :cond_42
    iput v0, p0, Lcom/google/android/gms/internal/zzyt;->zzavb:I

    iput v1, p0, Lcom/google/android/gms/internal/zzyt;->zzavc:I

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->zzsz()Lcom/google/android/gms/internal/zzani;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/internal/zzyt;->zzavb:I

    iget v1, p0, Lcom/google/android/gms/internal/zzyt;->zzavc:I

    if-nez p2, :cond_51

    const/4 v2, 0x1

    :cond_51
    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzani;->zza(IIZ)V

    :cond_54
    monitor-exit v3

    return-void

    :catchall_56
    move-exception p1

    monitor-exit v3
    :try_end_58
    .catchall {:try_start_3a .. :try_end_58} :catchall_56

    throw p1

    :cond_59
    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzyt;Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzyt;->zzb(Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    move-result-object p0

    return-object p0
.end method

.method private final zzb(Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;)",
            "Landroid/view/ViewTreeObserver$OnScrollChangedListener;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzyt;->zzclh:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v0, :cond_b

    new-instance v0, Lcom/google/android/gms/internal/zzza;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzza;-><init>(Lcom/google/android/gms/internal/zzyt;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzyt;->zzclh:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    :cond_b
    iget-object p1, p0, Lcom/google/android/gms/internal/zzyt;->zzclh:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    return-object p1
.end method

.method private final zzf(Lcom/google/android/gms/internal/zzanh;)V
    .registers 4

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->zzsz()Lcom/google/android/gms/internal/zzani;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxi:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/video"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxj:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/videoMeta"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    new-instance v0, Lcom/google/android/gms/internal/zzane;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzane;-><init>()V

    const-string v1, "/precache"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxm:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/delayPageLoaded"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxk:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/instrument"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxd:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/log"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v0, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxe:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v1, "/videoClicked"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    new-instance v0, Lcom/google/android/gms/internal/zzyx;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzyx;-><init>(Lcom/google/android/gms/internal/zzyt;)V

    const-string v1, "/trackActiveViewUnit"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    new-instance v0, Lcom/google/android/gms/internal/zzyy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzyy;-><init>(Lcom/google/android/gms/internal/zzyt;)V

    const-string v1, "/untrackActiveViewUnit"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    return-void
.end method


# virtual methods
.method public final zznj()Lcom/google/android/gms/internal/zzanh;
    .registers 13

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzej()Lcom/google/android/gms/internal/zzanr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzyt;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/zzapa;->zzuf()Lcom/google/android/gms/internal/zzapa;

    move-result-object v2

    iget-object v6, p0, Lcom/google/android/gms/internal/zzyt;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzyt;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v3, v3, Lcom/google/android/gms/internal/zzafp;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iget-object v7, v3, Lcom/google/android/gms/internal/zzaat;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget-object v8, p0, Lcom/google/android/gms/internal/zzyt;->zzanj:Lcom/google/android/gms/internal/zznu;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzyt;->zzclf:Lcom/google/android/gms/ads/internal/zzba;

    invoke-virtual {v3}, Lcom/google/android/gms/ads/internal/zza;->zzbq()Lcom/google/android/gms/ads/internal/zzv;

    move-result-object v10

    iget-object v3, p0, Lcom/google/android/gms/internal/zzyt;->zzcjk:Lcom/google/android/gms/internal/zzafp;

    iget-object v11, v3, Lcom/google/android/gms/internal/zzafp;->zzcxw:Lcom/google/android/gms/internal/zzis;

    const-string v3, "native-video"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v0 .. v11}, Lcom/google/android/gms/internal/zzanr;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzapa;Ljava/lang/String;ZZLcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/ads/internal/zzbl;Lcom/google/android/gms/ads/internal/zzv;Lcom/google/android/gms/internal/zzis;)Lcom/google/android/gms/internal/zzanh;

    move-result-object v0

    return-object v0
.end method
