.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# static fields
.field public static びぐびあび:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3066\u305c\u304d\u307d\u304f/\u304f\u3057\u3034\u303a\u3045<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3047\u306c\u304e\u3070\u3064/\u3073\u3050\u3073\u3042\u3073/\u306a\u3076\u3072\u305b\u304c$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;

.field public くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;

.field public げつ〴ぬぐ:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;-><init>(I)V

    sput-object v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 〺つふすそ(Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;)V
    .registers 2

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ:I

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;

    sget-object v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    return-void
.end method

.method public static げつ〴ぬぐ()Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;
    .registers 1

    sget-object v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;

    if-nez v0, :cond_f

    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$げつ〴ぬぐ;-><init>()V

    :cond_f
    return-object v0
.end method
