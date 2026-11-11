.class public final synthetic Lcom/google/android/gms/internal/zztv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zztr;


# static fields
.field public static final zzccd:Lcom/google/android/gms/internal/zztr;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/google/android/gms/internal/zztv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zztv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zztv;->zzccd:Lcom/google/android/gms/internal/zztr;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzf(Lorg/json/JSONObject;)Ljava/lang/Object;
    .registers 2

    invoke-static {p1}, Lcom/google/android/gms/internal/zztu;->zzg(Lorg/json/JSONObject;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
