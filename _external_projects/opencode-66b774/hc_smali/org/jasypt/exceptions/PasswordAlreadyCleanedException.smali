.class public final Lorg/jasypt/exceptions/PasswordAlreadyCleanedException;
.super Ljava/lang/RuntimeException;
.source ""


# static fields
.field private static final serialVersionUID:J = 0x6edcccb94c8ef975L


# direct methods
.method public constructor <init>()V
    .registers 2

    const-string v0, "Password already cleaned: The encryptor that uses this password has already been initialized and therefore this password has been cleaned so that it is no more present in memory. An exception has been raised when accessing this property in order to avoid inconsistencies. A possible reason for this error is that you are using the same PBEConfig object to configure two different PBE encryptor instances."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method
