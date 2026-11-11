.class public final synthetic Lcom/google/android/gms/internal/zzacu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzakh;


# instance fields
.field private final zzcuq:Lcom/google/android/gms/internal/zzact;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzact;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzacu;->zzcuq:Lcom/google/android/gms/internal/zzact;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacu;->zzcuq:Lcom/google/android/gms/internal/zzact;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzact;->zzn(Lorg/json/JSONObject;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
