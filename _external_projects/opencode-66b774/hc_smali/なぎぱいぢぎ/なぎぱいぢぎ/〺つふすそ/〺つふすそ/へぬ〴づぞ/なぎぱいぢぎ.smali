.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Landroid/view/View;

.field public づざかべべ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)Z
    .registers 3

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->びぐびあび:I

    if-eq v0, p1, :cond_b

    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->びぐびあび:I

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ()V

    const/4 p1, 0x1

    return p1

    :cond_b
    const/4 p1, 0x0

    return p1
.end method

.method public げつ〴ぬぐ()V
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/View;

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->びぐびあび:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    iget v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->〺つふすそ:I

    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/View;

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->づざかべべ:I

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->くし〴〺ぅ:I

    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇ〳〲〺すっ(Landroid/view/View;I)V

    return-void
.end method
