.class public final Lcom/google/android/gms/internal/zzaes;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzafb;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private final zzctb:Lcom/google/android/gms/internal/zzaey;

.field private final zzcwe:Lcom/google/android/gms/internal/zzfjw;

.field private final zzcwf:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzfke;",
            ">;"
        }
    .end annotation
.end field

.field private final zzcwg:Lcom/google/android/gms/internal/zzafd;

.field public zzcwh:Z

.field private zzcwi:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzcwj:Z

.field private zzcwk:Z

.field private zzcwl:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zzaey;Ljava/lang/String;Lcom/google/android/gms/internal/zzafd;)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwi:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwj:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwk:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwl:Z

    const-string v0, "SafeBrowsing config is not present."

    invoke-static {p3, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_27
    iput-object p1, p0, Lcom/google/android/gms/internal/zzaes;->mContext:Landroid/content/Context;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzaes;->zzcwg:Lcom/google/android/gms/internal/zzafd;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-object p1, p3, Lcom/google/android/gms/internal/zzaey;->zzcwt:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_52

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    iget-object p5, p0, Lcom/google/android/gms/internal/zzaes;->zzcwi:Ljava/util/HashSet;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p5, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    :cond_52
    iget-object p1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwi:Ljava/util/HashSet;

    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string p5, "cookie"

    invoke-virtual {p5, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    new-instance p1, Lcom/google/android/gms/internal/zzfjw;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzfjw;-><init>()V

    const/16 p3, 0x8

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p1, Lcom/google/android/gms/internal/zzfjw;->zzpnw:Ljava/lang/Integer;

    iput-object p4, p1, Lcom/google/android/gms/internal/zzfjw;->url:Ljava/lang/String;

    iput-object p4, p1, Lcom/google/android/gms/internal/zzfjw;->zzpny:Ljava/lang/String;

    new-instance p3, Lcom/google/android/gms/internal/zzfjx;

    invoke-direct {p3}, Lcom/google/android/gms/internal/zzfjx;-><init>()V

    iput-object p3, p1, Lcom/google/android/gms/internal/zzfjw;->zzpoa:Lcom/google/android/gms/internal/zzfjx;

    iget-object p4, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-object p4, p4, Lcom/google/android/gms/internal/zzaey;->zzcwp:Ljava/lang/String;

    iput-object p4, p3, Lcom/google/android/gms/internal/zzfjx;->zzcwp:Ljava/lang/String;

    new-instance p3, Lcom/google/android/gms/internal/zzfkf;

    invoke-direct {p3}, Lcom/google/android/gms/internal/zzfkf;-><init>()V

    iget-object p2, p2, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    iput-object p2, p3, Lcom/google/android/gms/internal/zzfkf;->zzpph:Ljava/lang/String;

    iget-object p2, p0, Lcom/google/android/gms/internal/zzaes;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/internal/zzbhf;->zzdb(Landroid/content/Context;)Lcom/google/android/gms/internal/zzbhe;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzbhe;->zzamu()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p3, Lcom/google/android/gms/internal/zzfkf;->zzppj:Ljava/lang/Boolean;

    .line 1
    sget-object p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;

    .line 2
    iget-object p2, p0, Lcom/google/android/gms/internal/zzaes;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->〺つふすそ(Landroid/content/Context;)I

    move-result p2

    int-to-long p4, p2

    const-wide/16 v0, 0x0

    cmp-long p2, p4, v0

    if-lez p2, :cond_ab

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p3, Lcom/google/android/gms/internal/zzfkf;->zzppi:Ljava/lang/Long;

    :cond_ab
    iput-object p3, p1, Lcom/google/android/gms/internal/zzfjw;->zzpok:Lcom/google/android/gms/internal/zzfkf;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzaes;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzaes;)Lcom/google/android/gms/internal/zzfjw;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    return-object p0
.end method

.method private final zzbw(Ljava/lang/String;)Lcom/google/android/gms/internal/zzfke;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzfke;

    monitor-exit v0

    return-object p1

    :catchall_d
    move-exception p1

    monitor-exit v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_d

    throw p1
.end method


# virtual methods
.method public final send()V
    .registers 9

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwh:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_c

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/zzaey;->zzcwv:Z

    if-nez v3, :cond_1e

    :cond_c
    iget-boolean v3, p0, Lcom/google/android/gms/internal/zzaes;->zzcwl:Z

    if-eqz v3, :cond_16

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/zzaey;->zzcwu:Z

    if-nez v3, :cond_1e

    :cond_16
    if-nez v0, :cond_20

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/zzaey;->zzcws:Z

    if-eqz v0, :cond_20

    :cond_1e
    const/4 v0, 0x1

    goto :goto_21

    :cond_20
    const/4 v0, 0x0

    :goto_21
    if-nez v0, :cond_24

    return-void

    :cond_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_27
    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->size()I

    move-result v4

    new-array v4, v4, [Lcom/google/android/gms/internal/zzfke;

    iput-object v4, v3, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    invoke-interface {v3, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_aa

    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    iget-object v5, v4, Lcom/google/android/gms/internal/zzfjw;->url:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzfjw;->zzpoc:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x35

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Sending SB report\n  url: "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\n  clickUrl: "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n  resources: \n"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    array-length v5, v4

    :goto_87
    if-ge v1, v5, :cond_a3

    aget-object v6, v4, v1

    const-string v7, "    ["

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v6, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    array-length v7, v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "] "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v6, Lcom/google/android/gms/internal/zzfke;->url:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_87

    :cond_a3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafa;->zzbx(Ljava/lang/String;)V

    :cond_aa
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfjs;->zzc(Lcom/google/android/gms/internal/zzfjs;)[B

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-object v3, v3, Lcom/google/android/gms/internal/zzaey;->zzcwq:Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/internal/zzaiv;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzaes;->mContext:Landroid/content/Context;

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/zzaiv;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v3, v5, v1}, Lcom/google/android/gms/internal/zzaiv;->zza(ILjava/lang/String;Ljava/util/Map;[B)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_d0

    new-instance v2, Lcom/google/android/gms/internal/zzaev;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/zzaev;-><init>(Lcom/google/android/gms/internal/zzaes;)V

    sget-object v3, Lcom/google/android/gms/internal/zzahh;->zzdar:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/zzakv;->zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_d0
    monitor-exit v0

    return-void

    :catchall_d2
    move-exception v1

    monitor-exit v0
    :try_end_d4
    .catchall {:try_start_27 .. :try_end_d4} :catchall_d2

    goto :goto_d6

    :goto_d5
    throw v1

    :goto_d6
    goto :goto_d5
.end method

.method public final zza(Ljava/lang/String;Ljava/util/Map;I)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x3

    if-ne p3, v1, :cond_9

    const/4 v2, 0x1

    :try_start_7
    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzaes;->zzcwl:Z

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    if-ne p3, v1, :cond_21

    iget-object p2, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzfke;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/google/android/gms/internal/zzfke;->zzppf:Ljava/lang/Integer;

    :cond_21
    monitor-exit v0

    return-void

    :cond_23
    new-instance v1, Lcom/google/android/gms/internal/zzfke;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzfke;-><init>()V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, v1, Lcom/google/android/gms/internal/zzfke;->zzppf:Ljava/lang/Integer;

    iget-object p3, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {p3}, Ljava/util/LinkedHashMap;->size()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, v1, Lcom/google/android/gms/internal/zzfke;->zzjjw:Ljava/lang/Integer;

    iput-object p1, v1, Lcom/google/android/gms/internal/zzfke;->url:Ljava/lang/String;

    new-instance p3, Lcom/google/android/gms/internal/zzfjz;

    invoke-direct {p3}, Lcom/google/android/gms/internal/zzfjz;-><init>()V

    iput-object p3, v1, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    iget-object p3, p0, Lcom/google/android/gms/internal/zzaes;->zzcwi:Ljava/util/HashSet;

    invoke-virtual {p3}, Ljava/util/HashSet;->size()I

    move-result p3

    if-lez p3, :cond_bf

    if-eqz p2, :cond_bf

    new-instance p3, Ljava/util/LinkedList;

    invoke-direct {p3}, Ljava/util/LinkedList;-><init>()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;
    :try_end_66
    .catchall {:try_start_7 .. :try_end_66} :catchall_c6

    :try_start_66
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_73

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_75

    :cond_73
    const-string v3, ""

    :goto_75
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_82

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_84

    :cond_82
    const-string v2, ""

    :goto_84
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/zzaes;->zzcwi:Ljava/util/HashSet;

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_93

    goto :goto_5a

    :cond_93
    new-instance v4, Lcom/google/android/gms/internal/zzfjy;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzfjy;-><init>()V

    const-string v5, "UTF-8"

    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    iput-object v3, v4, Lcom/google/android/gms/internal/zzfjy;->zzpom:[B

    const-string v3, "UTF-8"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    iput-object v2, v4, Lcom/google/android/gms/internal/zzfjy;->zzohg:[B

    invoke-virtual {p3, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_ab
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_66 .. :try_end_ab} :catch_ac
    .catchall {:try_start_66 .. :try_end_ab} :catchall_c6

    goto :goto_5a

    :catch_ac
    :try_start_ac
    const-string v2, "Cannot convert string to bytes, skip header."

    invoke-static {v2}, Lcom/google/android/gms/internal/zzafa;->zzbx(Ljava/lang/String;)V

    goto :goto_5a

    :cond_b2
    invoke-virtual {p3}, Ljava/util/LinkedList;->size()I

    move-result p2

    new-array p2, p2, [Lcom/google/android/gms/internal/zzfjy;

    invoke-virtual {p3, p2}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object p3, v1, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    iput-object p2, p3, Lcom/google/android/gms/internal/zzfjz;->zzpoo:[Lcom/google/android/gms/internal/zzfjy;

    :cond_bf
    iget-object p2, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_c6
    move-exception p1

    monitor-exit v0
    :try_end_c8
    .catchall {:try_start_ac .. :try_end_c8} :catchall_c6

    goto :goto_ca

    :goto_c9
    throw p1

    :goto_ca
    goto :goto_c9
.end method

.method public final zzbv(Ljava/lang/String;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwe:Lcom/google/android/gms/internal/zzfjw;

    iput-object p1, v1, Lcom/google/android/gms/internal/zzfjw;->zzpoc:Ljava/lang/String;

    monitor-exit v0

    return-void

    :catchall_9
    move-exception p1

    monitor-exit v0
    :try_end_b
    .catchall {:try_start_3 .. :try_end_b} :catchall_9

    throw p1
.end method

.method public final zzok()Lcom/google/android/gms/internal/zzaey;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    return-object v0
.end method

.method public final zzol()Z
    .registers 2

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぁにあがあ()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/zzaey;->zzcwr:Z

    if-eqz v0, :cond_12

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwk:Z

    if-nez v0, :cond_12

    const/4 v0, 0x1

    return v0

    :cond_12
    const/4 v0, 0x0

    return v0
.end method

.method public final zzom()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwj:Z

    return-void
.end method

.method public final zzon()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwg:Lcom/google/android/gms/internal/zzafd;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaes;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->zzcwf:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/zzafd;->zza(Landroid/content/Context;Ljava/util/Set;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzaeu;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/zzaeu;-><init>(Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzakv;)V

    sget-object v3, Lcom/google/android/gms/internal/zzahh;->zzdar:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/zzakv;->zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    monitor-exit v0

    return-void

    :catchall_1d
    move-exception v1

    monitor-exit v0
    :try_end_1f
    .catchall {:try_start_3 .. :try_end_1f} :catchall_1d

    throw v1
.end method

.method public final zzp(Ljava/util/Map;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_3

    return-void

    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_77

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "matches"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->mLock:Ljava/lang/Object;

    monitor-enter v3

    :try_start_2d
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzaes;->zzbw(Ljava/lang/String;)Lcom/google/android/gms/internal/zzfke;

    move-result-object v5

    if-nez v5, :cond_52

    const-string v2, "Cannot find the corresponding resource object for "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_48

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4d

    :cond_48
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_4d
    invoke-static {v1}, Lcom/google/android/gms/internal/zzafa;->zzbx(Ljava/lang/String;)V

    :goto_50
    monitor-exit v3

    goto :goto_b

    :cond_52
    new-array v1, v4, [Ljava/lang/String;

    iput-object v1, v5, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_58
    if-ge v6, v4, :cond_6b

    iget-object v7, v5, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    const-string v9, "threat_type"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_58

    :cond_6b
    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzaes;->zzcwh:Z

    if-lez v4, :cond_70

    const/4 v1, 0x1

    :cond_70
    or-int/2addr v1, v2

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzaes;->zzcwh:Z

    goto :goto_50

    :catchall_74
    move-exception p1

    monitor-exit v3
    :try_end_76
    .catchall {:try_start_2d .. :try_end_76} :catchall_74

    throw p1

    :cond_77
    return-void
.end method

.method public final zzq(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzctb:Lcom/google/android/gms/internal/zzaey;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/zzaey;->zzcwr:Z

    if-nez v0, :cond_7

    return-void

    :cond_7
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwk:Z

    if-eqz v0, :cond_c

    return-void

    :cond_c
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzahn;->zzs(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-nez p1, :cond_1b

    const-string p1, "Failed to capture the webview bitmap."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzafa;->zzbx(Ljava/lang/String;)V

    return-void

    :cond_1b
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaes;->zzcwk:Z

    new-instance v0, Lcom/google/android/gms/internal/zzaet;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzaet;-><init>(Lcom/google/android/gms/internal/zzaes;Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahn;->zzb(Ljava/lang/Runnable;)V

    return-void
.end method
