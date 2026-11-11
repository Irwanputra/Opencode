.class public final Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/lang/CharSequence;

.field public final ぁごぐすすぃ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:[Ljava/lang/CharSequence;

.field public final げつ〴ぬぐ:Ljava/lang/String;

.field public final づざかべべ:I

.field public final なぎぱいぢぎ:Landroid/os/Bundle;

.field public final びぐびあび:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/CharSequence;",
            "[",
            "Ljava/lang/CharSequence;",
            "ZI",
            "Landroid/os/Bundle;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->〺つふすそ:Ljava/lang/CharSequence;

    iput-object p3, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ:[Ljava/lang/CharSequence;

    iput-boolean p4, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->びぐびあび:Z

    iput p5, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->づざかべべ:I

    iput-object p6, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ:Landroid/os/Bundle;

    iput-object p7, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ:Ljava/util/Set;

    const/4 p1, 0x2

    if-ne p5, p1, :cond_1f

    if-eqz p4, :cond_17

    goto :goto_1f

    :cond_17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "setEditChoicesBeforeSending requires setAllowFreeFormInput"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1f
    :goto_1f
    return-void
.end method
