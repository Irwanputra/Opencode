.class public Lteam/dev/epro/apkcustom/widgets/AESEncrypt;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "Ka<Mj<\u0019fn\u001eek\u0019d=\u001b`nKgm\u001a3j\u00194fHdjJa"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native arr()[C
.end method

.method public static native checkSignature(Ljava/lang/Object;)I
.end method

.method public static native decode(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native decode0(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;
.end method

.method public static native encode(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
.end method
