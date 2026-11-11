.class public final Lpsi/Psi$proxyPsiphonProviderFeedbackHandler;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lgo/Seq1$Proxy;
.implements Lpsi/PsiphonProviderFeedbackHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpsi/Psi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "proxyPsiphonProviderFeedbackHandler"
.end annotation


# instance fields
.field private final refnum:I


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpsi/Psi$proxyPsiphonProviderFeedbackHandler;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq1;->trackGoRef(ILgo/Seq1$GoObject;)V

    return-void
.end method


# virtual methods
.method public final incRefnum()I
    .registers 2

    iget v0, p0, Lpsi/Psi$proxyPsiphonProviderFeedbackHandler;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq1;->incGoRef(ILgo/Seq1$GoObject;)V

    iget v0, p0, Lpsi/Psi$proxyPsiphonProviderFeedbackHandler;->refnum:I

    return v0
.end method

.method public native sendFeedbackCompleted(Ljava/lang/Exception;)V
.end method
