.class public final Lcom/google/android/gms/internal/zzlv;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzalp:Lcom/google/android/gms/internal/zzjm;

.field private zzaml:Lcom/google/android/gms/ads/VideoOptions;

.field private zzamr:Z

.field private zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

.field private zzapq:Ljava/lang/String;

.field private zzbdd:Lcom/google/android/gms/internal/zzje;

.field private zzbde:Lcom/google/android/gms/ads/AdListener;

.field private zzbeq:[Lcom/google/android/gms/ads/AdSize;

.field private final zzbgb:Lcom/google/android/gms/internal/zzuw;

.field private final zzbgc:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzbgd:Lcom/google/android/gms/ads/VideoController;

.field private zzbge:Lcom/google/android/gms/internal/zzkd;

.field private zzbgf:Lcom/google/android/gms/ads/Correlator;

.field private zzbgg:Lcom/google/android/gms/internal/zzks;

.field private zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

.field private zzbgi:Landroid/view/ViewGroup;

.field private zzbgj:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .registers 8

    sget-object v4, Lcom/google/android/gms/internal/zzjm;->zzbej:Lcom/google/android/gms/internal/zzjm;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzlv;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/zzjm;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;I)V
    .registers 9

    sget-object v4, Lcom/google/android/gms/internal/zzjm;->zzbej:Lcom/google/android/gms/internal/zzjm;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzlv;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/zzjm;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;Z)V
    .registers 10

    sget-object v4, Lcom/google/android/gms/internal/zzjm;->zzbej:Lcom/google/android/gms/internal/zzjm;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzlv;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/zzjm;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZI)V
    .registers 11

    sget-object v4, Lcom/google/android/gms/internal/zzjm;->zzbej:Lcom/google/android/gms/internal/zzjm;

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzlv;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/zzjm;I)V

    return-void
.end method

.method private constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/zzjm;I)V
    .registers 13

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzlv;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/zzjm;Lcom/google/android/gms/internal/zzks;I)V

    return-void
.end method

.method private constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/zzjm;Lcom/google/android/gms/internal/zzks;I)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p5, Lcom/google/android/gms/internal/zzuw;

    invoke-direct {p5}, Lcom/google/android/gms/internal/zzuw;-><init>()V

    iput-object p5, p0, Lcom/google/android/gms/internal/zzlv;->zzbgb:Lcom/google/android/gms/internal/zzuw;

    new-instance p5, Lcom/google/android/gms/ads/VideoController;

    invoke-direct {p5}, Lcom/google/android/gms/ads/VideoController;-><init>()V

    iput-object p5, p0, Lcom/google/android/gms/internal/zzlv;->zzbgd:Lcom/google/android/gms/ads/VideoController;

    new-instance p5, Lcom/google/android/gms/internal/zzlw;

    invoke-direct {p5, p0}, Lcom/google/android/gms/internal/zzlw;-><init>(Lcom/google/android/gms/internal/zzlv;)V

    iput-object p5, p0, Lcom/google/android/gms/internal/zzlv;->zzbge:Lcom/google/android/gms/internal/zzkd;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgi:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzlv;->zzalp:Lcom/google/android/gms/internal/zzjm;

    const/4 p4, 0x0

    iput-object p4, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p5, 0x0

    invoke-direct {p4, p5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p4, p0, Lcom/google/android/gms/internal/zzlv;->zzbgc:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput p6, p0, Lcom/google/android/gms/internal/zzlv;->zzbgj:I

    if-eqz p2, :cond_78

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p4

    :try_start_2f
    new-instance p6, Lcom/google/android/gms/internal/zzjq;

    invoke-direct {p6, p4, p2}, Lcom/google/android/gms/internal/zzjq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p6, p3}, Lcom/google/android/gms/internal/zzjq;->zzh(Z)[Lcom/google/android/gms/ads/AdSize;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {p6}, Lcom/google/android/gms/internal/zzjq;->getAdUnitId()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;
    :try_end_40
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2f .. :try_end_40} :catch_61

    invoke-virtual {p1}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_78

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    move-result-object p2

    iget-object p3, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    aget-object p3, p3, p5

    iget p5, p0, Lcom/google/android/gms/internal/zzlv;->zzbgj:I

    new-instance p6, Lcom/google/android/gms/internal/zzjn;

    invoke-direct {p6, p4, p3}, Lcom/google/android/gms/internal/zzjn;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/zzlv;->zzs(I)Z

    move-result p3

    iput-boolean p3, p6, Lcom/google/android/gms/internal/zzjn;->zzbep:Z

    const-string p3, "Ads by Google"

    invoke-virtual {p2, p1, p6, p3}, Lcom/google/android/gms/internal/zzajr;->zza(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;)V

    goto :goto_78

    :catch_61
    move-exception p2

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    move-result-object p3

    new-instance p5, Lcom/google/android/gms/internal/zzjn;

    sget-object p6, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-direct {p5, p4, p6}, Lcom/google/android/gms/internal/zzjn;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    invoke-virtual {p2}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p5, p4, p2}, Lcom/google/android/gms/internal/zzajr;->zza(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;Ljava/lang/String;)V

    :cond_78
    :goto_78
    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzlv;)Lcom/google/android/gms/ads/VideoController;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgd:Lcom/google/android/gms/ads/VideoController;

    return-object p0
.end method

.method private static zza(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;I)Lcom/google/android/gms/internal/zzjn;
    .registers 4

    new-instance v0, Lcom/google/android/gms/internal/zzjn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzjn;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/zzlv;->zzs(I)Z

    move-result p0

    iput-boolean p0, v0, Lcom/google/android/gms/internal/zzjn;->zzbep:Z

    return-object v0
.end method

.method private static zzs(I)Z
    .registers 2

    const/4 v0, 0x1

    if-ne p0, v0, :cond_4

    return v0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final destroy()V
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->destroy()V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_7} :catch_8

    :cond_7
    return-void

    :catch_8
    move-exception v0

    const-string v1, "Failed to destroy AdView."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final getAdListener()Lcom/google/android/gms/ads/AdListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbde:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public final getAdSize()Lcom/google/android/gms/ads/AdSize;
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_15

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->zzbs()Lcom/google/android/gms/internal/zzjn;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzjn;->zzht()Lcom/google/android/gms/ads/AdSize;

    move-result-object v0
    :try_end_e
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_e} :catch_f

    return-object v0

    :catch_f
    move-exception v0

    const-string v1, "Failed to get the current AdSize."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    if-eqz v0, :cond_1d

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_1d
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAdSizes()[Lcom/google/android/gms/ads/AdSize;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_15

    :try_start_8
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;
    :try_end_e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_e} :catch_f

    goto :goto_15

    :catch_f
    move-exception v0

    const-string v1, "Failed to get ad unit id."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    :goto_15
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;

    return-object v0
.end method

.method public final getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->zzcp()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_8} :catch_9

    return-object v0

    :catch_9
    move-exception v0

    const-string v1, "Failed to get the mediation adapter class name."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getOnCustomRenderedAdLoadedListener()Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/ads/VideoController;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgd:Lcom/google/android/gms/ads/VideoController;

    return-object v0
.end method

.method public final getVideoOptions()Lcom/google/android/gms/ads/VideoOptions;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzaml:Lcom/google/android/gms/ads/VideoOptions;

    return-object v0
.end method

.method public final isLoading()Z
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->isLoading()Z

    move-result v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_8} :catch_9

    return v0

    :catch_9
    move-exception v0

    const-string v1, "Failed to check if ad is loading."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    const/4 v0, 0x0

    return v0
.end method

.method public final pause()V
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->pause()V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_7} :catch_8

    :cond_7
    return-void

    :catch_8
    move-exception v0

    const-string v1, "Failed to call pause."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final recordManualImpression()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgc:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_a

    return-void

    :cond_a
    :try_start_a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_11

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->zzbu()V
    :try_end_11
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_11} :catch_12

    :cond_11
    return-void

    :catch_12
    move-exception v0

    const-string v1, "Failed to record impression."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final resume()V
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->resume()V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_7} :catch_8

    :cond_7
    return-void

    :catch_8
    move-exception v0

    const-string v1, "Failed to call resume."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbde:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbge:Lcom/google/android/gms/internal/zzkd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzkd;->zza(Lcom/google/android/gms/ads/AdListener;)V

    return-void
.end method

.method public final varargs setAdSizes([Lcom/google/android/gms/ads/AdSize;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    if-nez v0, :cond_8

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzlv;->zza([Lcom/google/android/gms/ads/AdSize;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad size can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setAdUnitId(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;

    if-nez v0, :cond_7

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad unit ID can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    .registers 4

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzjp;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzjp;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkx;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the AppEventListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setCorrelator(Lcom/google/android/gms/ads/Correlator;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgf:Lcom/google/android/gms/ads/Correlator;

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_11

    if-nez p1, :cond_a

    const/4 p1, 0x0

    goto :goto_e

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/ads/Correlator;->zzbh()Lcom/google/android/gms/internal/zzkc;

    move-result-object p1

    :goto_e
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzld;)V
    :try_end_11
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_11} :catch_12

    :cond_11
    return-void

    :catch_12
    move-exception p1

    const-string v0, "Failed to set correlator."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setManualImpressionsEnabled(Z)V
    .registers 3

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzlv;->zzamr:Z

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzks;->setManualImpressionsEnabled(Z)V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_9} :catch_a

    :cond_9
    return-void

    :catch_a
    move-exception p1

    const-string v0, "Failed to set manual impressions."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setOnCustomRenderedAdLoadedListener(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzod;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzod;-><init>(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzoa;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the onCustomRenderedAdLoadedListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setVideoOptions(Lcom/google/android/gms/ads/VideoOptions;)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzaml:Lcom/google/android/gms/ads/VideoOptions;

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_13

    if-nez p1, :cond_a

    const/4 p1, 0x0

    goto :goto_10

    :cond_a
    new-instance v1, Lcom/google/android/gms/internal/zzmr;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzmr;-><init>(Lcom/google/android/gms/ads/VideoOptions;)V

    move-object p1, v1

    :goto_10
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzmr;)V
    :try_end_13
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_13} :catch_14

    :cond_13
    return-void

    :catch_14
    move-exception p1

    const-string v0, "Failed to set video options."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzje;)V
    .registers 4

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbdd:Lcom/google/android/gms/internal/zzje;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz v0, :cond_12

    if-eqz p1, :cond_e

    new-instance v1, Lcom/google/android/gms/internal/zzjf;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzjf;-><init>(Lcom/google/android/gms/internal/zzje;)V

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzke;)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_12} :catch_13

    :cond_12
    return-void

    :catch_13
    move-exception p1

    const-string v0, "Failed to set the AdClickListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzlt;)V
    .registers 11

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-nez v0, :cond_d1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;

    if-nez v1, :cond_e

    :cond_c
    if-eqz v0, :cond_c9

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgi:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    iget v2, p0, Lcom/google/android/gms/internal/zzlv;->zzbgj:I

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzlv;->zza(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;I)Lcom/google/android/gms/internal/zzjn;

    move-result-object v4

    const-string v1, "search_v2"

    iget-object v2, v4, Lcom/google/android/gms/internal/zzjn;->zzbek:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v7, 0x0

    if-eqz v1, :cond_39

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzib()Lcom/google/android/gms/internal/zzjr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/zzjt;

    invoke-direct {v3, v1, v0, v4, v2}, Lcom/google/android/gms/internal/zzjt;-><init>(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;)V

    invoke-static {v0, v7, v3}, Lcom/google/android/gms/internal/zzjr;->zza(Landroid/content/Context;ZLcom/google/android/gms/internal/zzjr$zza;)Ljava/lang/Object;

    move-result-object v0

    :goto_36
    check-cast v0, Lcom/google/android/gms/internal/zzks;

    goto :goto_4d

    :cond_39
    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzib()Lcom/google/android/gms/internal/zzjr;

    move-result-object v2

    iget-object v5, p0, Lcom/google/android/gms/internal/zzlv;->zzapq:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzlv;->zzbgb:Lcom/google/android/gms/internal/zzuw;

    new-instance v8, Lcom/google/android/gms/internal/zzjs;

    move-object v1, v8

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzjs;-><init>(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;)V

    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/zzjr;->zza(Landroid/content/Context;ZLcom/google/android/gms/internal/zzjr$zza;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_36

    :goto_4d
    iput-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzjg;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlv;->zzbge:Lcom/google/android/gms/internal/zzkd;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzjg;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbdd:Lcom/google/android/gms/internal/zzje;

    if-eqz v0, :cond_69

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzjf;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlv;->zzbdd:Lcom/google/android/gms/internal/zzje;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzjf;-><init>(Lcom/google/android/gms/internal/zzje;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzke;)V

    :cond_69
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    if-eqz v0, :cond_79

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzjp;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlv;->zzamt:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzjp;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzkx;)V

    :cond_79
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    if-eqz v0, :cond_89

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzod;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlv;->zzbgh:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzod;-><init>(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzoa;)V

    :cond_89
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgf:Lcom/google/android/gms/ads/Correlator;

    if-eqz v0, :cond_96

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/Correlator;->zzbh()Lcom/google/android/gms/internal/zzkc;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzld;)V

    :cond_96
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzaml:Lcom/google/android/gms/ads/VideoOptions;

    if-eqz v0, :cond_a6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    new-instance v1, Lcom/google/android/gms/internal/zzmr;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzlv;->zzaml:Lcom/google/android/gms/ads/VideoOptions;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzmr;-><init>(Lcom/google/android/gms/ads/VideoOptions;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzmr;)V

    :cond_a6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzlv;->zzamr:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->setManualImpressionsEnabled(Z)V
    :try_end_ad
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_ad} :catch_ed

    :try_start_ad
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->zzbr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    if-nez v0, :cond_b6

    goto :goto_d1

    :cond_b6
    iget-object v1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgi:Landroid/view/ViewGroup;

    invoke-static {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_c1
    .catch Landroid/os/RemoteException; {:try_start_ad .. :try_end_c1} :catch_c2

    goto :goto_d1

    :catch_c2
    move-exception v0

    :try_start_c3
    const-string v1, "Failed to get an ad frame."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_d1

    :cond_c9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad size and ad unit ID must be set before loadAd is called."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d1
    :goto_d1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgi:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzjm;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzlt;)Lcom/google/android/gms/internal/zzjj;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzks;->zzb(Lcom/google/android/gms/internal/zzjj;)Z

    move-result v0

    if-eqz v0, :cond_ec

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgb:Lcom/google/android/gms/internal/zzuw;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzlt;->zzim()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzuw;->zzn(Ljava/util/Map;)V
    :try_end_ec
    .catch Landroid/os/RemoteException; {:try_start_c3 .. :try_end_ec} :catch_ed

    :cond_ec
    return-void

    :catch_ed
    move-exception p1

    const-string v0, "Failed to load ad."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final varargs zza([Lcom/google/android/gms/ads/AdSize;)V
    .registers 5

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    :try_start_2
    iget-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    if-eqz p1, :cond_1e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgi:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzlv;->zzbeq:[Lcom/google/android/gms/ads/AdSize;

    iget v2, p0, Lcom/google/android/gms/internal/zzlv;->zzbgj:I

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzlv;->zza(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;I)Lcom/google/android/gms/internal/zzjn;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzks;->zza(Lcom/google/android/gms/internal/zzjn;)V
    :try_end_17
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_17} :catch_18

    goto :goto_1e

    :catch_18
    move-exception p1

    const-string v0, "Failed to set the ad size."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1e
    :goto_1e
    iget-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgi:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzks;)Z
    .registers 5

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    :try_start_4
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzks;->zzbr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object v1
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_8} :catch_27

    if-nez v1, :cond_b

    return v0

    :cond_b
    invoke-static {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_18

    return v0

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgi:Landroid/view/ViewGroup;

    invoke-static {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    const/4 p1, 0x1

    return p1

    :catch_27
    move-exception p1

    const-string v1, "Failed to get an ad frame."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final zzbj()Lcom/google/android/gms/internal/zzll;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzlv;->zzbgg:Lcom/google/android/gms/internal/zzks;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    :try_start_6
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzks;->getVideoController()Lcom/google/android/gms/internal/zzll;

    move-result-object v0
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_a} :catch_b

    return-object v0

    :catch_b
    move-exception v0

    const-string v2, "Failed to retrieve VideoController."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method
