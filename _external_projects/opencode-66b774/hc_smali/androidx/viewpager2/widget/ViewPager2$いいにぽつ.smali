.class public Landroidx/viewpager2/widget/ViewPager2$いいにぽつ;
.super Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3044\u3044\u306b\u307d\u3064"
.end annotation


# instance fields
.field public final synthetic なぎぱいぢぎ:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$いいにぽつ;->なぎぱいぢぎ:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;-><init>()V

    return-void
.end method


# virtual methods
.method public びぐびあび(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$いいにぽつ;->なぎぱいぢぎ:Landroidx/viewpager2/widget/ViewPager2;

    .line 1
    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->おぐぴう〸ず:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;

    .line 2
    iget-object v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/びぐびあび;->げつ〴ぬぐ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;

    .line 3
    iget-boolean v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->のぷのちつ:Z

    if-eqz v0, :cond_b

    goto :goto_25

    .line 4
    :cond_b
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->いいにぽつ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v0

    goto :goto_20

    :cond_16
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v0

    :goto_20
    invoke-virtual {p0, p1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)Landroid/view/View;

    move-result-object p1

    goto :goto_26

    :cond_25
    :goto_25
    const/4 p1, 0x0

    :goto_26
    return-object p1
.end method
