.class public abstract Lcom/google/android/gms/internal/zzffu;
.super Lcom/google/android/gms/internal/zzfek;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzffu$zzf;,
        Lcom/google/android/gms/internal/zzffu$zze;,
        Lcom/google/android/gms/internal/zzffu$zzc;,
        Lcom/google/android/gms/internal/zzffu$zzh;,
        Lcom/google/android/gms/internal/zzffu$zzb;,
        Lcom/google/android/gms/internal/zzffu$zzd;,
        Lcom/google/android/gms/internal/zzffu$zza;,
        Lcom/google/android/gms/internal/zzffu$zzg;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/zzffu<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/zzffu$zza<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/zzfek<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static zzpgt:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/zzffu<",
            "**>;>;"
        }
    .end annotation
.end field


# instance fields
.field public zzpgr:Lcom/google/android/gms/internal/zzfio;

.field public zzpgs:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzffu;->zzpgt:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfek;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/zzfio;->zzczu()Lcom/google/android/gms/internal/zzfio;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzffu<",
            "TT;*>;>(TT;",
            "Lcom/google/android/gms/internal/zzfes;",
            ")TT;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzffm;->zzcxb()Lcom/google/android/gms/internal/zzffm;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_49

    sget v2, Lcom/google/android/gms/internal/zzffu$zzg;->zzphe:I

    invoke-virtual {p0, v2, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    if-ne v2, v0, :cond_1d

    const/4 v2, 0x1

    goto :goto_38

    :cond_1d
    if-nez v2, :cond_21

    const/4 v2, 0x0

    goto :goto_38

    :cond_21
    sget v2, Lcom/google/android/gms/internal/zzffu$zzg;->zzphc:I

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v2, v3, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2d

    const/4 v2, 0x1

    goto :goto_2e

    :cond_2d
    const/4 v2, 0x0

    :goto_2e
    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphf:I

    if-eqz v2, :cond_34

    move-object v4, p0

    goto :goto_35

    :cond_34
    move-object v4, v1

    :goto_35
    invoke-virtual {p0, v3, v4, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_38
    if-eqz v2, :cond_3b

    goto :goto_49

    :cond_3b
    new-instance p1, Lcom/google/android/gms/internal/zzfim;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzfim;-><init>(Lcom/google/android/gms/internal/zzfhe;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfim;->zzczt()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p0

    throw p0

    :cond_49
    :goto_49
    if-eqz p0, :cond_84

    sget v2, Lcom/google/android/gms/internal/zzffu$zzg;->zzphe:I

    invoke-virtual {p0, v2, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    if-ne v2, v0, :cond_5b

    const/4 p1, 0x1

    goto :goto_73

    :cond_5b
    if-nez v2, :cond_5e

    goto :goto_73

    :cond_5e
    sget v2, Lcom/google/android/gms/internal/zzffu$zzg;->zzphc:I

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v2, v3, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_69

    const/4 p1, 0x1

    :cond_69
    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphf:I

    if-eqz p1, :cond_6f

    move-object v2, p0

    goto :goto_70

    :cond_6f
    move-object v2, v1

    :goto_70
    invoke-virtual {p0, v0, v2, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_73
    if-eqz p1, :cond_76

    goto :goto_84

    :cond_76
    new-instance p1, Lcom/google/android/gms/internal/zzfim;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzfim;-><init>(Lcom/google/android/gms/internal/zzfhe;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfim;->zzczt()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p0

    throw p0

    :cond_84
    :goto_84
    return-object p0
.end method

.method private static zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzffu<",
            "TT;*>;>(TT;",
            "Lcom/google/android/gms/internal/zzfes;",
            "Lcom/google/android/gms/internal/zzffm;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfes;->zzcvm()Lcom/google/android/gms/internal/zzffb;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffb;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0
    :try_end_8
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_0 .. :try_end_8} :catch_13

    const/4 p2, 0x0

    :try_start_9
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzffb;->zzkp(I)V
    :try_end_c
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_9 .. :try_end_c} :catch_d

    return-object p0

    :catch_d
    move-exception p1

    :try_start_e
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p0

    throw p0
    :try_end_13
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_e .. :try_end_13} :catch_13

    :catch_13
    move-exception p0

    throw p0
.end method

.method public static zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffb;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzffu<",
            "TT;*>;>(TT;",
            "Lcom/google/android/gms/internal/zzffb;",
            "Lcom/google/android/gms/internal/zzffm;",
            ")TT;"
        }
    .end annotation

    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphi:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzffu;

    :try_start_9
    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphg:I

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget p1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    invoke-virtual {p0, p1, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V
    :try_end_18
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_18} :catch_19

    return-object p0

    :catch_19
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/android/gms/internal/zzfge;

    if-eqz p1, :cond_29

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzfge;

    throw p0

    :cond_29
    throw p0
.end method

.method public static zza(Lcom/google/android/gms/internal/zzffu;[B)Lcom/google/android/gms/internal/zzffu;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzffu<",
            "TT;*>;>(TT;[B)TT;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzffm;->zzcxb()Lcom/google/android/gms/internal/zzffm;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;[BLcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    if-eqz p0, :cond_46

    sget p1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphe:I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1d

    const/4 v1, 0x1

    goto :goto_35

    :cond_1d
    if-nez p1, :cond_20

    goto :goto_35

    :cond_20
    sget p1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphc:I

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v3, v0}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2b

    const/4 v1, 0x1

    :cond_2b
    sget p1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphf:I

    if-eqz v1, :cond_31

    move-object v2, p0

    goto :goto_32

    :cond_31
    move-object v2, v0

    :goto_32
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_35
    if-eqz v1, :cond_38

    goto :goto_46

    :cond_38
    new-instance p1, Lcom/google/android/gms/internal/zzfim;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzfim;-><init>(Lcom/google/android/gms/internal/zzfhe;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfim;->zzczt()Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p0

    throw p0

    :cond_46
    :goto_46
    return-object p0
.end method

.method private static zza(Lcom/google/android/gms/internal/zzffu;[BLcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzffu<",
            "TT;*>;>(TT;[B",
            "Lcom/google/android/gms/internal/zzffm;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/zzffb;->zzbb([B)Lcom/google/android/gms/internal/zzffb;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffb;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0
    :try_end_8
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_0 .. :try_end_8} :catch_13

    const/4 p2, 0x0

    :try_start_9
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzffb;->zzkp(I)V
    :try_end_c
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_9 .. :try_end_c} :catch_d

    return-object p0

    :catch_d
    move-exception p1

    :try_start_e
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p0

    throw p0
    :try_end_13
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_e .. :try_end_13} :catch_13

    :catch_13
    move-exception p0

    throw p0
.end method

.method public static varargs zza(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_4} :catch_20
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p0

    :catch_5
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1d

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_15

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_15
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1d
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_20
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final zza(Lcom/google/android/gms/internal/zzffu;Z)Z
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzffu<",
            "TT;*>;>(TT;Z)Z"
        }
    .end annotation

    sget p1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphe:I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_11

    return v1

    :cond_11
    const/4 v2, 0x0

    if-nez p1, :cond_15

    return v2

    :cond_15
    sget p1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphc:I

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v3, v0}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_20

    goto :goto_21

    :cond_20
    const/4 v1, 0x0

    :goto_21
    return v1
.end method

.method public static zzcxn()Lcom/google/android/gms/internal/zzfgc;
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzffy;->zzcxz()Lcom/google/android/gms/internal/zzffy;

    move-result-object v0

    return-object v0
.end method

.method public static zzcxo()Lcom/google/android/gms/internal/zzfgd;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/android/gms/internal/zzfgd<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzfho;->zzcza()Lcom/google/android/gms/internal/zzfho;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphk:I

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v2}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_19

    return v2

    :cond_19
    :try_start_19
    sget-object v1, Lcom/google/android/gms/internal/zzffu$zzc;->zzpgx:Lcom/google/android/gms/internal/zzffu$zzc;

    check-cast p1, Lcom/google/android/gms/internal/zzffu;

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphd:I

    invoke-virtual {p0, v3, v1, p1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-interface {v1, v3, p1}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfio;Lcom/google/android/gms/internal/zzfio;)Lcom/google/android/gms/internal/zzfio;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;
    :try_end_2c
    .catch Lcom/google/android/gms/internal/zzffv; {:try_start_19 .. :try_end_2c} :catch_2d

    return v0

    :catch_2d
    return v2
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzfek;->zzpfa:I

    if-eqz v0, :cond_5

    return v0

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/zzffu$zze;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzffu$zze;-><init>()V

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphd:I

    invoke-virtual {p0, v1, v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-interface {v0, v1, v1}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfio;Lcom/google/android/gms/internal/zzfio;)Lcom/google/android/gms/internal/zzfio;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    iget v0, v0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    iput v0, p0, Lcom/google/android/gms/internal/zzfek;->zzpfa:I

    return v0
.end method

.method public final isInitialized()Z
    .registers 6

    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphe:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_11

    return v2

    :cond_11
    const/4 v3, 0x0

    if-nez v0, :cond_15

    return v3

    :cond_15
    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphc:I

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v4, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_20

    goto :goto_21

    :cond_20
    const/4 v2, 0x0

    :goto_21
    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphf:I

    if-eqz v2, :cond_27

    move-object v3, p0

    goto :goto_28

    :cond_27
    move-object v3, v1

    :goto_28
    invoke-virtual {p0, v0, v3, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/zzfhh;->zza(Lcom/google/android/gms/internal/zzfhe;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    invoke-static {}, Lcom/google/android/gms/internal/zzfhn;->zzcyz()Lcom/google/android/gms/internal/zzfhn;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzfhn;->zzl(Ljava/lang/Class;)Lcom/google/android/gms/internal/zzfhv;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffi;->zzb(Lcom/google/android/gms/internal/zzffg;)Lcom/google/android/gms/internal/zzffi;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/zzfhv;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/zzfji;)V

    return-void
.end method

.method public final zza(ILcom/google/android/gms/internal/zzffb;)Z
    .registers 5

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    const/4 p1, 0x0

    return p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-static {}, Lcom/google/android/gms/internal/zzfio;->zzczu()Lcom/google/android/gms/internal/zzfio;

    move-result-object v1

    if-ne v0, v1, :cond_15

    invoke-static {}, Lcom/google/android/gms/internal/zzfio;->zzczv()Lcom/google/android/gms/internal/zzfio;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    :cond_15
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzfio;->zzb(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    return p1
.end method

.method public final zzcxm()Lcom/google/android/gms/internal/zzfhk;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzfhk<",
            "TMessageType;>;"
        }
    .end annotation

    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphl:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzfhk;

    return-object v0
.end method

.method public final synthetic zzcxp()Lcom/google/android/gms/internal/zzfhf;
    .registers 3

    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    return-object v0
.end method

.method public final synthetic zzcxq()Lcom/google/android/gms/internal/zzfhe;
    .registers 3

    sget v0, Lcom/google/android/gms/internal/zzffu$zzg;->zzphk:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzffu;

    return-object v0
.end method

.method public zzho()I
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_17

    invoke-static {}, Lcom/google/android/gms/internal/zzfhn;->zzcyz()Lcom/google/android/gms/internal/zzfhn;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzfhn;->zzl(Ljava/lang/Class;)Lcom/google/android/gms/internal/zzfhv;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzfhv;->zzcp(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    :cond_17
    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
