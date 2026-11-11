.class public abstract Lgo/Universe;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgo/Universe$proxyerror;
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .registers 0

    invoke-static {}, Lgo/Seq;->touch()V

    invoke-static {}, Lgo/Universe;->_init()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native _init()V
.end method

.method public static touch()V
    .registers 0

    return-void
.end method
