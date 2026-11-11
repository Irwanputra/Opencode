.class public abstract Lcom/google/android/gms/internal/zzdvm;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static zzmai:[Ljava/lang/Throwable;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Throwable;

    sput-object v0, Lcom/google/android/gms/internal/zzdvm;->zzmai:[Ljava/lang/Throwable;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract zza(Ljava/lang/Throwable;Ljava/io/PrintStream;)V
.end method

.method public abstract zza(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V
.end method
