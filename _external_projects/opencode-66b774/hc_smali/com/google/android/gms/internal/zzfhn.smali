.class public final Lcom/google/android/gms/internal/zzfhn;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zzpjb:Lcom/google/android/gms/internal/zzfhn;


# instance fields
.field private final zzpjc:Lcom/google/android/gms/internal/zzfhw;

.field private final zzpjd:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/zzfhv<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/google/android/gms/internal/zzfhn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfhn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzfhn;->zzpjb:Lcom/google/android/gms/internal/zzfhn;

    return-void
.end method

.method private constructor <init>()V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfhn;->zzpjd:Ljava/util/concurrent/ConcurrentMap;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.google.protobuf.AndroidProto3SchemaFactory"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_14
    if-gtz v3, :cond_21

    aget-object v1, v0, v2

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfhn;->zztw(Ljava/lang/String;)Lcom/google/android/gms/internal/zzfhw;

    move-result-object v1

    if-nez v1, :cond_21

    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_21
    if-nez v1, :cond_28

    new-instance v1, Lcom/google/android/gms/internal/zzfgq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzfgq;-><init>()V

    :cond_28
    iput-object v1, p0, Lcom/google/android/gms/internal/zzfhn;->zzpjc:Lcom/google/android/gms/internal/zzfhw;

    return-void
.end method

.method public static zzcyz()Lcom/google/android/gms/internal/zzfhn;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzfhn;->zzpjb:Lcom/google/android/gms/internal/zzfhn;

    return-object v0
.end method

.method private static zztw(Ljava/lang/String;)Lcom/google/android/gms/internal/zzfhw;
    .registers 3

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzfhw;
    :try_end_13
    .catchall {:try_start_0 .. :try_end_13} :catchall_14

    return-object p0

    :catchall_14
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final zzl(Ljava/lang/Class;)Lcom/google/android/gms/internal/zzfhv;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/zzfhv<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzffz;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfhn;->zzpjd:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzfhv;

    if-nez v1, :cond_28

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfhn;->zzpjc:Lcom/google/android/gms/internal/zzfhw;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzfhw;->zzk(Ljava/lang/Class;)Lcom/google/android/gms/internal/zzfhv;

    move-result-object v1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzffz;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzffz;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfhn;->zzpjd:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzfhv;

    if-eqz p1, :cond_28

    move-object v1, p1

    :cond_28
    return-object v1
.end method
