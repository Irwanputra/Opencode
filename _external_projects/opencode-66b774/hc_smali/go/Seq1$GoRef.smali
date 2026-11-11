.class public Lgo/Seq1$GoRef;
.super Ljava/lang/ref/PhantomReference;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgo/Seq1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GoRef"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/PhantomReference<",
        "Lgo/Seq1$GoObject;",
        ">;"
    }
.end annotation


# instance fields
.field public final refnum:I


# direct methods
.method public constructor <init>(ILgo/Seq1$GoObject;Lgo/Seq1$GoRefQueue;)V
    .registers 4

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    if-gtz p1, :cond_8

    iput p1, p0, Lgo/Seq1$GoRef;->refnum:I

    return-void

    :cond_8
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "GoRef instantiated with a Java refnum "

    invoke-static {p3, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
