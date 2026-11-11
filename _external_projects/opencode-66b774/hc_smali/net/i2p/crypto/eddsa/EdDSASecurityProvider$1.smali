.class public Lnet/i2p/crypto/eddsa/EdDSASecurityProvider$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/security/PrivilegedAction<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;


# direct methods
.method public constructor <init>(Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;)V
    .registers 2

    iput-object p1, p0, Lnet/i2p/crypto/eddsa/EdDSASecurityProvider$1;->this$0:Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Lnet/i2p/crypto/eddsa/EdDSASecurityProvider$1;->this$0:Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;

    invoke-virtual {v0}, Lnet/i2p/crypto/eddsa/EdDSASecurityProvider;->setup()V

    const/4 v0, 0x0

    return-object v0
.end method
