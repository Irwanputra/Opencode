.class public abstract Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public final くし〴〺ぅ:Landroid/graphics/Rect;

.field public final げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p2, -0x80000000

    iput p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ:I

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ:Landroid/graphics/Rect;

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    return-void
.end method

.method public static げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;I)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;
    .registers 3

    if-eqz p1, :cond_13

    const/4 v0, 0x1

    if-ne p1, v0, :cond_b

    .line 1
    new-instance p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/は〲ぱなで;

    invoke-direct {p1, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/は〲ぱなで;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    return-object p1

    .line 2
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3
    :cond_13
    new-instance p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;

    invoke-direct {p1, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    return-object p1
.end method


# virtual methods
.method public abstract 〳ぜぞぜべっ()I
.end method

.method public abstract 〺つふすそ(Landroid/view/View;)I
.end method

.method public abstract ぁごぐすすぃ()I
.end method

.method public abstract いいにぽつ()I
.end method

.method public abstract ぇぬぎばつ(I)V
.end method

.method public abstract おぐぴう〸ず(Landroid/view/View;)I
.end method

.method public abstract くし〴〺ぅ(Landroid/view/View;)I
.end method

.method public abstract づざかべべ(Landroid/view/View;)I
.end method

.method public abstract てぜきぽく()I
.end method

.method public abstract なぎぱいぢぎ()I
.end method

.method public のぷのちつ()I
    .registers 3

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ:I

    const/high16 v1, -0x80000000

    if-ne v1, v0, :cond_8

    const/4 v0, 0x0

    goto :goto_f

    :cond_8
    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v0

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ:I

    sub-int/2addr v0, v1

    :goto_f
    return v0
.end method

.method public abstract びぐびあび(Landroid/view/View;)I
.end method

.method public abstract へぬ〴づぞ(Landroid/view/View;)I
.end method

.method public abstract ぺぁあねじ()I
.end method

.method public abstract ぺふねづ〺()I
.end method
