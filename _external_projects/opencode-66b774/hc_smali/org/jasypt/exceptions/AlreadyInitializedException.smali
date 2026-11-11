.class public final Lorg/jasypt/exceptions/AlreadyInitializedException;
.super Ljava/lang/RuntimeException;
.source ""


# static fields
.field private static final serialVersionUID:J = 0x3fbbe484c5b0e7d2L


# direct methods
.method public constructor <init>()V
    .registers 2

    const-string v0, "Encryption entity already initialized"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method
