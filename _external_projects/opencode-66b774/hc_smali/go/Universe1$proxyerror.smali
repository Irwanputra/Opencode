.class public final Lgo/Universe1$proxyerror;
.super Ljava/lang/Exception;
.source ""

# interfaces
.implements Lgo/Seq1$Proxy;
.implements Lgo/error;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgo/Universe1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "proxyerror"
.end annotation


# instance fields
.field private final refnum:I


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput p1, p0, Lgo/Universe1$proxyerror;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq1;->trackGoRef(ILgo/Seq1$GoObject;)V

    return-void
.end method


# virtual methods
.method public native error()Ljava/lang/String;
.end method

.method public getMessage()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lgo/Universe1$proxyerror;->error()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final incRefnum()I
    .registers 2

    iget v0, p0, Lgo/Universe1$proxyerror;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq1;->incGoRef(ILgo/Seq1$GoObject;)V

    iget v0, p0, Lgo/Universe1$proxyerror;->refnum:I

    return v0
.end method
