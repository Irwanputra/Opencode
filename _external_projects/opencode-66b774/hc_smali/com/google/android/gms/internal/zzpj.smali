.class public final Lcom/google/android/gms/internal/zzpj;
.super Lcom/google/android/gms/internal/zzqa;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field public static final zzbvj:[Ljava/lang/String;


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private zzbuf:Lcom/google/android/gms/internal/zzos;

.field private zzbvo:Landroid/view/View;

.field private zzbvq:Landroid/graphics/Point;

.field private zzbvr:Landroid/graphics/Point;

.field private zzbvs:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/zzgp;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbvw:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbvx:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zzbvy:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zzbvz:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "2011"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "1009"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/zzpj;->zzbvj:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzqa;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpj;->zzbvx:Ljava/util/Map;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvy:Ljava/util/Map;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    iput-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvq:Landroid/graphics/Point;

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    iput-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvr:Landroid/graphics/Point;

    new-instance v3, Ljava/lang/ref/WeakReference;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvs:Ljava/lang/ref/WeakReference;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfc()Lcom/google/android/gms/internal/zzaln;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzaln;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfc()Lcom/google/android/gms/internal/zzaln;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzaln;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzpj;->zzi(Ljava/util/Map;)V

    invoke-interface {v2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/zzpj;->zzj(Ljava/util/Map;)V

    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzow;)V
    .registers 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/zzpj;->zzbvj:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_7
    if-ge v3, v2, :cond_1f

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_1c

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    goto :goto_20

    :cond_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_1f
    const/4 v1, 0x0

    :goto_20
    instance-of v2, v1, Landroid/widget/FrameLayout;

    if-nez v2, :cond_29

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzow;->zzki()V

    monitor-exit v0

    return-void

    :cond_29
    new-instance v2, Lcom/google/android/gms/internal/zzpl;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/zzpl;-><init>(Lcom/google/android/gms/internal/zzpj;Landroid/view/View;)V

    instance-of v3, p1, Lcom/google/android/gms/internal/zzor;

    if-eqz v3, :cond_36

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/zzow;->zzb(Landroid/view/View;Lcom/google/android/gms/internal/zzoq;)Z

    goto :goto_39

    :cond_36
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/zzow;->zza(Landroid/view/View;Lcom/google/android/gms/internal/zzoq;)V

    :goto_39
    monitor-exit v0

    return-void

    :catchall_3b
    move-exception p1

    monitor-exit v0
    :try_end_3d
    .catchall {:try_start_3 .. :try_end_3d} :catchall_3b

    goto :goto_3f

    :goto_3e
    throw p1

    :goto_3f
    goto :goto_3e
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzpj;Lcom/google/android/gms/internal/zzow;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzpj;->zza(Lcom/google/android/gms/internal/zzow;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzpj;[Ljava/lang/String;)Z
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzpj;->zza([Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final zza([Ljava/lang/String;)Z
    .registers 7

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v0, :cond_14

    aget-object v3, p1, v2

    iget-object v4, p0, Lcom/google/android/gms/internal/zzpj;->zzbvx:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_11

    const/4 p1, 0x1

    return p1

    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_14
    array-length v0, p1

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v0, :cond_26

    aget-object v3, p1, v2

    iget-object v4, p0, Lcom/google/android/gms/internal/zzpj;->zzbvy:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_23

    return v1

    :cond_23
    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    :cond_26
    return v1
.end method

.method private final zzi(Ljava/util/Map;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvx:Ljava/util/Map;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "1098"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_8

    :cond_3f
    return-void
.end method

.method private final zzj(Ljava/util/Map;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvy:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_8

    :cond_30
    return-void
.end method

.method private final zzk(Landroid/view/View;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    if-eqz v1, :cond_16

    instance-of v2, v1, Lcom/google/android/gms/internal/zzor;

    if-eqz v2, :cond_11

    check-cast v1, Lcom/google/android/gms/internal/zzor;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzor;->zzkf()Lcom/google/android/gms/internal/zzos;

    move-result-object v1

    :cond_11
    if-eqz v1, :cond_16

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzos;->zzk(Landroid/view/View;)V

    :cond_16
    monitor-exit v0

    return-void

    :catchall_18
    move-exception p1

    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_3 .. :try_end_1a} :catchall_18

    throw p1
.end method

.method private final zzt(I)I
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzos;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzajr;->zzd(Landroid/content/Context;I)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_12
    move-exception p1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_3 .. :try_end_14} :catchall_12

    throw p1
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 10

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    if-nez v1, :cond_9

    monitor-exit v0

    return-void

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/view/View;

    if-nez v7, :cond_16

    monitor-exit v0

    return-void

    :cond_16
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v1, "x"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvq:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzpj;->zzt(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v5, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "y"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvq:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzpj;->zzt(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v5, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "start_x"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvr:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzpj;->zzt(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v5, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "start_y"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvr:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzpj;->zzt(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v5, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvo:Landroid/view/View;

    if-eqz v1, :cond_81

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    instance-of v1, v2, Lcom/google/android/gms/internal/zzor;

    if-eqz v1, :cond_7c

    check-cast v2, Lcom/google/android/gms/internal/zzor;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzor;->zzkf()Lcom/google/android/gms/internal/zzos;

    move-result-object v1

    if-eqz v1, :cond_88

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    check-cast v1, Lcom/google/android/gms/internal/zzor;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzor;->zzkf()Lcom/google/android/gms/internal/zzos;

    move-result-object v2

    const-string v4, "1007"

    iget-object v6, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    :goto_77
    move-object v3, p1

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/zzos;->zza(Landroid/view/View;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;Landroid/view/View;)V

    goto :goto_88

    :cond_7c
    const-string v4, "1007"

    iget-object v6, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    goto :goto_77

    :cond_81
    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    invoke-interface {v1, p1, v2, v5, v7}, Lcom/google/android/gms/internal/zzos;->zza(Landroid/view/View;Ljava/util/Map;Landroid/os/Bundle;Landroid/view/View;)V

    :cond_88
    :goto_88
    monitor-exit v0

    return-void

    :catchall_8a
    move-exception p1

    monitor-exit v0
    :try_end_8c
    .catchall {:try_start_3 .. :try_end_8c} :catchall_8a

    goto :goto_8e

    :goto_8d
    throw p1

    :goto_8e
    goto :goto_8d
.end method

.method public final onGlobalLayout()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    if-eqz v1, :cond_18

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_18

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    invoke-interface {v2, v1, v3}, Lcom/google/android/gms/internal/zzos;->zzc(Landroid/view/View;Ljava/util/Map;)V

    :cond_18
    monitor-exit v0

    return-void

    :catchall_1a
    move-exception v1

    monitor-exit v0
    :try_end_1c
    .catchall {:try_start_3 .. :try_end_1c} :catchall_1a

    throw v1
.end method

.method public final onScrollChanged()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    if-eqz v1, :cond_18

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_18

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    invoke-interface {v2, v1, v3}, Lcom/google/android/gms/internal/zzos;->zzc(Landroid/view/View;Ljava/util/Map;)V

    :cond_18
    monitor-exit v0

    return-void

    :catchall_1a
    move-exception v1

    monitor-exit v0
    :try_end_1c
    .catchall {:try_start_3 .. :try_end_1c} :catchall_1a

    throw v1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 8

    iget-object p1, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    const/4 v1, 0x0

    if-nez v0, :cond_a

    monitor-exit p1

    return v1

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_16

    monitor-exit p1

    return v1

    :cond_16
    const/4 v2, 0x2

    new-array v2, v2, [I

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    aget v3, v2, v1

    int-to-float v3, v3

    sub-float/2addr v0, v3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    const/4 v4, 0x1

    aget v2, v2, v4

    int-to-float v2, v2

    sub-float/2addr v3, v2

    new-instance v2, Landroid/graphics/Point;

    float-to-int v0, v0

    float-to-int v3, v3

    invoke-direct {v2, v0, v3}, Landroid/graphics/Point;-><init>(II)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvq:Landroid/graphics/Point;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3e

    iput-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvr:Landroid/graphics/Point;

    :cond_3e
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p2

    iget v0, v2, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {p2, v0, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzos;->zzd(Landroid/view/MotionEvent;)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->recycle()V

    monitor-exit p1

    return v1

    :catchall_55
    move-exception p2

    monitor-exit p1
    :try_end_57
    .catchall {:try_start_3 .. :try_end_57} :catchall_55

    throw p2
.end method

.method public final unregisterNativeAd()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_4
    iput-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvo:Landroid/view/View;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvq:Landroid/graphics/Point;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbvr:Landroid/graphics/Point;

    monitor-exit v0

    return-void

    :catchall_e
    move-exception v1

    monitor-exit v0
    :try_end_10
    .catchall {:try_start_4 .. :try_end_10} :catchall_e

    throw v1
.end method

.method public final zza(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    .registers 10

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_4
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzpj;->zzk(Landroid/view/View;)V

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Lcom/google/android/gms/internal/zzow;

    if-nez v2, :cond_16

    const-string p1, "Not an instance of native engine. This is most likely a transient error"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_16
    check-cast p1, Lcom/google/android/gms/internal/zzow;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzow;->zzkd()Z

    move-result v2

    if-nez v2, :cond_25

    const-string p1, "Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_25
    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/view/View;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    if-eqz v2, :cond_4d

    if-eqz v7, :cond_4d

    sget-object v2, Lcom/google/android/gms/internal/zznh;->zzboq:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4d

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    invoke-interface {v2, v7, v3}, Lcom/google/android/gms/internal/zzos;->zzb(Landroid/view/View;Ljava/util/Map;)V

    :cond_4d
    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter v2
    :try_end_50
    .catchall {:try_start_4 .. :try_end_50} :catchall_178

    :try_start_50
    iget-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    instance-of v4, v3, Lcom/google/android/gms/internal/zzow;

    if-nez v4, :cond_58

    :cond_56
    :goto_56
    monitor-exit v2

    goto :goto_94

    :cond_58
    check-cast v3, Lcom/google/android/gms/internal/zzow;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-eqz v3, :cond_56

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzow;->getContext()Landroid/content/Context;

    move-result-object v5

    if-eqz v5, :cond_56

    if-eqz v4, :cond_56

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/zzaff;->zzs(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_56

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzow;->zzkk()Lcom/google/android/gms/internal/zzafe;

    move-result-object v3

    if-eqz v3, :cond_84

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzafe;->zzu(Z)V

    :cond_84
    iget-object v4, p0, Lcom/google/android/gms/internal/zzpj;->zzbvs:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzgp;

    if-eqz v4, :cond_56

    if-eqz v3, :cond_56

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/zzgp;->zzb(Lcom/google/android/gms/internal/zzgt;)V
    :try_end_93
    .catchall {:try_start_50 .. :try_end_93} :catchall_175

    goto :goto_56

    :goto_94
    :try_start_94
    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    instance-of v3, v2, Lcom/google/android/gms/internal/zzor;

    if-eqz v3, :cond_aa

    check-cast v2, Lcom/google/android/gms/internal/zzor;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzor;->zzke()Z

    move-result v2

    if-eqz v2, :cond_aa

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    check-cast v2, Lcom/google/android/gms/internal/zzor;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/zzor;->zzc(Lcom/google/android/gms/internal/zzos;)V

    goto :goto_b6

    :cond_aa
    iput-object p1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    instance-of v2, p1, Lcom/google/android/gms/internal/zzor;

    if-eqz v2, :cond_b6

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/zzor;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zzor;->zzc(Lcom/google/android/gms/internal/zzos;)V

    :cond_b6
    :goto_b6
    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    const-string v3, "1098"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-nez v2, :cond_c8

    const-string v1, "Ad choices asset view is not provided."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    goto :goto_104

    :cond_c8
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_d5

    move-object v1, v2

    check-cast v1, Landroid/view/ViewGroup;

    :cond_d5
    if-eqz v1, :cond_104

    const/4 v2, 0x1

    invoke-virtual {p1, p0, v2}, Lcom/google/android/gms/internal/zzow;->zza(Landroid/view/View$OnClickListener;Z)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvo:Landroid/view/View;

    if-eqz v2, :cond_104

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvz:Ljava/util/Map;

    const-string v3, "1007"

    new-instance v4, Ljava/lang/ref/WeakReference;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzpj;->zzbvo:Landroid/view/View;

    invoke-direct {v4, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvx:Ljava/util/Map;

    const-string v3, "1007"

    new-instance v4, Ljava/lang/ref/WeakReference;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzpj;->zzbvo:Landroid/view/View;

    invoke-direct {v4, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvo:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_104
    :goto_104
    iget-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvx:Ljava/util/Map;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzpj;->zzbvy:Ljava/util/Map;

    move-object v1, p1

    move-object v2, v7

    move-object v5, p0

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzow;->zza(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/view/View$OnTouchListener;Landroid/view/View$OnClickListener;)V

    sget-object v1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/zzpk;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/zzpk;-><init>(Lcom/google/android/gms/internal/zzpj;Lcom/google/android/gms/internal/zzow;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/zzpj;->zzk(Landroid/view/View;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    invoke-interface {p1, v7}, Lcom/google/android/gms/internal/zzos;->zzi(Landroid/view/View;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzpj;->mLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_124
    .catchall {:try_start_94 .. :try_end_124} :catchall_178

    :try_start_124
    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj;->zzbuf:Lcom/google/android/gms/internal/zzos;

    instance-of v2, v1, Lcom/google/android/gms/internal/zzow;

    if-nez v2, :cond_12c

    :cond_12a
    :goto_12a
    monitor-exit p1

    goto :goto_170

    :cond_12c
    check-cast v1, Lcom/google/android/gms/internal/zzow;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v1, :cond_12a

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzow;->getContext()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_12a

    if-eqz v2, :cond_12a

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzaff;->zzs(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_12a

    iget-object v3, p0, Lcom/google/android/gms/internal/zzpj;->zzbvs:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzgp;

    if-nez v3, :cond_168

    new-instance v3, Lcom/google/android/gms/internal/zzgp;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lcom/google/android/gms/internal/zzgp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzpj;->zzbvs:Ljava/lang/ref/WeakReference;

    :cond_168
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzow;->zzkk()Lcom/google/android/gms/internal/zzafe;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzgp;->zza(Lcom/google/android/gms/internal/zzgt;)V
    :try_end_16f
    .catchall {:try_start_124 .. :try_end_16f} :catchall_172

    goto :goto_12a

    :goto_170
    :try_start_170
    monitor-exit v0
    :try_end_171
    .catchall {:try_start_170 .. :try_end_171} :catchall_178

    return-void

    :catchall_172
    move-exception v1

    :try_start_173
    monitor-exit p1
    :try_end_174
    .catchall {:try_start_173 .. :try_end_174} :catchall_172

    :try_start_174
    throw v1
    :try_end_175
    .catchall {:try_start_174 .. :try_end_175} :catchall_178

    :catchall_175
    move-exception p1

    :try_start_176
    monitor-exit v2
    :try_end_177
    .catchall {:try_start_176 .. :try_end_177} :catchall_175

    :try_start_177
    throw p1

    :catchall_178
    move-exception p1

    monitor-exit v0
    :try_end_17a
    .catchall {:try_start_177 .. :try_end_17a} :catchall_178

    goto :goto_17c

    :goto_17b
    throw p1

    :goto_17c
    goto :goto_17b
.end method
